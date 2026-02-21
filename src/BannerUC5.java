public class BannerUC5 {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", "*".repeat(15)),
            String.join("", "*", "             ", "*"),
            String.join("", "*", "   WELCOME   ", "*"),
            String.join("", "*", "     TO      ", "*"),
            String.join("", "*", "   UC5 DEMO  ", "*"),
            String.join("", "*", "             ", "*"),
            String.join("", "*".repeat(15))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}