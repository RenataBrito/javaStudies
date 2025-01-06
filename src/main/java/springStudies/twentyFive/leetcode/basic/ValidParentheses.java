package springStudies.twentyFive.leetcode.basic;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Empilha os caracteres de abertura
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Verifica os caracteres de fechamento
            else {
                // Se a pilha está vazia ou não corresponde ao topo, é inválido
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // No final, a pilha deve estar vazia
        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
