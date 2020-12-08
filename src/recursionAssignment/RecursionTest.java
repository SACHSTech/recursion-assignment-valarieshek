package recursionAssignment;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;
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
        assertEquals("helo", Recursion.stringClean("hello"));
        assertEquals("hel*lo", Recursion.pairStar("hello"));
    }
    @Test
    public void Test2(){
        // make assertion statement(s)
        assertEquals( Recursion.stringClean("vaallaariie"),"valarie");
        assertEquals("hi*i*i*i*i*i", Recursion.pairStar("hiiiiii"));
    }
    @Test
    public void Test3(){
        // make assertion statement(s)
        assertEquals("helo", Recursion.stringClean("helloo"));
        assertEquals("ar*rived", Recursion.pairStar("arrived"));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
