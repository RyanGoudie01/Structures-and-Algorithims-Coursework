public class Product implements Comparable<Product> {

    protected String Name;
    protected String ID;
    protected Integer Stock;
    private Object Product;

    public Product() {
        this.Name = Name;
        this.ID = ID;
        this.Stock = Stock;

    }

    @Override
    public String toString() {
        String productDetails = new String();
        productDetails += "Product{" +
                "productName='" + this.Name + '\'' +
                ", productID='" + this.ID + '\'' +
                ", productStock=" + this.Stock +
                '}';
        return productDetails;
    }


    @Override
    public int compareTo(Product o) {
            return this.ID.compareTo(o.ID);
        }
}



