package springStudies.twentyFive.leetcode.basic;

import java.util.Objects;

public class FindTheIndex {
    public int strStr(String haystack, String needle) {
        int result = -1;
        String[] haystackSplitada = haystack.split("");
        String[] needleSplitada = needle.split("");
        int j = 0;
        int i = 0;
        int m = 0;
        do {
            if(j < needleSplitada.length){
                if(Objects.equals(haystackSplitada[i], needleSplitada[j])){
                    j++;
                    if(j == needleSplitada.length){
                        return m;
                    }
                    i++;
                } else {
                    j = 0;
                    m += 1;
                    i = m;
                }
            }
        }while(i < haystackSplitada.length);

        return result;
    }
}
