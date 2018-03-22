This app uses SLF4J and its Simple binding for logging.

It displays your INFO, WARN, and ERROR messages to the console.
By default, SLF4J does not display your DEBUG messages.

To build and run this app:

- You must have Java installed
- You must have slf4j-api-1.8.0-beta2.jar    at SLF4J_HOME
- You must have slf4j-simple-1.8.0-beta2.jar at SLF4J_HOME

Download slf4j from: https://www.slf4j.org/download.html

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

5. At the command line, execute: run.sh

The console should display:

Hello SLF4J Simplest!
[main] INFO HelloSLF4JSimplest - This is an info message
[main] WARN HelloSLF4JSimplest - This is a warning message
[main] ERROR HelloSLF4JSimplest - This is an error message

It should not display your DEBUG message.
