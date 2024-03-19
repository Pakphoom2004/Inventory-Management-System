import java.util.List;

class GenerateReports {
    public static void generateReports() {
        List<String[]> data = Csv.readData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv");
        System.out.println("\nGenerate Reports\n");

        // display all information of products
        for (int i = 1; i < data.size(); i++) {
            String id = data.get(i)[0];
            String name = data.get(i)[1];
            String category = data.get(i)[2];
            String quantities = data.get(i)[3];
            System.out.println("ID : " + id + "         \tName : " + name + "       \tCategory : " + category + "             \tQuantities : " + quantities);
        }
    }
}