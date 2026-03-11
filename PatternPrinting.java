class PatternPrinting{
    public static void main(String args[]) throws InterruptedException{

        int n = 5;

        for (int i = 1; i <= n; i++)//Outer
        {
            for (int j = 1; j <= n - i ; j++)
            {
                System.out.print("  ");
            }
                for(int k = 1; k <= i ; k++)
                {
                        System.out.print("* ");
                }
                   

            
            System.out.println();
        }
        
    }      
}