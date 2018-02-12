## Explanation

> Encapsulate the absence of an object by providing a substitutable alternative that offers suitable default do nothing behavior. In short, a design where "nothing will come of nothing"

In Null Object pattern, a null object replaces check of NULL object instance. Instead of putting if check for a null value, Null Object reflects a do nothing relationship. Such Null object can also be used to provide default behaviour in case data is not available.

## Advantage

The Null Object class is often implemented as a Singleton. Since a null object usually does not have any state, its state can't change, so multiple instances are identical. Rather than use multiple identical instances, the system can just use a single instance repeatedly.


## Usage

* when an object requires a collaborator. The Null Object pattern does not introduce this collaboration--it makes use of a collaboration that already exists
* when some collaborator instances should do nothing
* when you want to abstract the handling of null away from the client



## Main points
Client - requires a collaborator.
AbstractObject - declares the interface for Client's collaborator
implements default behavior for the interface common to all classes, as appropriate
RealObject - defines a concrete subclass of AbstractObject whose instances provide useful behavior that Client expects
NullObject - provides an interface identical to AbstractObject's so that a null object can be substituted for a real object implements its interface to do nothing. What exactly it means to do nothing depends on what sort of behavior Client is expecting when there is more than one way to do nothing, more than one NullObject class may be required