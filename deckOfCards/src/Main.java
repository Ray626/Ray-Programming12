import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList<>();
        ArrayList<Integer> flash = new ArrayList<>();
        int flashInHand = 0;
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
        System.out.println( "\n"+ "Shuffled:" + " \n");
        for (Card card :deck){
            System.out.println(card);
        }
        int i;
        for (i = 0; i < 100000;i++){
            flash.clear();
            Collections.shuffle(deck);
            for (int i1 = 0; i1 < 5;i1++){
                Card cardPolled = deck.pollLast();
                flash.add(cardPolled.getValue());
                deck.add(0,cardPolled);
            }
            Collections.sort(flash);
            int flashCheck = 0;
            for(int i2 = 1; i2 < 5; i2++){
                if (flash.get(i2) - 1 == flash.get(i2-1)){
                    flashCheck+=1;
                }
                if(flashCheck == 4){
                    flashInHand+=1;
                }
            }
        }
        System.out.println("\n" + "Numbers of flash from polling five cards in deck " + i + " times: " + flashInHand);
    }
}
