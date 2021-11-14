package exercise1;

public class RelationalLogicalOpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
	    double weight = 71.23;
	    int height = 191;
	    boolean married = false;
	    boolean attached = false;
	    char gender = 'm';
	    int day = 15;
	    int month = 10;
	    int year = 1582;
	    int Year = 2020;
	    int x = 29;
	    double d1 = 2.2 + 4.4;
	    double d2 = 6.6;
	    int d3 = 2 + 4;
	      
	    System.out.println(!married && !attached && (gender == 'm'));  //true
	      
	    System.out.println(married && (gender == 'f'));  //false
	    
	    System.out.println((height >= 180) && (weight >= 65) && (weight <= 80));  //true
	    
	    System.out.println((height >= 180) || (weight >= 90));  //true
	    
	    //Write an expression for all unmarried male, age between 21 and 35, with height above 180, and weight between 70 and 80.
	    System.out.println(!married && (gender == 'm') || (age >= 21) && (age <= 35) && (height >= 180) && (weight >= 70) && (weight <= 80));
	    
	    //Given the year, month (1-12), and day (1-31), write a boolean expression which returns true for dates before October 15, 1582
	    System.out.println((day <= 15) && (month <= 10) && (year <= 1582));
	    
	    //A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
	    System.out.println((Year % 4 == 0) && (Year % 100 != 0) || (Year % 400 == 0));
	    
	    //Return true if x is outside 0 and 100
	    System.out.println((x >= 0) && (x <= 100));
	    
	    //Return true d1 and d2
	    System.out.println (d1 != d2);
	    
	    
	    System.out.println(!married && !attached && (gender == 'm'));
	    
	    if (!married && !attached && (gender == 'm'))
	    	System.out.println("It is true");
	    
	    if (married && (gender == 'f'))
	    	System.out.println("It is false");
	    
	    if ((height >= 180) && (weight >= 65) && (weight <= 80))
	    	System.out.println("It is true");
	    
	    if ((height >= 180) || (weight >= 90))
	    	System.out.println("It is true");
	    
	    
	   }
	}
