package springStudies.twentyFive.leetcode.basic;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2) return n; // Casos base
        //f(n)=f(n−1)+f(n−2)
        int a = 1; // f(n-2)
        int b = 2; // f(n-1)

        for (int i = 3; i <= n; i++) {
            int current = a + b; // f(n) = f(n-1) + f(n-2)
            a = b;               // Atualiza f(n-2) para o próximo passo
            b = current;         // Atualiza f(n-1) para o próximo passo
        }

        return b; // Resultado final
    }

}
