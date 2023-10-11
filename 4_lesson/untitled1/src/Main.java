import java.util.Random;


public class Main {
    public static String maxSubstring(String in) {
        String maxStr="";
        for (int i = 0; i < in.length()-1; i++) {
            String s = String.valueOf(in.charAt(i));
            for (int j = i; j < in.length()-1 ; j++) {
                if (in.charAt(j)==in.charAt(j+1)) {
                    s+=String.valueOf(in.charAt(j+1));
                }
                else {
                    break;
                }

            }
            if (maxStr.length()<s.length()) {
                maxStr =s;
            }
        }
        return maxStr;
    }
    public static void main(String[] args) {
        Random rand = new Random();

        String result="";
        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(0,3);
            if (n==0) {
                result+="X";
            } else if (n==1) {
                result+="Y";
            } else if (n==2) {
                result+="Z";
            }
        }
        System.out.println(result);
        System.out.println(maxSubstring(result));
    }
}