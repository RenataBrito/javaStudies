package springStudies.twentyFive.leetcode.basic;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int posicaoNaoAchei = 0;
        if(nums[nums.length/2] < target){
            for(int i = nums.length/2; i< nums.length; i++){
                if(nums[i] == target){
                    posicaoNaoAchei = i;
                }
                if(nums[i] < target){
                    posicaoNaoAchei = i+1;
                }
            }
        } else{
            for(int i = 0; i<= nums.length/2; i++){
                if(nums[i] == target){
                    return i;
                }
                if(nums[i] < target){
                    posicaoNaoAchei = i+1;
                }
            }
        }

        return posicaoNaoAchei;
    }
}
