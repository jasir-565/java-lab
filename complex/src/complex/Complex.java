package complex;

import java.util.Scanner;

class Complex {

    private double real;
    private double img;

    Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.img + c2.img);
    }

    public void display() {
        if (img >= 0)
            System.out.println(real + " + " + img + "i");
        else
            System.out.println(real + " - " + (-img) + "i");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = add(c1, c2);

        System.out.print("Sum of complex numbers is: ");
        result.display();

        sc.close();
    }
}
