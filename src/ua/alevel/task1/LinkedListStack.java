package ua.alevel.task1;

import java.util.LinkedList;

public class LinkedListStack<T> {
    private final LinkedList<T> linkedList = new LinkedList<>();

    public void push(T item) {
        // добавление елемента в верх стека
        linkedList.addLast(item);
    }

    public T pop() {
        // возвращает и удаляет эелемент с верхушки стека
        T temp = linkedList.getLast();
        linkedList.removeLast();
        return temp;
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> ints = new LinkedListStack<>();
        ints.push(2);
        ints.push(3);
        ints.push(0);
        ints.push(12);
        ints.push(6);

        for (Integer x : ints.linkedList) {
            System.out.print(x + " ");
        }
        System.out.println();

        ints.pop();
        ints.pop();

        for (Integer x : ints.linkedList) {
            System.out.print(x + " ");
        }
        System.out.println();

        ints.push(30);

        for (Integer x : ints.linkedList) {
            System.out.print(x + " ");
        }

    }
}
