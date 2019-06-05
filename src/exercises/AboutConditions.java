package exercises;

public class AboutConditions {
    public static void main(String[] args) {
        System.out.println(getExamResult(100));
        System.out.println(getExamResult(99));
        System.out.println(getExamResult(65));
    }
    private static String getExamResult(int score) {
        if (score > 99) {
            return "Well done!";
        }
        if (score <= 65) {
            return "Too bad, you failed";
        }
        else {
            return "You passed";
        }
    }


}
