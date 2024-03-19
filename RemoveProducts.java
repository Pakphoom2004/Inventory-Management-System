import java.util.List;
import java.util.Scanner;
class RemoveProducts {
    public static void removeProducts() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nRemove Products\n");
        System.out.print("Enter the name of the product to remove : ");
        String remove = input.next();

        List<String[]> data = Csv.readData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv");

        // find name in csv 
        int indexRemove = -1;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i)[1].equals(remove)) {
                indexRemove = i;
                break;
            }
        }
        // remove product in csv 
        if (indexRemove != -1) {
            data.remove(indexRemove);
            Csv.writeData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv" , data);
            System.out.println("Product removed successfully");
        } else {
            System.out.println("Product not found");
        }
    }
}