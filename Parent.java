class Parent {
    public void display() {
        System.out.println("Inside Parent class");
    }

    public void printMessage() {
        System.out.println("Printing message from Parent");
    }

    public void printMessage(String message) {
        System.out.println("Printing message from Parent: " + message);
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Inside Child class");
    }

    public void printMessage(int number) {
        System.out.println("Printing number from Child: " + number);
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display(); 

        Child child = new Child();
        child.display(); 

        parent.printMessage(); 
        parent.printMessage("Hello");

        child.printMessage(); 
        child.printMessage(10); 
    }
}
