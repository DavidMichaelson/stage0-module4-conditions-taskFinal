package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
            return;
        }

        if (((firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide)
                && (secondSide + thirdSide > firstSide))) {
            System.out.println("T" +
                    "this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

    public static void main(String[] args) {
        TriangleSidesValidator validator = new TriangleSidesValidator();
        validator.validate(1,2,3);
        validator.validate(2,3,4);
        validator.validate(0,1,2);
        validator.validate(-2,-3,-4);
    }
}
