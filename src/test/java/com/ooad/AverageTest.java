package com.ooad;
import org.junit.Assert;
import org.junit.Before; 
import org.junit.Test;  
public class AverageTest {     
    private Average average;     
    private int[] list;      
    
    @Before     
    public void setUp() throws Exception {         
        average = new Average();         
        list = new int[]{1, 2, 3, 4, 5};     
        
    }      
    @Test     
    public void testWhenKIsNegative() {         
        Assert.assertSame(0, average.average(-1, list));     
        
    }      
    @Test     
    public void testWhenKIsZero() {         
        Assert.assertSame(0, average.average(0, list));     
        
    }      
    @Test     
    public void testWhenKIsPositive() {         
        Assert.assertSame(2, average.average(3, list));     
        
    } 
    @Test     
    public void testWhenKIsBigPositive() {         
        Assert.assertSame(3, average.average(100, list));     
        
    } 
    @Test     
    public void testWhenListIsEmpty() {         
        Assert.assertSame(0, average.average(3, new int[]{}));     
        
    } 
    
}
