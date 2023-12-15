package AdressbuchImplementation; 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.12.2023
 * @author 
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private JTextField TextName = new JTextField();
  private JTextField TextNummer = new JTextField();
  private JTextField tfName = new JTextField();
  private JTextField tfTelefonnr = new JTextField();
  private JList ListAdressbuch = new JList();
  private DefaultListModel ListAdressbuchModel = new DefaultListModel();
  private JScrollPane ListAdressbuchScrollPane = new JScrollPane(ListAdressbuch);
  private JButton bHinzufuegen1 = new JButton();
  private Adressbuch ab = new Adressbuch(); 
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 615; 
    int frameHeight = 836;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("GUI-Kontakte");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    TextName.setBounds(25, 750, 150, 20);
    cp.add(TextName);
    TextNummer.setBounds(200, 750, 150, 20);
    cp.add(TextNummer);
    tfName.setBounds(25, 725, 150, 20);
    tfName.setText("Name:");
    tfName.setEditable(false);
    cp.add(tfName);
    tfTelefonnr.setBounds(200, 725, 150, 20);
    tfTelefonnr.setText("Telefonnr.:");
    tfTelefonnr.setEditable(false);
    cp.add(tfTelefonnr);
    ListAdressbuch.setModel(ListAdressbuchModel);
    ListAdressbuchScrollPane.setBounds(0, 0, 400, 700);
    ListAdressbuch.setToolTipText("Adressbuch: ");
    ListAdressbuchModel.addElement("Adressbuch: ");
    cp.add(ListAdressbuchScrollPane);
    bHinzufuegen1.setBounds(386, 726, 100, 45);
    bHinzufuegen1.setText("Hinzufuegen");
    bHinzufuegen1.setMargin(new Insets(2, 2, 2, 2));
    bHinzufuegen1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHinzufuegen1_ActionPerformed(evt);
        if (TextName.getText()!= null && TextNummer.getText() != null){
            if (TextNummer.getText().length() < 16){
            try{
                ListAdressbuchModel.addElement("Name: " + TextName.getText() + "; " + "Telefonnr: " + TextNummer.getText()); 
                ab.kontaktSortiertHinzufuegen(TextName.getText(), Integer.parseInt(TextNummer.getText()));
                TextName.setText(" ");
                TextNummer.setText(" "); 
            } catch (NullPointerException e){
                System.out.println("Null!!");
            }               
            } else {
                System.out.println("Zu lange Nummer angegeben!"); 
            }
        }
      }
    });
    cp.add(bHinzufuegen1);
    cp.setBackground(Color.GRAY);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bHinzufuegen1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bHinzufuegen1_ActionPerformed

  // Ende Methoden
} // end of class GUI
