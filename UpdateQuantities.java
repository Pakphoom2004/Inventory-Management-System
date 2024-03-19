import java.util.List;
import java.util.Scanner;
class UpdateQuantities {
    public static void updateQuantities() {
        List<String[]> data = Csv.readData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv");
        Scanner input =new Scanner(System.in);
        System.out.println("\nUpdate Quantities\n");
        System.out.print("Enter name to Update Quantities : ");
        String userUpdate = input.next();
        boolean check = false;
        int checIndex = -1;

        // check name in csv if found it will continue working 
        for(int x=1 ; x<data.size() ; x++){
            if(data.get(x)[1].equals(userUpdate)){
                check = true;
                int indexUpdate = x; 

                System.out.println("1.Increase Quantities\n2.Decrease Quantities");
                System.out.print("Enter number for Update Quantities : ");
                
                int userUpQuantities = input.nextInt();

                // find name in csv for increase or decrease quantities of product
                if (indexUpdate != -1) {
                    int currentQuantities = Integer.parseInt(data.get(indexUpdate)[3]);
                    int update;
                    switch (userUpQuantities) {
                        case 1:
                            System.out.print("Enter amount to increase Quantities : ");
                            int userIncrease = input.nextInt();
                            if(userIncrease >0){
                                update = currentQuantities + userIncrease;
                            System.out.println("\nName : " + userUpdate + " , Current quantities : " + update);
                            data.get(indexUpdate)[3] = String.valueOf(update);
                            Csv.writeData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv", data);
                            System.out.println("\nUpdate quantities successfully");
                            break;
                            } else{
                                System.out.println("\nError(Please enter positive number.)");
                                break;
                            }
                        case 2:
                            System.out.print("Enter amount to decrease Quantities : ");
                            int userDecrease = input.nextInt();
                            if(userDecrease >0){
                                update = Math.max(0, currentQuantities - userDecrease);
                            System.out.println("\nName : " + userUpdate + " , Current quantities : " + update);
                            data.get(indexUpdate)[3] = String.valueOf(update);
                            Csv.writeData("C:/Users/USER/OneDrive/เดสก์ท็อป/Project/Management.csv", data);
                            System.out.println("\nUpdate quantities successfully");
                            break;
                            }else{
                                System.out.println("\nError(Please enter positive number.)");
                                break;
                            }
                        default:
                            System.out.println("\nError(Please enter number 1 or 2 )");
                            return;
                    }
                }
            }
        }if(!check){
            System.out.println("Product not found");
        }
    }
}