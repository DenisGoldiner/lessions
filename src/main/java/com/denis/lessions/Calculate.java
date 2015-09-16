package com.denis.lessions;

public class Calculate{

    public static void main (String[] args){

        System.out.println("Calculate ... \n");

	double first = Integer.valueOf(args[0]);
	double second = Integer.valueOf(args[1]);

	
	double summ = summ(first, second);
	double minus = minus(first, second);
	double multiplication = multiplication(first, second);
	double division = division(first, second);
	double power = power(first, second);

 
	System.out.println("first = " + first + ", second = " + second + '\n');
	System.out.println("Summ           = " + first + " + " + second + " = " + summ);
	System.out.println("Minus          = " + first + " - " + second + " = " + minus);
	System.out.println("Division       = " + first + " / " + second + " = " + division);
	System.out.println("Multiplication = " + first + " * " + second + " = " + multiplication);
	System.out.println("Power          = " + first + " ^ " + second + " = " + power);			

    }
	
	public static double summ (double x, double y){
		double result;
		result = x + y;
		return result;
	}
	
	public static double minus (double x, double y){
		double result;
		result = x - y;
		return result;
	}
	
	public static double division (double x, double y){
		double result;
		result = x / y;
		return result;
	}
	
	public static double multiplication (double x, double y){
		double result;
		result = x * y;
		return result;
	}

	public static double power (double x, double y){
		double result = 1;
		if(y >= 0){
			for(int i = 0; i < y; ++i){
				result *= y;
			}
		} else if(y < 0){
				for(int i = 0; i < -y; ++i){
				result /= y;
			}
		}
		return result;
	}	
}