
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;
import java.util.Vector;

import java.util.PriorityQueue;

/**
 *Universidad del Valle de Guatemala
 * @author Olivverde
 * Class's purpose: 
 * Priority_Queue class stores all the functions related to Priority Queues
 */

public class Priority_Queue<E>implements Iterable{

    /**
     *
     */
    protected PriorityQueue<E> data;
    
    /**
     * Implements PriorityQueue
     */
    public Priority_Queue() {
        data = new PriorityQueue<>();
    }
    
    /**
     * Insert a new value in the Queue
     * @param e
     * @return
     */
    public boolean add(E e){
        return data.add(e);
    }
    
    /**
     * Accomplish the same function as add function
     * @param e
     * @return
     */
    public boolean offer(E e){
        return data.offer(e);
    }
    
    /**
     * Peek data
     * @return
     */
    public E peek(){
        return data.peek();
    }
    /**
     * Measure the size
     * @return
     */
    public int size(){
        return data.size();
    }
    
    /**
     * Clears the Queue
     */
    public void clear(){
        data.clear();
    }
    /**
     * Remove and shows the lower value
     * @return
     */
    public E poll(){
        if (data.size()==0) 
        {
            System.out.println("Lista de espera extinta");
            
        }
        return data.poll();
    }

    @Override
    public Iterator iterator() 
    {
        return data.iterator();
    }
    
    public String print(Priority_Queue<Patient> p)
        {
            String answer="";
            Iterator<Patient> iterator = p.iterator();
            while(iterator.hasNext())
            {
                answer+=iterator.next().toString()+"\n";
                
            }
            return answer;
        }
    
    public String next(Priority_Queue<Patient> p)
        {
            
            Iterator<Patient> iterator = p.iterator();
            String answer = iterator.next().toString();
            return answer;
            
        }
    
}
