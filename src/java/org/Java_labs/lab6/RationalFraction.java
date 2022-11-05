package org.Java_labs.lab6;

public class RationalFraction {
    private int num, den;
    RationalFraction() {
        num = 0;
        den = 1;
    }
    RationalFraction(int n, int d){
        if (d == 0)
            System.out.print("Denominator can`t be zero");
        else {
            int g = gcd(n, d);
            num = n / g;
            den = d / g;
            if (den < 0) {
                num = -num;
                den = -den;
			}
        }
    }
    private static int gcd(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (0 == n) 
			return m;
        else 
			return gcd(n, m % n);
	}
    public int numerator(){ 
		return num; 
	}
    public int denominator() { 
		return den; 
	}
    public boolean compareTo(RationalFraction b) {
        RationalFraction a = this;
        int l = a.num * b.den;
        int r = a.den * b.num;
        if (l > r) 
            return true;
        return false;
    }
    public String toString() {
        if (den == 1) 
            return Integer.toString(num);
        else          
            return num + "/" + den;
    }
    public boolean equals(RationalFraction b){
        return (compareTo(b) && compareTo(this)) == false; 
    }
    public RationalFraction plus(RationalFraction b) {
        RationalFraction a = this;
        RationalFraction p = new RationalFraction(a.num * b.den + b.num * a.den, b.den * a.den);
        return p;
    }
    public RationalFraction negate() {
        return new RationalFraction(-num, den);
    }
    public RationalFraction minus(RationalFraction b) {
        RationalFraction a = this;
        return a.plus(b.negate());
    }
    public RationalFraction times(RationalFraction b) {
        RationalFraction a = this;
        RationalFraction c = new RationalFraction(a.num, b.den);
        RationalFraction d = new RationalFraction(b.num, a.den);
        return new RationalFraction(c.num * d.num, c.den * d.den);
    }
    public RationalFraction divides(RationalFraction b) {
        RationalFraction a = this;
        return a.times(new RationalFraction(b.den, b.num));
    }
}
