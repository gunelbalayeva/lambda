public class Lamb {
    public static void main(String[] args) {

        String s1 = "Hello World, Hello Java ";
        new Thread(new Runnable() {
            @Override
            public void run() {
                String[] words = s1.split(" ");
                for (String s : words) {
                    System.out.println(s);
                }
            }
        }).start();


        new Thread(() -> {
            System.out.println("*****LAMBDA EXPRESSIONS******");

            String[] words = s1.split(" ");
            for (String s : words) {
                System.out.println(s);
            }

        }).start();


    }
}