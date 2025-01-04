package springStudies.twentyFive.leetcode.basic;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; //Here already eliminated negative values

        //solution 1 with for
        //String xStringOriginal = String.valueOf(x);
        // String inverted = "";
        // for (int i = xStringOriginal.length() - 1; i >= 0; i--) {
        //     inverted += xStringOriginal.charAt(i);
        // }

        //2 with StringBuilder
        // String inverted = new StringBuilder(xStringOriginal).reverse().toString();
        // return xStringOriginal.equals(inverted);

        //3 solution with extracao do numero
        // int original = x;
        // int reversed = 0;

        // while (x != 0) {
        //     int digit = x % 10; // Extrai o último dígito
        //     // Verifica se a operação de inversão causaria overflow
        //     if (reversed > (Integer.MAX_VALUE - digit) / 10) {
        //         return false; // Overflow, portanto não é palíndromo
        //     }
        //     reversed = reversed * 10 + digit; // Adiciona o dígito ao número invertido
        //     x /= 10; // Remove o último dígito  - "deslocando" os dígitos para a direita
        // }

        // return original == reversed;

        //tempo: O(log10(x))
        //espaco: 1,2) O(n) 3) O(1)

        //solucao mais rapida
        // Números negativos e múltiplos de 10 (exceto 0) não podem ser palíndromos
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10; // Extrai o último dígito
            reversedHalf = reversedHalf * 10 + digit; // Reverte metade do número
            x /= 10; // Remove o último dígito
        }

        // Verifica se as metades são iguais
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
