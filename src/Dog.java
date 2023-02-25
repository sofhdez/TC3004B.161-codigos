public class Dog implements IAnimal {
    /*
    * This class Dog has only one responsibility: to represent a dog.
    * It has no other responsibilities.
    * This class depends on the interface IAnimal, instead of the class Animal,
    * which allows it to be more flexible.
    * */
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("The dog " + name + " is moving.");
    }
}
