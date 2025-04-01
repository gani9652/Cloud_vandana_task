import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in); //for user inputs
      System.out.print("Enter the first String:");
      String str1= sc.nextLine();//to store first string
      System.out.println("Enter the second String:");
      String str2=sc.nextLine();//to store second
      if(str1.length()==str2.length()){ //length differ then there are not anagrams
          str1.toLowerCase();//Our aim is to convert to either lower or upper case
          str2.toLowerCase();
          char [] first=str1.toCharArray();//convert them to array
          char [] second =str2.toCharArray();
          Arrays.sort(first);//arrange them in order
          Arrays.sort(second);
          if(Arrays.equals(first,second)){//check both are in same order or not
              System.out.print("They are Anagrams");
          }
          else{
              System.out.print("They are Not Anagrams");
          }
      }
      else{
          System.out.println("They both are not anagrams");
      }
    }
}