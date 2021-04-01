/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testdrivendevelopment;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 *
 * @author 220014442 Moegamad Nur Duncan
 */
public class KeyBTest {
    
    public KeyB keyb1;
    public KeyB keyb2;
    public KeyB keyb3;
    
    @BeforeEach
    public void setUp() {
        keyb1 = new KeyB();
        keyb2 = new KeyB();
        keyb3 = keyb2;        
    }
    
    @Test
    void testIden(){
        assertSame(keyb2, keyb3);
    }
    //
    @Test
    void testEqual(){
        assertEquals(keyb2, keyb3);
    }
     
    @Test
    void failTest(){
        if (keyb3 ==keyb2){
        fail(" Deliberately fail keyb3 is equal to keyb2");
    }
    }
    
    @Disabled("Disabled until keyb1 is sold")
    @Test
    void disableTest() {
        assertSame(keyb1, keyb3);
    
    }
    
    
    @Timeout (1)
    @Test
    public void testWithTimeout(){
       for (int i=0;i<100000;i++)
       {
           System.out.println(i);
       }
    
    
    
    
    }

}

