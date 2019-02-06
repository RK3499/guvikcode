import java.util.Scanner;  
 class Prime {  
   public static void main(String[] args) {  
       Scanner s = new Scanner(System.in);  
        
       int start = s.nextInt();  
        
       int end = s.nextInt();   
       for (int i = start; i <= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i+" ");  
           }  
       }  
   }  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
      for(int i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                   return false;  
            }
        }
       return true;  
   }  
}  
