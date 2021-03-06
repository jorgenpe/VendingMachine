package org.example.VendingMachine.Product;

// Abstract super class that Food, Drink and Sweets inherits from. Has two methods that are abstracts and need to be
// implemented in classes that inherit from the super class.

public abstract class Product {

    private String productInfo;
    private String useProduct;

    public Product(){

    }
    public Product(String productInfo, String useProduct){
            this.productInfo = productInfo;
            this.useProduct = useProduct;

        }

    public abstract int ProductNumber();

    public abstract int  productPrice();

    public String examine(){

        return productInfo;
    }

    public String use(){

        return useProduct;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getUseProduct() {
        return useProduct;
    }

    public void setUseProduct(String useProduct) {
        this.useProduct = useProduct;
    }


}
