import java.lang.*;
public class StringDemo {
   public static void main(String[] args) {
      String str1 = "Vish";
      String str2 = "Vish";
      String str3 = "Hi";
     
      // checking for equality
      boolean retval1 = str2.equals(str1);
      boolean retval2 = str2.equals(str3);
     
      // prints the return value
      System.out.println("str2 is equal to str1 = " + retval1);
      System.out.println("str2 is equal to str3 = " + retval2);
   }
}