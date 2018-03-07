import java.util.Random;
public class ImprovedRandom extends Random
{
	int firstBoundary;
	int secondBoundary;
	public ImprovedRandom()
	{
		super();
	}

	public ImprovedRandom(long seed)
	{
		super(seed);
	}

	public int getFirstBoundary()
	{
		return firstBoundary;
	}

	public int getSecondBoundary()
	{
		return secondBoundary;
	}

	public void setFirstBoundary(int firstBo)
	{

		firstBoundary=firstBo;
	}

	public void setSecondBoundary( int secondBo)
	{
		secondBoundary=secondBo;
	}

	public int boundaryRandom(int firstB, int secondB)
	{
		firstBoundary=firstB;
		secondBoundary=secondB;
		ImprovedRandom r=new ImprovedRandom();
		return r.nextInt(secondB-firstB)+firstB;
	
	}



}