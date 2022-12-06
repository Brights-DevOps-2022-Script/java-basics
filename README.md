## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Prerequisites

Install OpenJDK (Java Development Kit): 

```
sudo apt-get update
sudo apt-get install openjdk-17-jdk openjdk-17-demo openjdk-17-doc openjdk-17-jre-headless openjdk-17-source
```
(also mentioned here: https://wiki.ubuntuusers.de/Java/Installation/OpenJDK/)

Check installation by
```
java -version
which javac
```

VS Code has already compiled the Java files for us (as mentioned above). They can be found in bin folder.
Go to the root folder of the project.

Package the application by
```
jar cvf java-basics.jar -C bin .
```

Run the App by 
```
java -classpath java-basics.jar com.bt.java.basics.App
```

## Containerisation
Containerise the app by pulling a Java image from https://hub.docker.com/_/eclipse-temurin.
```
docker pull eclipse-temurin:17-jdk-alpine
docker build --tag java-basics:latest .
```

Run and check the java-basics container either by
```
docker run -d --name java-basics java-basics
docker logs java-basics
```
or
```
docker run java-basics
```
