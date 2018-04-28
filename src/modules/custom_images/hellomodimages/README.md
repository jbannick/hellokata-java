This simple HelloWorld app contains its own on-board subsets of the Java runtime environment, enabling it to run on:

- MacOS
- Windows64
- Linux

Java 9 and later JRE's are modularized. 

A Custom Runtime Image contains your app, as a module, and a JRE that contains only those modules required to run your app.

It needs the Java 9 or later JDK on your build computer to build.  
It also needs on your build computer the Java 9 or later JDKs for ***each*** of your other destination operating systems.

It does not need Java installed on a destination computer to run.

To build and run this app:

- You must have a Java 9 or later JDK for MacOS installed 
- You must have a Java 9 or later JDK for Windows64 installed
- You must have a Java 9 or later JDK for Linux installed

- You must have your JAVA_HOME environment variable pointing at the Java 9 or later JDK appropriate for your build computer
- You must have your JDK_MACOS_HOME environment variable pointing at your Java 9 or later JDK for MacOS
- You must have your JDK_WIN64_HOME environment variable pointing at your Java 9 or later JDK for Windows64
- You must have your JDK_LINUX_HOME environment variable pointing at your Java 9 or later JDK for Linux

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, execute: build.sh

The app should build:

* a. An image directory tree, appmod-image-linux, that contains a subset of the Java runtime environment that will run on Linux
* b. An image directory tree, appmod-image-macos, that contains a subset of the Java runtime environment that will run on a Mac
* c. An image directory tree, appmod-image-win64, that contains a subset of the Java runtime environment that will run on Windows
* d. Additional directories used only during the build process

5. At the command line, execute: run.sh

The app should display: Hello Modules Custom Images!

To run this app on another computer:

- Your destination computer can run either MacOS, Linux, or Windows
- The release version of that operating system should not matter, but YMMV
- It is not necessary to have Java installed on that computer
- Having Java installed on that computer should not affect this app

1. Create a destination location directory on the destination computer
2. Copy either the appmod-image-linux, appmod-image-macos, or appmod-image-win64 directory tree, as appropriate, to the destination location on the destination computer
4. Copy run_linux.sh, or run_macos.sh, or run_win64.bat, as appropriate, to the destination location
5. On the destination computer, open up a command line terminal
6. CD to the destination location
7. At the command line, execute: run_linux.sh, or run_macos.sh, or run_win64.bat

The app should display: Hello Modules Custom Images!
