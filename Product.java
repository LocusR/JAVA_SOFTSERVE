class Product {
    private String name;
    private double price;
    static int counter = 1;

    public Product() {
    this.counter++;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.counter++;
    }
    public static int count() {
        return counter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double pr) {
        this.price = pr;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
}