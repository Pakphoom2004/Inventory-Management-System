import java.util.List;

class ViewAvailableStock {
    public static void viewAvailableStock() {
        List<String[]> data = Csv.readData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv");
        System.out.println("\nAvailable Stock\n");

        // display products in csv(The quantities of product is more than 0) 
        for (int i = 1; i < data.size(); i++) {
            String name = data.get(i)[1];
            int quantities = Integer.parseInt(data.get(i)[3]);
            if (quantities > 0) {
                System.out.println("Name : " + name + "        \tQuantities : " + quantities);
            }
        }
    }
}