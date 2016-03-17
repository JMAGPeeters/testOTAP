/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OntwikkelStraatJUnitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Johan
 */
public class OntwikkelStraatJUnitTest { public OntwikkelStraatJUnitTest() {
    }
    
     @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void test() {
        TestClass test = new TestClass();
         Assert.assertEquals("1", test.doIets(1));
    }
    
     @Test
    public void test2() {
        TestClass test = new TestClass();
         Assert.assertEquals("2", test.doIets(2));
    }
    
        @Test
    public void test3() {
        TestClass test = new TestClass();
         Assert.assertEquals("3", test.doIets(3));
    }
    
      @Test
    public void test4() {
        TestClass test = new TestClass();
         Assert.assertEquals("4", test.doIets(4));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    private static class TestClass {

        public TestClass() {
            
        }

        public String doIets(int i) {
           return Integer.toString(i);
        }
    }
}