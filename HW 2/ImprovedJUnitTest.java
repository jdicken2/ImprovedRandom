import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
/**
 *
 * @author djnig
 */
public class ImprovedJUnitTest
{
    
    private ByteArrayOutputStream println = new ByteArrayOutputStream();
    private PrintStream oldSystemOut = System.out;
    
   
    @Before
    public void setUpStreams()
    {
        System.setOut(new PrintStream(println));
    }

    @After
    public void cleanUpStreams()
    {
        System.setOut(oldSystemOut);
    }

    @Test
    public void arrayReturnsTest()
    {
        String input="This class is easy";
        ImprovedStringTokenizer strin=new ImprovedStringTokenizer(input," ");
        String output[]=strin.arrayReturn(input," ");
        assertEquals("This",output[0]);
        assertEquals("class",output[1]);
        assertEquals("is",output[2]);
        assertEquals("easy",output[3]);

    }
    
    @Test
    public void arrayReturnsTestComma()
    {
        String input="This,class,is,easy";
        ImprovedStringTokenizer strin=new ImprovedStringTokenizer(input,",");
        String output[]=strin.arrayReturn(input,",");
        assertEquals("This",output[0]);
        assertEquals("class",output[1]);
        assertEquals("is",output[2]);
        assertEquals("easy",output[3]);

    }

    @Test
    public void StringTokenizerTest()
    {
        String input="This class is easy";
        ImprovedStringTokenizer strin=new ImprovedStringTokenizer(input, " ");
        assertEquals("This", strin.nextToken());
        assertEquals("class", strin.nextToken());
        assertEquals("is", strin.nextToken());
        assertEquals("easy", strin.nextToken());
    }
}