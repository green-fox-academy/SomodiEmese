
public class Counter {
    int value;
    int number = 10;

    public Counter(int value){
        this.value = value;
    }

    public void add(){
        this.value += number;
    }

    public int add2(){
        this.value += 1;
        return value;
    }

    public void reset(){
        this.value = value;
    }

    public static void main(String[] args){
        Counter value01 = new Counter(2);
        System.out.println(value01.value);
    }
}