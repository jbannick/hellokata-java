This is the simplest Log4J2 app.

It displays your ERROR message to the console.

Because it does not include a Log4J2 configuration file, it also displays a Log4J2 error message.

To build and run this app:

- You must have Java installed
- You must have log4j-core-2.10.0.jar at LOG4J2_HOME
- You must have log4j-api-2.10.0.jar  at LOG4J2_HOME

Download Log4J2 from: https://logging.apache.org/log4j/2.x/download.html

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

ERROR StatusLogger No log4j2 configuration file found. Using default configuration: logging only errors to the console. Set system property 'log4j2.debug' to show Log4j2 internal initialization logging.

Hello Log4J2 Simplest!

05:11:44.103 [main] ERROR HelloLog4J2Simplest - This is an error entry

The app does not display the other log messages because Log4J2's default verbosity is ERROR.
