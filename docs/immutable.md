# Immutable
### immutable objects are instances whose state does’t change after it has been initialized. 
### For example, String is an immutable class and once instantiated its value never changes.
## Benefits of Immutable Class in Java
### An immutable class is good for caching purposes because you don’t have to worry about the value changes.
### Another benefit of immutable class is that it is inherently thread-safe, so you don’t have to worry about thread safety in case of multi-threaded environment.

## How to Create an immutable class in Java?
### To create an immutable class in Java, you have to do the following steps.

### Declare the class as final, so it can’t be extended.
### Make all fields private so that direct access is not allowed.
### Don’t provide setter methods for variables.
### Make all mutable fields final so that its value can be assigned only once.
### Initialize all the fields via a constructor performing deep copy.
### Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.

## Advantages
###	1.Thread safety
###	2.Atomicity of failure
###	3.Absence of hidden side-effects
###	4.Protection against null reference errors
###	5.Ease of caching
###	6.Prevention of identity mutation
###	7.Avoidance of temporal coupling between methods
###	8.Support for referential transparency
###	9.Protection from instantiating logically-invalid objects
###	10.Protection from inadvertent corruption of existing objects