# Java: Classes, Objects, Access Specifiers, Constructors, and OOP Concepts

---

## 1. Classes

- **Definition:** A class is a blueprint for creating objects. It defines properties (fields) and behaviors (methods).
- **Syntax:**
    ```java
    class ClassName {
            // fields
            // methods
    }
    ```
- **Example:**
    ```java
    class Car {
            String color;
            void drive() {
                    System.out.println("Driving...");
            }
    }
    ```

---

## 2. Objects

- **Definition:** An object is an instance of a class. It represents a real-world entity.
- **Creation:**
    ```java
    Car myCar = new Car();
    myCar.color = "Red";
    myCar.drive();
    ```
- **Features:** Each object has its own copy of fields and can access class methods.

---

## 3. Access Specifiers

- **Purpose:** Control the visibility of class members (fields, methods, constructors).
- **Types:**

    | Specifier   | Scope                                                      |
    |-------------|------------------------------------------------------------|
    | `public`    | Accessible from anywhere                                   |
    | `private`   | Accessible only within the same class                      |
    | `protected` | Accessible within the same package and subclasses          |
    | (default)   | Accessible within the same package (no keyword specified)  |

- **Example:**
    ```java
    public class Example {
            private int data;
            protected void show() { }
    }
    ```

---

## 4. Constructors

- **Definition:** Special methods used to initialize objects.
- **Characteristics:**
    - Same name as the class.
    - No return type.
    - Can be overloaded.
- **Types:**
    - **Default Constructor:** No parameters.
    - **Parameterized Constructor:** Takes arguments.
- **Example:**
    ```java
    class Student {
            String name;
            Student(String n) { // Parameterized constructor
                    name = n;
            }
    }
    ```

---

## 5. Destructor (Finalize Method)

- **Java does not have destructors** like C++. Instead, it uses the `finalize()` method for cleanup before garbage collection.
- **Note:** `finalize()` is deprecated in Java 9 and later.
- **Example:**
    ```java
    protected void finalize() throws Throwable {
            // cleanup code
            super.finalize();
    }
    ```
- **Best Practice:** Use try-with-resources or explicit cleanup methods instead of relying on `finalize()`.

---

## Summary Table

| Concept         | Purpose                                  | Example Syntax                |
|-----------------|------------------------------------------|-------------------------------|
| Class           | Blueprint for objects                    | `class MyClass { ... }`       |
| Object          | Instance of a class                      | `MyClass obj = new MyClass();`|
| Access Specifier| Controls visibility                      | `private int x;`              |
| Constructor     | Initializes new objects                  | `MyClass() { ... }`           |
| Destructor      | Cleanup before object is destroyed       | `protected void finalize()`   |

---


## 6. Object-Oriented Programming (OOP) in Java

---

### What is OOP?

- **Object-Oriented Programming (OOP)** is a programming paradigm based on the concept of "objects", which can contain data and code to manipulate that data.
- Java is a pure object-oriented language (except for primitive types).

---

### Four Main Principles of OOP

#### 1. Encapsulation

- **Definition:** Wrapping data (fields) and code (methods) together as a single unit.
- **Purpose:** Protects data by restricting direct access and exposing only necessary operations.
- **How in Java:** Use `private` fields and `public` getter/setter methods.
- **Example:**
    ```java
    class Person {
        private String name;
        public String getName() { return name; }
        public void setName(String n) { name = n; }
    }
    ```

#### 2. Inheritance

- **Definition:** Mechanism where one class acquires properties and behaviors of another class.
- **Purpose:** Promotes code reuse and establishes relationships.
- **How in Java:** Use the `extends` keyword.
- **Example:**
    ```java
    class Animal {
        void eat() { System.out.println("Eating"); }
    }
    class Dog extends Animal {
        void bark() { System.out.println("Barking"); }
    }
    ```
    ##### Types of Inheritance in Java

    1. **Single Inheritance:** A class inherits from one superclass.
        ```java
        class A { }
        class B extends A { }
        ```
    2. **Multilevel Inheritance:** A class inherits from a class, which in turn inherits from another class.
        ```java
        class A { }
        class B extends A { }
        class C extends B { }
        ```
    3. **Hierarchical Inheritance:** Multiple classes inherit from the same superclass.
        ```java
        class A { }
        class B extends A { }
        class C extends A { }
        ```
    > **Note:** Java does not support multiple inheritance (a class inheriting from more than one class) to avoid ambiguity, but it can be achieved using interfaces.

#### 3. Polymorphism

- **Definition:** Ability of an object to take many forms (method overloading and overriding).
- **Purpose:** Enables one interface to be used for different data types.
- **Types:**
    - **Compile-time (Static):** Method overloading.
    - **Run-time (Dynamic):** Method overriding.
- **Example:**
    ```java
    class Animal {
        void sound() { System.out.println("Animal sound"); }
    }
    class Cat extends Animal {
        void sound() { System.out.println("Meow"); }
    }
    ```

#### 4. Abstraction

- **Definition:** Hiding complex implementation details and showing only essential features.
- **Purpose:** Reduces complexity and increases efficiency.
- **How in Java:** Use abstract classes and interfaces.
- **Example:**
    ```java
    abstract class Shape {
        abstract void draw();
    }
    class Circle extends Shape {
        void draw() { System.out.println("Drawing Circle"); }
    }
    ```

---

### OOP Concepts Table

| Principle      | Description                                      | Java Implementation         |
|----------------|--------------------------------------------------|----------------------------|
| Encapsulation  | Data hiding and access control                   | `private`, getters/setters |
| Inheritance    | Reuse and extend existing classes                | `extends`                  |
| Polymorphism   | Many forms: overloading/overriding methods       | Method overloading/overriding |
| Abstraction    | Hiding details, exposing only essentials         | `abstract` class, interface|

---

### Benefits of OOP in Java

- **Modularity:** Code is organized into classes.
- **Reusability:** Inheritance allows code reuse.
- **Scalability:** Easy to add new features.
- **Maintainability:** Encapsulation and abstraction make code easier to maintain.

---

### Example: OOP in Action

```java
abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() { System.out.println("Car started"); }
}

class Bike extends Vehicle {
    void start() { System.out.println("Bike started"); }
}

public class TestOOP {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}
```

---

**In summary:** OOP in Java helps you build robust, reusable, and maintainable software by modeling real-world entities as objects and leveraging the four core principles: encapsulation, inheritance, polymorphism, and abstraction.
