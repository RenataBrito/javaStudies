package springStudies.twentyFive.leetcode.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // Se o array estiver vazio, retorna 0.

        int k = 1; // O ponteiro para o próximo elemento único.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Verifica se o elemento atual é diferente do anterior.
                nums[k] = nums[i]; // Coloca o próximo elemento único na posição correta.
                k++;
            }
        }

        return k; // Retorna o número de elementos únicos.
    }
}
