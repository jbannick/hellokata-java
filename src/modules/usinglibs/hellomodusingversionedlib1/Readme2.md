This describes how to build this Multi-release library using IntelliJ.

It's based on:
https://blog.jetbrains.com/idea/2017/10/creating-multi-release-jar-files-in-intellij-idea/

The key operational elements are:

- The term "module" is overloaded here
    - IntelliJ modules are separately executable collections of code
    - Java modules are collections of Java packages
- This project uses 1 IntelliJ module for each of the 4 executable elements
- There are separate JDK settings for:
    - Your IntelliJ installation
    - This project
    - Each of its 4 IntelliJ modules
    
The rest of this description consists of pictures.

#### Project Structure:

TODO: ADD IMAGE

#### JDK Settings:

###### IntelliJ Installation Java Compiler

![IntelliJ Java Compiler](images/IntelliJJavaCompiler.png)

###### Library Project JDK

![Library Project JDK](images/LIB4ProjectJDK.png)

###### Library Root Version JDK

![Library Root Version JDK](images/LIB4RootJDK.png)

###### Library Java 9 Version JDK

![Library Java 9 Version JDK](images/LIB4Java9JDK.png)

###### Java 7 App JDK

![Java 7 App JDK](images/LIB4App7JDK.png)

###### Java 9 App JDK

![Java 9 App JDK](images/LIB4App9JDK.png)
