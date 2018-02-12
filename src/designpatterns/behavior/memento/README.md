## Explanation

> Without violating encapsulation, capture and externalize an object's internal state so that the object can be returned to this state later.

Memento pattern is used to restore state of an object to a previous state. 
Memento design pattern is used when we want to save the state of an object so that we can restore later on. Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object, this protects the integrity of saved state data.

Memento design pattern is implemented with two objects – Originator and Caretaker.
Originator is the object whose state needs to be saved and restored and it uses an inner class to save the state of Object. The inner class is called Memento and it’s private, so that it can’t be accessed from other objects.
Caretaker is the helper class that is responsible for storing and restoring the Originator’s state through Memento object. Since Memento is private to Originator, Caretaker can’t access it and it’s stored as an Object within the caretaker.

One of the best real life example is the text editors where we can save it’s data anytime and use undo to restore it to previous saved state.

## Advantage

We can use Serialization to achieve memento pattern implementation that is more generic rather than Memento pattern where every object needs to have it’s own Memento class implementation.

## Disadvantage

If Originator object is very huge then Memento object size will also be huge and use a lot of memory.

## Usage

* a snapshot of an object's state must be saved so that it can be restored to that state later, and
* a direct interface to obtaining the state would expose implementation details and break the object's encapsulation

## Main points

originator : the object for which the state is to be saved. It creates the memento and uses it in future to undo.
memento : the object that is going to maintain the state of originator. Its just a POJO.
caretaker : the object that keeps track of multiple memento. Like maintaining savepoints.

## Real world examples

* [java.util.Date](http://docs.oracle.com/javase/8/docs/api/java/util/Date.html)
