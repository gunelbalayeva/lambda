import java.util.function.Function;

public class FunctionalInterfae {

    public static void main(String[] args) {
        String s1 = "Hello World, Hello Java ";

        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < s1.length(); i++) {
                    if (i % 2 == 0) {
                        stringBuilder.append(s1.charAt(i));
                    }
                }
                return stringBuilder.toString();
            }
        };
        System.out.println("function.apply(\"Hello World\") = " + function.apply("Hello World"));
    }
}
