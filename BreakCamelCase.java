import java.util.*;

public class BreakCamelCase{
    public static String camelCase(String input) {
        char[] c = input.toCharArray();

        String out = "";
        for(int i = 0; i < input.length()-1; i++){
            out = out + c[i];
            if(Character.isUpperCase(c[i+1])){
                out = out + " ";
            }
        }
        out = out + c[input.length()-1];
        System.out.println(out);
        return out;
    }
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);

       String input = in.nextLine();
       BreakCamelCase b = new BreakCamelCase();
       b.camelCase(input);
    }
}