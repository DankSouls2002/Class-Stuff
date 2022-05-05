
public class Week5RecursionInClassFactorials {

	public static void main(String[] args) {
		int i = 25;
		long factorial = multiplyNums(i); //returns negatives past 25 but that's a limitation of Longs afaik, nothing a bit of Ostrich Algorithm can't fix!
		System.out.println(i + "! = " + factorial);
	}

	public static long multiplyNums(int i)
	{
		
		if (i >= 1)
		{
			return i * multiplyNums(i - 1); //recursion, returns i multiplied by itself - 1
		}
		else
		{
			return 1; //returns 1 if i falls below 1
		}
		
	}
}
