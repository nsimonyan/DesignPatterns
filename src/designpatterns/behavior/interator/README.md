
## Explanation

> Provide a way to access the elements of an aggregate object sequentially without exposing its underlying implementation.

The Iterator pattern is also known as Cursor.


Iterator pattern is used to provide a standard way to traverse through a group of Objects. 

In collection framework, we are now using Iterator that is preferred over Enumeration.

This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

## Advantage

It supports variations in the traversal of a collection.
It simplifies the interface to the collection.

## Usage

* When you want to access a collection of objects without exposing its internal representation.
* When there are multiple traversals of objects need to be supported in the collection.


## Real world examples

* [java.util.Iterator](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html)
* [java.util.Enumeration](http://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html)
