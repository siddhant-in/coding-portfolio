class Parent {
    Parent() {
        System.out.println("Parent constructor calling");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor calling");
    }
}

public class Constructor_Calling {

    public static void main(String[] args) {
        Child c = new Child();
    }
}
