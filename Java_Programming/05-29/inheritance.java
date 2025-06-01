class GrandParent{
    void displayGP(){
        System.out.println("GrandParent Class");
    }
}
class Parent extends GrandParent{
    void display(){
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child Class");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayGP();
        obj.display();
        obj.show();
    }
}
