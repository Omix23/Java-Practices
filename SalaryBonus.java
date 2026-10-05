class SalaryBonus {
    public static void main(String args[]){
        double salary = 9000;

        if (salary >= 50000)
            salary *= 1.2;
        else if (salary >= 30000)
            salary *= 1.1;
        else 
            salary *= 1.05;
  
        System.out.println(salary);
    }
}