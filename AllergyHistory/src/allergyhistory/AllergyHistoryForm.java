// The package statement stores the class in the package.
package allergyhistory;

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

// After the import statements, the declaration for the class shows that the AllergyHistoryForm class inherits the JFrame class.
public class AllergyHistoryForm extends JFrame {
    
    // The body of the AllergyHistoryForm class begins by declaring text fields.
    // It's necessary to declare these text fields here so all methods of the class, including the event handlers, can access them.
    private JTextField allergen;
    private JTextField startDate;
    private JTextField endDate;
    private JTextField allergyDescription;
    
    // The constructor for this class calls the initComponent() method to initialize the frame and its controls.
    public AllergyHistoryForm(){
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
        // Then, it sets the title, default close operation, and location of the frame.
        setTitle("Allergy History");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        
        // The next part of this program begins by creating text fields.
        allergen = new JTextField();
        startDate = new JTextField();
        endDate = new JTextField();
        allergyDescription = new JTextField();
        
        // It sets the preferred size and minimum size for these text fields.
        Dimension dim = new Dimension(150, 20);
        allergen.setPreferredSize(dim);
        startDate.setPreferredSize(dim);
        endDate.setPreferredSize(dim);
        allergyDescription.setPreferredSize(dim);
        
        // After setting up the text fields, this code creates the Edit, New, Save, Delete, and Close.
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
        
        // Button panel.
        // After creating the buttons, it creates a panel to contain these buttons.
        // Then, it sets the layout manager for this panel to a right aligned FlowLayout, and it adds both buttons to the panel.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(editButton);
        buttonPanel.add(newButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(closeButton);
        
        // Main panel.
        // After creating the panel for the buttons, this code creates another JPanel to store the labels and text boxes for this GUI.
        JPanel panel = new JPanel();
        // Then, it sets the layout manager for this panel to the GridBagLayout manager, and it adds all of the labels and text fields to the grid.
        panel.setLayout(new GridBagLayout());
        // This method makes it easier to get the GridBagConstraints object for each component.
        panel.add(new JLabel("Allergen:"), getConstraints(0, 0));
        panel.add(allergen, getConstraints(1, 0));
        panel.add(new JLabel("Start Date:"), getConstraints(0, 1));
        panel.add(startDate, getConstraints(1, 1));
        panel.add(new JLabel("End Date:"), getConstraints(0, 2));
        panel.add(endDate, getConstraints(1, 2));
        panel.add(new JLabel("Allergy Description:"), getConstraints(0, 3));
        panel.add(allergyDescription, getConstraints(1, 3));
        
        // Add button panel to the last row of the main panel.
        GridBagConstraints c = getConstraints(0, 4);
        c.anchor = GridBagConstraints.LINE_END;
        c.gridwidth = 2;
        panel.add(buttonPanel, c);
        
        // After creating the button panel and the main panel, this code adds the main panel to the center of the BorderLayout, and it adds the button panel to the south of the BorderLayout.
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Then, it sets the size of the frame and makes it visible.
        // This shoudl display the GUI to the user, and the GUI should listen for events that it can handle.
        setSize(new Dimension(320, 180));
        setVisible(true);
    }
    
    // Helper method for getting a GridBagConstraints object
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
        if (sv.isPresent(allergen, "Allergen") &&
            sv.isDouble(allergen, "Allergen") &&
            sv.isPresent(startDate, "Start Date") &&
            sv.isDouble(startDate, "Start Date") &&
            sv.isPresent(endDate, "End Date") &&
            sv.isDouble(endDate, "End Date") &&
            sv.isPresent(allergyDescription, "Allergy Description") &&
            sv.isDouble(allergyDescription, "Allergy Description")){
        }
    }
    
    // The newButtonClicked() method is the event handler for the action event of the New button.
    // In other words, it's executed when the New button is clicked.
    private void newButtonClicked(){
        SwingValidator sv = new SwingValidator(this);
        if (sv.isPresent(allergen, "Allergen") &&
            sv.isDouble(allergen, "Allergen") &&
            sv.isPresent(startDate, "Start Date") &&
            sv.isDouble(startDate, "Start Date") &&
            sv.isPresent(endDate, "End Date") &&
            sv.isDouble(endDate, "End Date") &&
            sv.isPresent(allergyDescription, "Allergy Description") &&
            sv.isDouble(allergyDescription, "Allergy Description")){
        }
    }
    
    // The saveButtonClicked() method is the event handler for the action event of the Save button.
    // In other words, it's executed when the Save button is clicked.
    private void saveButtonClicked(){
        System.exit(0);
    }
    
    // The deleteButtonClicked() method is the event handler for the action event of the Delete button.
    // In other words, it's executed when the Delete button is clicked.
    private void deleteButtonClicked(){
        System.exit(0);
    }
    
    // The closeButtonClicked() method is the event handler for the action event of the Close button.
    // In other words, it's executed when the Close button is clicked.
    private void closeButtonClicked(){
        System.exit(0);
    }
    
    // The main() method contains the code that creates a thread that creates the AllergyHistoryForm object and adds it the event queue that's used by the event dispatcher thread (EDT).
    public static void main(String[] args){
        // Here, the code uses a lambda expression to do that.
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new AllergyHistoryForm();
        });
    }
}
