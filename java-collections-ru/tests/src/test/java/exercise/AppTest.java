package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> elements = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15));
        int count = 4;
        List<Integer> result = new ArrayList<>();
        result.add(10);
        result.add(11);
        result.add(12);
        result.add(13);
        List<Integer> actual = App.take(elements, 4);
        Assertions.assertThat(result)
                .isEqualTo(actual);
        // END
    }
}
