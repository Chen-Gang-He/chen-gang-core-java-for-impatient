package chengang.com.chapter1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHello() {
//        Hello hello = new Hello();
        assertEquals("hello", Hello.helloWorld());
    }


}
