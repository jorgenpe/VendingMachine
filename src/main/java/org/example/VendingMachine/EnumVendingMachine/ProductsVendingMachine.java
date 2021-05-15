package org.example.VendingMachine.EnumVendingMachine;

import org.example.VendingMachine.Product.*;

// Enum that handles products that are in the vending machine. One internal constructor and four methods that return String, Food, Drink and Sweets.
public enum ProductsVendingMachine {




    HamSandwich("food", new Food("I'Am a foodProduct and cost 17 kr","Rip of the plastic raping and consume me", 15,"Ham Sandwich"
    ), null, null),

    CheeseSandwich("food", new Food("I'Am a foodProduct and cost 11 kr","Rip of the plastic raping and consume me", 10,"Cheese Sandwich"
    ), null, null),

    CheeseHamSandwich("food", new Food("I'Am a foodProduct and cost 22 kr","Rip of the plastic raping and consume me", 20,"Cheese Ham Sandwich"
    ), null, null),

    ColaDrink("drink",null, new Drink("I'Am a drinkProduct and cost 18 kr","Open and consume me", 15,"Cola"
    ),null),

    OrangeDrink("drink",null, new Drink("I'Am a drinkProduct and cost 18 kr","Open and consume me", 15,"Orange"
    ),null),

    AppleDrink("drink",null, new Drink("I'Am a drinkProduct and cost 18 kr","Open and consume me", 15,"Apple"
    ),null),

    ChocolateBar("sweets",null, null, new Sweets("I'Am a sweetsProduct and cost 21 kr","Rip of the plastic raping and consume me", 17,"Chocolate bar"
    )),

    ChewingGum("sweets",null, null, new Sweets("I'Am a sweetsProduct and cost 25 kr","Rip of the plastic raping and consume me", 20,"Chewing gum"
    )),

    OrangeSweets("sweets",null, null, new Sweets("I'Am a sweetsProduct and cost 34 kr","Rip of the plastic raping and consume me", 27,"Orange sweets"
    ));



    private  Food food;
    private  Drink drink;
    private  Sweets sweets;
    private String productTyp;




      ProductsVendingMachine(String productTyp, Food food, Drink drink, Sweets sweets){
        this.productTyp = productTyp;
        this.food = food;
        this.drink = drink;
        this.sweets = sweets;

    }


    public String productTyp(){

        return productTyp;
    }

    public  Food food(){
         return food;
    }

    public Drink drink(){
        return drink;
    }

    public Sweets sweets(){
        return sweets;
    }
}



