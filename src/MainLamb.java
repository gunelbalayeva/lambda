import java.util.function.Function;

public class MainLamb {
    public static void main(String[] args) {
        String s = "Hello World, Hello Java ";
        Function<String, String> function = (String s1) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    stringBuilder.append(s.charAt(i));
                }
            }
            return stringBuilder.toString();
        };
        System.out.println(doubleCaracters(function, " with method"));

    }

    public static String doubleCaracters(Function<String, String> func, String src) {
        return func.apply(src);
    }
}
