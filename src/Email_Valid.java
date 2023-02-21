import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Valid {

	public static void main(String[] args) {


		ArrayList<String> email = new ArrayList<String>();  
		email.add("example@domain.com");
		email.add("exampletwo@domain.com");
		email.add("12@domain.com");
		
		//Adding an invalid emails in list  
		email.add("@helloworld.com"); 
		
		//Regular Expression   
		String regx = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"; 
		
		//Compile regular expression to get the pattern  
		Pattern pattern = Pattern.compile(regx);
		
		//Iterate emails array list  
		for(String email1 : email){
			
		//Create instance of matcher   
		Matcher matcher = pattern.matcher(email1);  
		System.out.println(email1 +" : "+ matcher.matches()+"\n");  
		}  
	}  
}