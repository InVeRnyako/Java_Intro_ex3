import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

public class ex0 {

    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,6,7,8};
        LinkedList<Integer> inputLinkedList = new LinkedList<>(Arrays.asList(input));
        System.out.println("Linkedlist до переворота:\n" + inputLinkedList );
        reverseLinkedList(inputLinkedList);
        System.out.println("LinkedList после переворота:\n" + inputLinkedList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> inputLinkedList) {
        Collections.reverse(inputLinkedList);
        return inputLinkedList;
    }

}