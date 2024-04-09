import java.awt.*;
import java.awt.event.*;

public class OnlineVotingSystem extends Frame implements ActionListener {
    Label nameLabel, phoneLabel, resultLabel ,resultLabe2;
    TextField nameField, phoneField;
    Button submitButton;
    CheckboxGroup partyGroup;
    Checkbox partyA, partyB, partyC;
    
    OnlineVotingSystem() {
        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        phoneLabel = new Label("Phone Number:");
        phoneLabel.setBounds(50, 100, 100, 30);
        
        nameField = new TextField();
        nameField.setBounds(200, 50, 150, 30);
        phoneField = new TextField();
        phoneField.setBounds(200, 100, 150, 30);
        
        partyGroup = new CheckboxGroup();
        partyA = new Checkbox("Party A", partyGroup, false);
        partyA.setBounds(50, 150, 100, 30);
        partyB = new Checkbox("Party B", partyGroup, false);
        partyB.setBounds(150, 150, 100, 30);
        partyC = new Checkbox("Party C", partyGroup, false);
        partyC.setBounds(250, 150, 100, 30);
        
        submitButton = new Button("Submit");
        submitButton.setBounds(150, 200, 100, 30);
        submitButton.addActionListener(this);
        
        resultLabel = new Label("");
        resultLabel.setBounds(50, 250, 300, 30);
        resultLabe2 = new Label("");
        resultLabe2.setBounds(50, 300, 300, 30);

        add(nameLabel);
        add(phoneLabel);
        add(nameField);
        add(phoneField);
        add(partyA);
        add(partyB);
        add(partyC);
        add(submitButton);
        add(resultLabel);
        add(resultLabe2);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String phoneNumber = phoneField.getText();
        String selectedParty = "None";
        
        if (partyA.getState()) {
            selectedParty = "Party A";
        } else if (partyB.getState()) {
            selectedParty = "Party B";
        } else if (partyC.getState()) {
            selectedParty = "Party C";
        }
        
        String message = ("Vote submitted to " + selectedParty + " for " + name );
        String m= ("phone number " + phoneNumber);
        resultLabel.setText(message);
        resultLabe2.setText(m);
    }

    public static void main(String[] args) {
        new OnlineVotingSystem();
}
}