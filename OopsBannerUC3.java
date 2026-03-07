public class OopsBannerUC3 {

    public static void main(String[] args) {
        String[] oLine1 = {"O     O"};
        String[] oLine2 = {"O     O"};
        String[] oLine3 = {"O     O"};
        String[] oLine4 = {"O     O"};
        String[] oLine5 = {" OOOOO "};
        
        String[] pLine1 = {"PPPP "};
        String[] pLine2 = {"P   P"};
        String[] pLine3 = {"PPPP "};
        String[] pLine4 = {"P    "};
        String[] pLine5 = {"P    "};
        
        String[] sLine1 = {" SSSS"};
        String[] sLine2 = {"S    "};
        String[] sLine3 = {"  SSS"};
        String[] sLine4 = {"     S"};
        String[] sLine5 = {" SSSS"};
        
        String[] oSegments = {
            "OOOOO",
            "O   O",
            "O   O",
            "O   O",
            "OOOOO"
        };
        
        String line1 = String.join("  ", "O     O", "OOOOO", "PPPP ", " SSSS");
        String line2 = String.join("  ", "O     O", "O   O", "P   P", "S    ");
        String line3 = String.join("  ", "O     O", "O   O", "PPPP ", "  SSS");
        String line4 = String.join("  ", "O     O", "O   O", "P    ", "     S");
        String line5 = String.join("  ", " OOOOO ", "OOOOO", "P    ", " SSSS");
        
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
