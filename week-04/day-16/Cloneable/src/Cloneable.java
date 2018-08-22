class Student implements Cloneable {
    private String name;
    private int age;
    private String gender;
    private String previousOrganization;

    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void introduce(){
            System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + ".");
        }

    }


