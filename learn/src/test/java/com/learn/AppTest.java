package com.learn;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	
	CalculatorService calculatorService = Mockito.mock(CalculatorService.class);
	
	
    @Test
    public void testApp()
    {
    	Calculator calculator = new Calculator(calculatorService);
    	when(calculatorService.add(3, 2)).thenReturn(5);
        assertEquals(5, calculator.add(3, 2));
        verify(calculatorService).add(3, 2);
        
    }
}
