// To start, the package statement stores the class in the package named GeneralMedicalHistory
package generalmedicalhistory;

// Then, it imports all of the AWT and Swing classes needed by the application, as well as the NumberFormat class and the FinancialCalculations class from the murach.business package.
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

// After the import statements, the declaration for the class shows that the InterviewForGeneralMedicalHistory inherits the JFrame class.
public class InterviewForGeneralMedicalHistory extends JFrame implements ActionListener{
    // The body of the InterviewForGeneralMedicalHistory class begins by declaring six text fields.
    // It's necessary to declare these text fields here so all methods of the class, including the event handlers, can access them.
    private JTextField bloodTypeField;
    private JTextField rHFactorField;
    private JTextField maritalStatusField;
    private JTextField alcoholUseField;
    private JTextField tobaccoUseField;
    private JTextField drugUsageField;
    
    // The constructor for this class calls the initComponents() method to initialize the frame and its controls.
    public InterviewForGeneralMedicalHistory(){
        initComponents();
    }
    
    // To start, it sets the look and feel for the frame so it's the same as the current operating system.
    private void initComponents(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e);
        }
        // Then, it sets the title, default close operation, and location of the frame.
        setTitle("General Medical History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        
        // The next part of this program begins by creating the four text fields.
        bloodTypeField = new JTextField();
        rHFactorField = new JTextField();
        maritalStatusField = new JTextField();
        alcoholUseField = new JTextField();
        tobaccoUseField = new JTextField();
        drugUsageField = new JTextField();
        
        // Then, it sets the preferred size and minimum size for these text fields.
        Dimension dim = new Dimension(150, 20);
        bloodTypeField.setPreferredSize(dim);
        bloodTypeField.setMinimumSize(dim);
        rHFactorField.setPreferredSize(dim);
        rHFactorField.setMinimumSize(dim);
        maritalStatusField.setPreferredSize(dim);
        maritalStatusField.setMinimumSize(dim);
        alcoholUseField.setPreferredSize(dim);
        alcoholUseField.setMinimumSize(dim);
        tobaccoUseField.setPreferredSize(dim);
        tobaccoUseField.setMinimumSize(dim);
        drugUsageField.setPreferredSize(dim);
        drugUsageField.setMinimumSize(dim);
        
        // After setting up the text fields, this code creates the Edit, New, Save, Delete, and Close.
        JButton editButton = new JButton("Edit");
        JButton newButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton deleteButton = new JButton("Delete");
        JButton closeButton = new JButton("Close");
        JButton patientDemographicsButton = new JButton("Patient Demographics");
        JButton allergyHistoryButton = new JButton("Allergy History");
        
        // To add thses action listeners, this code uses lambda expressions.
        // First, it uses a lambda expression to specify that the editButtonClicked() method shown later in the program is the action listener for the Edit button.
        editButton.addActionListener(e -> editButtonClicked());
        // Then, it uses a lambda expression to specify that the newButtonClicked() method shown later in the program is the action listener for the New button.
        newButton.addActionListener(e -> newButtonClicked());
        // All of the other buttons follow the same general syntax as the Edit and New buttons.
        saveButton.addActionListener(e -> saveButtonClicked());
        deleteButton.addActionListener(e -> deleteButtonClicked());
        closeButton.addActionListener(e -> closeButtonClicked());
        patientDemographicsButton.addActionListener(e -> patientDemographicsButtonClicked());
        allergyHistoryButton.addActionListener(e -> allergyHistoryButtonClicked());
        
        // button panel
        // After creating the two buttons, it creates a panel to contain these buttons.
        // Then, it sets the layout manager for this panel to a right-aligned FlowLayout, and it adds both buttons to the panel.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(editButton);
        buttonPanel.add(newButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(closeButton);
        buttonPanel.add(patientDemographicsButton);
        buttonPanel.add(allergyHistoryButton);
        
        // main panel
        // After creating the panel for the buttons, this code creates another JPanel to store the labels and text boxes for this GUI.
        JPanel panel = new JPanel();
        // Then, it sets the layout manager for this panel to the GridBagLayout manager, and it adds all of the labels and text fields to the grid.
        panel.setLayout(new GridBagLayout());
        // To do that, it uses the getConstraints() method that's shown later in the program.
        // This method makes it easier to get the GridBagConstraints object for each component.
        panel.add(new JLabel("Blood Type:"), getConstraints(0, 0));
        panel.add(bloodTypeField, getConstraints(1, 0));
        panel.add(new JLabel("rH Factor:"), getConstraints(0, 1));
        panel.add(rHFactorField, getConstraints(1, 1));
        panel.add(new JLabel("Marital Status:"), getConstraints(0, 2));
        panel.add(maritalStatusField, getConstraints(1, 2));
        panel.add(new JLabel("Alcohol Use:"), getConstraints(0, 3));
        panel.add(alcoholUseField, getConstraints(1, 3));
        panel.add(new JLabel("Tobacco Use:"), getConstraints(0, 4));
        panel.add(tobaccoUseField, getConstraints(1, 4));
        panel.add(new JLabel("Drug Usage:"), getConstraints(0, 5));
        panel.add(drugUsageField, getConstraints(1, 5));
        
        // add button panel to last row of main panel
        GridBagConstraints c = getConstraints(0, 6);
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
    
    // helper method for getting a GridBagConstraints object.
    // The last part of this program begins by defining the getConstraints() method.
    private GridBagConstraints getConstraints(int x, int y){
        // This method returns a GridBagReturns object.
        // To do that, it starts by creating a GridBagConstraints object and setting values for alignment and padding.
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.LINE_START;
        c.insets = new Insets(5, 5, 0, 5);
        // Then , it sets the x and y coordinates to the values that are passed to the method.
        c.gridx = x;
        c.gridy = y;
        return c;
    }
    
    // The editButtonClicked() method is the event handler for the action event of the Edit button.
    // In other words, it's executed when the Edit button is clicked.
    private void editButtonClicked(){
        SwingValidator sv = new SwingValidator(this);
        if(sv.isPresent(bloodTypeField, "Blood Type") &&
           sv.isString(bloodTypeField, "Blood Type") &&
           sv.isPresent(rHFactorField, "rH Factor") &&
           sv.isString(rHFactorField, "rH Factor") &&
           sv.isPresent(maritalStatusField, "Marital Status") &&
           sv.isString(maritalStatusField, "Marital Status") &&
           sv.isPresent(alcoholUseField, "Alcohol Use") &&
           sv.isString(alcoholUseField, "Alcohol Use") &&
           sv.isPresent(tobaccoUseField, "Tobacco Use") &&
           sv.isString(tobaccoUseField, "Tobacco Use") &&
           sv.isPresent(drugUsageField, "Drug Usage") &&
           sv.isString(drugUsageField, "Drug Usage")){   
        }
    }
    
    private void newButtonClicked(){
        SwingValidator sv = new SwingValidator(this);
        if(sv.isPresent(bloodTypeField, "Blood Type") &&
           sv.isString(bloodTypeField, "Blood Type") &&
           sv.isPresent(rHFactorField, "rH Factor") &&
           sv.isString(rHFactorField, "rH Factor") &&
           sv.isPresent(maritalStatusField, "Marital Status") &&
           sv.isString(maritalStatusField, "Marital Status") &&
           sv.isPresent(alcoholUseField, "Alcohol Use") &&
           sv.isString(alcoholUseField, "Alcohol Use") &&
           sv.isPresent(tobaccoUseField, "Tobacco Use") &&
           sv.isString(tobaccoUseField, "Tobacco Use") &&
           sv.isPresent(drugUsageField, "Drug Usage") &&
           sv.isString(drugUsageField, "Drug Usage")){   
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
    
    private void patientDemographicsButtonClicked(){
        PatientDemographics patDem = new PatientDemographics();
        patDem.setVisible(true);
    }
    
    private void allergyHistoryButtonClicked(){
        AllergyHistoryForm allergies = new AllergyHistoryForm();
        allergies.setVisible(true);
    }
    
    // The main() method contains the code that creates a thread that creates the InterviewForGeneralMedicalHistory object and adds it to the event queue that's used by the event dispatcher thread (EDT).
    public static void main(String[] args){
        // Here, the code uses a lambda expression to do that.
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new InterviewForGeneralMedicalHistory();
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
