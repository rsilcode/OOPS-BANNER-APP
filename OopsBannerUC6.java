public class OopsBannerUC6 {

    static String getOLine1() {
        return "O     O";
    }

    static String getOLine2() {
        return "O     O";
    }

    static String getOLine3() {
        return "O     O";
    }

    static String getOLine4() {
        return "O     O";
    }

    static String getOLine5() {
        return " OOOOO";
    }

    static String getPLine1() {
        return "PPPP";
    }

    static String getPLine2() {
        return "P   P";
    }

    static String getPLine3() {
        return "PPPP";
    }

    static String getPLine4() {
        return "P";
    }

    static String getPLine5() {
        return "P";
    }

    static String getSLine1() {
        return "SSSS";
    }

    static String getSLine2() {
        return "S";
    }

    static String getSLine3() {
        return "SSS";
    }

    static String getSLine4() {
        return "S";
    }

    static String getSLine5() {
        return "SSSS";
    }

    public static void main(String[] args) {

        String[] banner = {
                String.join("  ", getOLine1(), getOLine1(), getPLine1(), getSLine1()),
                String.join("  ", getOLine2(), getOLine2(), getPLine2(), getSLine2()),
                String.join("  ", getOLine3(), getOLine3(), getPLine3(), getSLine3()),
                String.join("  ", getOLine4(), getOLine4(), getPLine4(), getSLine4()),
                String.join("  ", getOLine5(), getOLine5(), getPLine5(), getSLine5()),
                String.join(" ", "UC6", "Static", "Methods"),
                String.join(" ", "Modular", "Banner", "Functions")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
