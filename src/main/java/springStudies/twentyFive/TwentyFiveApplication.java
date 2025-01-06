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
		ValidParentheses validParentheses = new ValidParentheses();
		System.out.println(validParentheses.isValid("()[]{}"));

	}

}
