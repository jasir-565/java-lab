package newpackage;

public class newclass {
	
	double real, img;
	
	newclass(double r, double i)
	{
		real = r;
		img = i;
	}
	
	public static newclass sum(newclass c1, newclass c2)
	{
		newclass temp = new newclass(0, 0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;
	}
	
	public static void main(String args[])
	{
		newclass c1 = new newclass(5.5, 4);
		newclass c2 = new newclass(1.2, 3.5);
		newclass temp = sum(c1, c2);
		System.out.printf("Sum is : " + temp.real + " + " + temp.img + "i");
	}
}
