This simple HelloWorld app contains its own on-board subset of the Java 9 runtime environment.

It needs Java 9 on your build computer to build, but does not need Java installed on the destination computer to run.

It may be run only on computers using the same operating system, though not necessarily the same release, as the computer on which you built this app.

To build and run this app:

- You must have the Java 9 JDK installed

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, execute: build.sh

The app should build:

a. A directory, mods, that contains appmod.jar
b. An image directory tree, appmod-image, that contains a subset of the Java 9 runtime envirionment

5. At the command line, execute: run.sh

The app should display: Hello Modules Image!

To run this app on another computer:

- Your destination computer must use the same operating system you used to build this app, for example:  MacOS
- The release version of that operating system should not matter, but YMMV
- It is not necessary to have Java installed on that computer
- Having Java installed on that computer should not affect this app

1. Create a destination location directory on your destination computer
2. Copy the appmod-image directory tree to your destination location on your destination computer
4. Copy run.sh to your destination location
5. On your destination computer, open up a command line terminal
6. CD to your destination location
7. At the command line, execute: run.sh

The app should display: Hello Modules Image!
