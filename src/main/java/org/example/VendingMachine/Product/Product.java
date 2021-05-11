package org.example.VendingMachine.Product;

public abstract class Product {

    private String productInfo;
    private String useProduct;

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
