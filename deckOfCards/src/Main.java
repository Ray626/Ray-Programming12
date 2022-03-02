import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList<>();
        ArrayList<Card> hand = new ArrayList<>();
        ArrayList<Integer> flash = new ArrayList<>();
        for (int i = 0; i < 13; i++){
            deck.add(new Card("diamond",i+2));
            deck.add(new Card("heart",i+2));
            deck.add(new Card("spade",i+2));
            deck.add(new Card("club",i+2));
        }
        Collections.sort(deck,Card::compareTo);
        for (Card card :deck){
            System.out.println(card);
        }
        Collections.shuffle(deck);
        System.out.println( "Shuffled:");
        for (Card card :deck){
            System.out.println(card);
        }
        for (int i = 0; i < 1000;i++){
            for (int i1 = 0; i1 < 5;i1++){
                Card cardPolled = deck.pollLast();
                hand.add(cardPolled);
                deck.add(0,cardPolled);
            }
            Collections.sort(hand);
            for()

        }
    }
}
