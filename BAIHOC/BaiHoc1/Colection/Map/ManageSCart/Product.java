package BAIHOC.BaiHoc1.Colection.Map.ManageSCart;

import java.util.Arrays;

public class Product {
    private String ProductCode;
    private String NameProduct;
    private double Price;

    public Product(String productCode, String nameProduct, double price) {
        ProductCode = productCode;
        NameProduct = nameProduct;
        Price = price;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public void setNameProduct(String nameProduct) {
        NameProduct = nameProduct;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    @Override
    public String toString() {
       return "ProductCode: "+ProductCode+", Name Product: "+NameProduct+", Price: "+Price;
    }
    
}
