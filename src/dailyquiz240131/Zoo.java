package dailyquiz240131;

public class Zoo {
    String name;
    final int time = 3;

    Zoo(String name){
        this.name = name;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void run(String km){
        System.out.println(km);
        final int a = 3;
    }

    void sleep(){
        System.out.println(name+" 은(는)"+time+" 시부터 자는중");
    }
}
