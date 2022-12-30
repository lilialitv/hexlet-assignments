package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String input) {
        String[] inputArray = input.split("\n");
        String result1 = Arrays.stream(inputArray)
                .filter(x -> x.startsWith("environment"))
                .map(x -> x.replaceAll("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .collect(Collectors.joining(","));
        String[] array2 = result1.split(",");
        return Arrays.stream(array2)
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .collect(Collectors.joining(","));
    }
}
//END
