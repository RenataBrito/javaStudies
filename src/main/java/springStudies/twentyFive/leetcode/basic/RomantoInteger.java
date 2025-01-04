package springStudies.twentyFive.leetcode.basic;

import java.util.HashMap;

public class RomantoInteger {
    public int romanToInt(String s) {
        //1 solucao
//        int result = 0;
//
//        HashMap<String, Integer> mapRomanToInteger = new HashMap<>();
//        mapRomanToInteger.put("I", 1);
//        mapRomanToInteger.put("V", 5);
//        mapRomanToInteger.put("X", 10);
//        mapRomanToInteger.put("L", 50);
//        mapRomanToInteger.put("C", 100);
//        mapRomanToInteger.put("D", 500);
//        mapRomanToInteger.put("M", 1000);
//
//        String[] sSplitada = s.split("");
//
//        if(sSplitada.length > 1 ){
//            if(mapRomanToInteger.get(sSplitada[sSplitada.length-1]) <= mapRomanToInteger.get(sSplitada[sSplitada.length - 2])){
//                result = mapRomanToInteger.get(sSplitada[sSplitada.length-1]);
//            }
//        } else {
//            return result = mapRomanToInteger.get(sSplitada[0]);
//        }
//
//        for(int i = 0; i<sSplitada.length - 1; i++){
//            if(mapRomanToInteger.get(sSplitada[i]) >= mapRomanToInteger.get(sSplitada[i + 1])){
//                result += mapRomanToInteger.get(sSplitada[i]);
//            } else {
//                result = result + (mapRomanToInteger.get(sSplitada[i+1]) - mapRomanToInteger.get(sSplitada[i]));
//                i++;
//            }
//        }
//
//        return result;

        //2 mais rapida
        // Array para mapear valores baseados nos caracteres romanos
//        int[] romanValues = new int[128];
//        romanValues['I'] = 1;
//        romanValues['V'] = 5;
//        romanValues['X'] = 10;
//        romanValues['L'] = 50;
//        romanValues['C'] = 100;
//        romanValues['D'] = 500;
//        romanValues['M'] = 1000;
//
//        int result = 0;
//        int prevValue = 0;
//
//        // Iteração da direita para a esquerda
//        for (int i = s.length() - 1; i >= 0; i--) {
//            int currentValue = romanValues[s.charAt(i)];
//
//            // Se o valor atual for menor que o anterior, subtraímos
//            if (currentValue < prevValue) {
//                result -= currentValue;
//            } else {
//                result += currentValue;
//            }
//
//            // Atualiza o valor anterior
//            prevValue = currentValue;
//        }
//
//        return result;

        //3 mais rapida
        int result = 0;
        int prevValue = 0;

        // Iterar da direita para a esquerda na string
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));

            // Se o valor atual for menor que o anterior, subtraímos
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            // Atualiza o valor anterior
            prevValue = currentValue;
        }

        return result;
    }

    // Mapeamento direto dos caracteres romanos
    private int getValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // Não deve ocorrer
        }
    }
}
