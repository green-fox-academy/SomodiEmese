public class TakesLonger {
        public static void main(String... args){

            String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
            String quote2 = "always takes longer than";
            quote = quote.replace("It" , "It" + quote2);

            System.out.println(quote);
        }
}

