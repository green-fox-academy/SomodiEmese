import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        int dominoesCount = dominoes.size();
        Domino lastDomino = dominoes.get(0);

        for (int i = 0; i < dominoesCount; i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                Domino nextDomino = dominoes.get(j);

                if (lastDomino.getValues()[1] == nextDomino.getValues()[0]) {
                    System.out.print(lastDomino.toString());
                    lastDomino = nextDomino;
                    dominoes.remove(j);
                }
            }
        }
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
      for ( int i = 0; i <  dominoes.size() ; i++ ){
        
      }

        return dominoes;
    }
}
