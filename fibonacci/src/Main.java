public class Main {
    static int fibonacci(int term){
        if(term == 1){return 1;}
        else if(term <=0){return 0;}
        else{return 2 * fibonacci(term - 1) - fibonacci(term -3);}
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));

    }
}
