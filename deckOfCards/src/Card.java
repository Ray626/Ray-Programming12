public class Card implements Comparable<Card> {
    private final String suit;
    private String face;
    private int value;


    public Card(String suit, int num) {
        this.suit = suit;
        this.value = num;
        if (value <= 10) {
            this.face = String.valueOf(num);
        } else {
            switch (value) {
                case 11 -> face = "jack";
                case 12 -> face = "queen";
                case 13 -> face = "king";
                case 14 -> face = "ace";
            }
        }
    }

    @Override
    public String toString() {
        return suit + " " + face;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card other) {
            return this.hashCode() == other.hashCode();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }


    @Override
    public int compareTo(Card o) {
        if(this.getSuit().ordinal() == o.getSuit().ordinal()){
            if (this.value > o.value){
                return -1;
            }else if(this.value < o.value){
                return 1;
            }else{
                return 0;
            }
        }else if (this.getSuit().ordinal() > o.getSuit().ordinal()){
            return 1;
        }else {
            return -1;
        }

    }

    public int getValue(){
        return value;
    }


    public Suit getSuit() {
        switch (suit){
            case "diamond" -> {
                return Suit.DIAMOND;
            }
            case "spade" -> {
                return Suit.SPADE;
            }
            case "heart" ->{
                return Suit.HEART;
            }
            case "club" ->{
                return Suit.CLUB;
            }
            default -> {
                return null;
            }
        }
    }



}
