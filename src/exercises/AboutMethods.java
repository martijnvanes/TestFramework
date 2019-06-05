package exercises;

public class AboutMethods {
    public AboutMethods() {
    }

    public static void main(String[] args) {
        System.out.println(multiply(3, 5));
        System.out.println("I expect the answer is 15");
    }

    private static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
}
