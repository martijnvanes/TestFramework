package exercises;

public class PrintVariables {
    public static void main(String[] args) {
        int aIntegerValue = 2000000000;
        double aDoubleValue = 99.99;
        boolean aBooleanValue = false;
        String aStringValue = "I'd like my bank account to show ";

        System.out.println(aStringValue + aIntegerValue + ". Hopefully Euro's but Dollars will also do. When I say I have that much, that statement will be " + aDoubleValue + "% " + aBooleanValue);

    }
}
