package springStudies.twentyFive.leetcode.basic;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0; // Se o array estiver vazio, retorna 0.
        int k = 0; // O ponteiro para o próximo elemento que nao eh igual a val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // Verifica se o elemento atual é diferente do val.
                nums[k] = nums[i]; // Coloca o próximo elemento único na posição correta.
                k++;
            }
        }

//        for(int num : nums){
//            System.out.println(num);
//        }

        return k;
    }
}
