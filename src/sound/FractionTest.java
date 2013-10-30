package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testFractionEquals() {
	    Fraction f1 = new Fraction(1,4);
	    Fraction f2 = new Fraction(1, 6);
	    Fraction f3 = new Fraction(2, 4);
	    Fraction f4 = new Fraction(1, 4);
	    Fraction f5 = new Fraction(2, 8);
	    Fraction f6 = new Fraction(6);
	    Fraction f7 = new Fraction();
	    
	    assertEquals(true, f1.equals(f1));
	    assertEquals(true, f1.equals(f4));
	    assertEquals(false, f1.equals(f2));
	    assertEquals(false, f1.equals(f3));
	    assertEquals(false, f1.equals(f5));
	    assertEquals(false, f1.equals(f6));
	    assertEquals(false, f1.equals(f7));
	}
	
	@Test
	public void testFractionHashCode() {
        Fraction f1 = new Fraction(1,4);
        Fraction f4 = new Fraction(1, 4);
        Fraction f6 = new Fraction(6);
        Fraction f7 = new Fraction();
        
        assertEquals(true, f1.hashCode() == f1.hashCode());
        assertEquals(true, f1.hashCode() == f4.hashCode());
        assertEquals(true, f7.hashCode() == f7.hashCode());
        assertEquals(true, f6.hashCode() == f6.hashCode());
	}
	
	@Test
	public void testFractionGetNumerator() {
        Fraction f1 = new Fraction(1,4);
        Fraction f2 = new Fraction(1, 6);
        Fraction f6 = new Fraction(6);
        Fraction f7 = new Fraction();
        
        assertEquals(true, f1.getNumerator() == f2.getNumerator());
        assertEquals(false, f1.getNumerator() == f6.getNumerator());
        assertEquals(false, f1.getNumerator() == f7.getNumerator());
	}
	
	@Test
	public void testFractionGetDenominator() {
	    Fraction f1 = new Fraction(1,4);
        Fraction f3 = new Fraction(2, 4);
        Fraction f4 = new Fraction(1, 4);
        Fraction f6 = new Fraction(6);
        Fraction f7 = new Fraction();
        
        assertEquals(true, f1.getDenominator() == f3.getDenominator());
        assertEquals(true, f1.getDenominator() == f4.getDenominator());
        assertEquals(false, f1.getDenominator() == f6.getDenominator());
        assertEquals(false, f1.getDenominator() == f7.getDenominator());
	}
	
	@Test
	public void testFractionToString() {
	    Fraction f1 = new Fraction(1,4);
        Fraction f4 = new Fraction(1, 4);
        Fraction f5 = new Fraction(2, 8);
        Fraction f6 = new Fraction(6);
        Fraction f7 = new Fraction();
        
        assertEquals(true, f1.toString().equals(f4.toString()));
        assertEquals(false, f1.toString().equals(f6.toString()));
        assertEquals(false, f1.toString().equals(f7.toString()));
        assertEquals(true, f1.toString().equals("1/4"));
        assertEquals(false, f1.toString().equals(f5.toString()));
	}
	
	@Test
	public void testFractionEvaluate() {
	    Fraction f1 = new Fraction(1,4);
        Fraction f4 = new Fraction(1, 4);
        Fraction f5 = new Fraction(2, 8);
        Fraction f6 = new Fraction(6);
        Fraction f7 = new Fraction();
        
        assertEquals(true, f1.evaluate() == f5.evaluate());
        assertEquals(false, f1.evaluate() == f6.evaluate());
        assertEquals(false, f1.evaluate() == f7.evaluate());
        assertEquals(true, f1.evaluate() == f4.evaluate());
	}
	
	@Test
	public void testFractionClone() {
	    Fraction f1 = new Fraction(1, 4);
	    Fraction clone = f1.clone();
	    
	    assertEquals(true, f1.hashCode() == clone.hashCode());
	    assertEquals(true, f1.equals(clone));
	    assertEquals(true, f1.evaluate() == clone.evaluate());
	    assertEquals(true, f1.toString().equals(clone.toString()));
	}
	
	@Test
	public void testFractionAdd() {
	    Fraction f1 = new Fraction(1,4);
        Fraction f2 = new Fraction(1, 6);
        Fraction f4 = new Fraction(1, 4);
        Fraction f6 = new Fraction(6);
        Fraction f7 = new Fraction();
        
        assertEquals(f1.add(f4), new Fraction(8, 16));
        assertEquals(f1.add(f7), f1);
        assertEquals(f1.add(f6), new Fraction(25,4));
        assertEquals(f1.add(f2), new Fraction(10, 24));
	}
}
