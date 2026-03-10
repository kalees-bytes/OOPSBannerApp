import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class BannerAppUC8 {

    // Centralized repository for character patterns using a HashMap
    private final Map<Character, List<String>> patternRepository;

    public BannerAppUC8() {
        this.patternRepository = new HashMap<>();
        initializePatterns();
    }

    // Method to populate the HashMap with character patterns
    private void initializePatterns() {
        // Pattern for 'O'
        patternRepository.put('O', Arrays.asList(
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        ));

        // Pattern for 'P'
        patternRepository.put('P', Arrays.asList(
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        ));
        
        // Pattern for 'S'
        patternRepository.put('S', Arrays.asList(
            " **** ",
            "*     ",
            " ***  ",
            "     *",
            " **** "
        ));
        
        // Add other character patterns as needed
    }

    // Method to get the character pattern efficiently using HashMap's get()
    public List<String> getCharacterPattern(char character) {
        // Use the built-in get method for O(1) average time complexity retrieval
        return patternRepository.get(Character.toUpperCase(character)); // Handle case insensitivity if needed
    }

    // Method to build and display the banner word
    public void displayBanner(String word) {
        // Assuming all character patterns have the same number of rows (e.g., 5)
        int bannerHeight = 5; 

        for (int i = 0; i < bannerHeight; i++) {
            for (char character : word.toCharArray()) {
                List<String> pattern = getCharacterPattern(character);
                if (pattern != null) {
                    System.out.print(pattern.get(i) + "  "); // Print the current row of the character
                } else {
                    // Handle unsupported characters gracefully
                    System.out.print("       "); // Print spaces for an unsupported character
                }
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

    public static void main(String[] args) {
        BannerAppUC8 app = new BannerAppUC8();
        String wordToDisplay = "OOPS";
        System.out.println("Displaying the word \"" + wordToDisplay + "\" in a banner format using HashMap:");
        app.displayBanner(wordToDisplay);
    }
}
