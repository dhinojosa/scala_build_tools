# Scala Build Tools

Alternative Build Tools for Scala.  All projects in here are 
small with one test `EmployeeSpec` and one class, `Employee`

Each build is equipped with ScalaTest.

## Maven

```sh
cd maven
mvn clean test
```

## Gradle

```sh
cd gradle
gradle build
```

## Mill

```sh
cd mill
mill foo.{clean,test}
```
