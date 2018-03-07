import java.util.Random;
public class hw2AcceptanceTest
{
	static int size=0;
	public static void main(String [] args)
	{
		System.out.println("Problem 4:");
		ImprovedRandom ra=new ImprovedRandom();
		System.out.println("The random number is:" + " " + ra.boundaryRandom(3,11));
		System.out.println("Min is:" + " " + ra.getFirstBoundary());
		System.out.println("Max is:" + " " + ra.getSecondBoundary());

		System.out.println("Problem 5:");
		String input="This class is easy";
		ImprovedStringTokenizer strin=new ImprovedStringTokenizer(input," ");

		/*for(int i=0;i<strin.countTokens()+3;i++)
		{
			System.out.println(strin.nextToken());
		}*/
		/*
		{
			System.out.println("Here");
			size++;
		}*/

		
		//System.out.println(strin.getSize());
		String output[]=strin.arrayReturn(input," ");
		//System.out.println(output.length);
		/*for(int i=0;i<strin.getSize();i++)
		{
			//System.out.println("Here");
			output[i]=strin.nextToken();
		}*/
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}

	}
}
