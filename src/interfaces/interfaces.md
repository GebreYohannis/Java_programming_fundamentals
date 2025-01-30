**Interfaces:**
- It is a *contract* or *interconnection* between entities.
- Interfaces are similar to a class but it only have method declaration no implementation
- We use interfaces to build loosely-coupled, extensible, testable applications
- Interfaces care about *WHAT SHOULD BE DONE* not *HOW IT SHOULD BE DONE*. On the other hand,
- Classes care about *HOW IT SHOULD BE DONE* not *WHAT SHOULD BE DONE*.
- Examples are:
    - Data Compression
    - Searching
    - Sorting
    - Encryption
    - Many more
- Generally speaking *Interfaces* are all about WHAT's while *Classes* are all about HOW's.

**Coupling:**
- Is the level of dependencies between classes.

As a rule of thumb program to an interface not a concrete(real) implementation


**Dependency Injection:**
- Our classes should not instantiate their dependencies
- Ways to inject dependencies:
  - *Constructor injection* (injecting dependencies via constructors)
  - *Setter injection* (injecting dependencies via setter method)
  - *Method injection* (injecting dependencies via any method in the class)

**Interface Segregation Principles:**
- Divide big interfaces into smaller ones