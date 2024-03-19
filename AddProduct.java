import java.io.IOException;
import java.util.*;

class AddProduct{
    public static void addProduct() {
        List<String[]> data = Csv.readData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv");
        Scanner input = new Scanner(System.in);
        System.out.println("\nAdd Products\n");
        System.out.print("Enter name of Products : ");
        String username = input.next();

        // check name in csv 
        if(checkName(data, username)){
            System.out.println("\nError Name already used.");
            return;
        }

        System.out.print("Enter ID of Products(must be integer 5 digits) : ");
        String userID  = input.next();

        // check id in csv 
        if(checkID(data , userID)){
            System.out.println("\nError ID already used.");
            return;
        }
        // check digits ID
        if(userID.length() > 5){
            System.out.println("Error(ID must be 5 digits.)");
        }
        else{
            System.out.print("Enter Category of Products(must be String) : ");
            String userCategory = input.next();
            System.out.print("Enter Quantities of Products(must be integer) : ");
            String userQuantities = input.next();
    
            System.out.println("\nName : " + username + " , ID : " + userID + " , Category : " + userCategory + " , Quantities : " + userQuantities);
            String[] newdata = {userID, username, userCategory, userQuantities};
            data.add(newdata);
            Csv.writeData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv", data);
            System.out.println("\nProduct added Successfully");
        }
    }

    // find ID in csv  
    private static boolean checkID(List<String[]> data , String newID){
        for(String[] row : data){
            if(row.length > 0 && row[0].equals(newID)){
                return true;
            }
        }
        return false;
    }

    // find name in csv 
    private static boolean checkName(List<String[]> data , String newName){
        for(String[] row : data){
            if(row.length > 0 && row[1].equals(newName)){
                return true;
            }
        }
        return false;
    }
}