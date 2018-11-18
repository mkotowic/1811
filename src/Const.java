public class Const {
    public static void main(String[] args) {

        new B();
    }
}
class A {
    A() {
        System.out.println("Działa konstruktor klasy A");
    }
    A(boolean arg) {

    }
}

class B extends A {
    B(){
        super(true);
        System.out.println("Działa konstruktor klasy B");
    }
}