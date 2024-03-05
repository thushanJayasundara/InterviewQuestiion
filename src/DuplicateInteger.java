import java.util.HashMap;

public class DuplicateInteger {

    public static void main(String[] args) {

        Integer[] values = new Integer[]{1, 2, 2, 4, 7, 7, 7, 1, 9, 5, 8, 10,10, 7};
        HashMap<Integer, Integer> outPut = new HashMap<>();

        for (Integer value : values) {

            boolean isContainsValue = outPut.containsKey(value);

            if (isContainsValue) {

                Integer existValue = outPut.get(value);
                existValue++;
                outPut.replace(value, existValue);

            } else {

                outPut.put(value, 1);

            }

        }

        outPut.forEach((key, value) -> System.out.println("number: " + key + ", count: " + value));

    }

}
