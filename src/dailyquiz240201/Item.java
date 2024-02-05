package dailyquiz240201;

public class Item {
   private int id;
   private String name;
   private double price;

   Item(int id, String name, double price){
       this.id = id;
       this.name = name;
       this.price = price;
   }

   //Getter
   public int getId(){
       return id;
   }
   public String getName(){
       return name;
   }
   public double getPrice(){
       return price;
   }

   public void showDetails(){
       System.out.println("ID : " + id + ", 이름 : " + name + ", 가격 : " + price);
   }

}
