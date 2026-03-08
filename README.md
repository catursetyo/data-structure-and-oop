# Data Structure and OOP: The 4 Pillars of Java

> **Name:** Catur Setyo Ragil\
> **NRP:** 5027251066\
> **Class:** Data Structure and OOP (B)

This repository contains independent practice projects for my college course, demonstrating the implementation of the four fundamental pillars of Object-Oriented Programming (OOP) in Java. All examples use a `Noodle` theme to illustrate the concepts clearly.

---

# 1. Inheritance

**Inheritance** is a mechanism where a new class (subclass) acquires the properties and behaviors of an existing class (superclass). It promotes code reusability.

The `Gacoan` class inherits properties (`brand`, `flavor`, `price`) and methods from the `Noodle` parent class using the `extends` keyword. It uses `super()` to call the parent's constructor.
```java
// child class
class Gacoan extends Noodle {
    public Gacoan(String brand, String flavor, int price) {
        super(brand, flavor, price); // super() used to call the Noodle() constructor 
    }
}
```

# 2. Encapsulation

**Encapsulation** is the bundling of data (variables) and the methods that operate on them into a single unit. It restricts direct access to some of the object's components, protecting data integrity.

Variables in the `Noodle` class are declared as `private`. They can only be read or modified through controlled `public getter` and `setter` methods.
```java
class Noodle {
    // variable has to be set into private
    private String brand;
    private String flavor;
    private int price;

    public Noodle(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    // setter for changing 'flavor' variable
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // getter for reading 'flavor' data
    public String getFlavor() {
        return flavor;
    }
```

# 3. Polymorphism

**Polymorphism** means "many forms." It allows objects of different classes to be treated as objects of a common superclass. The specific method executed depends on the actual object type created at runtime.

Variables are declared with the parent type (`Noodle`), but instantiated with child objects (`Gacoan` and `Indomie`). Calling the overridden `cook()` method executes the specific child's version.
```java
class Noodle {
    public void cook() {
        System.out.println("Cooking noodle...");
    }
}

class Gacoan extends Noodle {
    // override the cook() method in parent class
    @Override
    public void cook() {
        System.out.println("Cooking Gacoan...");
    }
}

class Indomie extends Noodle {
    @Override
    public void cook() {
        System.out.println("Cooking Indomie...");
    }
}
```
We declare variables using the parent type (`Noodle`) but instantiate them as specific child objects (`Gacoan` and `Indomie`). When `cook()` is called, Java dynamically executes the child's specific method instead of the parent's.
```java
// Main execution
public class Main {
    public static void main(String[] args) throws Exception {
        // parent class declared as data type, but child class declared as object
        Noodle jaki = new Gacoan();
        Noodle dzili = new Indomie();

        jaki.cook();
        dzili.cook();
    }
}
```

# 4. Abstraction

**Abstraction** hides complex implementation details and shows only the essential features of the object. It acts as a strict contract that child classes must follow.

The `Noodle` class is declared as `abstract` and contains an abstract method `cook()`. Child classes are forced to provide their own specific implementation of this method.
```java
abstract class Noodle {
    protected String brand;
    protected int price;

    public Noodle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // abstract method
    public abstract void cook();
}
```
Implementation:
```java
class Gacoan extends Noodle {
    @Override
    public void cook() {
        System.out.println("Cooking Gacoan...");
    }
}
```

## How to Run the Projects

Since the Java files use `package` declarations, they must be compiled and run from the correct directory level to avoid `NoClassDefFoundError`. 

Follow these steps for any of the pillars (e.g., `encapsulation`):

1. Open your terminal and navigate to the `src` folder of the specific topic:
   ```bash
   cd encapsulation/src
2. Compile all Java files in that directory:
    ```bash
    javac *.java
3. Move up one directory level (so the terminal can see the package folder from the outside):
    ```bash
    cd ..
4. Run the compiled program by calling the package name **followed by the Main class**:
    ```bash
    java encapsulation.Main
***(Note: Replace encapsulation with inheritance, polymorphism, or abstraction depending on which program you want to run).***