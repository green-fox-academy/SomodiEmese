package main.java.animals;

abstract class Animal {
    protected String name;
    protected int age;
    protected String gender;
    protected String food;


    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String eat(){
        return this.food;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String breed() {
        return "laying eggs";
    }
}
