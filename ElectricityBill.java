class ElectricityBill {
    public static void main(String args[]){

        int $units = 56;
        int $price = 0;
            System.out.println("Units Consumed: " +$units);    

        if ($units > 0 && $units <= 100)
            $price = $units * 5;
        else if ($units >= 101 && $units <= 300)
            $price = $units * 7;
        else if ($units > 300)
            $price = $units * 10;

        System.out.println("Total Electricity Bill: " +$price);

    }
}