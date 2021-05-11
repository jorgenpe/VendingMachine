package org.example.VendingMachine.Product;

public abstract class Product {

    private String productInfo;
    private String useProduct;
    private int price;
    private int productNumber;

    public abstract int ProductNumber();

    public abstract int  productPrice();

    public String examine(){

        return productInfo;
    }

    public String use(){

        return useProduct;
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
