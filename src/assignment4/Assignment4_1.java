package assignment4; // Declaring Package

public class Assignment4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new A(); // Creating Instance for Class A
a1.showA(); // Calling Method A without parameter
a1.showA(22); // Calling Method A with parameter to show Method overloading of Class A
B b1= new B(); // To show the output of Method Overriding creating instance for Class B
b1.showA(); // Calling Method B
	}

}
class A {
	int a ; // Declaring the variable
	public static final double c = 3.14; // Initializing and declaring the constant variables
	double b; // Declaring the variable
	A()
	{
		a = 22; // Initializing the variable
		
	}
	void showA() // Initializing void show() method for class A 
	{  
		b = c * a * a; 
System.out.println("Area of a Circle "+b);	// Prints the area of Circle	

	}
void showA(int d) // Using the same Show () method with parameter to show Method overloading concept
{
	
	b = c * a * a * d;
	System.out.println("Volume of Sphere " +b); // Prints the volume of Sphere
	
	
}
}
class B extends A  // Creating a new class B to show the concept of Method Overriding
{
	int a ;
	B() 
	{
	a = 33;	
	}
	void showA() // Using the same method of parent class 
	{
		b = this.a * this.a;
		System.out.println("Area of a Square " +b); // Prints the volume of Square
	}
}