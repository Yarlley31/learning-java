import classes.Car;

public class Main {
    public static void main(String[] args) {
//        String msg = "Progamando em: ";
//        System.out.println("Hello World!");
//        System.out.println(msg + args[0]);
//        System.out.println("Precisamos de uma " + args[1]);



//        var person1 = new classes.Person();
//        person1.setName("Yarlley");
//        person1.setAge(18);
//        var person2 = new classes.Person();
//        person2.setName("Marcos");
//        person2.setAge(19);
//
//        System.out.println(person1.getName() + " " + person1.getAge() + " \n"  + person2.getName() + " " + person2.getAge());

        var car = new Car("Fiat", "Uno", "Red");

        System.out.println(car.getInfo());
        System.out.println("Marca: " + car.brand());

    }
}
