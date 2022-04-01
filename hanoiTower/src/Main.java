public class Main {
    static int hanoi(int ring){
        if (ring == 1){
            return 1;
        }else{
            return 2*hanoi(ring -1)+1;
        }

    }
    public static void main(String[] args) {
        System.out.println(hanoi(3));
    }
}
