import java.util.Arrays;
import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

public class ex1 {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,5,6,7,8};
        LinkedList<Integer> inputLinkedList = new LinkedList<>(Arrays.asList(input));
        System.out.println("Исходный лист: \n" + inputLinkedList);

        inputLinkedList = enqueue(inputLinkedList, 9);
        System.out.println("\nenqueue() - помещает элемент в конец очереди");
        System.out.println(inputLinkedList);

        System.out.println(" \ndequeue() - возвращает первый элемент из очереди и удаляет его");
        Integer firstElement = dequeue(inputLinkedList);
        System.out.println(inputLinkedList + "\n" + "Первый элемент - " + firstElement);

        System.out.println("\nfirst() - возвращает первый элемент из очереди, не удаляя.");
        firstElement = first(inputLinkedList);
        System.out.println(inputLinkedList + "\n" + "Первый элемент - " + firstElement);
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> inputLinkedList, Integer newElement) {
        inputLinkedList.add(newElement);
        return inputLinkedList;
    }

    public static Integer dequeue(LinkedList<Integer> inputLinkedList) {
        Integer firstInt = inputLinkedList.removeFirst();
        return firstInt;
    }
    public static Integer first(LinkedList<Integer> inputLinkedList) {
        return inputLinkedList.element();
    }
}
