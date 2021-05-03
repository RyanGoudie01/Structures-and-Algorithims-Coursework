public class PetStoreTest {
            public static void main(String[] args) {
            SortedADT sortedPetStore = new BinarySearchTree();
            //String pet = new String();
            Integer option;
            do {
                // Menu Output for User
                // Comments about marks are used for tracking progress.
                System.out.println("0: quit");
                System.out.println("1: Insert pet"); // Worth 3 marks - 3/3
                System.out.println("2: Insert product for specific pet"); // Worth 6 marks - 6/6
                System.out.println("3: Find product for Pet Type "); // Worth 3 marks - 3/3
                System.out.println("4: Display all the types of pets the company provides for - Never finished so it wont work"); // Worth 2 marks - wasn't able to fix it to work there for it wont work
                System.out.println("5: Display all the products stocked for specific pet"); // Worth 2 marks - 2/2
                System.out.println("6: Display Entire Tree ");
                System.out.println("7: Display All in Alphabetical Order");// Worth 3 marks for alphabetically - 3/3
                System.out.println("8: Remove a specific products - Never finished so it wont work");// Worth 3 marks - wasn't able to fix it to work there for it wont work
                System.out.println("9: Remove a pet"); // Worth 3 marks - 3/3
                option = Input.getInteger("option: ");
                switch (option) {
                    case 0:
                        System.out.println("quitting program");
                        break;
                    case 1: // insert pet
                        Pet insertPet = new Pet();
                        insertPet.name = Input.getString("Enter the Type of Pet to insert: ");
                    try{
                        sortedPetStore.insert(insertPet);
                        System.out.println("inserted");
                    }
                    catch(SortedADT.NotUniqueException e){
                        System.out.println("insert invalid - value not unique");
                    }
                        break;
                    case 2: // insert product
                        Pet petProducts= new Pet();
                        Product insertProduct=new Product();
                        petProducts.name = Input.getString("Input Pet that a product will be inserted for: ");
                        try{
                            Pet petFound = (Pet) sortedPetStore.find(petProducts);
                            System.out.println(" found : " + petFound);

                            insertProduct.Name = Input.getString("Enter Product Name to insert: ");
                            insertProduct.ID  = Input.getString("Enter Product ID to insert: ");
                            insertProduct.Stock  = Input.getInteger("Enter amount of stock: ");
                            petFound.getProductList().insert(insertProduct);
                            System.out.println("Inserted");
                        }
                        catch(SortedADT.NotFoundException e){
                            System.out.println("Pet not found - product info not required");
                        }
                        catch (SortedADT.NotUniqueException e){
                            System.out.println("value is not unique");
                        }
                        break;
                    case 3:// Find product
                        Pet findPet= new Pet();
                        Product findProduct=new Product();
                        findPet.name = Input.getString("Input Pet that the product is for: ");
                        try{
                            Pet petFound = (Pet) sortedPetStore.find(findPet);
                            System.out.println(" found : " + petFound);
                        findProduct.Name = Input.getString("Enter Name to find: ");
                        findProduct.ID = Input.getString("Enter Product ID to find: ");
                            petFound.getProductList().find(findProduct);
                            Product productFound = (Product) petFound.getProductList().find(findProduct);
                            System.out.println("Found : " + productFound);
                        } catch (SortedADT.NotFoundException e) {
                            System.out.println("Pet not found");
                        }

                        break;
                    case 4:// Display all pets - needs done
                    System.out.println(((BinarySearchTree)sortedPetStore).getAllPets());
                        break;
                    case 5: // Display all products for specific pet
                        Pet displaySpecificProduct = new Pet();
                        displaySpecificProduct.name = Input.getString("Enter Pet Name to find: ");
                            try {
                                Pet found = (Pet) sortedPetStore.find(displaySpecificProduct);
                                System.out.println("Found : " + found.productListToString());

                            } catch (SortedADT.NotFoundException e) {
                                System.out.println("Pet not found");
                            }
                        break;
                    case 6://Display All of the tree - used for quick results
                        System.out.println(sortedPetStore);
                        break;
                    case 7: // Displays all pets and product in alphabetical order
                        System.out.println(((BinarySearchTree)sortedPetStore).getTraversals());
                        break;

                    case 8:// Remove product - needs done

                        break;
                    case 9:// Remove pet
                        Pet removePet = new Pet();
                        removePet.name=Input.getString("Pet to be Removed : ");
                        try{
                            Pet remove =(Pet) sortedPetStore.remove(removePet);
                            System.out.println("Pet Removed : " + remove);
                        }
                        catch(SortedADT.NotFoundException e){
                            System.out.println("remove invalid - value not found");
                        }
                        break;
    
    
                    default:
                        System.out.println("Invalid option");
                }
            } while (option != 0);
        }
 }
    
