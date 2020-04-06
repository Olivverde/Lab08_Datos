
/**
 *Universidad del Valle de Guatemala
 * @author Olivverde
 * Class's purpose: 
 * Patient class stores all the information of any patient
 */
public class Patient implements Comparable<Patient>{
    
    private String name, disease, priority;
   

    /**
     * This constructor is used just to call the entire class and its methods
     */
    public Patient() {
    }

    /**
     * Second constructor: Gather the patient's information
     * @param name
     * @param disease
     * @param priority
     */
    public Patient(String name, String disease, String priority) {
        this.name = name;
        this.disease = disease;
        this.priority = priority;
    }
    /**
     * Get the name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param nombre
     */
    public void setName(String nombre) {
        this.name = nombre;
    }
    /**
     * Get the disease
     * @return
     */
    public String getDisease() {
        return disease;
    }
    /**
     * Set the disease
     * @param disease
     */
    public void setDisease(String disease) {
        this.disease = disease;
    }
    /**
     * Get the Priority
     * @return
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Set the priority
     * @param priority
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    @Override
    public String toString() {
        String line = "";
        line = name + " -- " + disease + " -- " + priority;
        
        return line;
    }
    /**
     * Compare to implementation
     */
    @Override
    public int compareTo(Patient o) {
        int result = 0;
        
        if(this.priority.compareTo(o.priority) < 0){
            result = -1;
        }else if(this.priority.compareTo(o.priority) > 0){
            result = 1;
        }else{
            result = 0;
        }
        
        return result;
    }
    
}
