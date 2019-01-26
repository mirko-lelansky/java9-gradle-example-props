# java11-gradle-example-props

Minimal gradle java 11 examples that shows the properties location from the
module path. With java 9 and the chainsaw plugin of gradle this example didn't
work with "clean run". But with the moduleplugin from javamodularity and java 11
this example will work.

## Installation

If you want to use this project you need java 11 and gradle 5.1.1 or use the
gradle wrapper.

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
