package Sched_App_GUI;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class CourseSchedulerMain extends JApplet {
	
	/**
	 * Create the applet.
	 */
	
	private Object currentInterface;
	
	private int viewID = 0;
	
	public int getViewID(){
		return this.viewID;
	}
	
	public void cleanMainPanel(){
		this.mainPanel.removeAll();
        this.mainPanel.repaint();
	}
	
	public void initSchedAppGUI(){
		
	}
	public void initAdminHomeInterface(){
		cleanMainPanel();
		Admin.AdminHome ah = new Admin.AdminHome(this);
	}
	public void initErrorLogInterface(){
		cleanMainPanel();
		Admin.ErrorLogInterface eli = new Admin.ErrorLogInterface(this);
	}
	public void initLoginInterface(){
		cleanMainPanel();
		Admin.Login l = new Admin.Login(this);
	}
	public void initTestInterface(){
		cleanMainPanel();
		initComponents();
	}
	
	
	public JPanel getMainPanel(){
		return mainPanel;
	}

	
	public CourseSchedulerMain() {
		
		this.mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		getContentPane().setSize(1000,800);
		getContentPane().setVisible(true);
		
		initComponents();
		
		//switch view when button is pressed
		btnAdminLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				initLoginInterface();
			}
			
		});
	}
	

	
	
	public void initComponents(){
		//TODO delete and replace with mainInterface run method
				//add button to panel
				mainPanel.add(btnAdminLogin);
				mainPanel.repaint();
				mainPanel.revalidate();
	}
	
	private JPanel mainPanel;
	private JButton btnAdminLogin = new JButton("Admin Login");;
}
