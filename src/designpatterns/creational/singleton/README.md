## Explanation

> Define a class that has only one instance and provides a global point of access to it.

In other words ensures that only one object of a particular class is ever created.

**Effective java note**

A single-element enum type is the best way to implement a singleton

## Advantage

Saves memory because object is not created at each request. Only single instance is reused again and again.

## Usage

* the logging class
* managing a connection to a database
* file manager

## Real world examples

* [java.lang.Runtime#getRuntime()](http://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime%28%29)
* [java.awt.Desktop#getDesktop()](http://docs.oracle.com/javase/8/docs/api/java/awt/Desktop.html#getDesktop--)
* [java.lang.System#getSecurityManager()](http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getSecurityManager--)


## Singleton implementation types
* Eagle load
* Static block
* Lazy load
* Thread safe
* Bill Pugh
* Enum
* Reflection problem
* Serialization problem