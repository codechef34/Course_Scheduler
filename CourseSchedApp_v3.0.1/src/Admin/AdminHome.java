/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Admin;

import javax.swing.JPanel;

/**
 *
 * @author germanvalenzuela
 */
public class AdminHome
{
	public AdminHome(Sched_App_GUI.CourseSchedulerMain ma){
		mainApplet = ma;
		mainPanel = mainApplet.getMainPanel();
		initComponents();
	}
	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        textArea1 = new java.awt.TextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(6, 6), new java.awt.Dimension(6, 6), new java.awt.Dimension(6, 6));
        updateButton = new java.awt.Button();
        homeButton = new java.awt.Button();
        ErrorInfoField = new javax.swing.JTextField();
        addCourseButton = new javax.swing.JButton();
        addCourseButton1 = new javax.swing.JButton();
        addCourseButton2 = new javax.swing.JButton();
        addCourseButton3 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        updateButton.setLabel("button1");
        updateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateButtonActionPerformed(evt);
            }
        });

        homeButton.setActionCommand("Home");
        homeButton.setLabel("button1");
        homeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                homeButtonActionPerformed(evt);
            }
        });
        homeButton.getAccessibleContext().setAccessibleName("Home");

        ErrorInfoField.setText("Errors");
        ErrorInfoField.addInputMethodListener(new java.awt.event.InputMethodListener()
        {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt)
            {
                ErrorInfoFieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt)
            {
            }
        });
        ErrorInfoField.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
            	
            }
        });

        addCourseButton.setText("Add Course");
        addCourseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addCourseButtonActionPerformed(evt);
            }
        });

        addCourseButton1.setText("Remove/Update Course");
        addCourseButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addCourseButton1ActionPerformed(evt);
            }
        });

        addCourseButton2.setText("Errors");
        addCourseButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
            	mainApplet.initErrorLogInterface();
            }
        });

        addCourseButton3.setText("Home");
        addCourseButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addCourseButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addCourseButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                        .addComponent(ErrorInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addCourseButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                .addComponent(addCourseButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ErrorInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addCourseButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(addCourseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(addCourseButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(addCourseButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_homeButtonActionPerformed
    {//GEN-HEADEREND:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

    private void ErrorInfoFieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ErrorInfoFieldActionPerformed
    {//GEN-HEADEREND:event_ErrorInfoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorInfoFieldActionPerformed

    private void addCourseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addCourseButtonActionPerformed
    {//GEN-HEADEREND:event_addCourseButtonActionPerformed
        AddCourse c = new AddCourse();
        String[] params = new String[4];
        c.main(params);
      
       
    }//GEN-LAST:event_addCourseButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateButtonActionPerformed
    {//GEN-HEADEREND:event_updateButtonActionPerformed
       
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addCourseButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addCourseButton1ActionPerformed
    {//GEN-HEADEREND:event_addCourseButton1ActionPerformed
        Update_Remove u = new Update_Remove();
        String[] params = new String[4];
        u.main(params);
    }//GEN-LAST:event_addCourseButton1ActionPerformed

    private void addCourseButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addCourseButton2ActionPerformed
    {//GEN-HEADEREND:event_addCourseButton2ActionPerformed
        
        
//        mainPanel.removeAll();
//        mainPanel.repaint();
        
    }//GEN-LAST:event_addCourseButton2ActionPerformed

    private void addCourseButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addCourseButton3ActionPerformed
    {//GEN-HEADEREND:event_addCourseButton3ActionPerformed
        //This is the sign out button
        
    }//GEN-LAST:event_addCourseButton3ActionPerformed

    private void ErrorInfoFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt)//GEN-FIRST:event_ErrorInfoFieldInputMethodTextChanged
    {//GEN-HEADEREND:event_ErrorInfoFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorInfoFieldInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Sched_App_GUI.CourseSchedulerMain mainApplet;
    private JPanel mainPanel;
    private javax.swing.JTextField ErrorInfoField;
    private javax.swing.JButton addCourseButton;
    private javax.swing.JButton addCourseButton1;
    private javax.swing.JButton addCourseButton2;
    private javax.swing.JButton addCourseButton3;
    private javax.swing.Box.Filler filler1;
    private java.awt.Button homeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.TextArea textArea1;
    private java.awt.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
