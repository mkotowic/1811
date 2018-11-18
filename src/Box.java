import java.awt.*;

public class Box {

    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    Box bulidBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Box bulidBox(Point topLeft, Point bottomRight) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = bottomRight.x;
        this.y2 = bottomRight.y;
        return this;
    }

    Box bulidBox(Point topLeft, int w, int h) {
        this.x1 = topLeft.x;
        this.y1 = topLeft.y;
        this.x2 = (this.x1 + w);
        this.y2 = (this.y1 + h);
        return this;
    }

    void printBox() {
        System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] args) {

        Box rect = new Box();  //tworzenie obiektu

        System.out.println("Wywołanie bulidBox ze współrzędnymi (25,25) i (50,50):");
        rect.bulidBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("Wywołanie bulidBox ze współrzędnymi (10,10) i (20,20):");
        Point a = new Point(10,10);
        Point b = new Point(20, 20);
        rect.bulidBox(a,b);
        rect.printBox();

        System.out.println("Wywołanie bulidBox ze współrzędnymi (10,10), szerokością 50 i wysokością 50:");
        Point c = new Point(10,10);
        rect.bulidBox(a, 50, 50);
        rect.printBox();




    }
}
