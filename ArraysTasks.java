import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTasks {
    private static int[] even(int n){
        int[] evenNumbers = new int[n];
        for(int i = 0; i<evenNumbers.length; i++){
            evenNumbers[i] = i*2+2;
        }
        return evenNumbers;
    }
    private static boolean allSimilar(int[] a){
        int j = 0;
        for(int i = 0; i<a.length; i++){
           if(a[0] == a[i])
               j++;
        }
        if(j == a.length){
            return true;
        }else{
            return false;
        }
    }
    private static boolean hasSimilar(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                j++;
            }
        }if(j == 0){
            return false;
        }else{
            return true;
        }
    }
    private static double Mean(int[] a){
        double average=0;
        if(a.length>0){
            double sum = 0;
            for(int i = 0; i<a.length; i++){
                sum += a[i];
            }
            average = sum/a.length;
        }
        return average;
    }
    private static void Shift(int[]a){
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,1,3);
        b[0] = a[a.length-1];
        System.arraycopy(b,0,a,0,4);
        System.out.println(Arrays.toString(a));
    }
    private static int[] copyShift(int[]a){
        int[] b = new int[a.length];
        b[0] = a[a.length-1];
        for(int i = a.length-1; i>0; i--){
            a[i] = a[i-1];
        }
        System.arraycopy(a,1,b,1,3);

        return b;
    }

     private static void printTable(int [][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++) {
                System.out.printf(a[i][j] + "\t");
            }
            System.out.println();
        }
     }

    private static void printTableAligned(int [][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++) {
                System.out.printf("%7d", a[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        System.out.println(Arrays.toString(even(10)));
        System.out.println(Mean(new int[]{2,3,4,5,6}));
        System.out.println(allSimilar(new int[]{2,2,2}));
        System.out.println(hasSimilar(new int[]{2,5,4,6,6}));
        Shift(new int[]{18,25,36,42});
        System.out.println(Arrays.toString(copyShift(new int[]{18,25,36,42})));
        printTable(new int[][]{{10,20},{40,90},{50,60,79}});
        printTableAligned(new int[][]{{1660,260, 678, 9},{470,90,5678},{5880,60,8979}});

    }
}