public class OOPSBannerUC7 {

    public static void main(String[] args) {

        String input = "OOPS";
        StringBuilder[] output = new StringBuilder[5];

        // Initialize 5 rows for banner height
        for (int i = 0; i < 5; i++) {
            output[i] = new StringBuilder();
        }

        // Process each character
        for (char ch : input.toCharArray()) {
            CharacterPatternMap pattern = CharacterPatternMap.getPattern(ch);

            if (pattern != null) {
                String[] rows = pattern.getPattern();

                for (int i = 0; i < rows.length; i++) {
                    output[i].append(rows[i]).append("  ");
                }
            }
        }

        // Print final banner
        for (StringBuilder row : output) {
            System.out.println(row);
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        // Centralized pattern management
        public static CharacterPatternMap getPattern(char ch) {

            switch (Character.toUpperCase(ch)) {

                case 'O':
                    return new CharacterPatternMap('O', new String[]{
                            " *** ",
                            "*   *",
                            "*   *",
                            "*   *",
                            " *** "
                    });

                case 'P':
                    return new CharacterPatternMap('P', new String[]{
                            "**** ",
                            "*   *",
                            "**** ",
                            "*    ",
                            "*    "
                    });

                case 'S':
                    return new CharacterPatternMap('S', new String[]{
                            " ****",
                            "*    ",
                            " *** ",
                            "    *",
                            "**** "
                    });

                default:
                    return null;
            }
        }
    }
}