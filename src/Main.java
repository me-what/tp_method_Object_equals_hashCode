public class Main extends  Programmer {
    protected Main(String position, int salary) {
        super(position, salary);
    }

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Junior", 300);
        Programmer programmer2 = new Programmer("Junior", 300);

        System.out.println(programmer1 == programmer2); // false
        System.out.println(programmer1.equals(programmer2)+"\n"); // true


        Programmer programmer_1 = new Programmer("Junior", 300);
        Programmer programmer_2 = new Programmer("Middle", 300);

        System.out.println(programmer_1 == programmer_2); // false
        System.out.println(programmer_1.equals(programmer_2)); // false

    }
}