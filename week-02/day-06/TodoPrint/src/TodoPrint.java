public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";

        todoText = todoText.concat(" - Download games\n");
        todoText = todoText.concat(" - Diablo\n");

        System.out.println(todoText);
    }
}
