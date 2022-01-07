import java.util.Scanner;

public class FindMissingLetter {
    public static char findMissingLetter(char[] array){
        int ch = array[0];
        char falt = ' ';
        for(int i = 0; i <= array.length-1; i++){
            System.out.println("Char agora: " + array[i]);
            System.out.println("int ch agora: " + ch);
           
            if(array[i] != ch){
                System.out.println(falt = (char)ch);
                break;
            }
            ch++;
        }          
        return ' ';
  }
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      FindMissingLetter f = new FindMissingLetter();
      char[] input = in.nextLine().toCharArray(); 
      f.findMissingLetter(input);

  }
}
