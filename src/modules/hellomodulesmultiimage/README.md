This app contains its own on-board copies of the Java 9 runtime environments for:

- MacOS
- Windows64
- Linux

It needs Java 9 on your build computer to build, but does not need Java installed on the destination computer to run.

It may be run on MacOS, Windows64 (Windows 10, 8, 7), or Linux computers.

To build and run this app:

- You must have a Java 9 JDK for MacOS installed
- You must have a Java 9 JDK for Windows64 installed
- You must have a Java 9 JDK for Linux installed

- You must have your JAVA_HOME environment variable pointing at the Java 9 JDK appropriate for your build computer
- You must have your JAVA9_MACOS_HOME environment variable pointing at your Java 9 JDK for MacOS
- You must have your JAVA9_WIN64_HOME environment variable pointing at your Java 9 JDK for Windows64
- You must have your JAVA9_LINUX_HOME environment variable pointing at your Java 9 JDK for Linux

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, execute: build.sh or build.bat, depending on your build computer

The app should build:

a. An application directory, mods, that contains hmod.jar

b. An image directory tree, hmod-image-java9-macos, that contains a macOS Java 9 runtime envirionment

c. An image directory tree, hmod-image-java9-win64, that contains a Windows64 Java 9 runtime envirionment

d. An image directory tree, hmod-image-java9-linux, that contains a Linux Java 9 runtime envirionment

5. At the command line, execute: run.sh or run.bat, depending on your computer

The app should display: Hello Modules!

To run this app on another computer:

- It is not necessary to have Java installed on that computer
- Having Java installed on that computer should not affect this app


To run this app on another MacOS computer:
------------------------------------------

1. Create a destination location directory on your destination computer
2. Copy the hmod-image-java9-macos directory tree to your destination location on your destination computer
3. Copy the mods directory tree to your destination location
4. Copy runhmodmacos.sh to your destination location
5. On your destination computer, open up a command line terminal
6. CD to your destination location
7. At the command line, execute: runhmodmacos.sh

The app should display: Hello Modules!


To run this app on a Windows64 (Windows 10, 8, 7) computer:
-----------------------------------------------------------

1. Create a destination location directory on your destination computer
2. Copy the hmod-image-java9-win64 directory tree to your destination location on your destination computer
3. Copy the mods directory tree to your destination location
4. Copy runhmodwin64.bat to your destination location
5. On your destination computer, open up a command line terminal
6. CD to your destination location
7. At the command line, execute: runhmodwin64.bat

The app should display: Hello Modules!


To run this app on a Linux computer:
-----------------------------------------------------------

1. Create a destination location directory on your destination computer
2. Copy the hmod-image-java9-linux directory tree to your destination location on your destination computer
3. Copy the mods directory tree to your destination location
4. Copy runhmodlinux.sh to your destination location
5. On your destination computer, open up a command line terminal
6. CD to your destination location
7. At the command line, execute: runhmodlinux.sh

The app should display: Hello Modules!
