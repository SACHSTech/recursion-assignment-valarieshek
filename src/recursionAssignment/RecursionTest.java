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
        assertEquals(2, Recursion.count8(1828));
    }
    @Test
    public void Test2(){
        // make assertion statement(s)
        assertEquals( Recursion.stringClean("vaallaariie"),"valarie");
        assertEquals("hi*i*i*i*i*i", Recursion.pairStar("hiiiiii"));
        assertEquals(0, Recursion.count8(976535));
    }
    @Test
    public void Test3(){
        // make assertion statement(s)
        assertEquals("helo", Recursion.stringClean("helloo"));
        assertEquals("ar*rived", Recursion.pairStar("arrived"));
        assertEquals(4, Recursion.count8(218488687));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
