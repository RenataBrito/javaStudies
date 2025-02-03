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
//		MergeTwoLists mergeTwoLists = new MergeTwoLists();
//		// Lista 1: [1, 2, 4]
//		ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
//		// Lista 2: [1, 3, 4]
//		ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
//		ListNode mergedList = mergeTwoLists.mergeTwoLists(list1, list2);
//		while (mergedList != null) {
//			System.out.print(mergedList.val + " ");
//			mergedList = mergedList.next;
//		}

		//07 - 2025-01-08
		//System.out.println("23 horas de um dia corrido, passando pra te desejar forcas e te amo! Comp day da empresa e vc ta mega feliz :) so vai ter que acordar super cedo amanha e por isso nao vai da tempo pra fazer algo maior hj.");

		//08 - 2025-01-09
		//System.out.println("23:30 quintas e sextas sarao impossieveis, vc ta fazendo volei e natacao tem que compensar depois, dois exercicios em dois outros dias beijos se cuida te amo!");

		//09 - 2025-01-10
		//System.out.println("23:52 eu esqueci que ontem era segunda e que essa semana eu fui quarta tbm pro trabalho entao hj nao vai da pra fazer exercicios, amanha estaremos ai beijooos");

		//10 - 2025-01-11
//		RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
//		int[] nums = {0,0,1,1,1,2,2,3,3,4};
//		System.out.println(removeDuplicatesfromSortedArray.removeDuplicates(nums));

		//11 - 2025-01-12
//		RemoveElement removeElement = new RemoveElement();
//		int[] nums = {0,1,2,2,3,0,4,2};
//		System.out.println(removeElement.removeElement(nums, 2));

		//12 - 2025-01-13
//		FindTheIndex findTheIndex = new FindTheIndex();
//		String haystack = new String("mississippi");
//		String needle = new String("issip");
//
//		System.out.println(findTheIndex.strStr(haystack, needle)); //see later how can we do it better, other day
//
//		//13 - 2025-01-14
//		System.out.println("essa semana 3 dias presenciais seguidos morte");
//
//		//14 - 2025-01-15
//		System.out.println("oto dia love you");
//
//		//15 - 2025-01-16
//		System.out.println("quintou vamoo");

		//16 - 2025-01-20
//		SearchInsert searchInsert = new SearchInsert();
//		int[] nums = {1,3,5,6};
//		System.out.println(searchInsert.searchInsert(nums,2));

		//17 - 2025-01-21
//		LengthofLastWord lengthofLastWord = new LengthofLastWord();
//		String phrase = "   fly me   to   the moon  ";
//		System.out.println(lengthofLastWord.lengthOfLastWord(phrase));

		//18 - 2025-01-22
//		int[] digits = {9,9};
//		PlusOne plusOne = new PlusOne();
//		for(int i : plusOne.plusOne(digits)){
//			System.out.println(i);
//		}

		//19 - 2025-01-26
//		AddBinary addBinary = new AddBinary();
//		String a = "11";
//		String b = "1";
//		System.out.println(addBinary.addBinary(a,b));

		//20 - 2025-01-29
		SqrtX sqrtX = new SqrtX();
		System.out.println(sqrtX.mySqrt(8));

		System.out.println("Segunda da amiya no br vou estudar a reuniao");

	}

}
