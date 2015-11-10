package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.border.BevelBorder;


public class inputErrorInterface {

	private JFrame frmErrorReportForm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inputErrorInterface window = new inputErrorInterface();
					window.frmErrorReportForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public inputErrorInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmErrorReportForm = new JFrame();
		frmErrorReportForm.setResizable(false);
		frmErrorReportForm.setTitle("Error Report Form");
		frmErrorReportForm.setBounds(100, 100, 550, 300);
		frmErrorReportForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmErrorReportForm.getContentPane().setLayout(new BoxLayout(frmErrorReportForm.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		frmErrorReportForm.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDirections = new JLabel("Directions: Please select one category of error and describe the situation");
		lblDirections.setBounds(69, 22, 485, 14);
		panel.add(lblDirections);
		
		JRadioButton rdbtnContIsWrong = new JRadioButton("Content is Wrong");
		rdbtnContIsWrong.setBounds(19, 52, 131, 23);
		panel.add(rdbtnContIsWrong);
		
		JRadioButton rdbtnCourseIsMissing = new JRadioButton("Course is missing");
		rdbtnCourseIsMissing.setBounds(152, 52, 131, 23);
		panel.add(rdbtnCourseIsMissing);
		
		JRadioButton rdbtnTechnicalMalfunction = new JRadioButton("Technical Malfunction");
		rdbtnTechnicalMalfunction.setBounds(279, 52, 152, 23);
		panel.add(rdbtnTechnicalMalfunction);
		
		JRadioButton rdbtnCourseMissing = new JRadioButton("Old Course List");
		rdbtnCourseMissing.setBounds(433, 52, 121, 23);
		panel.add(rdbtnCourseMissing);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(110, 214, 131, 23);
		panel.add(btnBack);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(306, 214, 131, 23);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnSubmit);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		textArea.setBackground(Color.WHITE);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(19, 95, 506, 94);
		panel.add(textArea);
		
		panel.setVisible(true);
	}
}
