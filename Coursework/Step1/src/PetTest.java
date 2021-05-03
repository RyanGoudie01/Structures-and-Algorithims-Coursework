public class PetTest {
    public static void main(String[] args)  {
        SortedADT sorted = new BinarySearchTree();
        String pet = new String();
        Integer option;
        do {
            System.out.println("0: quit");
            System.out.println("1: Insert Pet Type");
            System.out.println("2: Find Specific Pet");
            System.out.println("3: Display specific pet");
            System.out.println("4: Remove Pet");
            System.out.println("5: Display All ");
            option = Input.getInteger("option: ");
            switch (option) {
                case 0:
                    System.out.println("quitting program");
                    break;
                case 1:
                    pet=Input.getString("value: ");
                    try{
                        sorted.insert(pet);
                        System.out.println("inserted");
                    }
                    catch(SortedADT.NotUniqueException e){
                        System.out.println("insert invalid - value not unique");
                    }
                    break;
                case 2:
                    pet=Input.getString("value: ");
                    try{
                        pet=(String) sorted.find(pet);
                        System.out.println(pet+" found");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("value not found");
                    }
                    break;
                case 3:
                    pet=Input.getString("value: ");
                    try{
                        pet=(String) sorted.find(pet);
                        System.out.println("The Specific Search has returned");
                        System.out.println(pet);
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("value not found");
                    }
                    break;
                case 4:
                    pet=Input.getString("value: ");
                    try{
                        pet=(String) sorted.remove(pet);
                        System.out.println(pet+" removed");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("remove invalid - value not found");
                    }
                    break;
                case 5:
                    System.out.println(((BinarySearchTree)sorted).getTraversals());
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 0);
    }

}


