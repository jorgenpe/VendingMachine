package org.example.VendingMachine.EnumVendingMachine;

import org.example.VendingMachine.Product.*;
public enum ProductsVendingMachine {




    HamSandwich("food",new Food("I'Am a foodProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Ham Sandwich"
    )),
    CheeseSandwich("food",new Food("I'Am a foodProduct and cost 10 kr","Rip of the plastic raping and consume me", 10,"Cheese Sandwich"
    )),
    CheeseHamSandwich("food",new Food("I'Am a foodProduct and cost 20 kr","Rip of the plastic raping and consume me", 20,"Cheese Ham Sandwich"
    )),
    ColaDrink("drink",new Drink("I'Am a drinkProduct and cost 15 kr","Open and consume me", 15,"Cola"
    )),
    OrangeDrink("drink",new Drink("I'Am a drinkProduct and cost 15 kr","Open and consume me", 15,"Orange"
    )),
    AppleDrink("drink",new Drink("I'Am a drinkProduct and cost 15 kr","Open and consume me", 15,"Apple"
    )),
    ChocolateBar("sweets",new Sweets("I'Am a sweetsProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Chocolate bar"
    )),
    ChewingGum("sweets",new Sweets("I'Am a sweetsProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Chewing gum"
    )),
    OrangeSweets("sweets",new Sweets("I'Am a sweetsProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Orange sweets"
    ));

    //private Product product;
    private Food food;
    private Drink drink;
    private Sweets sweets;
    private String productTyp;




     ProductsVendingMachine(String productTyp, Food food){
        this.productTyp = productTyp;
        this.food = food;

    }

    ProductsVendingMachine(String productTyp,Drink drink){
        this.drink= drink;

    }

    ProductsVendingMachine(String productTyp,Sweets sweets){
        this.sweets = sweets;

    }

    public String productTyp(){

        return productTyp;
    }

    public Food food(){
         return food;
    }

    public Drink drink(){
        return drink;
    }

    public Sweets sweets(){
        return sweets;
    }
}



