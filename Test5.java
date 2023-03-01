import java.util.Scanner;

//interface demo
interface Shape {
public void setRadious(double d);
public void area();
public void volume();
}
class Circle implements Shape {
	double radious;
	public void setRadious(double radious) {
		this.radious=radious;
		
	}
	public void area()  {
		System.out.println("Area is" +3.141*radious*radious);
	}
	public void volume()  {}
	
}
class Sphere implements Shape {
	double radious;
	public void setRadious(double radious)  {
		this.radious=radious;
	}
	public void area() {}
	public void volume() {
	System.out.println("volume is"+4.0/3*14*radious*radious);

	}
		
	}
	

public class Test5 {

	public static void main(String[] args) {
		int dimension;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 or 3");
		dimension=sc.nextInt();
		Shape s;
		if(dimension==2) {
			s=new Circle();
			s.setRadious(3.5);
			s.area();
			
		}

	}

}
