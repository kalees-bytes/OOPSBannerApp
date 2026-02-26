public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // O O P S banner (OOPS)
        for (int i = 0; i < O.length; i++) {
            System.out.println(
                    O[i] + "  " +
                    O[i] + "  " +
                    P[i] + "  " +
                    S[i]
            );
        }
    }

    // Static method for O
    static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for P
    static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        };
    }

    // Static method for S
    static String[] getS() {
        return new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}