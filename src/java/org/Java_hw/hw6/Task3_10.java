package org.Java_hw.hw6;

public class Line {
	// a1x + a2y + a3 = 0
	private double a1;
	private double a2;
	private double a3;

	public Line(double a1, double a2, double a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	public String intersectionWithOXAndOY() {
		String x = "";
		String y = "";
		String result = "";
		if (a1 == 0 && a2 != 0) {
			if (a3 == 0) {
				x += "infinity";
			} else {
				x += "no intersection";
			}
			y += (-a3 / a2);
			result += "OX: " + x + " OY: " + y;
		} else if (a1 == 0 && a2 == 0 && a3 != 0) {
			result += "error";
		} else if (a1 == 0 && a2 == 0 && a3 == 0) {
			result += "cant find";
		} else {
			x += (-a3 / a1);
			y += (-a3 / a1);
			result += "OX: " + x + " OY: " + y;
		}
		return result;
	}
	public String intersectionWithLine(Line line) {
		String x = "";
		String y = "";
		String result = "";
		if (a1 == 0 && a2 != 0 && line.getA1() != 0 && line.getA2() == 0) {
			x += (-line.getA3() / line.getA1());
			y += (-a3 / a2);
			result += "X: " + x + " Y: " + y;
		} else if (a1 == line.getA1() && a2 == line.getA2() && a3 == line.getA3()) {
			result += "infinity";
		} else if (a1 != 0 && a2 == 0 && line.getA1() == 0 && line.getA2() != 0) {
			x += (-a3 / a1);
			y += (-line.getA3() / line.getA2());
		} else if (a1 == 0 && a2 == 0 && a3 != 0) {
			result += "cant find";
		} else if (line.getA1() == 0 && line.getA2() == 0 && line.getA3() != 0) {
			result += "cant find";
		} else if (a1 == 0 && a2 == 0 && a3 == 0) {
			result += "cant find";
		} else if (line.getA1() == 0 && line.getA2() == 0 && line.getA3() == 0) {
			result += "cant find";
		} else {
			double X = ((a3 / a2) - (line.getA3() / line.getA2())) / ((-a1 / a2) + (line.getA1() / line.getA2()));
			double Y = (-a1 / a2) * X - (a3 / a2);
			result += "X: " + X + " Y: " + Y;
		}
		return result;
	}
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getA2() {
		return a2;
	}
	public void setA2(double a2) {
		this.a2 = a2;
	}
	public double getA3() {
		return a3;
	}
	public void setA3(double a3) {
		this.a3 = a3;
	}
}
