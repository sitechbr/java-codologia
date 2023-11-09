
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void prints(String s) {
        if (s==null) {
            throw new NullPointerException("Exception: s is null!");
        }
        System.out.println("Inside method print: " + s);
    }

    public static void main(String[] args) {
        String[] list = {"first step",null,"second step"};
        for (String s: list) {
            try {
                prints(s);
                System.out.println("Inside block try");
            }
            catch (NullPointerException e){
                System.out.println(e.getMessage());
                System.out.println("Exception was processed. Program continues");
            }
            finally {
                System.out.println("Inside block finally");
            }
        }

    }
}