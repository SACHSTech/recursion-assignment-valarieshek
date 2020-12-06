package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.After;
import java.io.*;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    @Before
    public void beforeTest(){
      // some steps to perform before tests are run
    }
    
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        // assertEquals(EXPECTEDVALUE, TESTVALUE);
        // assertTrue(TESTBOOLEAN);
    }
    
    // add more tests
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }

    public static void main (String[] args) throws IOException{
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
      String str;
      String strWord;
      str = keyboard.readLine();
      strWord = Recursion.endX(str);
      System.out.println(strWord);
      
    }
    
    
}
