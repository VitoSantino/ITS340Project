package generalmedicalhistorytable;

public class generalmedicalhistorytable_class 
{
    // declare instance fields
    private int generalMedicalHistoryID;
    private int patientID;
    private String tobacco;
    private String tobaccoQuantity;
    private String tobaccoDuration;
    private String alcohol;
    private String alcoholQuantity;
    private String alcoholDuration;
    private String drug;
    private String drugType;
    private String drugDuration;
    private String bloodType;
    private String rH;
    
    // constructor for the generalmedicalhistorytable_class
    public generalmedicalhistorytable_class(int GMHID, int PID, String T, String TQ, String TD, String A, String AQ, String AD, String D, String DT,String DD, String BT, String RH)
    {
        generalMedicalHistoryID = GMHID;
        patientID = PID;
        tobacco = T;
        tobaccoQuantity = TQ;
        tobaccoDuration = TD;
        alcohol = A;
        alcoholQuantity = AQ;
        alcoholDuration = AD;
        drug = D;
        drugType = DT;
        drugDuration = DD;
        bloodType = BT;
        rH = RH;
    }
    
    // set method for the generalMedicalHistoryID field
    public void setGeneralMedicalHistoryID(int generalMedicalHistoryID)
    {
        this.generalMedicalHistoryID = generalMedicalHistoryID;
    }
    
    // get method for the generalMedicalHistoryID field
    public int getGeneralMedicalHistoryID()
    {
        return generalMedicalHistoryID;
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
    
    // set method for the tobacco field
    public void setTobacco(String tobacco)
    {
        this.tobacco = tobacco;
    }
    
    // get method for the tobacco field
    public String getTobacoo()
    {
        return tobacco;
    }
    
    // set method for the tobaccoQuantity field
    public void setTobaccoQuantity(String tobaccoQuantity)
    {
        this.tobaccoQuantity = tobaccoQuantity;
    }
    
    // get method for the tobaccoQuantity field
    public String getTobaccoQuantity()
    {
        return tobaccoQuantity;
    }
    
    // set method for the tobaccoDuration field
    public void setTobaccoDuration(String tobaccoDuration)
    {
        this.tobaccoDuration = tobaccoDuration;
    }
    
    // get method for the tobaccoDuration field
    public String getTobaccoDuration()
    {
        return tobaccoDuration;
    }
    
    // set method for the alcohol field
    public void setAlcohol(String alcohol)
    {
        this.alcohol = alcohol;
    }
    
    // get method for the alcohol field
    public String getAlcohol()
    {
        return alcohol;
    }
    
    // set method for the alcoholQuantity field
    public void setAlcoholQuantity(String alcoholQuantity)
    {
        this.alcoholQuantity = alcoholQuantity;
    }
    
    // get method for the alcoholQuantity field
    public String getAlcoholQuantity()
    {
        return alcoholQuantity;
    }
    
    // set method for the alcoholDuration field
    public void setAlcoholDuration(String alcoholDuration)
    {
        this.alcoholDuration = alcoholDuration;
    }
    
    // get method for the alcoholDuration field
    public String getAlcoholDuration()
    {
        return alcoholDuration;
    }
    
    // set method for the drug field
    public void setDrug(String drug)
    {
        this.drug = drug;
    }
    
    // get method for the drug field
    public String getDrug()
    {
        return drug;
    }
    
    // set method for the drugType field
    public void setDrugType(String drugType)
    {
        this.drugType = drugType;
    }
    
    // get method for the drugType field
    public String getDrugType()
    {
        return drugType;
    }
    
    // set method for the drugDuration field
    public void setDrugDuration(String drugDuration)
    {
        this.drugDuration = drugDuration;
    }
    
    // get method for the drugDuration field
    public String getDrugDuration()
    {
        return drugDuration;
    }
    
    // set method for the bloodType field
    public void setBloodType(String bloodType)
    {
        this.bloodType = bloodType;
    }
    
    // get method for the bloodType field
    public String getBloodType()
    {
        return bloodType;
    }
    
    // set method for the rH field
    public void setRH(String rH)
    {
        this.rH = rH;
    }
    
    // get method for the rH field
    public String getrH()
    {
        return rH;
    }
}
