package in.kgcoding.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {

    public static void main(String[] args) {
        
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1); //add item or give exception if not able to do.
        queue.offer(2);//add item or give false if not able to do.
        for(Integer i:queue){
            System.out.println(i);
        }

        System.out.println(queue.peek()); //retrive head item and give null if empty.
        System.out.println(queue.element());//retrieve head item but return exception if empty.

        System.out.println(queue.remove());//exception
        System.out.println(queue.poll());//null

    }

}
