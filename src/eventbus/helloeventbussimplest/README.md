This app uses the EventBus library to connect Publisher and Subscriber.

To build and run this app:

- You must have any Java JDK release 1.4 or later installed
- You must have eventbus-1.4.jar at EBUS_HOME

Download eventbus from: 
https://mvnrepository.com/artifact/org.bushe/eventbus/1.4

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:

Hello EventBus!    
Publisher is instantiated  
Subscriber is instantiated  
Subscriber received a rumor: Pizza in the break room  

To deploy this app:

- You must have installed on the destination computer a Java JRE 
with a version that is at or later than the version of the JDK you used
to build this app

1. Copy the out and lib directories and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello EventBus!  
Publisher is instantiated  
Subscriber is instantiated  
Subscriber received a rumor: Pizza in the break room  
