public class Main {

    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "Bme" );
        Student student02;
        try {
            student02 = (Student)john.clone();
            student02.introduce();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
