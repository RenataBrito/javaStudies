package springStudies.twentyFive.leetcode.basic;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        // Remove espaços extras no início e no final da string
        String trimmed = s.trim();

        // Divide a string em palavras com base nos espaços
        String[] words = trimmed.split("\\s+");

        // Pega a última palavra
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}
