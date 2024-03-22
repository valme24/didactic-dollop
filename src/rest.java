public class rest {
     static public int gst;
    
     static public dish dish1;
     static public dish dish2;
     static public dish dish3;
     static public dish dish4;
     static private int orders;
     static public String []seats= new String[30];
    rest(){
        dish1 = new dish();
        dish2 = new dish();
        dish3 = new dish();
        dish4 = new dish();
        dish1.dishName = "Burger";
        dish1.dishType = new String[]{"Veg", "Non-Veg","size:small","size:medium","size:large"};
        dish1.dishPrice = "100";
        dish2.dishName = "Pizza";
        dish2.dishType = new String[]{"Veg", "Non-Veg","size:small","size:medium","size:large"};
        dish2.dishPrice = "200";
        dish3.dishName = "Pasta";
        dish3.dishType = new String[]{"Veg", "Non-Veg","size:small","size:medium","size:large"};
        dish3.dishPrice = "150";
        dish4.dishName = "Sandwich";
        dish4.dishType = new String[]{"Veg", "Non-Veg","size:small","size:medium","size:large"};
        dish4.dishPrice = "50";
    
}
 static   boolean menu(){
      System.out.println("1.burgur");
      System.out.println("2. Pizza");
      System.out.println("3. Pasta");
      System.out.println("4. Sandwich");
      return true;
  }

  public  static void setOrder(int seat, dish [] order){
    orders++;
    System.out.println("order recievd at seat :" +seat+ " order is: ");
    for(dish i : order)
     {
       System.out.println(i.dishName);
      }
}
public void completeOrder(cust cust,int seat){
     
    System.out.println("Order completed at seat: "+seat+"bill is "+ cust.total);

}


//end of class rest
}

class dish{
   String dishName;
   String[] dishType;
   String dishPrice;


}