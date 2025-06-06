package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }

        int result = dividend / divider;
        result *= divider;

        if (result == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

    public static void main(String[] args) {
        IntegerDivider divider = new IntegerDivider();
        divider.printCompletelyDivided(1, 5);
    }
}
