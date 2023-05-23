public class Books {
    private String Name;
    private String Category;
    private double Price;

    public Books(String Name, String Category, double Price){
        this.Name = Name;
        this.Category = Category;
        this.Price = Price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
