This simple publish / subscribe app contains its own on-board subset of the Java runtime environment.

It uses a HACK to make the otherwise-image-able eventbus library available to a custom runtime image.

A Custom Runtime Image is a JRE that contains only those modules required to run your app.

It needs the Java 9 or later JDK on your build computer to build, but does not need Java installed on the destination computer to run.

It may be run only on computers using the same operating system, though not necessarily the same release, as the computer on which you built this app.

The HACK consists of adding a module-info.class file to the eventbus JAR.

To do this, we:

1. Extract into a work directory the entire eventbus JAR 
2. Use the Java jdeps tool to generate from the eventbus JAR a module-info.java file into that work directory
3. Compile that module-info.java file using the Java 9 or greater JDK
4. Update the eventbus JAR by inserting the resulting module-info.class file

To build and run this app:

- You must have the Java 9 or later JDK installed

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, execute: build.sh

The app should build:

* a. An image directory tree, appmod-image, that contains your application, the eventbus library, both as modules, and the subset of the Java runtime environment necessary to run that app
* b. Additional directories used only during the build process

5. At the command line, execute: run.sh

The app should display: Hello Modularized Image Using Library 1!  
Publisher is instantiated  
Subscriber is instantiated  
Subscriber received a rumor: Pizza in the break room  

To run this app on another computer:

- Your destination computer must use the **same operating system** you used to build your app, for example:  MacOS
- The release version of that operating system should not matter, but YMMV
- It is not necessary to have Java installed on that computer
- Having Java installed on that computer should not affect this app

1. Create a destination location directory on the destination computer
2. Copy the appmod-image directory tree to the destination location on the destination computer
4. Copy run.sh to the destination location
5. On the destination computer, open up a command line terminal
6. CD to the destination location
7. At the command line, execute: run.sh

The app should display: Hello Modularized Image Using Library 1!  
Publisher is instantiated  
Subscriber is instantiated  
Subscriber received a rumor: Pizza in the break room  
