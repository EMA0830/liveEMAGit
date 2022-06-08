package com.demo.basics;
public class EqualsEx {
   public static void main(String[] args) {
      Product product = new Product(1, "SWY", 1500);
      Product product1 = new Product(1, "SWY", 1500);
      // Product product1 = new Product(2, "EAWA", 2500);
      System.out.println(product);
      System.out.println(product1);
      if(product == product1){
         System.out.println("Identical");
      }
      else 
      {
         System.out.println("Not Identical");
      }

      if(product.equals(product1)){
         System.out.println("Equal");
      }
      else 
      {
         System.out.println("Not Equal");
      }

      product1 = product;
      if(product == product1){
         System.out.println("Identical");
      }
      else 
      {
         System.out.println("Not Identical");
      }
      if(product.equals(product1)){
         System.out.println("Equal");
      }
      else 
      {
         System.out.println("Not Equal");
      }
      System.out.println(product);
      System.out.println(product1);
   }
}


class Product {
   private int productId;
   private String productName;
   private float price;
   public Product(int productId, String productName, float price) {
      this.productId = productId;
      this.productName = productName;
      this.price = price;
   }
   
   @Override
	public boolean equals(Object productObject) {
	   Product product = (Product)productObject;
	   if(productId == product.productId && productName.equals(product.productName) && price == product.price) {
		   return true;
	   }
	   else {
		return false;
	}
	}
//   @Override
//   public int hashCode() {
//      final int prime = 31;
//      int result = 1;
//      result = prime * result + Float.floatToIntBits(price);
//      result = prime * result + productId;
//      result = prime * result + ((productName == null) ? 0 : productName.hashCode());
//      return result;
//   }
//   @Override
//   public boolean equals(Object obj) {
//      if (this == obj)
//      return true;
//      if (obj == null)
//         return false;
//      if (getClass() != obj.getClass())
//         return false;
//      Product other = (Product) obj;
//      if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
//         return false;
//      if (productId != other.productId)
//         return false;
//      if (productName == null) {
//         if (other.productName != null)
//            return false;
//      } else if (!productName.equals(other.productName))
//         return false;
//      return true;
//   }

}
