package org.egc;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue( true );
    }
    @Test
    public void testSecond(){
    	UndirectedGraph<String, DefaultEdge> g =
                new SimpleGraph<String, DefaultEdge>(DefaultEdge.class);
    	assertTrue( true );
    }
   
}
