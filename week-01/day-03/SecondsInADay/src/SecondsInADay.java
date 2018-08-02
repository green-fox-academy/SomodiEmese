public class SecondsInADay {
    public static void main(String[] args){
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int currnetTimeInSeconds = (currentHours*60*60) + (currentMinutes*60) + currentSeconds;
        int daySeconds = 60*60*24;
        System.out.println(daySeconds - currnetTimeInSeconds);
    }
}
