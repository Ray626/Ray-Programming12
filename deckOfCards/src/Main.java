import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList<>();
        for (int i = 2; i < 15; i++){
            deck.add(new Card("diamond",i));
            deck.add(new Card("heart",i));
            deck.add(new Card("spade",i));
            deck.add(new Card("club",i));
        }
        Collections.sort(deck,Card::compareTo);
        for (Card card :deck){
            System.out.println(card);
        }
    }
}
