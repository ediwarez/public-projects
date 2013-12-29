About myself
------------
I'm an experienced Java programmer, but a total newbie to mobile app development.

Mobile app development
----------------------
The first thing I noticed about mobile app development was that there were a whole
lot of different frameworks for mobile app development. I started digging around for
comparisons, and did quite intense investigations of my own to find the perfect framework for me.

I tried the following frameworks:
* Appcelerator Titanium
  - Develop your app using JavaScript and a proprietary XML format (Alloy)
  - Test and debug in standard simulators
  - Titanium converts JavaScript into native code and packages it into a native app
    to be deployed on supported devices
* jQuery Mobile and PhoneGap
  - Develop your web application using HTML5, CSS and JavaScript
  - Test in standard simulators (debug?)
  - PhoneGap packages your web application inside a native wrapper app to be deployed
    on supported devices
* GWT, MGWT, GWT PhoneGap and PhoneGap
  - Develop your app using Java and GWT, GWT PhoneGap and MGWT API:s
  - GWT converts Java code into JavaScript and packages it into a web application
  - Test in standard simulators (debug?)
  - PhoneGap packages your web application inside a native wrapper app to be deployed
    on supported devices
* Codename One
  - Develop your app using a subset of the Java 5 JDK and Codename One API:s
  - Test and debug in a proprietary simulator
  - Codename One converts Java code into native code and packages it into a native app
    to be deployed on supported devices

I read several books, tons of articles, howto:s, developer guides etc about the different
frameworks. I also tried all available Hello World examples. In my opinion, JavaScript is
being used way beyond the scope that it was intended for - dynamic web pages.
My personal opinion is that JavaScript might work for smaller and simpler applications,
while more advanced applications (independently if they're desktop, web or mobile) should
be developed in an advanced language and framework.

Codename One
------------
I ended up choosing Codename One, because it delivers what I need in the most elegant way.
With Codename One it's possible to develop mobile apps in pure Java. The result is a pure native
app that can be deployed to supported devices (iOS, Android among others). Codename One also gives
your app access to native device functionality such as storage, geolocation, contacts etc.

My first mobile app project
---------------------------
I just wanted to play around a bit with fonts and animated layouts and this is the result.

The app is composed of a button at the top and when you click the button, a bunch of labels
are animated into the display. Each label represents one of the 400+ FontAwesome "icons".

As you can see, it's extremely easy to add fonts and animate layouts!
