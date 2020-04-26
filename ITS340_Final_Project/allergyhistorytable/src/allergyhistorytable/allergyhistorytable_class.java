package allergyhistorytable;

public class allergyhistorytable_class 
{
    // declare instance fields
    private int allergyID;
    private int patientID;
    private String allergen;
    private String allergenStartDate;
    private String allergenEndDate;
    private String allergyDescription;
    
    // constructor for the class
    public allergyhistorytable_class(int AID, int PID, String A, String ASD, String AED, String AD)
    {
        allergyID = AID;
        patientID = PID;
        allergen = A;
        allergenStartDate = ASD;
        allergenEndDate = AED;
        allergyDescription = AD;
    }
    
    // set method for the allergyID field
    public void setAllergyID(int allergyID)
    {
        this.allergyID = allergyID;
    }
    
    // get method for the allergyID field
    public int getAllergyID()
    {
        return allergyID;
    }
    
    // set method for the patientID field
    public void setPatientID(int patientID)
    {
        this.patientID = patientID;
    }
    
    // get method for the patientID field
    public int getPatientID()
    {
        return patientID;
    }
    
    // set method for the allergen field
    public void setAllergen(String allergen)
    {
        this.allergen = allergen;
    }
    
    // get method for the allergen field
    public String getAllergen()
    {
        return allergen;
    }
    
    // set method for the allergenStartDate field
    public void setAllergenStartDate(String allergenStartDae)
    {
        this.allergenStartDate = allergenStartDate;
    }
    
    // get method for the allergenStartDate field
    public String getAllergenStartDate()
    {
        return allergenStartDate;
    }
    
    // set method for the allergenEndDate field
    public void setAllergenEndDate(String allergenEndDate)
    {
        this.allergenEndDate = allergenEndDate;
    }
    
    // get method for the allergenEndDate field
    public String getAllergenEndDate()
    {
        return allergenEndDate;
    }
    
    // set method for the allergyDescription field
    public void setAllergyDescription(String allerygyDescription)
    {
        this.allergyDescription = allergyDescription;
    }
    
    // get method for the allergyDescription field
    public String getAllergyDescription()
    {
        return allergyDescription;
    }
}
