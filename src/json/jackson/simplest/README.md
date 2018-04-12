This app uses the Jackson JSON library to derive JSON from class instances.

It outputs prettyprinted JSON, with newlines and indents.

It suppresses output of null values.

To build and run this app:

- You must have the Java JDK 7 or later installed
- You must have jackson-core.2.9.0.jar at JSON_HOME
- You must have jackson-annotations.2.9.0.jar at JSON_HOME
- You must have jackson-databind.2.9.0.jar at JSON_HOME

Download these Jars from:  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.0/  
http://central.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.9.0/  

WARNING: Jackson's databind for versions later than 2.9.0 __would__ work here.  
However, it will not work with Java 9 Modules.  
Specifically, for Jackson versions 2.9.1 - 2.9.5, Java can not find the jackson.databind module.  
Therefore, we use 2.9.0 here.

1. Copy the src directory tree to your destination location
2. Copy build.sh to that location
3. Copy run.sh to that location
4. At the command line, cd to your destination location
5. At the command line, execute: build.sh

The app should build.

6. At the command line, execute: run.sh

The console should display:
```
Hello JSON using Jackson!  
{
  "name" : "Hat",
  "count" : 5,
  "discount" : false,
  "notes" : "The Queen likes them"
}
{
  "name" : "Bundle",
  "count" : 1,
  "discount" : false,
  "subfields" : [ {
    "name" : "Coat",
    "count" : 7,
    "discount" : true,
    "notes" : "Out of fashion"
  }, {
    "name" : "Shoes",
    "count" : 8,
    "discount" : false
  } ]
}
```

To deploy this app:

- You must have the Java JRE for the release you used for building, or greater, installed on the destination computer

1. Copy the lib, and out directories and run.sh file to the destination computer and directory
2. At the command line, cd to that location
2. At the command line, execute: run.sh

The console should display:

```
Hello JSON using Jackson!
{
  "name" : "Hat",
  "count" : 5,
  "discount" : false,
  "notes" : "The Queen likes them"
}
{
  "name" : "Bundle",
  "count" : 1,
  "discount" : false,
  "subfields" : [ {
    "name" : "Coat",
    "count" : 7,
    "discount" : true,
    "notes" : "Out of fashion"
  }, {
    "name" : "Shoes",
    "count" : 8,
    "discount" : false
  } ]
}
```
