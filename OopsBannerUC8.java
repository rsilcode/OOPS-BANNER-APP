import java.util.HashMap;
import java.util.Map;

public class OopsBannerUC8 {

    static Map<Character, String[]> initializePatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();
        
        patternMap.put('O', new String[]{
            "O     O",
            "O     O",
            "O     O",
            "O     O",
            " OOOOO"
        });
        
        patternMap.put('P', new String[]{
            "PPPP",
            "P   P",
            "PPPP",
            "P",
            "P"
        });
        
        patternMap.put('S', new String[]{
            "SSSS",
            "S",
            "SSS",
            "S",
            "SSSS"
        });
        
        return patternMap;
    }

    static String renderBannerLine(String word, Map<Character, String[]> patternMap, int lineNumber) {
        StringBuilder lineBuilder = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) {
            if (i > 0) {
                lineBuilder.append("  ");
            }
            
            char ch = word.charAt(i);
            if (patternMap.containsKey(ch)) {
                String[] pattern = patternMap.get(ch);
                if (lineNumber < pattern.length) {
                    lineBuilder.append(pattern[lineNumber]);
                }
            }
        }
        
        return lineBuilder.toString();
    }

    public static void main(String[] args) {
        
        Map<Character, String[]> patternMap = initializePatternMap();
        String word = "OOPS";
        
        int patternHeight = 5;
        String[] banner = new String[patternHeight + 2];
        
        for (int line = 0; line < patternHeight; line++) {
            banner[line] = renderBannerLine(word, patternMap, line);
        }
        
        banner[patternHeight] = "UC8 HashMap Pattern Storage";
        banner[patternHeight + 1] = "Efficient Pattern Retrieval";
        
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
