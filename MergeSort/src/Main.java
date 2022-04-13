import java.security.Timestamp;
import java.util.Arrays;

public class Main {
    static int[] merge( int numA, int numB, int[] arrayA, int[] arrayB, int [] arrayC) {
        if (arrayC.length == numA + numB) {
            return arrayC;
        }else{
            if(arrayA.length -1 < numA ){
                arrayC[numA + numB] = arrayB[numB];
                return merge(numA, numB+1, arrayA,arrayB,arrayC);
            }else if (arrayB.length - 1< numB){
                arrayC[numA + numB] = arrayA[numA];
                return merge(numA+1, numB, arrayA,arrayB,arrayC);
            }else{
                if(arrayA[numA] > arrayB[numB]){
                    arrayC[numA+numB] = arrayA[numA];
                    return merge(numA+1, numB, arrayA,arrayB,arrayC);
                }else {
                    arrayC[numA + numB] = arrayB[numB];
                    return merge(numA, numB + 1, arrayA, arrayB, arrayC);
                }
            }
        }
    }


    static int[] mergesort(int[] theArray){
        if (theArray.length <=1){
            return theArray;
        }else{
            int midpoint = theArray.length/2;
            int[] arrayA = new int[midpoint];
            int[] arrayB = new int[theArray.length - midpoint];
            System.arraycopy(theArray,0,arrayA,0,midpoint);
            if(theArray.length % 2 == 0){
                System.arraycopy(theArray,midpoint,arrayB,0,midpoint);
            }else{
                System.arraycopy(theArray,midpoint,arrayB,0,midpoint+1);
            }
            arrayA = mergesort(arrayA);
            arrayB = mergesort(arrayB);
            return merge(0,0,arrayA,arrayB,new int[arrayA.length + arrayB.length]);
        }
    }

    public static void main(String[] args) {

        int[] arrayC = new int[12500];

        for(int i = 0; i <12500; i++){
            int range = 10000;
            arrayC[i] = (int)(Math.random() * range);
        }
        long start = System.nanoTime();
        System.out.println(Arrays.toString(mergesort(arrayC)));

        System.out.println(System.nanoTime()- start);






    }
}
