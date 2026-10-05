class LargestNum{
    public static void main(String args[]){
        int x = 5;
        int y = 5;
        int z = 10;

        if (x > y  && x > z)
            System.out.println("x is greater than y & z");
        else if (y > z)
            System.out.println("y is greater than x & z");
        else 
            System.out.println("z is greater than x & y");
    }
}