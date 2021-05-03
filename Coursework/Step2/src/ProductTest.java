public class ProductTest {
        public static void main(String[] args) throws SortedADT.NotFoundException {
            SortedADT sorted = new SortedLinkedList();
            Integer option;

            do {
                System.out.println("0: quit");
                System.out.println("1: insert product");
                System.out.println("2: find product ");
                System.out.println("3: remove");
                System.out.println("4: display");
                option = Input.getInteger("option: ");
                switch (option) {
                    case 0:
                        System.out.println("quitting program");
                        break;
                    case 1:
                        Product insertProduct=new Product();
                        insertProduct.Name = Input.getString("Enter Product Name to insert: ");
                        insertProduct.ID  = Input.getString("Enter Product ID to insert: ");
                        insertProduct.Stock  = Input.getInteger("Enter amount of stock: ");

                        try {
                            sorted.insert(insertProduct);
                            System.out.println("Inserted");
                        } catch (SortedADT.NotUniqueException e) {
                            System.out.println("insert invalid - Value not unique");
                        }
                        break;
                    case 2:
                        Product findProduct=new Product();
                        findProduct.Name = Input.getString("Enter Name to find: ");
                        findProduct.ID = Input.getString("Enter Product ID to find: ");
                        try {
                            sorted.find(findProduct);
                            System.out.println("Found : " + findProduct.Name);
                        } catch (SortedADT.NotFoundException e) {
                            System.out.println("Product not found");
                        }
                        break;
                    case 3:
                        Product removeProduct=new Product();
                        removeProduct.Name = Input.getString("Enter Name to find: ");
                        removeProduct.ID = Input.getString("Enter Product ID to find: ");
                        removeProduct.Stock = Input.getInteger("What is the stock for this product? : ");
                        try{
                        if (removeProduct.Stock == 0){
                            sorted.remove(removeProduct);
                            System.out.println("Removed");
                        }
                        else if (removeProduct.Stock > 0)
                        {
                            System.out.println("Stock found");
                            break;
                        }
                        } catch (SortedADT.NotFoundException e) {
                            System.out.println("Product not found");
                        }
                        break;
                    case 4:
                        System.out.println("Products in list:");
                        System.out.println(sorted);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } while (option != 0);
        }
    }

