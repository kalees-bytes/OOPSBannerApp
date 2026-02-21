public class BannerUC4 {

    public static void main(String[] args) {

        // Store banner lines inside a String array
        String[] banner = {
            String.join("", "***************"),
            String.join("", "*             *"),
            String.join("", "*   WELCOME   *"),
            String.join("", "*     TO      *"),
            String.join("", "*   UC4 DEMO  *"),
            String.join("", "*             *"),
            String.join("", "***************")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}