public class Lab413 {
    public static void main(String[] args) {
        new F();
    }
    }


    class D {
        public D() {
            System.out.println("Konstruktor D");
        }
    }

    class E extends D{
        public E() {
            System.out.println("Konstruktor E");
        }
    }

    class F extends E {
        public F() {
            System.out.println("Konstruktor F");
        }
    }