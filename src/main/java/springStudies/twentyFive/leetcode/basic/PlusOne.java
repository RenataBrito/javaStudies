package springStudies.twentyFive.leetcode.basic;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // Percorrer os dígitos de trás para frente
        for (int i = digits.length - 1; i >= 0; i--) {
            // Caso o dígito seja menor que 9, basta incrementá-lo
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Retorna diretamente o resultado
            }
            // Se for 9, zera o dígito e continua para o próximo
            digits[i] = 0;
        }

        // Se todos os dígitos forem 9, cria um novo array
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Primeiro dígito será 1, o resto já está como 0 por padrão
        return result;
    }
}
