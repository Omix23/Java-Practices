class starPrint {
    public static void main (String args[]){

        char star = '*';

        for (int i = 0; i < 5;i++)
        {

            for (int j = 5 ; j > i ; j--)
            {
                    System.out.print(" " + star);
            }

            System.out.println();
        
        } 

    }

}