
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of parent method, of class VectorHeap.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        int i = 0;
        int expResult = 0;
         Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        int result = patient.parent(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of left method, of class VectorHeap.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        int i = 0;
        int expResult = 1;
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        int result = patient.left(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of right method, of class VectorHeap.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        int i = 0;
        int expResult = 2;
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        int result = patient.right(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of percolateUp method, of class VectorHeap.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        int leaf = 0;
        VectorHeap instance = new VectorHeap();
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        patient.percolateUp(leaf);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        
        
        String name = patient.remove().getName();
        String value = "Juana del Arco";
        
        assertEquals(name, value);
    }

    /**
     * Test of pushDownRoot method, of class VectorHeap.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
        int root = 0;
        VectorHeap instance = new VectorHeap();
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> paciente = new VectorHeap<>();
        paciente.add(patient1);
        paciente.add(patient2);
        paciente.pushDownRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        String expResult = "Juana de Arco -- apuñalada -- A";
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        Object result = patient.remove();
        assertEquals(expResult, result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFirst method, of class VectorHeap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap instance = new VectorHeap();
        String expResult = "Maria Ramirez -- apendicitis -- A";
        Patient patient1 = new Patient("Juana del Arco", "Apuñalada", "A");
        Patient patient2 = new Patient("Marco Polo", "Hipotermia", "B");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        Patient result = patient.getFirst();
        
        assertEquals(expResult, result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isEmpty method, of class VectorHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VectorHeap instance = new VectorHeap();
        boolean expResult = false;
         Patient patient1 = new Patient("Maria Ramirez", "apendicitis", "A");
        Patient patient2 = new Patient("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        boolean result = patient.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 2;
        Patient patient1 = new Patient("Maria Ramirez", "apendicitis", "A");
        Patient patient2 = new Patient("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        int result = patient.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of clear method, of class VectorHeap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap instance = new VectorHeap();
         Patient patient1 = new Patient("Maria Ramirez", "apendicitis", "A");
        Patient patient2 = new Patient("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Patient> patient = new VectorHeap<>();
        patient.add(patient1);
        patient.add(patient2);
        patient.clear();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
