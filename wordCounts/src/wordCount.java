public class wordCount {
    private int count;
    private String theWord;

    public wordCount( String theWord) {
        this.count = 1;
        this.theWord = theWord;
    }

    public int getCount() {
        return count;
    }
    public void addOne(){
        count += 1;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTheWord() {
        return theWord;
    }

    public void setTheWord(String theWord) {
        this.theWord = theWord;
    }

    @Override
    public boolean equals(Object obj){
        if( obj instanceof String other){
            if (this.getTheWord().equals(other)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
