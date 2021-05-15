package org.example.VendingMachine;

import org.example.VendingMachine.EnumVendingMachine.ProductsVendingMachine;
import org.example.VendingMachine.Product.Product;

import java.util.Scanner;

public class VendingMachineMain {

    private static Scanner in = new Scanner(System.in);
    private static VendingMachine productVM = new VendingM();

    public static void main(String[] args){

        Product product;


       int choice = 0;

        do
        {

            choice = menu();
            switch (choice) {

                case 1:{

                    product = productVM.request(ProductsVendingMachine.HamSandwich.food().ProductNumber());

                    if(product == null){
                        System.out.println("No purchase were made. Not enough money in deposit");
                    }
                }
                break;

                case 2:{

                    productVM.request(ProductsVendingMachine.CheeseSandwich.food().ProductNumber());
                }
                break;


                case 3:{

                    productVM.request(ProductsVendingMachine.CheeseHamSandwich.food().ProductNumber());
                }
                break;


                case 4:{

                    productVM.request(ProductsVendingMachine.ColaDrink.drink().ProductNumber());
                }
                break;

                case 5:{

                    productVM.request(ProductsVendingMachine.OrangeDrink.drink().ProductNumber());
                }
                break;

                case 6:{

                    productVM.request(ProductsVendingMachine.AppleDrink.drink().ProductNumber());
                }
                break;

                case 7:{

                    productVM.request(ProductsVendingMachine.ChocolateBar.sweets().ProductNumber());
                }
                break;

                case 8:{

                    productVM.request(ProductsVendingMachine.ChewingGum.sweets().ProductNumber());
                }
                break;

                case 9:{

                    productVM.request(ProductsVendingMachine.OrangeSweets.sweets().ProductNumber());
                }
                break;

                case 10:{

                    addMoney();
                }
                break;

                case 11:{

                    System.out.println("\n" + "Your change is: " + productVM.endSession());
                }
                break;

            }

        }
        while (choice != 11);






    }

    public static boolean isInteger(String text){

        int temp;
        try{
            temp = Integer.parseInt(text);
            return true;
        }catch (Exception e){

            return false;
        }
    }



    public static int menu(){

        String tempText = "0";
        boolean boolTemp = true;
        int temp = 0;

        String [] productMenu = productVM.getProducts();
        System.out.println(" 1. Menu: " + productVM.getProducts()[0] + "          Product description: " + productVM.GetDescription(10001));
        System.out.println(" 2. Menu: " + productVM.getProducts()[1] + "       Product description: " + productVM.GetDescription(10002));
        System.out.println(" 3. Menu: " + productVM.getProducts()[2] + "   Product description: " + productVM.GetDescription(10003));
        System.out.println(" 4. Menu: " + productVM.getProducts()[3] + "                  Product description: " + productVM.GetDescription(20001));
        System.out.println(" 5. Menu: " + productVM.getProducts()[4] + "                Product description: " + productVM.GetDescription(20002));
        System.out.println(" 6. Menu: " + productVM.getProducts()[5] + "                 Product description: " + productVM.GetDescription(20003));
        System.out.println(" 7. Menu: " + productVM.getProducts()[6] + "         Product description: " + productVM.GetDescription(30001));
        System.out.println(" 8. Menu: " + productVM.getProducts()[7] + "           Product description: " + productVM.GetDescription(30002));
        System.out.println(" 9. Menu: " + productVM.getProducts()[8] + "         Product description: " + productVM.GetDescription(30003));
        System.out.println(" 10. Add money");
        System.out.println(" 11. Get change");

        System.out.println("\n" + "Deposit balance: " + productVM.getBalance());

        do {
            tempText = in.next();
            boolTemp = true;
            if(!isInteger(tempText)){
                System.out.println(" Illegal token. Must be a menu choice 1-11");

                boolTemp = false;
            } else if (Integer.parseInt(tempText) < 1 || Integer.parseInt(tempText) > 11 ){
                System.out.println(" The number is not a menu choice. Please select number from menu.");

                boolTemp = false;
            } else {
                boolTemp = true;
            }


        }
        while(!boolTemp);
        temp = Integer.parseInt(tempText);




        return temp;
    }

    public static void addMoney(){

        int temp = 0;
        int choice = 0;

        while (choice != 11 )
        {

            choice = addMoneyMenu() ;
            switch (choice) {

                case 1:{

                    productVM.addCurrency(1);
                }
                break;

                case 2:{

                    productVM.addCurrency(2);
                }
                break;


                case 3:{

                    productVM.addCurrency(5);
                }
                break;


                case 4:{

                    productVM.addCurrency(10);
                }
                break;

                case 5:{

                    productVM.addCurrency(20);
                }
                break;

                case 6:{

                    productVM.addCurrency(50);
                }
                break;

                case 7:{

                    productVM.addCurrency(100);
                }
                break;

                case 8:{

                    productVM.addCurrency(200);
                }
                break;

                case 9:{

                    productVM.addCurrency(500);
                }
                break;

                case 10:{

                    productVM.addCurrency(1000);
                }
                break;



            }

        }




    }

    public static int addMoneyMenu(){
        String tempText = "0";
        boolean boolTemp = true;
        int temp = 0;

        System.out.println(" 1. Add 1 kr");
        System.out.println(" 2. Add 2 kr");
        System.out.println(" 3. Add 5 kr");
        System.out.println(" 4. Add 10 kr");
        System.out.println(" 5. Add 20 kr");
        System.out.println(" 6. Add 50 kr");
        System.out.println(" 7. Add 100 kr");
        System.out.println(" 8. Add 200 kr");
        System.out.println(" 9. Add 500 kr");
        System.out.println(" 10. Add 1000 kr");
        System.out.println(" 11. Return to buy products");


        System.out.println("\n" + "Deposit balance: " + productVM.getBalance());

        do {
            tempText = in.next();
            boolTemp = true;
            if(!isInteger(tempText)){
                System.out.println(" Illegal token. Must be a menu choice 1-12");

                boolTemp = false;
            } else if (Integer.parseInt(tempText) < 1 || Integer.parseInt(tempText) > 12 ){
                System.out.println(" The number is not a menu choice. Please select number from menu.");

                boolTemp = false;
            } else {
                boolTemp = true;
            }


        }
        while(!boolTemp);
        temp = Integer.parseInt(tempText);



        return temp;






    }

}
