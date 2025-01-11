package springStudies.twentyFive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springStudies.twentyFive.leetcode.basic.*;

import java.util.Arrays;

@SpringBootApplication
public class TwentyFiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwentyFiveApplication.class, args);

		//1 - 2025-01-02 TwoSum
//		TwoSum twoSum = new TwoSum();
//		int[] nums = {2, 7, 11, 15};
//		int target = 9;
//		int[] twoSumResult = twoSum.twoSum(nums, target);
//		System.out.println(Arrays.toString(twoSumResult));

		//2 - 2025-01-03 Palindrome
//		Palindrome palindrome = new Palindrome();
//		System.out.println(palindrome.isPalindrome(121));

		//3 - 2025-01-04
//		RomantoInteger romantoInteger = new RomantoInteger();
//		System.out.println(romantoInteger.romanToInt("III"));

		//4 - 2025-01-05
//		LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//		String[] strs = {"flower", "flow", "flight"};
//		System.out.println(longestCommonPrefix.longestCommonPrefix(strs));

		//5 - 2025-01-06
//		ValidParentheses validParentheses = new ValidParentheses();
//		System.out.println(validParentheses.isValid("()[]{}"));

		//6 - 2025-01-07
		MergeTwoLists mergeTwoLists = new MergeTwoLists();
		// Lista 1: [1, 2, 4]
		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		// Lista 2: [1, 3, 4]
		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		ListNode mergedList = mergeTwoLists.mergeTwoLists(list1, list2);
		while (mergedList != null) {
			System.out.print(mergedList.val + " ");
			mergedList = mergedList.next;
		}

		//07 - 2025-01-08
		System.out.println("23 horas de um dia corrido, passando pra te desejar forcas e te amo! Comp day da empresa e vc ta mega feliz :) so vai ter que acordar super cedo amanha e por isso nao vai da tempo pra fazer algo maior hj.");

		//08 - 2025-01-09
		System.out.println("23:30 quintas e sextas sarao impossieveis, vc ta fazendo volei e natacao tem que compensar depois, dois exercicios em dois outros dias beijos se cuida te amo!");

		//09 - 2025-01-10
		System.out.println("23:52 eu esqueci que ontem era segunda e que essa semana eu fui quarta tbm pro trabalho entao hj nao vai da pra fazer exercicios, amanha estaremos ai beijooos");

	}

}
