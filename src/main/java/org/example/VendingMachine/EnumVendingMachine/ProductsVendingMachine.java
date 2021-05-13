package org.example.VendingMachine.EnumVendingMachine;

import org.example.VendingMachine.Product.*;
public enum ProductsVendingMachine {




    HamSandwich(new Food("I'Am a foodProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Ham Sandwich"
    )),
    CheeseSandwich(new Food("I'Am a foodProduct and cost 10 kr","Rip of the plastic raping and consume me", 10,"Cheese Sandwich"
    )),
    CheeseHamSandwich(new Food("I'Am a foodProduct and cost 20 kr","Rip of the plastic raping and consume me", 20,"Cheese Ham Sandwich"
    )),
    ColaDrink(new Drink("I'Am a drinkProduct and cost 15 kr","Open and consume me", 15,"Cola"
    )),
    OrangeDrink(new Drink("I'Am a drinkProduct and cost 15 kr","Open and consume me", 15,"Orange"
    )),
    AppleDrink(new Food("I'Am a drinkProduct and cost 15 kr","Open and consume me", 15,"Apple"
    )),
    ChocolateBar(new Food("I'Am a sweetsProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Chocolate bar"
    )),
    ChewingGum(new Food("I'Am a sweetsProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Chewing gum"
    )),
    OrangeSweets(new Food("I'Am a sweetsProduct and cost 15 kr","Rip of the plastic raping and consume me", 15,"Orange sweets"
    ));

    private Product product;


    ProductsVendingMachine(Product food){
        this.product = food;

    }

}



