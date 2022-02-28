public class Card {
    private String suit;
    private String face;
    private int num;
    private boolean faceCheck =  true;

    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
    }
    public Card(String suit, int num) {
        this.suit = suit;
        this.num = num;
        faceCheck = false;
    }
    @Override
    public String toString(){
        if (faceCheck){
            return suit + " " + face;
        }else{
            return suit + " " + num;
        }

    }
    @Override
    public boolean equals(Object obj){

        if (obj instanceof Card other) {
            return this.toString().equals(other.toString());
        }else {
            return false;
        }
    }


}
