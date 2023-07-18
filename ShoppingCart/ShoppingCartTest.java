import java.util.*;
 public class ShoppingCartTest
 {
   public static void main(String[] args)
   {

    
     Item i1 = new Item("Olive", 3, 100);
     Item i2 = new Item("Olive", 3, 100);
     Item i3 = new Item("Olive", 3, 100);
     Item i4 = new Item("Olive", 3, 100);
     Item i5 = new Item("Olive", 3, 100);
     
     ShoppingCart cart = new ShoppingCart();
     
     /*
      * 8 .Add all the items to the cart
      */
     
     cart.addToCart(i1);
     cart.addToCart(i2);
     cart.addToCart(i3);
     cart.addToCart(i4);
     cart.addToCart(i5);
     
     cart.showCart();
     
     /* remove the item sent as argument from the cart */
     cart.removeFromCart(i3);    
     
     
     cart.showCart();
 
     
     double totalAmount = cart.getTotalAmount();
     System.out.println(totalAmount);
 
     
     double payableAmount = cart.getPayableAmount();
     System.out.println(payableAmount);    
 
     /* apply a coupon code */
     cart.applyCoupon("IND50");
     
     
    cart.printInvoice();
 
     cart.applyCoupon("IND10");
 
    
     cart.printInvoice();
 
     cart.addToCart(new Item("Milk", 5, 30.00));
     
     cart.printInvoice();
   }
 }