import java.lang.reflect.Array;
import java.util.*;

public class Main {


//    public static int solution(List<Integer> x, List<Integer> y) {
//        List<Integer> largeList = new ArrayList<Integer>();
//        List<Integer> smallList = new ArrayList<Integer>();
//
//        if (x.size() > y.size()) {
//            largeList = x;
//            smallList = y;
//        } else {
//            largeList = y;
//            smallList = x;
//        }
//
//        largeList.removeAll(smallList);
//        int id = largeList.get(0);
//        System.out.println(id);
//        return id;
//    }

//    public static int solution(int[] x, int[] y) {
//        List<int[]> large = new ArrayList<>();
//        List<int[]> small = new ArrayList<>();
//
//        if (x.length > y.length) {
//            large = Arrays.asList(x);
//            small = Arrays.asList(y);
//        } else {
//            large = Arrays.asList(y);
//            small = Arrays.asList(x);
//        }
//        large.removeAll(small);
//        int id = (int) Array.get(large, 0);
//        System.out.println(id);
//        return id;
//    }

    public static int solution(int[] x, int[] y) {
        int[] large;
        int[] small;
        int id = 0;
        int temp = 0;

        //Sort the large array in ascending order
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if(x[i] > x[j]) {      //swap elements if not in order
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        //Sort the small array in ascending order
        for (int i = 0; i < y.length; i++) {
            for (int j = i + 1; j < y.length; j++) {
                if(y[i] > y[j]) {      //swap elements if not in order
                    temp = y[i];
                    y[i] = y[j];
                    y[j] = temp;
                }
            }
        }

        //Figures out which array is larger, the larger array will contain the extra id
        if (x.length > y.length) {
            for (int i = 0; i < x.length; i++) {
                if (x[i] != y[i]) {
                    id = x[i];
                    //System.out.println(id);
                    break;
                }
            }
        } else {
            for (int i = 0; i < y.length; i++) {
                if (y[i] != x[i]) {
                    id = y[i];
                    //System.out.println(id);
                    break;
                }
            }
        }


//        for (int i : large) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i : small) {
//            System.out.print(i + " ");
//        }
//        System.out.println("next");

        return id;
    }
    public static void main(String[] args) {
//        List<Integer> x = new ArrayList<Integer>();
//        Collections.addAll(x, 13, 5, 6, 2, 5);
//        List<Integer> y = new ArrayList<Integer>();
//        Collections.addAll(y, 5, 2, 5, 13);
//        int[] x = {13, 5, 6, 2, 5};
//        int[] y = {5, 2, 5, 13};

        int[] x = {14, 27, 1, 4, 2, 50, 3, 1};
        int[] y = {2, 4, -4, 3, 1, 1, 14, 27, 50};


        solution(x,y);
        System.out.println(solution(x,y));

    }
}