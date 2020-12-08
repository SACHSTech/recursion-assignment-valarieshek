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
    }
    @Test
    public void Test2(){
        // make assertion statement(s)
        assertEquals( Recursion.stringClean("vaallaariie"),"valarie");
    }
    @Test
    public void Test3(){
        // make assertion statement(s)
        assertEquals("helo", Recursion.stringClean("helloo"));
    }
    
    @After
    public void afterTest(){
      // some steps to perform after tests are run
    }
    
    
}
