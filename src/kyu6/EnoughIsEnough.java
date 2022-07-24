package kyu6;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences == 0) return new int[]{};

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : elements) {
            if (!map.containsKey(e)) {
                map.put(e, 1);
                list.add(e);
            } else if (map.containsKey(e) && map.get(e) < maxOccurrences) {
                map.put(e, map.get(e) + 1);
                list.add(e);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(
                new int[]{20, 37, 21},
                EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                EnoughIsEnough.deleteNth(new int[]{}, 5)
        );

    }
}
