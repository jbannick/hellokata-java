This app uses the Apache Commons CSVParser library to parse a comma separated variable (CSV) file.

This app is modularized.

The CSVParser library is not modularized.  
Here we make it an Automatic module.

To build and run this app:

- You must have any Java JDK release 1.7 or later installed
- You must have commons-csv-1.5.jar at CSV_HOME

Download CSVParser from: 
https://commons.apache.org/proper/commons-csv/download_csv.cgi

1. Copy the src directory tree to your destination location
2. Copy names.csv to that location  
3. Copy build.sh to that location
4. Copy run.sh to that location
5. At the command line, cd to your destination location
6. At the command line, execute: build.sh

The app should build.

7. At the command line, execute: run.sh

The console should display:

Hello Modularized CSVParser!  
first_name 	= john  
last_name 	= bannick  
first_name 	= elmer  
last_name 	= fudd  
first_name 	= bugs  
last_name 	= bunny   

To deploy this app:

- You must have installed on the destination computer a Java JRE 
with a version that is at or later than the version of the JDK you used
to build this app

1. Copy the out and mods directories and run.sh and names.csv files to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

Hello Modularized CSVParser!  
first_name 	= john  
last_name 	= bannick  
first_name 	= elmer  
last_name 	= fudd  
first_name 	= bugs  
last_name 	= bunny  
