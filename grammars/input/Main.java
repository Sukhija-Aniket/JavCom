import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String[] args) {
      try {
         Node root = new TempoJavaParser(System.in).Goal();
         System.out.println("// Program parsed successfully");
         System.out.println("// Author: Aniket Sukhija");
         System.out.println("// Generated using JTB 1.3.2");
         root.accept(new GJNoArguDepthFirst()); // Your assignment part is invoked here.
      } catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
