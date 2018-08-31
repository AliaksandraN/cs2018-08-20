package by.it.anovikava.lesson06;

public class DogHelper {
    private String name;
    static void printAllNames(Dog[] dogs){
     for (Dog dog: dogs) {
            System.out.print(dog.getName()+"");
        }
        System.out.println();
    }
    static double averageAge(Dog[] dogs){
        double result=0;
        for (Dog dog: dogs){
            result+=dog.getAge();

        }
        return result/dogs.length;
    }
}
