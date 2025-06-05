package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }

    public static void main(String[] args) {
        BitwiseValuesSwap swapper = new BitwiseValuesSwap();
        swapper.swap(1,2);
    }
}
