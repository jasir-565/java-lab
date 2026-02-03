package product;

class Product {
    String pname, pcode;
    int price;

    public Product() {}

    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public void display() {
        System.out.println("pcode : " + pcode);
        System.out.println("pname : " + pname);
        System.out.println("price : " + price + "\n");
    }
}

public class Cars {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.pcode = "Car123";
        p1.pname = "Benz";
        p1.price = 10000;

        Product p2 = new Product("Jaguar", "Car426", 25000);
        Product p3 = new Product("Maruthi", "Car800", 50000);

        System.out.println("Displaying p1:");
        p1.display();

        System.out.println("Displaying p2:");
        p2.display();

        System.out.println("Displaying p3:");
        p3.display();

        Product p = p1.price < p2.price
                ? (p1.price < p3.price ? p1 : p3)
                : (p2.price < p3.price ? p2 : p3);

        System.out.println("Displaying product with lowest price:");
        p.display();
    }
}
