package src;
import java.util.Scanner;  // Import the Scanner class
class controlStatementsLooping {
	
	 public static void main(String[] args) {
		 // System defined data Code starts here
	        int age;
	        double weight;
	     
	        // if (age >= 18) {
	        //     if (weight >= 50.0) {
	        //         System.out.println("You are eligible to donate blood.");
	        //     } else {
	        //         System.out.println("You must weigh at least 50 kilograms to donate blood.");
	        //     }
	        // } else {
	        //     System.out.println("You must be at least 18 years old to donate blood.");
	        // }
		 // System defined data Code ends here
		
		 //USer defined data Code starts here
		 Scanner UserdefAge_WeightObj = new Scanner(System.in); 

	        System.out.println("Enter your age");
	        String userAge = UserdefAge_WeightObj.nextLine();  // Read user input
	        int Age=Integer.parseInt(userAge); 
	        
			System.out.println("Enter your weight");
	        String userWeight = UserdefAge_WeightObj.nextLine();  // Read user input
	        int Weight=Integer.parseInt(userWeight);
	       
	       
	       
	        if (Age >= 18) {
	            if (Weight >= 50.0) {
	                System.out.println("You are eligible to donate blood.");
	            } else {
	                System.out.println("You must weigh at least 50 kilograms to donate blood.");
	            }
	        } else {
	            System.out.println("You must be at least 18 years old to donate blood.");
	        }
	        //USer defined data Code ends here
		  System.out.println("Looping starts from here");
		  System.out.println("Switch cases");
		 int num=20;
        switch(num){
        case 5 :  System.out.println("It is 5");
                  break;
        case 10 : System.out.println("It is 10");
                  break;
        case 15 : System.out.println("It is 15");
                  break;
        case 20 : System.out.println("It is 20");
                  break;
        default:  System.out.println("Not present");
	 }
		  System.out.println("While loop");
        int i=0;
        while (i<=10)
        {
          System.out.println(i);
          i++;
        }
		 System.out.println("for loop");
        for (int j= 0;j<= 3;j++)
        {
          System.out.println(j);
		}
		 int j=0;
        do
        {
          System.out.println(j);
          j++;
        }while(j<=5);
	 }
}



