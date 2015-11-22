package com.kanhaiyakumawat.kanhaiyajavarpc;

public class MathComputation {
	public static double PI = 3.14159265358979323846;
	public static final int DEFAULT = 0;
	public static final int INVERSE = 1;

	public double ComputePi(int valType) {
		double result = 0;

		switch (valType) {
		case DEFAULT:
			result = PI;
			break;
		case INVERSE:
			result = 1.0 / PI;
			break;
		}

		return result;
	}
}
