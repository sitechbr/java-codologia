public class OneChange1 {
    public static void main(String[] args) {
        String myString = "1 plus 1 ravno 2";
        String resultStr = myString.replaceAll("1","one");
        System.out.println(resultStr);
    }
}
