public class Main {
    static int fibonacci(int term){
        return term <= 1 ? (term== 1 ? 1 : 0) : 2 * fibonacci(term - 1) - fibonacci(term -3);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
