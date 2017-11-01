# java9-gradle-example-props

Minimal gradle java 9 examples that shows a bug with the experimental plugins
of gradle for java 9 module system.

If you use the run command than the jvm didn't find the resource file on the
path, but if you use the install command and run the shell or cmd file the
example is working.

## Installation

If you want to use this project you need java 9(9.0.1 for example) and
gradle 4.2.1 or use the gradle wrapper.

## Usage

If you want to run this example use the command 

```
gradle clean run
```

or

```
./gradlew clean run
```

If you want to inspect or run the installable version then you should use the
command

```
gradle clean install
```

or

```
./gradlew clean install
```

After that you can inspect the files or run it in the build/install folder.
