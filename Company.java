// multilevel inheritence
class Company{
    String company_name = "asb";
    static Company x = new Company(); 

    class employee extends Company{
        String emoloyee_name = "aditya";
        int salary = 80000;
    }
    
    class developer extends employee{
        int bonus = 20000;
    }
    
    public static void main(String[] args){
    
        developer d = x.new developer();
        System.out.println("Company name is : " + d.company_name);
        System.out.println("Employee name is :" + d.emoloyee_name);
        System.out.println("Salary of Employee :" + d.salary);
        System.out.println("Bonus of developer :" + d.bonus);  
    }
    
}

