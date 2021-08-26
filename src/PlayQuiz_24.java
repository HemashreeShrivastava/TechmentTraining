import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class Question
{
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String correctOption;
	public Question(String question, String option1, String option2, String option3, String option4,
			String correctOption) {
		super();
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctOption = correctOption;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrectOption() {
		return correctOption;
	}
	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}
	
}

public class PlayQuiz_24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Question q=new Question("jaipur is known as ", "pink city", "white city", "yellow city", "small city", "pink city");

		Question q1=new Question("Capital of Chhattisgarh is ", "Durg", "Bhilai", "Raipur", "Bhopal", "Raipur");
		HashMap <Integer,Question> list=new HashMap<Integer,Question>();
		list.put(1, q);
		list.put(2, q1);
		System.out.println("Enter the question number");
		int qno= scanner.nextInt();
		System.out.println("question "+" "+qno+" "+list.get(qno).getQuestion());
		System.out.println("a. "+list.get(qno).getOption1());
		System.out.println("b. "+list.get(qno).getOption2());
		System.out.println("c. "+list.get(qno).getOption3());
		System.out.println("d. "+list.get(qno).getOption4());

	/*	for(Entry<Integer,Question> e: list.entrySet()) 
		{
			System.out.println("question "+" "+qno+e.getValue().getQuestion());
			System.out.println("a. "+e.getValue().getOption1());
			System.out.println("b. "+e.getValue().getOption2());
			System.out.println("c. "+e.getValue().getOption3());
			System.out.println("d. "+e.getValue().getOption4());
		}*/
		System.out.println("Enter the answer of given question");
		String answer=scanner.next();
		Boolean flag=false;
		for(Entry<Integer,Question> e: list.entrySet()) 
		{
			if(e.getValue().getCorrectOption().equalsIgnoreCase(answer))
			{
				flag=true;
				//System.out.println("the answer is correct");
				
			}
			else
			{
				
				flag=false;
				//System.out.println("the answer is wrong and the correct answer is "+e.getValue().getCorrectOption());
				
			}
		}
		if(flag=true)
		{
			System.out.println("the answer is correct");

		}
		else
		{
			System.out.println("the answer is wrong and the correct answer is "+list.get(answer));

		}
	}

}
