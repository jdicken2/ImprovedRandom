import java.util.StringTokenizer;
public class ImprovedStringTokenizer extends StringTokenizer
{
	String output[];
	int size;
	
	ImprovedStringTokenizer(String str)
	{
		super(str);
	}

	ImprovedStringTokenizer(String str, String delim)
	{
		super(str,delim);
	}

	ImprovedStringTokenizer(String str, String delim, boolean returnDelims)
	{
		super(str,delim,returnDelims);
	}

	public int getSize()
	{
		return size;
	}

	public void setSize(int si)
	{
		size=si;
	}

	String [] arrayReturn(String input, String delim)
	{
		ImprovedStringTokenizer stri=new ImprovedStringTokenizer(input,delim);
		size=stri.countTokens();
		output=new String[size];
		while(stri.hasMoreTokens())
		{
			for(int i=0;i<output.length;i++)
			{
				output[i]=stri.nextToken();
			}
		}
		return output;

	}

}