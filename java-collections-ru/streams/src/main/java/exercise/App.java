package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static boolean isFreeEmail(String string) {
        return string.contains("@gmail.com") || string.contains("@yandex.ru") || string.contains("@hotmail.com");
    }

    public static long getCountOfFreeEmails(List<String> list) {
        long result = list.stream()
                    .filter(email -> !email.isBlank())
                    .filter(email -> isFreeEmail(email))
                    .count();
        return result;
    }
}
// END
