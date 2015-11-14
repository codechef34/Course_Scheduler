package Sched_App_GUI;

import static Sched_App_GUI.SchedAppGUI.changeFont;
import Sched_App_GUI.SchedTreeManager.checkTaken;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Christopher Church edited by Tayler Boyce
 */
public class PrereqTab extends JTabbedPane{
    /* Global Constants */
    final Color COLOR_PANE = new Color(150,150,150);
    final Color COLOR_PRER = new Color(150,150,150);
    final Color COLOR_BLUE = new Color(0,0,150);
    
   // Prerequisites Tab 
	Consider removing ( Moved to preReq class )
    JPanel PrerequisitesPanel = new JPanel(new GridBagLayout());
    JLabel Prerequisite_1Label = new JLabel("Prerequisite 1:");
    JLabel Prerequisite_2Label = new JLabel("Prerequisite 2:");
    JTextField Prerequisite_1TextField = new JTextField();
    JTextField Prerequisite_2TextField = new JTextField();
    JCheckBox Prerequisite_1CheckBox = new JCheckBox("Passed");
    JCheckBox Prerequisite_2CheckBox = new JCheckBox("Passed");
   
    public PreequisitePanel(){
        Prerequisite_1TextField.setText("NONE");
        Prerequisite_2TextField.setText("NONE");
        this.setBackground(COLOR_PANE);
    
        ColorPanel.setBackground(COLOR_BLUE);
        this.assemblePanel();
    }

    public OverviewPanel(Course c, checkTaken Lstnr, boolean b){
        Prerequisite_1TextField.setText(c.getPrerequisites().get(0));
        Prerequisite_2TextField.setText(c.getPrerequisites().get(1));
       
		this.setBackground(COLOR_PANE);
    
     
		Prerequisite_1TextField.setEditable(false);
        Prerequisite_2TextField.setEditable(false);
        Prerequisite_1CheckBox.setEnabled(false);
        Prerequisite_2CheckBox.setEnabled(false);
       
        assemblePanel();
    }
    
    private void assemblePanel(){
        
        //Prerequisites Panel Components Added
		
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 3;
        PrerequisitesPanel.add(Prerequisite_1Label, cons);
        cons.gridy++;
        cons.gridwidth = 2;
        PrerequisitesPanel.add(Prerequisite_1TextField, cons);
        cons.gridx += 2;
        cons.gridwidth = 1;
        PrerequisitesPanel.add(Prerequisite_1CheckBox, cons);
        cons.gridx = 0;
        cons.gridy++;
        cons.gridwidth = 3;
        PrerequisitesPanel.add(Prerequisite_2Label, cons);
        cons.gridy++;
        cons.gridwidth = 2;
        PrerequisitesPanel.add(Prerequisite_2TextField, cons);
        cons.gridx += 2;
        cons.gridwidth = 1;
        PrerequisitesPanel.add(Prerequisite_2CheckBox, cons);
		
        
        add("Prerequisites", PrerequisitesPanel);
        
        //Safeguard against font-growth infinite loop
       
       PrerequisitesPanel.setMaximumSize(new Dimension(400,400));
    }
   
	
    private void setColorConstraints(GridBagConstraints c) {
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.anchor = GridBagConstraints.EAST;
        c.weightx = 1.0;
        c.weighty = 1.0;
    }
    
    private void setInfoConstraints(GridBagConstraints c){
        c.gridwidth = 1;
        c.insets = new Insets(5,5,5,5);
    }
    
    private static void changeFont ( Component component, Font font ){
        component.setFont ( font );
        if ( component instanceof Container ){
            for ( Component child : ( ( Container ) component ).getComponents () ){
                changeFont ( child, font );
            }
        }
    }
}