
class Example{
    public static void main(String args[]){
        int[] array = {10,20,30,50,60};
        int x = 10;
        int y = 40;
     
        System.out.println(Math.max(array[0],array[4]));
        System.out.println(Math.max(x,y));

        int max = 0;
        for (int arr : array){
            if (max < arr){
                max = arr;
            }
        }
        System.out.println(max);

       
        
    }
}
