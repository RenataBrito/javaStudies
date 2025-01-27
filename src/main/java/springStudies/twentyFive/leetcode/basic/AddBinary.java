package springStudies.twentyFive.leetcode.basic;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1; // Índice para a string `a`
        int j = b.length() - 1; // Índice para a string `b`
        int carry = 0; // Transporte inicializado como 0

        // Loop enquanto houver bits em `a` ou `b` ou transporte
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Inicia a soma com o transporte

            // Adiciona o bit de `a` à soma, se houver
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Adiciona o bit de `b` à soma, se houver
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Adiciona o bit calculado ao resultado
            result.append(sum % 2);

            // Atualiza o transporte
            carry = sum / 2;
        }

        // Inverte o resultado e retorna como string
        return result.reverse().toString();
    }
}
