package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {

        if ((x == 0) || (y == 0)) {
            System.out.println("zero");
        } else if ((x > 0) && (y > 0)) {
            System.out.println("first");
        } else if ((x < 0) && (y > 0)) {
            System.out.println("second");
        } else if ((x < 0) && (y < 0)) {
            System.out.println("third");
        } else {
            System.out.println("fourth");
        }
    }

    public static void main(String[] args) {
        CoordinatePane pane = new CoordinatePane();
        pane.printQuadrant(0,0);
        pane.printQuadrant(1,1);
    }
}