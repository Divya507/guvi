/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
 class CatalanNumbers {
   public static long fact(int i) {
      if(i <= 1) {
         return 1;
      }
      return i * fact(i - 1);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int num = sc.nextInt();
      
      //(2n)!/(n+1)!*n!
      for(int i = 0; i<num; i++) {
         long Cn = (fact(2*i))/(fact(i+1)*fact(i));
         System.out.println(Cn+"\t");
      }
   }
}
