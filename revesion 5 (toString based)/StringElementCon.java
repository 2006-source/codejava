public class StringElementCon {
    public static void main(String[] args) {
        String[] str = new String[] {"satyam","is","a","very","bed","boy","for","our","Friend","circle"};
        StringBuilder sectencebuilder = new StringBuilder();
        for ( String Word : str) {
            sectencebuilder.append(Word);
            sectencebuilder.append(" ");
        }
        String finalSentence = sectencebuilder.toString();
        System.out.println(finalSentence);
    }
}
