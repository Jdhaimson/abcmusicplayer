package sound;

/* Fraction.java from http://www.cs.berkeley.edu/~jrs/61bf98/labs/lab2/Fraction.java */

import java.io.*;

/** The Fraction class implements non-negative fractions, i.e., rational 
 * numbers.   
 */
class Fraction {
	
	/* private fields within a Fraction.           */ 
	private int numerator;
	private int denominator;
	
	/** Constructs a Fraction n/d. 
	 *  @param n is the numerator, assumed non-negative.
	 *  @param d is the denominator, assumed positive.
	 */
	Fraction(int n, int d) {
		numerator = n; 
		denominator = d;
	}

	/** Constructs a Fraction n/1. 
	 *  @param n is the numerator, assumed non-negative.
	 */
	public Fraction(int n) {
		this(n,1);
	}

	/** Constructs a Fraction 0/1. 
	 */
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()   {
		return (numerator + "/" + denominator);
	}

	/** Calculates and returns the double floating point value of a fraction.
	 *  @return a double floating point value for this Fraction.
	 */
	public double evaluate()
	{
		double n = numerator;	// convert to double
		double d = denominator;	
		return (n / d);		
	}

	/** Add f2 to this fraction and return the result. 
	 * @param f2 is the fraction to be added.
	 * @return the result of adding f2 to this Fraction.
	 */
	public Fraction add (Fraction f2) {
		Fraction r = new Fraction((numerator * f2.denominator) + 
				(f2.numerator * denominator),
				(denominator * f2.denominator));    
		return r;
	}

	/**
	 * Gets numerator of fracction
	 * @return int: numerator of fraction
	 */
	public int getNumerator() {
		return this.numerator;
	}
	
	/**
	 * Gets denominator of fraction
	 * @return int: denominator of fraction
	 */
	public int getDenominator() {
		return this.denominator;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Fraction clone() {
		return new Fraction(this.numerator, this.denominator);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Fraction)) {
			return false;
		}
		Fraction other = (Fraction) obj;
		if (denominator != other.denominator) {
			return false;
		}
		if (numerator != other.numerator) {
			return false;
		}
		return true;
	}


}

