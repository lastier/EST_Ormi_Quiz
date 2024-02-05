package dailyquizItemAnswer240201;

public class Item{
    int id;
    String name;
    int price;

    Item(int id, String name, int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

//    public String toString(){
//        return String.format("ID : %s, Name : %s, Price : %s", id, name, price);
//    }
    void print(){
        System.out.println(this.toString());
    }

    void print(int id){

    }
    void print(int id, String name){

    }
}
