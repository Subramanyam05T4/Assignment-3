import java.io.*;

class Product{
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Category: " + category);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {
        Product product = new Product(101, "Laptop", "Electronics", 999.99);
        String filename = "product.ser";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(product);
            out.close();
            file.close();
            System.out.println("Product serialized successfully. Saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Product deserializedProduct = null;
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            deserializedProduct = (Product) in.readObject();
            in.close();
            file.close();
            System.out.println("\nProduct deserialized successfully:");
            deserializedProduct.printDetails();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
