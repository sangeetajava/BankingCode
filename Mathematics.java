package com.rab3tech;

public class Mathematics {
	MathService mathService=new MathService();
	//ARti doing changes
	public void setMathService(MathService mathService) {
		this.mathService = mathService;
	}

	public int fact(int num) {
		//this is making database call!!!!!!!!!!!!!!!!!!!!!!!!!
		if(num<0) {
			 throw new ArithmeticException("Num cannot be negative!!");
		}
		int sum = 1;
		for (int x = 2; x <= num; x++) {
			sum = sum * x;
		}
		return sum;
	}
	
	public int add(int  num1,int num2) {
		if(num1==4 || num2==4) {
			int  maoa= mathService.magic(num1, num2);
			return maoa+5;
		}
		return num1+num2;
	}
	public int sum(int  num1,int num2,int  num3) {
		int sum = num1+num2+num3;
		System.out.println(sum);
		return sum;
	}
	
	public int add(int  num1,int num2,int  num3) {
		int sum = num1+num2+num3;
		System.out.println(2*sum);
		return 2*sum;
	}

}
