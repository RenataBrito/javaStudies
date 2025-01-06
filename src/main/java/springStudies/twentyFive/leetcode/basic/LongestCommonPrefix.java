package springStudies.twentyFive.leetcode.basic;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        //o primeiro é o certo
        String prefix = strs[0];

        // Compare o prefixo com cada string
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { //verifica se ta na posicao 0
                //tipo se strs for "Renata" e o prefix = "ata" vai retornar 3
                // Reduza o prefixo removendo o último caractere
                prefix = prefix.substring(0, prefix.length() - 1);
                // Se o prefixo for vazio, não há prefixo comum
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;

    }
}
