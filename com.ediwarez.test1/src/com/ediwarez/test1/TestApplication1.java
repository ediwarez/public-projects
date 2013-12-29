package com.ediwarez.test1;

import java.io.IOException;

import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.Font;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.table.TableLayout;
import com.codename1.ui.util.Resources;

public class TestApplication1 {

	private Form current;

	public void init(Object context) {
		try {
			Resources theme = Resources.openLayered("/theme");
			UIManager.getInstance().setThemeProps(theme.getTheme(theme.getThemeResourceNames()[0]));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		if (current != null) {
			current.show();
			return;
		}

		Form form = new Form("Hi World");
		form.setLayout(new BorderLayout());

		Font labelFont = Font.getDefaultFont();
		if (Font.isTrueTypeFileSupported()) {
			labelFont = Font.createTrueTypeFont("FontAwesome Regular", "fontawesome-webfont.ttf");
			labelFont = labelFont.derive(16, Font.STYLE_PLAIN);
		}

		final Container labelContainer = new Container();
		labelContainer.setLayout(new TableLayout(11, 40));
		for (int i = 0; i < 407; i++) {
			Label label = new Label(new String("" + (char) (61440 + i)));
			label.getStyle().setFont(labelFont);
			labelContainer.addComponent(label);
		}

		Button button = new Button("Hello World!");
		try {
			button.setIcon(Image.createImage("/icon2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				animateLabelContainer(labelContainer);
			}
		});

		form.addComponent(BorderLayout.NORTH, button);

		form.show();
	}

	protected void animateLabelContainer(Container labelContainer) {
		Form form = Display.getInstance().getCurrent();
		if (!form.contains(labelContainer))
			form.addComponent(BorderLayout.CENTER, labelContainer);

		form.revalidate();
		for (int i = 0; i < labelContainer.getComponentCount(); i++) {
			Component component = labelContainer.getComponentAt(i);
			int j = i % 4;
			if (j == 0)
				component.setX(-labelContainer.getWidth());
			else if (j == 1) {
				component.setX(-labelContainer.getWidth());
				component.setY(-labelContainer.getHeight());
			} else if (j == 2)
				component.setX(labelContainer.getWidth());
			else if (j == 3) {
				component.setX(labelContainer.getWidth());
				component.setY(labelContainer.getHeight());
			}
		}
		labelContainer.setShouldCalcPreferredSize(true);
		labelContainer.animateLayout(1000);
	}

	public void stop() {
		current = Display.getInstance().getCurrent();
	}

	public void destroy() {
	}

}
