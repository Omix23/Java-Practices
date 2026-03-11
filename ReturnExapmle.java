class ReturnExample{

    static int add(int a,int b){
        return a + b;
    }

     static int sub(int a, int b){
        return a - b;
    }

     static int mul(int a,int b){
        return a * b;
    }

     static double div(int a,int b){
        return (double) a / b;
    }


    public static void main (String args[]){
        int x = 6;
        int y = 3;

        System.out.println(add(x,y));
        System.out.println(sub(x,y));
        System.out.println(mul(x,y));
        System.out.println(div(x,y));
    }
}