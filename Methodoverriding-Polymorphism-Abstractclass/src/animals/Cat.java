package animals;

public class Cat extends Animal {

    public static Integer age = 2;


    public  Integer getAge() {
        return age;
    }

    public static void sayMyName(){
        System.out.println("My name is Cat");
    }
//    public Cat(String name, Integer age) {
//        super(name, age);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println(this.getName() + " Meow");
//    }

}
