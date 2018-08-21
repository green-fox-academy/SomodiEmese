public class Student extends Person {
    private String previousOrganization;
    private int skippedDays;
    private int numberOfDays;

    public Student(){
        this.previousOrganization = previousOrganization ;
        this.skippedDays = 0;
        this.numberOfDays = 0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);

        this.previousOrganization = "The School of Life";
        this.skippedDays = this.skippedDays;
    }

    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println( "from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays){
        skippedDays *= numberOfDays;
    }
}
