
## Explanation

> To define a representation of grammar of a given language, along with an interpreter that uses this representation to interpret sentences in the language

Interpreter pattern is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar.

Given a language, define a representation for its grammar along
with an interpreter that uses the representation to interpret sentences in the
language.

We can discuss the Interpreter pattern only in terms of formal grammars but in this area there are better solutions that is why it is not frequently used.

The best example of interpreter design pattern is java compiler that interprets the java source code into byte code that is understandable by JVM. Google Translator is also an example of interpreter pattern where the input can be in any language and we can get the output interpreted in another language.


## Advantage

It is easier to change and extend the grammar.
Implementing the grammar is straightforward.

## Usage

* When the grammar of the language is not complicated.
* When the efficiency is not a priority.


## Real world examples
* [java.util.Pattern](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)
* [java.text.Normalizer](http://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html)
* All subclasses of [java.text.Format](http://docs.oracle.com/javase/8/docs/api/java/text/Format.html)
* [javax.el.ELResolver](http://docs.oracle.com/javaee/7/api/javax/el/ELResolver.html)
