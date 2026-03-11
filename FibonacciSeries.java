class FibonacciSeries {
    public static void main (String args[]){
        
         int n = 7;

         int a = 0; 
         int b = 1;

             System.out.println(a);
             System.out.println(b);

        for (int i = 3; i <= n; i++)
        {
           int next = a + b; 
           System.out.println(next); 
            a = b; 
            b = next; // Iteration 1 :  a = 0 , b = 1, next = 1 , a = 1, b = 1;
                      // Iteration 2 : a = 1, b = 1, next = 2, a = 1, b = 2;
                      // Iteration 3 : a = 1, b = 2, next = 3, a = 1, b = 3;
                      //.
                      //.
                      //.

           
            
        }
       
    }
}