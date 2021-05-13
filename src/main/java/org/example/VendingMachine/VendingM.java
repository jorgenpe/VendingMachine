package org.example.VendingMachine;

import org.example.VendingMachine.EnumVendingMachine.ProductsVendingMachine;
import org.example.VendingMachine.Payment.DepositPool;

import org.example.VendingMachine.Product.Product;

public class VendingM implements VendingMachine{

    private DepositPool currency;

    public VendingM(){

    }



    @Override
    public void addCurrency(int amount) {
        if(currency == null){
            currency = DepositPool.getInstance();
        }
        currency.add(amount);

    }

    @Override
    public Product request(int productNumber) {

        for(ProductsVendingMachine products: ProductsVendingMachine.values()) {

            if (products.productTyp() == "food" && products.food().ProductNumber() == productNumber) {

                if (currency.getDepositPool() >= products.food().productPrice()) {

                    currency.setDepositPool(currency.getDepositPool() - products.food().productPrice());
                } else {

                    return null;
                }

                return products.food();

            } else if (products.productTyp() == "drink" && products.drink().ProductNumber() == productNumber){

                if (currency.getDepositPool() >= products.drink().productPrice()) {

                    currency.setDepositPool(currency.getDepositPool() - products.drink().productPrice());
                } else {

                    return null;
                }


                return products.drink();

            }
            else if(products.productTyp() == "sweets" && products.sweets().ProductNumber() == productNumber){

                if(currency.getDepositPool() >= products.sweets().productPrice()){

                    currency.setDepositPool(currency.getDepositPool() - products.sweets().productPrice());
                }else{

                    return null;
                }

                return products.sweets();
            }

        }


        return null;
    }

    @Override
    public int endSession() {

        int temp = currency.getDepositPool();
        currency.setDepositPool(0);
        return temp;
    }

    @Override
    public String GetDescription(int productNumber) {

        for(ProductsVendingMachine products: ProductsVendingMachine.values()){

            if(products.productTyp() == "food" && products.food().ProductNumber() == productNumber){

                return products.food().examine();

            }else if(products.productTyp() == "drink" && products.drink().ProductNumber() == productNumber){

                return products.drink().examine();

            }else if (products.productTyp() == "sweets" && products.sweets().ProductNumber() == productNumber){

                return products.sweets().examine();
            }

        }
        return null;
    }

    @Override
    public int getBalance() {

        return currency.getDepositPool();
    }

    @Override
    public String[] getProducts() {

        String[] gProducts = new String[ProductsVendingMachine.values().length];
        int count = 0;

        for(ProductsVendingMachine products: ProductsVendingMachine.values()) {

            if (products.productTyp() == "food") {

                String temp = "Name: " + products.food().getFoodName() + " Product number: " + products.food().ProductNumber();
                gProducts[count] = temp;

            } else if (products.productTyp() == "drink") {

                String temp = "Name: " + products.drink().getDrinkName() + " Product number: " + products.drink().ProductNumber();
                gProducts[count] = temp;

            } else if (products.productTyp() == "sweets") {

                String temp = "Name: " + products.sweets().getSweetsName() + " Product number: " + products.sweets().ProductNumber();
                gProducts[count] = temp;

            }

            ++count;

        }

        return gProducts;
    }

}
