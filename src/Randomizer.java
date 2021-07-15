import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Randomizer {

    public static void main(String[] args) {
        Random random = new Random();

//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < 10000; i++) {
//            int nextInt = random.nextInt(50);
//
//            if (map.containsKey(nextInt)) {
//                map.put(nextInt, map.get(nextInt) + 1);
//            } else {
//                map.put(nextInt, 1);
//            }
//        }
//
//        System.out.println("map = " + map);

        int total = 100000;
        int trues = 0;
        for (int i = 0; i < total; i++) {
            if (Math.random() < 0.2) {
                trues++;
            }
        }
        System.out.println("total = " + total + " trues = " + trues);
        System.out.println("percent = " + (double) trues/total * 100);
    }

}
