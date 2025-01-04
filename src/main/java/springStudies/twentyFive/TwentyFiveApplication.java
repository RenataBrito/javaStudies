package springStudies.twentyFive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springStudies.twentyFive.leetcode.basic.Palindrome;
import springStudies.twentyFive.leetcode.basic.RomantoInteger;
import springStudies.twentyFive.leetcode.basic.TwoSum;

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
		RomantoInteger romantoInteger = new RomantoInteger();
		System.out.println(romantoInteger.romanToInt("III"));

	}

}
