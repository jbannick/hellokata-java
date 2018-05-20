This is a simplem odularized app uses a modularized library.
It is contained in a Custom Runtime Image that includes its own on-board subset of the Java runtime environment.

Java 9 and later JRE's are modularized.

A Custom Runtime Image is a JRE that contains only those modules required to run your app.

It requires the Java 9 or later JDK on your build computer to build, 
but does not require Java to be installed on the destination computer to run.

It may be run only on computers using the same operating system, 
though not necessarily the same release, 
as the computer on which you built this app.

To build and run this app:

- You must have the Java 9 or later JDK installed

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, execute: build.sh

The app should build:

* a. An image directory tree, appmod-image, that contains your application and your library, both as modules, and the subset of the Java runtime environment necessary to run that app
* b. Additional directories used only during the build process

5. At the command line, execute: run.sh

Hello Custom Image Using a Library - Simplest!

Hello from a Modularized Library! 

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

Hello Custom Image Using a Library - Simplest!

Hello from a Modularized Library!
