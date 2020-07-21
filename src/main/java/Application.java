public class Application {
    public static void main(String[] args) {

        Person adam = new Person("Adam", 40.5, 178);
        Person iza = new Person("Iza",26, 168);
        System.out.println(iza.name + " " + iza.age + " " + iza.height);

        if (adam.name != null) {
            if (adam.age > 30 && adam.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }

}


