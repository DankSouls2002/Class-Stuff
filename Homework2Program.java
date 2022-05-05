//by Payton Bayron
public class Homework2Program {

	public static void main(String[] args) {
		
		int scrunglin1 = 200; //creates and sets the Scrunglins
		int scrunglin2 = 1983;
		int scrunglin3 = 5;
		
		int scrunglinSum = scrunglinAdd(scrunglin1, scrunglin2, scrunglin3); //calls scrunglinAdd, sets scrunglinSum to its outcome
		
		scrunglinCompare(scrunglinSum, (scrunglin1 + scrunglin2 + scrunglin3)); //calls scrunglinCompare, ensuring the above addition is correct
		
		int[] scrunglinArray = {scrunglin1, scrunglin2, scrunglin3}; //creates the array of known Scrunglins
		
		scrungPrint(scrunglinArray); //prints per line each known Scrunglin
		
	}

	public static int scrunglinAdd(int input1, int input2, int input3) //adds the known Scrunglins
	{
		int sum = input1 + input2 + input3;
		return sum;
	}
	
	public static void scrunglinCompare(int baseNum, int comparitor) //ensures the above addition is sancitifed and correct
	{
		if (baseNum == comparitor)
		{
			System.out.println("The sum of Scrunglins is equal to its constituents added together, all is well in the world, nothing is wrong.");
		}
		else 
		{
			System.out.println("The sum of Scrunglins isn't equal to its constituents. Something is wrong, I can feel it.");
		}
	}
	
	public static void scrungPrint(int[] arrayUsed) //iterates through the array of known Scrunglins, printing their likenesses in each new line
	{
		for (int i = 0; i < arrayUsed.length; i++)
		{
			System.out.println("This lowly scrunglin: " + arrayUsed[i]);
		}
	}
}
