public class Application {
    public static void main(String[] args) {

        Person adam = new Person();
        adam.name = "Adam";
        adam.age = 40.5;
        adam.height = 178;

        if (adam.name != null) {
            if (adam.age > 30 && adam.height > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }

}


