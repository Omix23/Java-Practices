class Shoe{

        public void Brand (String s1){
            System.out.println(s1);  
        }

        public void Size (int s){
            System.out.println(s);
        }

        public void Price (Double p){
            System.out.println(p);
        }


}

class ShoeBrand {
    public static void main(String args[]){
            String name = "Nike";
            int size = 6;
            double price = 9000;

        Shoe s = new Shoe();
        s.Brand(name);
        s.Size(size);
        s.Price(price);


    }
}