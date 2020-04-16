// The package statement stores the class in the package.
package patientdemographics;

// Import all of the AWT and Swing classes needed by the application.
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

// After the import statements, the declaration for the class shows that PatientDemographicsClass inherits the JFrame class.
public class PatientDemographicsForm extends JFrame {
    // The body of PatientDemographicsClass begins by declaring text fields.
    // It's necessary to declare these text fields here so all methods of the class, including the event handlers, can access them.
    private JTextField patientID;
    private JTextField lastName;
    private JTextField prevLastName;
    private JTextField firstName;
    private JTextField homeAddr1;
    private JTextField homeAddr2;
    private JTextField city;
    private JTextField state;
    private JTextField zip;
    private JTextField country;
    private JTextField citizenship;
    private JTextField homePhone;
    private JTextField emergencyPhone;
    private JTextField emailAddr;
    private JTextField ssn;
    private JTextField dob;
    private JTextField gender;
    private JTextField ethnicAssoc;
    private JTextField maritalStatus;
    private JTextField currPrimHPC;
    private JTextField active;
    private JTextField comments;
    private JTextField subRelationship;
    private JTextField nextOfKin;
    private JTextField middleInitial;
    private JTextField nextOfKinRelationToPatient;
    
    // The constructor for this class calls the initComponents() method to initialize the frame and its controls.
    public PatientDemographicsForm(){
        initComponents();
    }
    
