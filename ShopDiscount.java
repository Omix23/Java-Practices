class ShopDiscount{
    public static void main(String args[]){
        
        double bill = 6000;
        System.out.println("Bill: " +bill);
        double discount ;
        if (bill >= 5000)
            discount = bill * 0.20; // 20% discount
        else if (bill >= 2000)
            discount = bill * 0.10; // 10% discount 
        else 
            discount = bill * 0.05; // 5% discount
        
        System.out.println("Discount: " +discount);
        System.out.println("Total bill: " + (bill - discount));


    }
}