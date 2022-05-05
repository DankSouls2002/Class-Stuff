
public class Week3inClasses {
//By Payton Bayron
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass theClass; //special variable, keeps track of the object
		theClass = new SecondClass(); //sets theClass to draw from SecondClass
		
		String[] hiddenMysteries = new String[3]; //creates the string array
		
		theClass.setMyInfo("Secret beans recipe"); //interfaces setMyInfo to set myInfo1
		
		hiddenMysteries[0] = "Passwords"; //sets parts of the array
		hiddenMysteries[1] = theClass.getMyInfo();
		hiddenMysteries[2] = "Addresses";
		
		for (int i = 0; i<3; i++) //iterates through and prints parts of the array
		{
			System.out.println(hiddenMysteries[i]);
		}
	}
}
