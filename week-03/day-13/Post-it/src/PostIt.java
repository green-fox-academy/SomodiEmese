public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt ( String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    public static void main(String[] args){
        PostIt example1 = new PostIt("orange", "Idea 1", "blue");
        PostIt example2 = new PostIt("pink", "Awesome", "black");
        PostIt example3 = new PostIt ("yellow", "Superb!", "green");
    }
}
