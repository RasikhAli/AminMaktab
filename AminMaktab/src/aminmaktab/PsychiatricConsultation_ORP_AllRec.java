/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminmaktab;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABC
 */
public class PsychiatricConsultation_ORP_AllRec extends javax.swing.JInternalFrame {

    /**
     * Creates new form PsychiatricConsultation_ORP_AllRec
     */
    public PsychiatricConsultation_ORP_AllRec() {
        initComponents();
        try
        {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            File myFile = new File("ORP.txt");
            if(myFile.exists())
            {
                Scanner myRead = new Scanner(myFile);
                boolean check = false;
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(data.equals("Psychiatric Consultation"))
                    {
                        String[] dataRow = {
                            myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(),
                            myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), 
                            myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(),
                            myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(),
                            myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(), myRead.nextLine(),
                            myRead.nextLine()};
                        model.addRow(dataRow);
                        data = myRead.nextLine();
                        check = true;
                    }
                }
                if(check == true)
                {
                    JFrame j = new JFrame();
                    JOptionPane.showMessageDialog(j,"Successfully Displayed Data...");
                }
                if(check == false)
                {
                    JFrame j = new JFrame();
                    JOptionPane.showMessageDialog(j,"Error: Data Not Found...");
                }
                myRead.close();
            }
            else
            {
                myFile.createNewFile();
            }
        }
        catch(IOException ex)
        {
            System.out.println("Error");
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student's Name", "Age", "Sex", "Date of Examination", "Intelligence", "Speech", "Stutt", "Signing", "Coherent", "Relevant", "Comprehension", "Memory", "Ability", "Expression", "Excitable", "Violent", "Aggressive", "Affect", "InterPersonal Relationships", "Eye Contact", "Tantrums", "Stubborn", "Conduct Disorder", "Continence", "Conv/Fit", "Notes", "Advised"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(50);
            jTable1.getColumnModel().getColumn(2).setMinWidth(50);
            jTable1.getColumnModel().getColumn(3).setMinWidth(50);
        }

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}