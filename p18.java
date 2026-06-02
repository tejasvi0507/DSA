import java.util.Collections;
import java.util.PriorityQueue;

public class p18 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}