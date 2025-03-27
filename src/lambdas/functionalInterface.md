# Functional Interface

*Functional interfaces* provide target types for lambda expressions and method references

** The are Four(4) types of functional interfaces:**
1. Consumer
    - represents an operation that takes a single argument and return no result that's why it is called consumer
    - e.g void consume(Object obj);
2. Supplier
    - It is the opposite of the consumer interface
    - It represents an operation that takes no input but returns an output that's why it is called supplier meaning it supplies a value
    - e.g Object supply();
3. Function 
    - It represents function that can map a value to different value
    - e.g Object map(obj);
4. Predicate 
    - It represents an operation that takes an object and check if that object satisfies an operation
    - e.g bool test(condition);
    - We use this interface for filtering data