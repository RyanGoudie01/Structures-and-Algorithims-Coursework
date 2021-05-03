public class Pet implements Comparable<Pet>{

    protected String name = "";
    private SortedLinkedList productList = new SortedLinkedList();

    public SortedLinkedList getProductList(){
        return productList;
    }


    public String nameToString(){
        String nameDetails = new String();
        nameDetails += "Pet ='" + this.name;
        return nameDetails;
    }

    public String productListToString(){
        String listDetails = new String();
        listDetails += "Product =" + this.productList;
        return listDetails;

    }

    @Override
    public String toString() {
        String petDetails = new String();
            petDetails += "Pet ='" + this.name + '\'' +
                    ", Product='" + this.productList + '\'';
            return petDetails;
        }

    @Override
    public int compareTo(Pet o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
