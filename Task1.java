import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
//        public static void main(String[] args) {
//            int b = (int) (Integer.MAX_VALUE - 2);
//            byte[] ba = new byte[b];
//        }
    public static void main(String[] args) {
        LinkedList<Long> arrayList = new LinkedList<>();
        firstMethod(arrayList,1000);
        secondMethod(arrayList, 100);
    }

    public static void firstMethod(List list, int num) {
        for(int i = 1; i <= num; i++) {
            list.add(null);
        }
    }
    public static void secondMethod(List list, int num) {
        list.add(num, 5);
    }

}


