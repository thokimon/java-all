public class countword {
    public static void main(String[] args) {
        String str = "This";
        int count = countWords(str);
        System.out.println("The number of words in the string is: " + count);


    }

    public static int countWords(String str) {
        int count = 0;
        String[] words = str.trim().split("\\s+");
        for (String word : words) {
            count++;
        }
        return count;
    }
}

