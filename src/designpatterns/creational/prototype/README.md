## Explanation

> Cloning of an existing object instead of creating new one and can also be customized as per the requirement.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.

## Advantage

It reduces the need of sub-classing.
It hides complexities of creating objects.
The clients can get new objects without knowing which type of object it will be.
It lets you add or remove objects at runtime.

## Usage
* When the classes are instantiated at runtime.
* When the cost of creating an object is expensive or complicated.
* When you want to keep the number of classes in an application minimum.
* When the client application needs to be unaware of object creation and representation.

## Real world examples

* [java.lang.Object#clone()](http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone%28%29)
