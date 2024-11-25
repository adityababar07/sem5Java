class Company{
    
    // inheritence in java is implemented using extends keyword
    // the child class inherits the functions or features of the superclass(paernt class) 

    String company_name = "abc";
    
    static class Employee extends Company{
        int salary = 60000;
        String employee_name = "adi";
    } 

    public static void main(String[] args){
        Employee obj = new Employee();

        System.out.println("Company name :" + obj.company_name);
        System.out.println("Employee name :" + obj.employee_name);        
        System.out.println("salary :" + obj.salary);        

    }
}

