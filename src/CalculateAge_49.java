import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class CalculateAge_49 {

	public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    System.out.println("enter your date of birth in yyyy-mm-dd");
    String sdate=scanner.next(); 
    LocalDate date1=LocalDate.parse(sdate);
    LocalDate date2=LocalDate.now();
    Period	period=Period.between(date1,date2);
	System.out.println("Your age is : "+period.getYears()+"years"+period.getMonths()+"months"+period.getDays()+"days");
    

	}

}
