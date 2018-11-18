public class SubPrinter extends Printer {
    int z = 3;

    @Override
    void printMe() {
        System.out.println("x wynosi " + x + " y wyniosi " + y + ", z wynosi " + z );
        System.out.println("jestem egzepmlarzem klasy " + this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();
        subPrinter.printMe();

        Printer printer = new Printer();
        printer.printMe();

        printer = subPrinter;
        printer.printMe();
    }
}
