# OOPs principles

**Encapsulation:**

- Bind (bundle) data and methods that operate on the data.

**Abstraction:**

- Reduce complexity by hiding unnecessary details.
- Reduce complexity and only expose what is necessary.
- is the process of hiding the implementation details and showing only the functionality to the user.
- It lets to focus what the object does instead of how it does it.

*Ways to achieve abstraction:*

- Abstract class (0 to 100%)
- Interfaces(100%)

*Abstract class:*

- A class declared as abstract with abstract keyword
- It can have abstract and non-abstract methods
- It needs to be extended and its method implemented
- It cannot be instantiated
- It can have constructors and static method
- It can't be final class. However,
- It can have final method which will force subclasses not to change the body of the method
- Can have zero or more abstract and default method

```java
public abstract class TaxCalculator {
    public abstract double calculate();

    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}

public class TaxCalculator2025 extends TaxCalculator {
    @Override
    public double calculate() {
        return 0.0;
    }
}
```

Rule

- If there is an abstract method in a class that class must be abstract as well.
- If you are extending an abstract class that has an abstract method, you must either provide the implementation of the
  method or make this class abstract as well.

**Interfaces:**

- is a blueprint of a class.
- it is a contract for entities
- it has an abstract methods
- It is a mechanism to achieve abstraction
- It has method definition only not implementation
- It also the IS-A relationship
- It cannot be instantiate like abstract class
- It uses to achieve loose-coupling

Bad Features of interfaces in java since java 8,9

- It has constants static fields
- It has static and default method with default implementation
- it can have private methods

**There are three main reasons to use interfaces in java**

- It is used to achieve abstraction
- By using interface we can support the functionality of multiple inheritance which is absolutely bad practice.
- It can be used to achieve loose coupling

```java
interface InterfaceName {
//    Declare constant field
//  Declare methods that are abstract and public by default
}
```

Example:

```java
public interface Resizable {
    void resize();
}


public interface UIWidget extends Resizable {
    void render();
}

public class TextBox implements UIWidget {
    @Override
    public void resize() {
        // logic goes here
    }

    @Override
    public void render() {
        // .....
    }
}
```

An interface which has no member know as *Marker* or *Tagged* interface

### Difference between Interfaces and Abstract classes in java

1. Abstract class abstract and non-abstract method while interfaces can have only abstract methods Since java 8,
   interfaces can have static and default method also.
2. Abstract class doesn't support multiple inheritance while interfaces support multiple inheritance.
3. Abstract class can have final, non-final and static, non-static variables while interfaces has only static and final
   variables
4. Abstract classes can provide the implementation of interfaces while interfaces can provide the implementation of
   abstract classes
5. The abstract keyword is used to declare abstract classes while the interface keyword is used to declare interfaces
6. An abstract classes can extend anther java classes and implements multiple java interfaces while an interfaces only
   extends another multiple java interfaces.
7. An abstract class can be extended using extends keyword while an interface can be implemented using implements
   keyword
8. Java abstract class can have class members like private, protected, public or default while interface members are
   public by default also support private members only besides public.
9. Interfaces doesn't support protected members.

**Inheritance:**

- A mechanism in which one object acquires all the properties and behaviors of a parent object.
- It is an important part of Object-Oriented Programming.
- It represents IS-A/An relationship between classes
- Also know as generalization or *parent-child* relationship.
