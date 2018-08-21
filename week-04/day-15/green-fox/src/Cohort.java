import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Mentor> mentors = new ArrayList<>();
    private ArrayList<Sponsor> sponsors = new ArrayList<>();

    public Cohort(String name){
        this.name = name;
        this.students = students;
        this.mentors = mentors;
        this.sponsors = sponsors;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
