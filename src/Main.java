import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            arrlist.add(r.nextInt(1, 101));
        }
        ArrayList<Integer> arrtak = new ArrayList<>();
        for (Integer integer : arrlist) {
            if (integer % 2 != 0) arrtak.add(integer);
        }
        ArrayList<Integer> arrjup = new ArrayList<>();
        for (Integer integer : arrlist) {
            if (integer % 2 == 0) arrjup.add(integer);
        }
        System.out.printf("1-arrlist:%s \n2-arrlist так сандар: %s \n3-arrlist жуп сандар: %s", arrlist, arrtak, arrjup);
    }
}