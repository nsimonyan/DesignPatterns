## Explanation
 
 > Attach a flexible additional responsibilities to an object dynamically

In other words, The Decorator Pattern uses composition instead of inheritance to extend the functionality of an object at runtime.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior. 

We use inheritance or composition to extend the behavior of an object but this is done at compile time and its applicable to all the instances of the class. We can’t add any new functionality of remove any existing behavior at runtime – this is when Decorator pattern comes into picture.

The Decorator Pattern is also known as Wrapper.

## Advantage

It provides greater flexibility than static inheritance.
It enhances the extensibility of the object, because changes are made by coding new classes.
It simplifies the coding by allowing you to develop a series of functionality from targeted classes instead of coding all of the behavior into the object.

## Usage

When you want to transparently and dynamically add responsibilities to objects without affecting other objects.
When you want to add responsibilities to an object that you may want to change in future.
Extending functionality by sub-classing is no longer practical.

## Main parts
Component Interface – The interface or abstract class defining the methods that will be implemented
Component Implementation – The basic implementation of the component interface
Decorator – Decorator class implements the component interface and it has a HAS-A relationship with the component interface. The component variable should be accessible to the child decorator classes, so we will make this variable protected.
Concrete Decorators – Extending the base decorator functionality and modifying the component behavior accordingly.
## Real world examples
 * [java.io.InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html), [java.io.OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html),
 [java.io.Reader](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html) and [java.io.Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html)
 * [java.util.Collections#synchronizedXXX()](http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#synchronizedCollection-java.util.Collection-)
 * [java.util.Collections#unmodifiableXXX()](http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#unmodifiableCollection-java.util.Collection-)
 * [java.util.Collections#checkedXXX()](http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#checkedCollection-java.util.Collection-java.lang.Class-)
