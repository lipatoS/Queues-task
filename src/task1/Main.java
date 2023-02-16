package task1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Queue<String> queue = new LinkedList<>();

    public static void main(String[] args) {
        getMap(queue);
        addNewProduct(queue);
        getInfo(queue);

    }

    private static void getMap(Queue<String> queues) {
        queues.add("orange");
        queues.add("plum");
        queues.add("grape");
        queues.add("apple");
        queues.add("lemon");
    }
    private static void addNewProduct(Queue<String> queues){
        queues.add("banana");
    }
    private static void getInfo(Queue<String> queues) {
        int num = 1;
        for (String s : queues) {
            System.out.println(num + ". " + s);
            num++;
        }

    }
}