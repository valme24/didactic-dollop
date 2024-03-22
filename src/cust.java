import java.util.Scanner;

public class cust {
     dish [] order ;
     float total;
     int seat;
     public static void main(String[] args) {
        rest rest = new rest();
        System.out.println("Welcome to big bite");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seat number between 0 to 30");
        cust customer = new cust(); // create an instance of cust
        customer.seat = sc.nextInt(); // use the instance to set the seat field
        customer.order();
        


    
    }


    void order(){
        int bill=0;
        rest.menu();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dish you vant to order");
        String order_string = sc.nextLine();
        String[] string_order =order_string.split(",");
        order = new dish[string_order.length];
        for(int i=0;i<string_order.length;i++){
            order[i] = new dish();
            order[i].dishName = string_order[i];
            order[i].dishType = new String[]{"Veg", "Non-Veg","size:small","size:medium","size:large"};
            order[i].dishPrice = "100";
            bill+=Integer.parseInt(order[i].dishPrice);
            System.out.println("Dish you ordered: "+order[i].dishName + " Price: "+order[i].dishPrice);
           
        }
        total = bill;
        rest.setOrder(seat, order);
        enjoy();
        
            
           
        }
    
    void pay(){
        System.out.println("Total amount to be paid is: "+total);
    }
    void enjoy(){
        System.out.println("Enjoy your meal");
        pay();
    }
    
}
