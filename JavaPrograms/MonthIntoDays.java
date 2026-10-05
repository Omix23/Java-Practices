class MonthIntoDays {
    public static void main(String args[]){
        int $month = 2;

        switch ($month)
        {
            case 1,3,5,7,8,10,12 -> System.out.println("Number of days in this month: 31");
             case 4,6,9,11 -> System.out.println("Number of days in this month: 30");
              case 2 -> System.out.println("29 days when its Leap year otherwise 28 days.");
        }
    }
}