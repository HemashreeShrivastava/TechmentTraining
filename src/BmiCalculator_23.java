import java.util.*;
public class BmiCalculator_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vlaue of height in metre");
        float height = sc.nextFloat();
        System.out.println("enter the vlaue of weight in kg");
        float weight = sc.nextInt();
        double bmi =weight/(height*height);
        if(bmi < 18.5)
        {
        	System.out.println("you are under weight and your weight is "+bmi);
        	
        }
        else if(bmi > 18.5 && bmi <25)
        {
        	System.out.println("you are normal weight and your weight is "+bmi);
        	
        }
        else if(bmi >20 && bmi <30)
        {
        	System.out.println("you are over weight and your weight is "+bmi);
        	
        }
        else
        {
        	System.out.println("you are obese and your weight is "+bmi);
        }

        
	}

}
