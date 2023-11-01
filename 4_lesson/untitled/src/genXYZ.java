import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class genXYZ {
    public  static String maxSubstring(String in) {
        String maxStr="";
        for (int i = 0; i < in.length() -1; i++) {
            String s = String.valueOf(in.charAt(i));
            for (int j = i; j < in.length()-1; j++) {
                if (in.charAt(j) != in.charAt(j + 1)) {
                    s += String.valueOf(in.charAt(j + 1));
                } else {

                    break;

                }

            }
            if (maxStr.length() < s.length()) {
                maxStr = s;

            }


        }
        return maxStr;
    }
    public static void main(String[] args) {
        Random random = new Random();
        String resultstr = "";
        for (int i = 0; i <5 ; i++) {
            int n = random.nextInt(0,3);
            switch(n){
                case 0:
                    resultstr += "X";
                    break;
                case 1:
                    resultstr += "Y";
                    break;
                case 2:
                    resultstr += "Z";
                    break;
            }


        }

        System.out.println(resultstr);
        System.out.println(maxSubstring(resultstr));
    }
}
