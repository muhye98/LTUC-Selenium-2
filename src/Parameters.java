import java.util.Random;

public class Parameters {

	// this is for urls
	static String url = "https://magento.softwaretestingboard.com/";
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// this is to get element By (id,...)
	static String CreatAccountXpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']";
	static String SignUpXpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]";
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	// here to get the names or varibles.

	String[] FirstNameArray = { "ahmed", "jamal", "khaled", "jaber", "Osama" };
	String[] LastNameArray = { "Khalel", "Sami", "Raid", "Mohammed", "Mahmmud" };
	String FirstName;
	String LasttName;
	String Email;
	int Passoward;
	String passwordAsString;
	String FinalPassoward;
	
		
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public Parameters() {

		Random first = new Random();
		int firstrandomame = first.nextInt(5);
		FirstName = FirstNameArray[firstrandomame];
		
		
		Random second = new Random();
		int secondrandomame = second.nextInt(5);
		LasttName = LastNameArray[secondrandomame];
		
		
		Random number = new Random();
		int randomNumber = number.nextInt(100) + 1;
		Email = FirstName + LasttName + randomNumber + "@gmail.com";
		
		
		Random Passowar = new Random();
		int randomPassoward = Passowar.nextInt(99999999);
		Passoward = randomPassoward;
		passwordAsString = String.valueOf(Passoward);
		FinalPassoward = "M"+ passwordAsString + "m@@" ;
	
	}
	
	


}
