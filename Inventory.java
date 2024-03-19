import java.io.*;
import java.util.*;

public class Inventory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;

        while(check){
            System.out.println("Inventory Management System\n1.Add Products\n2.Remove Products\n3.Update Quantities\n4.View Available Stock\n5.Generate Reports\n6.End Program");
            System.out.print("\nEnter the number : ");
            int user = input.nextInt();
    
            switch (user) {
                case 1:
                    System.out.println("\n-------------------------------------------------------------");
                    AddProduct.addProduct();
                    System.out.println("\n-------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("\n-------------------------------------------------------------");
                    RemoveProducts.removeProducts();
                    System.out.println("\n-------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("\n-------------------------------------------------------------");
                    UpdateQuantities.updateQuantities();
                    System.out.println("\n-------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("\n-------------------------------------------------------------");
                    ViewAvailableStock.viewAvailableStock();
                    System.out.println("\n-------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("\n------------------------------------------------------------------------------------------------------");
                    GenerateReports.generateReports();
                    System.out.println("\n------------------------------------------------------------------------------------------------------");
                    break;
                case 6 : 
                    check = false;
                    System.out.println("\nEnd Program");
            }
        }
    }
}