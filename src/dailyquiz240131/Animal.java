package dailyquiz240131;

public class Animal {
    private String name;
    private final String species;
    public Animal(String species) {
        this.species = species;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(getName() + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(getName() + " makes a sound.");
    }

    public void runHunt(){
        System.out.println(getName() + " running and hunt rabbits.");
    }

    public void eat(){
        System.out.println(getName() + " eating food now.");
    }

    public static void main(String[] args) {
        // 동물 인스턴스 생성
        Animal cat = new Animal("Cat");
        Animal bigcat = new Animal("lion");
        cat.setName("SnowLeopard");
        cat.makeSound(); // Mittens makes a sound.
        cat.sleep(); // Mittens is sleeping.

        bigcat.setName("Mountain Lion");
        bigcat.runHunt();
        bigcat.eat();
    }
}
