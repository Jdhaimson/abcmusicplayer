package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {
    
    /*
     * Testing Strategy
     * 
     * To test equals(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences. 
     * Tested to make sure equals() was reflexive and that two structurally equal instances were equals().
     * 
     * To test toString(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences. 
     * Tested to make sure instances returned the correct string and that structurally equivalent instances returned the same string.
     * 
     * To test hashCode(), we tested to be sure that structurally equivalent instances returned the same hash code and that hashCode() was reflexive.
     * 
     * To test clone(), we tested to be sure that a clone of an instance was equals() to its parent, returned equivalent strings, and returned equivalent hash codes.
     * 
     * To test getNumerator(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We used the different constructors of Fraction with different values to ensure complete coverage. We tested to make sure that Fractions with equivalent numerators independent of denomintor returned equivlant numerators.
     * 
     * To test getDenominator(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We used the different constructors of Fraction with different values to ensure complete coverage. We tested to make sure that Fractions with equivalent denominators returned equivalent denominators independent of numerator.
     * 
     * To test evaluate(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We used the different constructors of Fraction with different values to ensure complete coverage. We tested to make sure that Fractions that evaluate() returned the proper result and that unsimplified fractions evaluated to the same as their simplified versions.
     * 
     * To test add(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We used the different constructors of Fraction with different values to ensure complete coverage. We tested to make sure that add() returnd the proper value and that fractions with equivalent or different denominators could be properly added together. 
     * 
     */

	@Test
	public void testFractionEquals() {
	    Fraction f1 = new Fraction(1,4);
	    Fraction f2 = new Fraction(1, 6);
	    Fraction f3 = new Fraction(2, 4);
	    Fraction f4 = new Fraction(1, 4);
	    Fraction f5 = new Fraction(2, 8);
	    Fraction f6 = new Fraction(6);
	    Fraction f7 = new Fraction();
	    Fraction f8 = new Fraction(1,4);
	    Fraction f9 = new Fraction(3, 4);
	    
	    assertEquals(true, f1.equals(f1));
	    assertEquals(true, f1.equals(f4));
	    assertEquals(false, f1.equals(f2));
	    assertEquals(false, f1.equals(f3));
	    assertEquals(false, f1.equals(f5));
	    assertEquals(false, f1.equals(f6));
	    assertEquals(false, f1.equals(f7));
	    assertEquals(false, f8.equals(f9));
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
