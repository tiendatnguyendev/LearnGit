package BAIHOC.BaiHoc1.Colection.Map.ManageSCart;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ManageShoppingCart {
    Map <String, Product > ShoppingCart;
    public ManageShoppingCart () {
        ShoppingCart = new HashMap<>();
    }

    public void addProduct(String id, Product pro) {
        ShoppingCart.put(id, pro);
    }

    public void displayShoppingCart() {
        // System.out.println(ShoppingCart);
        for(Product pro : ShoppingCart.values()){
            System.out.println(pro);
        }
    }

    public Product findProductInCart(String id) {
        Product temp =null;
        for(Product pro : ShoppingCart.values()){
            if(pro.getProductCode().equals(id)){
                temp = pro;
                break;
            }
        }
        return temp;
    }

    public Product findProductInCartTwo(String id) {
        return ShoppingCart.get(id);
    }

    public void deleteOnceProductinCart(String id) {
        ShoppingCart.remove(id);
    }


    public void deleteAllinCart() {
        ShoppingCart.clear();
    }


    public double TotalValueShoppingCart() {
      double tolTal = 0;
      for(Product pro : ShoppingCart.values()){
        tolTal += pro.getPrice();
      }
      return tolTal;
    }

    public static void main(String[] args) {
        ManageShoppingCart Cart = new ManageShoppingCart();

        Locale vnLocal = new Locale("vi", "VN");
        Currency currency = Currency.getInstance(vnLocal);
        String symbol = currency.getSymbol(vnLocal);
        NumberFormat VnCurency = NumberFormat.getCurrencyInstance(vnLocal);

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------------MENU-------------");
            System.out.println("1.Add Product on Cart.\n"+
            "2.Search Product on Cart.\n"+
            "3.Display List Product on Cart.\n"+
            "4.Delete Any Once Product on Cart.\n"+
            "5.Delete All in Cart.\n"+
            "6.Total Value on Cart.\n"+
            "0.Exit."
            );
            System.out.print("choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0:
                return;
                case 1:
                    // System.out.print("ProductCode: ");
                    // String id = sc.nextLine();
                    // System.out.print("Name Product: ");
                    // String name = sc.nextLine();
                    // System.out.print("Price Product: ");
                    // Double price = sc.nextDouble();
                    Product pro_one = new Product("P001", "Laptop", 2000000);
                    Product pro_two = new Product("P002", "Honda", 7000000);
                    Product pro_three = new Product("P003", "Iphone", 9000000);
                    Cart.addProduct(pro_one.getProductCode(), pro_one);
                    Cart.addProduct(pro_two.getProductCode(), pro_two);
                    Cart.addProduct(pro_three.getProductCode(), pro_three);
                    System.out.println("Add Success!");
                break;
                case 2:
                    System.out.print("ProductCode: ");
                    String id = sc.nextLine();
                    System.out.println("found Product: "+Cart.findProductInCart(id));
                break;
                case 3:
                Cart.displayShoppingCart();
                break;
                case 4:
                    System.out.print("ProductCode: ");
                    id = sc.nextLine();
                    Cart.deleteOnceProductinCart(id);
                break;
                case 5:
                Cart.deleteAllinCart();
                break;
                case 6:
                System.out.println("Total ShoppingCart: "+VnCurency.format(Cart.TotalValueShoppingCart()));
                break;
                default:
                break;
            }
        } while (true);
    }
}
