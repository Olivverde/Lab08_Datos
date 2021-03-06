
import java.util.Iterator;
import java.util.Vector;

/**
 *Universidad del Valle de Guatemala
 * @author Olivverde
 * Class's purpose: 
 * VectorHeap class implements the ADT contract of PriorityQueue. Executes all the 
 * related methods
 * Retrieved from: Canvas
 * 
 */
public class VectorHeap<E extends Comparable<E>> implements Iterable, PriorityQueue<E> {

	protected Vector<E> data; // the data, kept in heap order

        /**
         * Constructor
         */
	public VectorHeap()
	{
		data = new Vector<>();
	}
        
         
        public String show (VectorHeap<Patient> v)
        {
            String answer = "";
            Iterator<Patient> iterator = v.iterator();
            while(iterator.hasNext())
            {
                answer += iterator.next().toString()+"\n";
                
            }
            return answer;
        }
        
 
        public String next(VectorHeap<Patient> v)
        {
            Iterator<Patient> iterator = v.iterator();
            String respuesta = iterator.next().toString();
            return respuesta; 
        }
        

	public VectorHeap(Vector<E> v)
	// 
	{
            int i;
            data = new Vector<>(v.size()); // we know ultimate size
            for (i = 0; i < v.size(); i++){ // add elements to heap
                add(v.get(i));
            }
	}
        
	protected static int parent(int i)
	{
            return (i-1)/2;
	}
	
	protected static int left(int i)
	{
            return 2*i+1;
	}

	protected static int right(int i)
	{
            return (2*i+1) + 1;
	}

	protected void percolateUp(int leaf)
	{
            int parent = parent(leaf);
            E value = data.get(leaf);
            
            while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)){
                data.set(leaf, data.get(parent));
                leaf = parent;
                parent = parent(leaf);
            }
            data.set(leaf, value);
	}

	public void add(E value)
	{
            data.add(value);
            percolateUp(data.size()-1);
	}
	
	protected void pushDownRoot(int root)
	{
            int heapSize = data.size();
            E value = data.get(root);
            while (root < heapSize) {
                int childpos = left(root);
                if (childpos < heapSize){
                    if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo(data.get(childpos)) < 0)){
                        childpos++;
                    }
                    // Assert: childpos indexes smaller of two children

                    if ((data.get(childpos)).compareTo(value) < 0){
                        data.set(root,data.get(childpos));
                        root = childpos; // keep moving down
                    } else { // found right location
                        data.set(root,value);
                        return;
                    }
                } else { // at a leaf! insert and halt
                    data.set(root,value);
                    return;
                }
            }
        }

	public E remove() 
	{
            E minVal=null; 
            if (data.size()!=0) 
            {
                minVal= getFirst();
                data.set(0, data.get(data.size()-1));
                data.setSize(data.size()-1);
                
            }
            
            if (data.size() >= 1){
                pushDownRoot(0);
            }else{
                System.out.println("Ya no hay pacientes para atender.");
            }
            return minVal;
	}

    public E getFirst() {
        return data.get(0);
    }

    public boolean isEmpty() {
            return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    public void clear() {
        data.removeAllElements();
    }

    public Iterator iterator() {
        return data.iterator();
    }
    
}
