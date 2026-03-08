public class OopsBannerUC5 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "O", "     ", "O", "  ", "OOOOO", "  ", "PPPP", "   ", "SSSS"),
                String.join("", "O", "     ", "O", "  ", "O   O", "  ", "P   P", "  ", "S"),
                String.join("", "O", "     ", "O", "  ", "O   O", "  ", "PPPP", "   ", "SSS"),
                String.join("", "O", "     ", "O", "  ", "O   O", "  ", "P", "         ", "S"),
                String.join("", " ", "OOOOO", "   ", "OOOOO", "  ", "P", "      ", "SSSS"),
                String.join(" ", "Banner", "using", "String.join()"),
                String.join(" ", "UC5", "Array", "Initialization")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
