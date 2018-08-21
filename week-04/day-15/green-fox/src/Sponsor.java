public class Sponsor extends Person{
     private String company;
     private int hiredStudents;

     public  Sponsor(){
         this.company = "Google";
     }
     public  Sponsor(String name, int age, String gender, String company){
         super(name, age, gender);

         this.hiredStudents = 0;
         this.company = company;
     }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
         hiredStudents++;
    }

    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
}
