package Fuxi4;

public class Traiangle extends Shape {
double a,b,c;
 
	public Traiangle() {
	}
	public Traiangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
    
	@Override
	public double getArea() {
		double p,s;
		p=(a+b+c)/2;
		s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}

	@Override
	public double getPerimeter() {

		return a+b+c;
	}

}
