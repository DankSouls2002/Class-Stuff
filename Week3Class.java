
public class Week3Class {
//By Payton Bayron 4/12/22
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		one(); //calls method one
		
		System.out.println(two()); //prints the output of method two
		
		String recievedMessage = two(); //same as above, different method
		System.out.println(recievedMessage); //prints recievedMessage
		
		int myValue = 42; //sets myValue, for method three
		three("Sent to method. ", myValue); //sets parameters for and calls method three
		
		String sentMessage = "Sent to method. "; //sets sentMessage
		three(sentMessage, 42); //same as above, different method
		
		System.out.println( four("This is a message.") ); //sets theMessage parameter in method 4, calls method 4 as well
	}

	public static void one() //Method with no parameters and no return
	{
		System.out.println("Hello World!"); //prints the string within
	}
	
	public static String two() //Method with no parameters and a return
	{
		String myMessage = "Sent from method."; //sets the string myMessage
		return myMessage; //returns myMessage
	}
	
	public static void three(String theMessage, int theInt) //Method with parameters and no return
	{
		System.out.println(theMessage + theInt); //prints parameters theMessage and theInt
	}
	
	public static String four(String theMessage) //Method with parameters and a return
	{
		return "This message was returned: " + theMessage; //returns the string and the parameter the Message
	}
	
	
}
