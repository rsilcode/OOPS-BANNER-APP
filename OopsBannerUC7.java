public class OopsBannerUC7 {

    static class CharacterPatternMap {
        
        private char character;
        private String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        char getCharacter() {
            return character;
        }

        String getLine(int lineNumber) {
            if (lineNumber >= 0 && lineNumber < pattern.length) {
                return pattern[lineNumber];
            }
            return "";
        }

        int getPatternHeight() {
            return pattern.length;
        }
    }

    static CharacterPatternMap createCharacterPattern(char ch) {
        switch (ch) {
            case 'O':
                return new CharacterPatternMap('O', new String[]{
                    "O     O",
                    "O     O",
                    "O     O",
                    "O     O",
                    " OOOOO"
                });
            case 'P':
                return new CharacterPatternMap('P', new String[]{
                    "PPPP",
                    "P   P",
                    "PPPP",
                    "P",
                    "P"
                });
            case 'S':
                return new CharacterPatternMap('S', new String[]{
                    "SSSS",
                    "S",
                    "SSS",
                    "S",
                    "SSSS"
                });
            default:
                return new CharacterPatternMap(ch, new String[]{"", "", "", "", ""});
        }
    }

    public static void main(String[] args) {
        
        CharacterPatternMap[] characters = {
            createCharacterPattern('O'),
            createCharacterPattern('O'),
            createCharacterPattern('P'),
            createCharacterPattern('S')
        };

        int height = characters[0].getPatternHeight();
        String[] banner = new String[height + 2];

        for (int line = 0; line < height; line++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (int i = 0; i < characters.length; i++) {
                if (i > 0) {
                    lineBuilder.append("  ");
                }
                lineBuilder.append(characters[i].getLine(line));
            }
            banner[line] = lineBuilder.toString();
        }

        banner[height] = "UC7 Character Pattern Class";
        banner[height + 1] = "Object-Oriented Banner Design";

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
