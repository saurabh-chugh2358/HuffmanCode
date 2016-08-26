public class practice {

   public static void main(String args[]) {
      String s = "Strings are immutable";
      char result = s.charAt(8);
      int x = s.charAt(8);
      System.out.println(result);
      System.out.println(x);
      
      String Str = new String("Welcome to Tutorialspoint.com");

      System.out.print("Return Value :" );
      System.out.println(Str.substring(10) );

      System.out.print("Return Value :" );
      System.out.println(Str.substring(11, 16) );

      
   }
}

