package springStudies.twentyFive.leetcode.basic;

public class SqrtX {
    public int mySqrt(int x) { //busca binaria
        if (x == 0 || x == 1) return x; // Casos base

        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid == x) { // Evita overflow
                return mid;
            } else if ((long) mid * mid < x) {
                result = mid; // Armazena o maior candidato possível
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


//        Busca binária:
//
//        Definimos left = 1 e right = x.
//        Pegamos o meio mid e verificamos se mid * mid é igual a x.
//        Se mid * mid < x, então mid pode ser a resposta, então atualizamos result e ajustamos left.
//        Se mid * mid > x, ajustamos right.
        //        Evita overflow:
//
//        Convertendo mid * mid para long, evitamos problemas com valores grandes.
//        Complexidade:
//
//        O(log x), pois estamos reduzindo o espaço de busca pela metade a cada iteração.



        return result; // Maior valor cujo quadrado não ultrapassa x
    }
}