    // To start, it sets the look and feel for the frame so it's the same as the current operating system.
    private void initComponents(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
            System.out.println(e);
        }
        // Then, it sets the title, default close operation, and relocation of the frame.
        setTitle("Patient Demographics Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        
        // The next part of this program begins by creating the text fields.
        patientID = new JTextField();
        lastName = new JTextField();
        prevLastName = new JTextField();
        firstName = new JTextField();
        homeAddr1 = new JTextField();
        homeAddr2 = new JTextField();
        city = new JTextField();
        state = new JTextField();
        zip = new JTextField();
        country = new JTextField();
        citizenship = new JTextField();
        homePhone = new JTextField();
        emergencyPhone = new JTextField();
        emailAddr = new JTextField();
        ssn = new JTextField();
        dob = new JTextField();
        gender = new JTextField();
        ethnicAssoc = new JTextField();
        maritalStatus = new JTextField();
        currPrimHPC = new JTextField();
        active = new JTextField();
        comments = new JTextField();
        subRelationship = new JTextField();
        nextOfKin = new JTextField();
        middleInitial = new JTextField();
        nextOfKinRelationToPatient = new JTextField();
        
        // It sets the preferred size and minimum size for these text fields.
        Dimension dim = new Dimension(150, 20);
        patientID.setPreferredSize(dim);
        patientID.setMinimumSize(dim);
        lastName.setPreferredSize(dim);
        lastName.setMinimumSize(dim);
        prevLastName.setPreferredSize(dim);
        prevLastName.setMinimumSize(dim);
        firstName.setPreferredSize(dim);
        firstName.setMinimumSize(dim);
        homeAddr1.setPreferredSize(dim);
        homeAddr1.setMinimumSize(dim);
        homeAddr2.setPreferredSize(dim);
        homeAddr2.setMinimumSize(dim);
        city.setPreferredSize(dim);
        city.setMinimumSize(dim);
        state.setPreferredSize(dim);
        state.setMinimumSize(dim);
        zip.setPreferredSize(dim);
        zip.setMinimumSize(dim);
        country.setPreferredSize(dim);
        country.setMinimumSize(dim);
        citizenship.setPreferredSize(dim);
        citizenship.setMinimumSize(dim);
        homePhone.setPreferredSize(dim);
        homePhone.setMinimumSize(dim);
        emergencyPhone.setPreferredSize(dim);
        emergencyPhone.setMinimumSize(dim);
        emailAddr.setPreferredSize(dim);
        emailAddr.setMinimumSize(dim);
        ssn.setPreferredSize(dim);
        ssn.setMinimumSize(dim);
        dob.setPreferredSize(dim);
        dob.setMinimumSize(dim);
        gender.setPreferredSize(dim);
        gender.setMinimumSize(dim);
        ethnicAssoc.setPreferredSize(dim);
        ethnicAssoc.setMinimumSize(dim);
        maritalStatus.setPreferredSize(dim);
        maritalStatus.setMinimumSize(dim);
        currPrimHPC.setPreferredSize(dim);
        currPrimHPC.setMinimumSize(dim);
        active.setPreferredSize(dim);
        active.setMinimumSize(dim);
        comments.setPreferredSize(dim);
        comments.setMinimumSize(dim);
        subRelationship.setPreferredSize(dim);
        subRelationship.setMinimumSize(dim);
        nextOfKin.setPreferredSize(dim);
        nextOfKin.setMinimumSize(dim);
        middleInitial.setPreferredSize(dim);
        middleInitial.setMinimumSize(dim);
        nextOfKinRelationToPatient.setPreferredSize(dim);
        nextOfKinRelationToPatient.setMinimumSize(dim);
        
        // After setting up the text fields, this code creates the Edit, New, Save, Delete, and Close buttons and adds an action listener to each one.
        JButton editButton = new JButton("Edit");
        JButton newButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton deleteButton = new JButton("Delete");
        JButton closeButton = new JButton("Close");
        
        // To add these action listeners, this code uses lambda expressions.
        editButton.addActionListener(e -> editButtonClicked());
        newButton.addActionListener(e -> newButtonClicked());
        saveButton.addActionListener(e -> saveButtonClicked());
        deleteButton.addActionListener(e -> deleteButtonClicked());
        closeButton.addActionListener(e -> closeButtonClicked());
        
        // Button Panel
        // After creating the two buttons, it creates a panel to contains these buttons.
        // Then, it sets the layout manager for this panel to a right aligned FlowLayout, and it adds both buttons to the panel.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(editButton);
        buttonPanel.add(newButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(closeButton);
        
        // Main Panel
        // After creating the panel for the buttons, this code creates another JPanel to store the labels and text boxes for this GUI.
        JPanel panel = new JPanel();
        // Then, it sets the layout manager for this panel to the GridBagLayout manager, and it adds all of the labels and text fields to the grid.
        panel.setLayout(new GridBagLayout());
        // This method makes it easier to get the GridBagConstraints object for each component.
        panel.add(new JLabel("Patient ID:"), getConstraints(0, 0));
        panel.add(patientID, getConstraints(1, 0));
        panel.add(new JLabel("Last Name:"), getConstraints(0, 1));
        panel.add(lastName, getConstraints(1, 1));
        panel.add(new JLabel("Previous Last Name:"), getConstraints(0, 2));
        panel.add(prevLastName, getConstraints(1, 2));
        panel.add(new JLabel("First Name:"), getConstraints(0, 3));
        panel.add(firstName, getConstraints(1, 3));
        panel.add(new JLabel("Home Address 1:"), getConstraints(0, 4));
        panel.add(homeAddr1, getConstraints(1, 4));
        panel.add(new JLabel("Home Address 2:"), getConstraints(0, 5));
        panel.add(homeAddr2, getConstraints(1, 5));
        panel.add(new JLabel("City:"), getConstraints(0, 6));
        panel.add(city, getConstraints(1, 6));
        panel.add(new JLabel("State:"), getConstraints(0, 7));
        panel.add(state, getConstraints(1, 7));
        panel.add(new JLabel("Zip Code:"), getConstraints(0, 8));
        panel.add(zip, getConstraints(1, 8));
        panel.add(new JLabel("Country:"), getConstraints(0, 9));
        panel.add(country, getConstraints(1, 9));
        panel.add(new JLabel("Citizenship:"), getConstraints(0, 10));
        panel.add(citizenship, getConstraints(1, 10));
        panel.add(new JLabel("Home Phone Number:"), getConstraints(0, 11));
        panel.add(homePhone, getConstraints(1, 11));
        panel.add(new JLabel("Emergency Phone Number:"), getConstraints(0, 12));
        panel.add(emergencyPhone, getConstraints(1, 12));
        panel.add(new JLabel("Email Address:"), getConstraints(0, 13));
        panel.add(emailAddr, getConstraints(1, 13));
        panel.add(new JLabel("Social Security Number:"), getConstraints(0, 14));
        panel.add(ssn, getConstraints(1, 14));
        panel.add(new JLabel("Date of Birth:"), getConstraints(0, 15));
        panel.add(dob, getConstraints(1, 15));
        panel.add(new JLabel("Gender:"), getConstraints(0, 16));
        panel.add(gender, getConstraints(1, 16));
        panel.add(new JLabel("Ethnic Association:"), getConstraints(0, 17));
        panel.add(ethnicAssoc, getConstraints(1, 17));
        panel.add(new JLabel("Marital Status:"), getConstraints(0, 18));
        panel.add(maritalStatus, getConstraints(1, 18));
        panel.add(new JLabel("Current Primary Healthcare Provider:"), getConstraints(0, 19));
        panel.add(currPrimHPC, getConstraints(1, 19));
        panel.add(new JLabel("Active:"), getConstraints(0, 20));
        panel.add(active, getConstraints(1, 20));
        panel.add(new JLabel("Comments:"), getConstraints(0, 21));
        panel.add(comments, getConstraints(1, 21));
        panel.add(new JLabel("Subscriber Relationship:"), getConstraints(0, 22));
        panel.add(subRelationship, getConstraints(1, 22));
        panel.add(new JLabel("Next of Kin:"), getConstraints(0, 23));
        panel.add(nextOfKin, getConstraints(1, 23));
        panel.add(new JLabel("Middle Initial:"), getConstraints(0, 24));
        panel.add(middleInitial, getConstraints(1, 24));
        panel.add(new JLabel("Next of Kin Relationship with Patient:"), getConstraints(0, 25));
        panel.add(nextOfKinRelationToPatient, getConstraints(1, 25));
        
        // Add button panel to the last row of the main panel.
        GridBagConstraints c = getConstraints(0, 26);
        c.anchor = GridBagConstraints.LINE_END;
        c.gridwidth = 2;
        panel.add(buttonPanel, c);
        
        // After creating the button panel and the main panel, this code adds the main panel to the center of the BorderLayout, and it adds the button panel to the south of the BorderLayout.
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Then, it sets the size of the frame and makes it visible.
        // This should display the GUI to the user, and the GUI should listen for events that it can handle.
        setSize(new Dimension(320, 180));
        setVisible(true);
    }
    
    // Helper method for getting a GridBagConstraints object.
    // The last part of the program begins by defining the getConstraints() method.
    private GridBagConstraints getConstraints(int x, int y){
        // This method returns a GridBagConstraints object.
        // To do that, it starts by creating a GridBagConstraints object and setting values for alignment and padding.
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        // Then, it sets the x and y coordinates to the values that are passed to the method.
        c.gridx = x;
        c.gridy = y;
        return c;
    }
    
    // The editButtonClicked() method is the event handler for the action event of the Edit button.
    // In other words, it's executed when the Edit button is clicked.
    private void editButtonClicked(){
        SwingValidator sv = new SwingValidator(this);
        if(sv.isPresent(patientID, "Patient ID") &&
           sv.isDouble(patientID, "Patient ID") &&
           sv.isPresent(lastName, "Last Name") &&
           sv.isDouble(lastName, "Last Name") &&
           sv.isPresent(prevLastName, "Previous Last Name") &&
           sv.isDouble(prevLastName, "Previous Last Name") &&
           sv.isPresent(firstName, "First Name") &&
           sv.isDouble(firstName, "First Name") &&
           sv.isPresent(homeAddr1, "Home Address 1") &&
           sv.isDouble(homeAddr1, "Home Address 1") &&
           sv.isPresent(homeAddr2, "Home Address 2") &&
           sv.isDouble(homeAddr2, "Home Address 2") &&
           sv.isPresent(city, "City") &&
           sv.isDouble(city, "City") &&
           sv.isPresent(state, "State") &&
           sv.isDouble(state, "State") &&
           sv.isPresent(zip, "Zip Code") &&
           sv.isDouble(zip, "Zip Code") &&
           sv.isPresent(country, "Country") &&
           sv.isDouble(country, "Country") &&
           sv.isPresent(citizenship, "Citizenship") &&
           sv.isDouble(citizenship, "Citizenship") &&
           sv.isPresent(homePhone, "Home Phone Number") &&
           sv.isDouble(homePhone, "Home Phone Number") &&
           sv.isPresent(emergencyPhone, "Emergency Phone Number") &&
           sv.isDouble(emergencyPhone, "Emergency Phone Number") &&
           sv.isPresent(emailAddr, "Email Address") &&
           sv.isDouble(emailAddr, "Email Address") &&
           sv.isPresent(ssn, "Social Security Number") &&
           sv.isDouble(ssn, "Social Security Number") &&
           sv.isPresent(dob, "Date of Birth") &&
           sv.isDouble(dob, "Date of Birth") &&
           sv.isPresent(gender, "Gender") &&
           sv.isDouble(gender, "Gender") &&
           sv.isPresent(ethnicAssoc, "Ethnic Association") &&
           sv.isDouble(ethnicAssoc, "Ethnic Association") &&
           sv.isPresent(maritalStatus, "Marital Status") &&
           sv.isDouble(maritalStatus, "Marital Status") &&
           sv.isPresent(currPrimHPC, "Current Primary Healthcare Provider") &&
           sv.isDouble(currPrimHPC, "Current Primary Healthcare Provider") &&
           sv.isPresent(active, "Active") &&
           sv.isDouble(active, "Active") &&
           sv.isPresent(comments, "Comments") &&
           sv.isDouble(comments, "Comments") &&
           sv.isPresent(subRelationship, "Subscriber Relationship") &&
           sv.isDouble(subRelationship, "Subscriber Relationship") &&
           sv.isPresent(nextOfKin, "Next of Kin") &&
           sv.isDouble(nextOfKin, "Next of Kin") &&
           sv.isPresent(middleInitial, "Middle Initial") &&
           sv.isDouble(middleInitial, "Middle Initial") &&
           sv.isPresent(nextOfKinRelationToPatient, "Next of Kin Relationship to Patient") &&
           sv.isDouble(nextOfKinRelationToPatient, "Next of Kin Relationship to Patient")){
        }
    }
        
        // The editButtonClicked() method is the event handler for the action event of the Edit button.
        // In other words, it's executed when the Edit button is clicked.
    private void newButtonClicked(){
        SwingValidator sv = new SwingValidator(this);
        if(sv.isPresent(patientID, "Patient ID") &&
           sv.isDouble(patientID, "Patient ID") &&
           sv.isPresent(lastName, "Last Name") &&
           sv.isDouble(lastName, "Last Name") &&
           sv.isPresent(prevLastName, "Previous Last Name") &&
           sv.isDouble(prevLastName, "Previous Last Name") &&
           sv.isPresent(firstName, "First Name") &&
           sv.isDouble(firstName, "First Name") &&
           sv.isPresent(homeAddr1, "Home Address 1") &&
           sv.isDouble(homeAddr1, "Home Address 1") &&
           sv.isPresent(homeAddr2, "Home Address 2") &&
           sv.isDouble(homeAddr2, "Home Address 2") &&
           sv.isPresent(city, "City") &&
           sv.isDouble(city, "City") &&
           sv.isPresent(state, "State") &&
           sv.isDouble(state, "State") &&
           sv.isPresent(zip, "Zip Code") &&
           sv.isDouble(zip, "Zip Code") &&
           sv.isPresent(country, "Country") &&
           sv.isDouble(country, "Country") &&
           sv.isPresent(citizenship, "Citizenship") &&
           sv.isDouble(citizenship, "Citizenship") &&
           sv.isPresent(homePhone, "Home Phone Number") &&
           sv.isDouble(homePhone, "Home Phone Number") &&
           sv.isPresent(emergencyPhone, "Emergency Phone Number") &&
           sv.isDouble(emergencyPhone, "Emergency Phone Number") &&
           sv.isPresent(emailAddr, "Email Address") &&
           sv.isDouble(emailAddr, "Email Address") &&
           sv.isPresent(ssn, "Social Security Number") &&
           sv.isDouble(ssn, "Social Security Number") &&
           sv.isPresent(dob, "Date of Birth") &&
           sv.isDouble(dob, "Date of Birth") &&
           sv.isPresent(gender, "Gender") &&
           sv.isDouble(gender, "Gender") &&
           sv.isPresent(ethnicAssoc, "Ethnic Association") &&
           sv.isDouble(ethnicAssoc, "Ethnic Association") &&
           sv.isPresent(maritalStatus, "Marital Status") &&
           sv.isDouble(maritalStatus, "Marital Status") &&
           sv.isPresent(currPrimHPC, "Current Primary Healthcare Provider") &&
           sv.isDouble(currPrimHPC, "Current Primary Healthcare Provider") &&
           sv.isPresent(active, "Active") &&
           sv.isDouble(active, "Active") &&
           sv.isPresent(comments, "Comments") &&
           sv.isDouble(comments, "Comments") &&
           sv.isPresent(subRelationship, "Subscriber Relationship") &&
           sv.isDouble(subRelationship, "Subscriber Relationship") &&
           sv.isPresent(nextOfKin, "Next of Kin") &&
           sv.isDouble(nextOfKin, "Next of Kin") &&
           sv.isPresent(middleInitial, "Middle Initial") &&
           sv.isDouble(middleInitial, "Middle Initial") &&
           sv.isPresent(nextOfKinRelationToPatient, "Next of Kin Relationship to Patient") &&
           sv.isDouble(nextOfKinRelationToPatient, "Next of Kin Relationship to Patient")){
        }
    }
    
    private void saveButtonClicked(){
        System.exit(0);
    }
    
    private void deleteButtonClicked(){
        System.exit(0);
    }
    
    private void closeButtonClicked(){
        System.exit(0);
    }
    
    // The main method contains the code that creates a thread that creates the PatientDemographicsForm object and adds it to the event queue that's used by the event dispatcher thread (EDT).
    public static void main(String[] args){
        // Here, the code uses lamda expression to do that.
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new PatientDemographicsForm();
        });
    }
}
