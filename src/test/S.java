
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author buidanhnam
 */
public class S {

   public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("nGUYEn quaNG vInH");
        l.add("nGUYEn quaNG vInH");
        l.add("nGUYEn quaNG vInH");
        l.add("nGUYEn quaNG vInHs");
        List<String> l2 = new ArrayList<>();
        for (String string : l) {
            String re = returnString(string);
            int index = 2;
            int length = re.length();
            while (l2.contains(re)) {
                if(index == 2){
                   re += index;
                }
                else{
                    re = re.substring(0, length - 1);
                    System.out.println("sss" + re);
                    re += index;
                }
                index++;
            }
            
            l2.add(re);
            re += "@ptit.edu.vn";
            System.out.println(re);
        }

    }

    private static String returnString(String s) {
        String regex = "\\s+";
        String[] strings = s.split(regex);
        String name = strings[strings.length - 1];
        name = name.toLowerCase();
        for (int i = 0; i < strings.length - 1; i++) {
            String x = String.valueOf(strings[i].charAt(0)).toLowerCase();
            name += x;
        }
        return name;
    }
}
