## Explanation

> Decouple an abstraction from its implementation so that the two can vary independently.


The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.

This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.

This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.

For example you have a shape with different color and you are supposed to allow mixing different shapes with different colors. The bridge allow you just create separate colors and set it for the shape as needed

## Advantage

It enables the separation of implementation from the interface.
It improves the extensibility.
It allows the hiding of implementation details from the client.

## Usage

* When you don't want a permanent binding between the functional abstraction and its implementation.
* When both the functional abstraction and its implementation need to extended using sub-classes.
* It is mostly used in those places where changes are made in the implementation does not affect the clients.
