package springStudies.twentyFive.leetcode.basic;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Criação de um nó dummy para servir como ponto inicial da lista resultante
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; // Ponteiro para construir a nova lista

        // Enquanto ambas as listas tiverem elementos
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1; // Conecte o nó de list1
                list1 = list1.next;  // Avance em list1
            } else {
                current.next = list2; // Conecte o nó de list2
                list2 = list2.next;  // Avance em list2
            }
            current = current.next; // Avance o ponteiro da lista resultante
        }

        // Conecte os nós restantes, se houver
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // Retorne o próximo de dummy, que é o início da lista resultante
    }
}

