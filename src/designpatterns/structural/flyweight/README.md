## Explanation
Real world example

> Use sharing to support large numbers of fine-grained objects efficiently .

To reuse already existing similar kind of objects by storing them and create new object when no matching object is found.

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

Flyweight design pattern is used when we need to create a lot of Objects of a class. Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by sharing objects.

## Advantage

It reduces the number of objects.
It reduces the amount of memory and storage devices required if the objects are persisted

## Usage

When an application uses number of objects
When the storage cost is high because of the quantity of objects.
When the application does not depend on object identity.

## Real world examples

* [java.lang.Integer#valueOf(int)](http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf%28int%29) and similarly for Byte, Character and other wrapped types.
