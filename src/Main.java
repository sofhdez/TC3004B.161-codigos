public class Main {
    public static void main(String[] args) {

        // Create a new dog
        Dog dog = new Dog("Rex", 5);

        // Print the dog's name and age
        System.out.println("The dog's name is " + dog.getName() + " and it is " + dog.getAge() + " years old.");

        // Change the dog's name and age
        dog.setName("Max");
        dog.setAge(6);

        // Print the dog's name and age
        System.out.println("The dog's name is " + dog.getName() + " and it is " + dog.getAge() + " years old.");

        // Make the dog move
        dog.move();
    }
}