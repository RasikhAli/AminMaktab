/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminmaktab;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ABC
 */
public class PsychiatricConsultation_ORP_Read extends javax.swing.JInternalFrame {
     String Age;
     String Sexs;
     String Intelligences;
     String Speechs;
     String Stutt;
     String Signing;
     String Coherent;
     String Relevant;
     String Comprehension;
     String Abilitys;
     String Aggressive;
     String InterpersonalRelationships;
     String EyeContact;
     String Tantrums;
     String Stubborn;
     String ConductDisorder;
     String Continence;
     String Conv_or_Fit;
     String Memory;
     String Expression;
     String Excitable;
     String Affect;
     String Violent;
    /**
     * Creates new form PsychiatricConsultation_ORP_Read
     */
    public PsychiatricConsultation_ORP_Read() {
        initComponents();
    }
    public PsychiatricConsultation_ORP_Read(String GetName)
    {
        initComponents();
        Download.setVisible(true);
        try
        {
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
                        data = myRead.nextLine();
                        if(GetName.equals(data))
                        {
                            check = true;
                            Name.setText(data);
                            data = myRead.nextLine();
                            AgeBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            SexBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            Date.setText(data);
                            data = myRead.nextLine();
                            if(data.equals("Dull"))
                            {
                                Intelligence1.setSelected(true);
                            }else if(data.equals("Below Average"))
                            {
                                Intelligence2.setSelected(true);
                            }else if(data.equals("Average"))
                            {
                                Intelligence3.setSelected(true);
                            }else if(data.equals("Low"))
                            {
                                Intelligence4.setSelected(true);
                            }else if(data.equals("Very Low"))
                            {
                                Intelligence5.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Nil"))
                            {
                                Speech1.setSelected(true);
                            }else if(data.equals("Few Sounds"))
                            {
                                Speech2.setSelected(true);
                            }else if(data.equals("Few Words"))
                            {
                                Speech3.setSelected(true);
                            }else if(data.equals("Fair"))
                            {
                                Speech4.setSelected(true);
                            }else if(data.equals("Average"))
                            {
                                Speech5.setSelected(true);
                            }else if(data.equals("Good"))
                            {
                                Speech6.setSelected(true);
                            }else if(data.equals("Many Words"))
                            {
                                Speech7.setSelected(true);
                            }
                            data = myRead.nextLine();
                            StuttBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            SigningBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            CoherentBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            RelevantBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            if(data.equals("Poor"))
                            {
                                Comprehension1.setSelected(true);
                            }else if(data.equals("Average"))
                            {
                                Comprehension2.setSelected(true);
                            }else if(data.equals("Very Good"))
                            {
                                Comprehension3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Poor"))
                            {
                                Memory1.setSelected(true);
                            }else if(data.equals("Average"))
                            {
                                Memory2.setSelected(true);
                            }else if(data.equals("Very Good"))
                            {
                                Memory3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Poor"))
                            {
                                Ability1.setSelected(true);
                            }else if(data.equals("Average"))
                            {
                                Ability2.setSelected(true);
                            }else if(data.equals("Very Good"))
                            {
                                Ability3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Poor"))
                            {
                                Expression1.setSelected(true);
                            }else if(data.equals("Average"))
                            {
                                Expression2.setSelected(true);
                            }else if(data.equals("Very Good"))
                            {
                                Expression3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Common"))
                            {
                                Excitable1.setSelected(true);
                            }else if(data.equals("Frequent"))
                            {
                                Excitable2.setSelected(true);
                            }else if(data.equals("Occaisul"))
                            {
                                Excitable3.setSelected(true);
                            }else if(data.equals("None"))
                            {
                                Excitable4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Common"))
                            {
                                Violent1.setSelected(true);
                            }else if(data.equals("Frequent"))
                            {
                                Violent2.setSelected(true);
                            }else if(data.equals("Occaisul"))
                            {
                                Violent3.setSelected(true);
                            }else if(data.equals("None"))
                            {
                                Violent4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Common"))
                            {
                                Aggressive1.setSelected(true);
                            }else if(data.equals("Frequent"))
                            {
                                Aggressive2.setSelected(true);
                            }else if(data.equals("Occaisul"))
                            {
                                Aggressive3.setSelected(true);
                            }else if(data.equals("None"))
                            {
                                Aggressive4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Happy"))
                            {
                                Affect1.setSelected(true);
                            }else if(data.equals("Apathetic"))
                            {
                                Affect2.setSelected(true);
                            }else if(data.equals("Sad"))
                            {
                                Affect3.setSelected(true);
                            }else if(data.equals("Moody"))
                            {
                                Affect4.setSelected(true);
                            }else if(data.equals("Anxious"))
                            {
                                Affect5.setSelected(true);
                            }else if(data.equals("Restless"))
                            {
                                Affect6.setSelected(true);
                            }else if(data.equals("Cooperative"))
                            {
                                Affect7.setSelected(true);
                            }else if(data.equals("Autism"))
                            {
                                Affect8.setSelected(true);
                            }else if(data.equals("Down's"))
                            {
                                Affect9.setSelected(true);
                            }else if(data.equals("High Fever"))
                            {
                                Affect10.setSelected(true);
                            }else if(data.equals("Birth Trauma"))
                            {
                                Affect11.setSelected(true);
                            }else if(data.equals("Anoxia"))
                            {
                                Affect12.setSelected(true);
                            }else if(data.equals("Other Chromes"))
                            {
                                Affect13.setSelected(true);
                            }else if(data.equals("Metab"))
                            {
                                Affect14.setSelected(true);
                            }else if(data.equals("Endoc"))
                            {
                                Affect15.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Yes"))
                            {
                                IR1.setSelected(true);
                            }else if(data.equals("Poor"))
                            {
                                IR2.setSelected(true);
                            }else if(data.equals("Ok"))
                            {
                                IR3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Yes"))
                            {
                                EC1.setSelected(true);
                            }else if(data.equals("Poor"))
                            {
                                EC2.setSelected(true);
                            }else if(data.equals("No"))
                            {
                                EC3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Temper"))
                            {
                                Tantrums1.setSelected(true);
                            }else if(data.equals("Demand"))
                            {
                                Tantrums2.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Major Problem"))
                            {
                                Stubborn1.setSelected(true);
                            }else if(data.equals("Frequent"))
                            {
                                Stubborn2.setSelected(true);
                            }else if(data.equals("Occaisul"))
                            {
                                Stubborn3.setSelected(true);
                            }else if(data.equals("None"))
                            {
                                Stubborn4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Breaking Things"))
                            {
                                CD1.setSelected(true);
                            }else if(data.equals("Disruptive"))
                            {
                                CD2.setSelected(true);
                            }else if(data.equals("Noisy"))
                            {
                                CD3.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Double"))
                            {
                                Continence1.setSelected(true);
                            }else if(data.equals("Encopresis"))
                            {
                                Continence2.setSelected(true);
                            }else if(data.equals("Enuresis"))
                            {
                                Continence3.setSelected(true);
                            }else if(data.equals("Nocturnal"))
                            {
                                Continence4.setSelected(true);
                            }else if(data.equals("Incontinent"))
                            {
                                Continence5.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Grand Mal"))
                            {
                                CF1.setSelected(true);
                            }else if(data.equals("Pet Mal"))
                            {
                                CF2.setSelected(true);
                            }else if(data.equals("Tic"))
                            {
                                CF3.setSelected(true);
                            }else if(data.equals("Jacksonian"))
                            {
                                CF4.setSelected(true);
                            }else if(data.equals("Part Focal"))
                            {
                                CF5.setSelected(true);
                            }else if(data.equals("Status"))
                            {
                                CF6.setSelected(true);
                            }
                            data = myRead.nextLine();
                            Notes.setText(data);
                            data = myRead.nextLine();
                            Advised.setText(data);
                        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SexBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        AgeBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Intelligence2 = new javax.swing.JRadioButton();
        Intelligence1 = new javax.swing.JRadioButton();
        Intelligence3 = new javax.swing.JRadioButton();
        Intelligence4 = new javax.swing.JRadioButton();
        Intelligence5 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Speech1 = new javax.swing.JRadioButton();
        Speech2 = new javax.swing.JRadioButton();
        Speech3 = new javax.swing.JRadioButton();
        Speech7 = new javax.swing.JRadioButton();
        Speech4 = new javax.swing.JRadioButton();
        Speech5 = new javax.swing.JRadioButton();
        Speech6 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        StuttBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        SigningBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CoherentBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        RelevantBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Comprehension1 = new javax.swing.JRadioButton();
        Comprehension2 = new javax.swing.JRadioButton();
        Comprehension3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        Memory1 = new javax.swing.JRadioButton();
        Memory2 = new javax.swing.JRadioButton();
        Memory3 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        Ability1 = new javax.swing.JRadioButton();
        Ability2 = new javax.swing.JRadioButton();
        Ability3 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        Expression1 = new javax.swing.JRadioButton();
        Expression2 = new javax.swing.JRadioButton();
        Expression3 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        Excitable1 = new javax.swing.JRadioButton();
        Excitable2 = new javax.swing.JRadioButton();
        Excitable3 = new javax.swing.JRadioButton();
        Excitable4 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        Affect1 = new javax.swing.JRadioButton();
        Affect2 = new javax.swing.JRadioButton();
        Affect3 = new javax.swing.JRadioButton();
        Affect4 = new javax.swing.JRadioButton();
        Affect5 = new javax.swing.JRadioButton();
        Affect6 = new javax.swing.JRadioButton();
        Affect7 = new javax.swing.JRadioButton();
        Affect8 = new javax.swing.JRadioButton();
        Affect9 = new javax.swing.JRadioButton();
        Affect10 = new javax.swing.JRadioButton();
        Affect11 = new javax.swing.JRadioButton();
        Affect12 = new javax.swing.JRadioButton();
        Affect13 = new javax.swing.JRadioButton();
        Affect14 = new javax.swing.JRadioButton();
        Affect15 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        Violent1 = new javax.swing.JRadioButton();
        Violent2 = new javax.swing.JRadioButton();
        Violent3 = new javax.swing.JRadioButton();
        Violent4 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        Aggressive1 = new javax.swing.JRadioButton();
        Aggressive2 = new javax.swing.JRadioButton();
        Aggressive3 = new javax.swing.JRadioButton();
        Aggressive4 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        IR1 = new javax.swing.JRadioButton();
        IR2 = new javax.swing.JRadioButton();
        IR3 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        EC1 = new javax.swing.JRadioButton();
        EC2 = new javax.swing.JRadioButton();
        EC3 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        Tantrums1 = new javax.swing.JRadioButton();
        Tantrums2 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        Stubborn1 = new javax.swing.JRadioButton();
        Stubborn2 = new javax.swing.JRadioButton();
        Stubborn3 = new javax.swing.JRadioButton();
        Stubborn4 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        CD1 = new javax.swing.JRadioButton();
        CD2 = new javax.swing.JRadioButton();
        CD3 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        Continence1 = new javax.swing.JRadioButton();
        Continence2 = new javax.swing.JRadioButton();
        Continence3 = new javax.swing.JRadioButton();
        Continence4 = new javax.swing.JRadioButton();
        Continence5 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        CF1 = new javax.swing.JRadioButton();
        CF2 = new javax.swing.JRadioButton();
        CF3 = new javax.swing.JRadioButton();
        CF4 = new javax.swing.JRadioButton();
        CF5 = new javax.swing.JRadioButton();
        CF6 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Notes = new javax.swing.JTextField();
        Advised = new javax.swing.JTextField();
        Download = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Student's Name:");

        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setText("Enter Name");
        Name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFocusLost(evt);
            }
        });
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Age:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Sex:");

        SexBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        SexBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Date of Examination:");

        Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Date.setText("Enter Date");
        Date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateFocusLost(evt);
            }
        });

        AgeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        AgeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Intelligence:");

        Intelligence2.setText("Below Average");
        Intelligence2.setToolTipText("");
        Intelligence2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intelligence2ActionPerformed(evt);
            }
        });

        Intelligence1.setText("Dull");
        Intelligence1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intelligence1ActionPerformed(evt);
            }
        });

        Intelligence3.setText("Average");
        Intelligence3.setToolTipText("");
        Intelligence3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intelligence3ActionPerformed(evt);
            }
        });

        Intelligence4.setText("Low");
        Intelligence4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intelligence4ActionPerformed(evt);
            }
        });

        Intelligence5.setText("Very Low");
        Intelligence5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Intelligence5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Speech:");

        Speech1.setText("Nil");
        Speech1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech1ActionPerformed(evt);
            }
        });

        Speech2.setText("Few Sounds");
        Speech2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech2ActionPerformed(evt);
            }
        });

        Speech3.setText("Few Words");
        Speech3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech3ActionPerformed(evt);
            }
        });

        Speech7.setText("Many Words");
        Speech7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech7ActionPerformed(evt);
            }
        });

        Speech4.setText("Fair");
        Speech4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech4ActionPerformed(evt);
            }
        });

        Speech5.setText("Average");
        Speech5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech5ActionPerformed(evt);
            }
        });

        Speech6.setText("Good");
        Speech6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Speech6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Stutt:");

        StuttBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        StuttBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuttBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Signing:");

        SigningBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        SigningBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigningBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Coherent:");

        CoherentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        CoherentBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoherentBoxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Relevant:");

        RelevantBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        RelevantBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelevantBoxActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Comprehension:");

        Comprehension1.setText("Poor");
        Comprehension1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprehension1ActionPerformed(evt);
            }
        });

        Comprehension2.setText("Average");
        Comprehension2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprehension2ActionPerformed(evt);
            }
        });

        Comprehension3.setText("Very Good");
        Comprehension3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comprehension3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Memory:");

        Memory1.setText("Poor");
        Memory1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Memory1ActionPerformed(evt);
            }
        });

        Memory2.setText("Average");
        Memory2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Memory2ActionPerformed(evt);
            }
        });

        Memory3.setText("Very Good");
        Memory3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Memory3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Ability:");

        Ability1.setText("Poor");
        Ability1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ability1ActionPerformed(evt);
            }
        });

        Ability2.setText("Average");
        Ability2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ability2ActionPerformed(evt);
            }
        });

        Ability3.setText("Very Good");
        Ability3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ability3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Expression:");

        Expression1.setText("Poor");
        Expression1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Expression1ActionPerformed(evt);
            }
        });

        Expression2.setText("Average");
        Expression2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Expression2ActionPerformed(evt);
            }
        });

        Expression3.setText("Very Good");
        Expression3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Expression3ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Excitable:");

        Excitable1.setText("Common");
        Excitable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excitable1ActionPerformed(evt);
            }
        });

        Excitable2.setText("Frequent");
        Excitable2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excitable2ActionPerformed(evt);
            }
        });

        Excitable3.setText("Occaisul");
        Excitable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excitable3ActionPerformed(evt);
            }
        });

        Excitable4.setText("None");
        Excitable4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excitable4ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Affect:");

        Affect1.setText("Happy");
        Affect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect1ActionPerformed(evt);
            }
        });

        Affect2.setText("Apathetic");
        Affect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect2ActionPerformed(evt);
            }
        });

        Affect3.setText("Sad");
        Affect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect3ActionPerformed(evt);
            }
        });

        Affect4.setText("Moody");
        Affect4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect4ActionPerformed(evt);
            }
        });

        Affect5.setText("Anxious");
        Affect5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect5ActionPerformed(evt);
            }
        });

        Affect6.setText("Restless");
        Affect6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect6ActionPerformed(evt);
            }
        });

        Affect7.setText("Cooperative");
        Affect7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect7ActionPerformed(evt);
            }
        });

        Affect8.setText("Autism");
        Affect8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect8ActionPerformed(evt);
            }
        });

        Affect9.setText("Down's");
        Affect9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect9ActionPerformed(evt);
            }
        });

        Affect10.setText("High Fever");
        Affect10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect10ActionPerformed(evt);
            }
        });

        Affect11.setText("Birth Trauma");
        Affect11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect11ActionPerformed(evt);
            }
        });

        Affect12.setText("Anoxia");
        Affect12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect12ActionPerformed(evt);
            }
        });

        Affect13.setText("Other Chromes");
        Affect13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect13ActionPerformed(evt);
            }
        });

        Affect14.setText("Metab");
        Affect14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect14ActionPerformed(evt);
            }
        });

        Affect15.setText("Endoc");
        Affect15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affect15ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Violent:");

        Violent1.setText("Common");
        Violent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Violent1ActionPerformed(evt);
            }
        });

        Violent2.setText("Frequent");
        Violent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Violent2ActionPerformed(evt);
            }
        });

        Violent3.setText("Occaisul");
        Violent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Violent3ActionPerformed(evt);
            }
        });

        Violent4.setText("None");
        Violent4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Violent4ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Aggressive:");

        Aggressive1.setText("Common");
        Aggressive1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aggressive1ActionPerformed(evt);
            }
        });

        Aggressive2.setText("Frequent");
        Aggressive2.setToolTipText("");
        Aggressive2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aggressive2ActionPerformed(evt);
            }
        });

        Aggressive3.setText("Occaisul");
        Aggressive3.setToolTipText("");
        Aggressive3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aggressive3ActionPerformed(evt);
            }
        });

        Aggressive4.setText("None");
        Aggressive4.setToolTipText("");
        Aggressive4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aggressive4ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Interpersonal Relationships:");

        IR1.setText("Yes");
        IR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IR1ActionPerformed(evt);
            }
        });

        IR2.setText("Poor");
        IR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IR2ActionPerformed(evt);
            }
        });

        IR3.setText("Ok");
        IR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IR3ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Eye Contact:");

        EC1.setText("Yes");
        EC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EC1ActionPerformed(evt);
            }
        });

        EC2.setText("Poor");
        EC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EC2ActionPerformed(evt);
            }
        });

        EC3.setText("No");
        EC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EC3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Tantrums:");

        Tantrums1.setText("Temper");
        Tantrums1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tantrums1ActionPerformed(evt);
            }
        });

        Tantrums2.setText("Demand");
        Tantrums2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tantrums2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Stubborn:");

        Stubborn1.setText("Major Problem");
        Stubborn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stubborn1ActionPerformed(evt);
            }
        });

        Stubborn2.setText("Frequent");
        Stubborn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stubborn2ActionPerformed(evt);
            }
        });

        Stubborn3.setText("Occaisul");
        Stubborn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stubborn3ActionPerformed(evt);
            }
        });

        Stubborn4.setLabel("None");
        Stubborn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stubborn4ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Conduct Disorder:");

        CD1.setText("Breaking Things");
        CD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CD1ActionPerformed(evt);
            }
        });

        CD2.setText("Disruptive");
        CD2.setToolTipText("");
        CD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CD2ActionPerformed(evt);
            }
        });

        CD3.setText("Noisy");
        CD3.setToolTipText("");
        CD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CD3ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Continence:");

        Continence1.setText("Double");
        Continence1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continence1ActionPerformed(evt);
            }
        });

        Continence2.setText("Encopresis");
        Continence2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continence2ActionPerformed(evt);
            }
        });

        Continence3.setText("Enuresis");
        Continence3.setToolTipText("");
        Continence3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continence3ActionPerformed(evt);
            }
        });

        Continence4.setText("Nocturnal");
        Continence4.setToolTipText("");
        Continence4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continence4ActionPerformed(evt);
            }
        });

        Continence5.setText("Incontinent");
        Continence5.setToolTipText("");
        Continence5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continence5ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Conv/Fit:");

        CF1.setText("Grand Mal");
        CF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF1ActionPerformed(evt);
            }
        });

        CF2.setText("Pet Mal");
        CF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF2ActionPerformed(evt);
            }
        });

        CF3.setText("Tic");
        CF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF3ActionPerformed(evt);
            }
        });

        CF4.setText("Jacksonian");
        CF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF4ActionPerformed(evt);
            }
        });

        CF5.setText("Part Focal");
        CF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF5ActionPerformed(evt);
            }
        });

        CF6.setText("Status");
        CF6.setToolTipText("");
        CF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CF6ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Notes:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Advised:");

        Notes.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Notes.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Advised.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        Advised.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Download.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Download.setText("Download");
        Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Aggressive1)
                                .addGap(18, 18, 18)
                                .addComponent(Aggressive2)
                                .addGap(18, 18, 18)
                                .addComponent(Aggressive3)
                                .addGap(18, 18, 18)
                                .addComponent(Aggressive4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Violent1)
                                .addGap(18, 18, 18)
                                .addComponent(Violent2)
                                .addGap(18, 18, 18)
                                .addComponent(Violent3)
                                .addGap(18, 18, 18)
                                .addComponent(Violent4))
                            .addComponent(Comprehension1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Ability1)
                                    .addComponent(Memory1)
                                    .addComponent(Expression1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Memory2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Memory3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Ability2)
                                                .addGap(18, 18, 18)
                                                .addComponent(Ability3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Expression2)
                                                .addGap(18, 18, 18)
                                                .addComponent(Expression3)))
                                        .addGap(363, 363, 363))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Excitable1)
                                .addGap(18, 18, 18)
                                .addComponent(Excitable2)
                                .addGap(18, 18, 18)
                                .addComponent(Excitable3)
                                .addGap(18, 18, 18)
                                .addComponent(Excitable4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Affect1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Affect4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EC2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EC3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Affect9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Affect11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Affect14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Affect15))))
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Intelligence1)
                                    .addComponent(Speech1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Speech2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Speech3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Intelligence2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Intelligence3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Intelligence4)
                                        .addGap(18, 18, 18)
                                        .addComponent(Intelligence5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Speech4)
                                        .addGap(18, 18, 18)
                                        .addComponent(Speech5)
                                        .addGap(18, 18, 18)
                                        .addComponent(Speech6)
                                        .addGap(18, 18, 18)
                                        .addComponent(Speech7))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(StuttBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Comprehension2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Comprehension3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SigningBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CoherentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RelevantBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CF1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CF2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CF3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CF4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CF5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CF6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Continence1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Continence2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Continence3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Continence4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Continence5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CD1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CD2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CD3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Notes)
                            .addComponent(Advised, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tantrums1))
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IR1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IR2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IR3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tantrums2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Stubborn1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stubborn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Stubborn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Stubborn4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(Download)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(AgeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(SexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Intelligence1)
                    .addComponent(Intelligence3)
                    .addComponent(Intelligence4)
                    .addComponent(Intelligence5)
                    .addComponent(Intelligence2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Speech2)
                        .addComponent(Speech3)
                        .addComponent(Speech4)
                        .addComponent(Speech5)
                        .addComponent(Speech6)
                        .addComponent(Speech7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(Speech1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StuttBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(SigningBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CoherentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(RelevantBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comprehension1)
                    .addComponent(Comprehension2)
                    .addComponent(Comprehension3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Memory1)
                    .addComponent(Memory2)
                    .addComponent(Memory3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ability1)
                    .addComponent(Ability2)
                    .addComponent(Ability3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Expression1)
                    .addComponent(Expression2)
                    .addComponent(Expression3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Excitable1)
                    .addComponent(Excitable2)
                    .addComponent(Excitable3)
                    .addComponent(Excitable4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Violent1)
                    .addComponent(Violent2)
                    .addComponent(Violent3)
                    .addComponent(Violent4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aggressive1)
                    .addComponent(Aggressive2)
                    .addComponent(Aggressive3)
                    .addComponent(Aggressive4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Affect1)
                            .addComponent(Affect2)
                            .addComponent(Affect3)
                            .addComponent(Affect4)
                            .addComponent(Affect5)
                            .addComponent(Affect6)
                            .addComponent(Affect7)
                            .addComponent(Affect8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Affect10)
                            .addComponent(Affect11)
                            .addComponent(Affect12)
                            .addComponent(Affect13)
                            .addComponent(Affect14)
                            .addComponent(Affect15)
                            .addComponent(Affect9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EC3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(IR1)
                        .addComponent(IR2)
                        .addComponent(IR3)
                        .addComponent(jLabel20)
                        .addComponent(EC1)
                        .addComponent(EC2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Tantrums1)
                    .addComponent(Tantrums2)
                    .addComponent(jLabel22)
                    .addComponent(Stubborn1)
                    .addComponent(Stubborn2)
                    .addComponent(Stubborn3)
                    .addComponent(Stubborn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(CD1)
                    .addComponent(CD2)
                    .addComponent(CD3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Continence1)
                    .addComponent(Continence2)
                    .addComponent(Continence3)
                    .addComponent(Continence4)
                    .addComponent(Continence5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(CF1)
                    .addComponent(CF2)
                    .addComponent(CF3)
                    .addComponent(CF4)
                    .addComponent(CF5)
                    .addComponent(CF6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(Advised, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Download)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusGained
        // TODO add your handling code here:
        if(Name.getText().toString().equals("Enter Name"))
        {
            Name.setText("");
        }
    }//GEN-LAST:event_NameFocusGained

    private void NameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFocusLost
        // TODO add your handling code here:
        if(Name.getText().toString().equals(""))
        {
            Name.setText("Enter Name");
        }
    }//GEN-LAST:event_NameFocusLost

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void SexBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexBoxActionPerformed
        // TODO add your handling code here:
        Sexs = SexBox.getSelectedItem().toString();
    }//GEN-LAST:event_SexBoxActionPerformed

    private void DateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateFocusGained
        // TODO add your handling code here:
        if(Date.getText().toString().equals("Enter Date"))
        {
            Date.setText("");
        }
    }//GEN-LAST:event_DateFocusGained

    private void DateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateFocusLost
        // TODO add your handling code here:
        if(Date.getText().toString().equals(""))
        {
            Date.setText("Enter Date");
        }
    }//GEN-LAST:event_DateFocusLost

    private void AgeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeBoxActionPerformed
        // TODO add your handling code here:
        Age = AgeBox.getSelectedItem().toString();
    }//GEN-LAST:event_AgeBoxActionPerformed

    private void Intelligence2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intelligence2ActionPerformed
        // TODO add your handling code here:
        Intelligence1.setSelected(false);
        Intelligence2.setSelected(true);
        Intelligence3.setSelected(false);
        Intelligence4.setSelected(false);
        Intelligence5.setSelected(false);
        Intelligences = "Below Average";
    }//GEN-LAST:event_Intelligence2ActionPerformed

    private void Intelligence1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intelligence1ActionPerformed
        // TODO add your handling code here:
        Intelligence1.setSelected(true);
        Intelligence2.setSelected(false);
        Intelligence3.setSelected(false);
        Intelligence4.setSelected(false);
        Intelligence5.setSelected(false);
        Intelligences = "Dull";
    }//GEN-LAST:event_Intelligence1ActionPerformed

    private void Intelligence3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intelligence3ActionPerformed
        // TODO add your handling code here:
        Intelligence1.setSelected(false);
        Intelligence2.setSelected(false);
        Intelligence3.setSelected(true);
        Intelligence4.setSelected(false);
        Intelligence5.setSelected(false);
        Intelligences = "Average";
    }//GEN-LAST:event_Intelligence3ActionPerformed

    private void Intelligence4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intelligence4ActionPerformed
        // TODO add your handling code here:
        Intelligence1.setSelected(false);
        Intelligence2.setSelected(false);
        Intelligence3.setSelected(false);
        Intelligence4.setSelected(true);
        Intelligence5.setSelected(false);
        Intelligences = "Low";
    }//GEN-LAST:event_Intelligence4ActionPerformed

    private void Intelligence5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Intelligence5ActionPerformed
        // TODO add your handling code here:
        Intelligence1.setSelected(false);
        Intelligence2.setSelected(false);
        Intelligence3.setSelected(false);
        Intelligence4.setSelected(false);
        Intelligence5.setSelected(true);
        Intelligences = "Very Low";
    }//GEN-LAST:event_Intelligence5ActionPerformed

    private void Speech1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech1ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(true);
        Speech2.setSelected(false);
        Speech3.setSelected(false);
        Speech7.setSelected(false);
        Speech4.setSelected(false);
        Speech5.setSelected(false);
        Speech6.setSelected(false);
        Speechs = "Nil";
    }//GEN-LAST:event_Speech1ActionPerformed

    private void Speech2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech2ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(false);
        Speech2.setSelected(true);
        Speech3.setSelected(false);
        Speech7.setSelected(false);
        Speech4.setSelected(false);
        Speech5.setSelected(false);
        Speech6.setSelected(false);
        Speechs = "Few Sounds";
    }//GEN-LAST:event_Speech2ActionPerformed

    private void Speech3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech3ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(false);
        Speech2.setSelected(false);
        Speech3.setSelected(true);
        Speech7.setSelected(false);
        Speech4.setSelected(false);
        Speech5.setSelected(false);
        Speech6.setSelected(false);
        Speechs = "Few Words";
    }//GEN-LAST:event_Speech3ActionPerformed

    private void Speech7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech7ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(false);
        Speech2.setSelected(false);
        Speech3.setSelected(false);
        Speech4.setSelected(false);
        Speech5.setSelected(false);
        Speech6.setSelected(false);
        Speech7.setSelected(true);
        Speechs = "Many Words";
    }//GEN-LAST:event_Speech7ActionPerformed

    private void Speech4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech4ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(false);
        Speech2.setSelected(false);
        Speech3.setSelected(false);
        Speech4.setSelected(true);
        Speech5.setSelected(false);
        Speech6.setSelected(false);
        Speech7.setSelected(false);
        Speechs = "Fair";
    }//GEN-LAST:event_Speech4ActionPerformed

    private void Speech5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech5ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(false);
        Speech2.setSelected(false);
        Speech3.setSelected(false);
        Speech4.setSelected(false);
        Speech5.setSelected(true);
        Speech6.setSelected(false);
        Speech7.setSelected(false);
        Speechs = "Average";
    }//GEN-LAST:event_Speech5ActionPerformed

    private void Speech6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Speech6ActionPerformed
        // TODO add your handling code here:
        Speech1.setSelected(false);
        Speech2.setSelected(false);
        Speech3.setSelected(false);
        Speech4.setSelected(false);
        Speech5.setSelected(false);
        Speech6.setSelected(true);
        Speech7.setSelected(false);
        Speechs = "Good";
    }//GEN-LAST:event_Speech6ActionPerformed

    private void StuttBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuttBoxActionPerformed
        // TODO add your handling code here:
        Stutt = StuttBox.getSelectedItem().toString();
    }//GEN-LAST:event_StuttBoxActionPerformed

    private void SigningBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigningBoxActionPerformed
        // TODO add your handling code here:
        Signing = SigningBox.getSelectedItem().toString();
    }//GEN-LAST:event_SigningBoxActionPerformed

    private void CoherentBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoherentBoxActionPerformed
        // TODO add your handling code here:
        Coherent = CoherentBox.getSelectedItem().toString();
    }//GEN-LAST:event_CoherentBoxActionPerformed

    private void RelevantBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelevantBoxActionPerformed
        // TODO add your handling code here:
        Relevant = RelevantBox.getSelectedItem().toString();
    }//GEN-LAST:event_RelevantBoxActionPerformed

    private void Comprehension1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprehension1ActionPerformed
        // TODO add your handling code here:
        Comprehension1.setSelected(true);
        Comprehension2.setSelected(false);
        Comprehension3.setSelected(false);
        Comprehension = "Poor";
    }//GEN-LAST:event_Comprehension1ActionPerformed

    private void Comprehension2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprehension2ActionPerformed
        // TODO add your handling code here:
        Comprehension1.setSelected(false);
        Comprehension2.setSelected(true);
        Comprehension3.setSelected(false);
        Comprehension = "Average";
    }//GEN-LAST:event_Comprehension2ActionPerformed

    private void Comprehension3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comprehension3ActionPerformed
        // TODO add your handling code here:
        Comprehension1.setSelected(false);
        Comprehension2.setSelected(false);
        Comprehension3.setSelected(true);
        Comprehension = "Very Good";
    }//GEN-LAST:event_Comprehension3ActionPerformed

    private void Memory1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Memory1ActionPerformed
        // TODO add your handling code here:
        Memory1.setSelected(true);
        Memory2.setSelected(false);
        Memory3.setSelected(false);
        Memory = "Poor";
    }//GEN-LAST:event_Memory1ActionPerformed

    private void Memory2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Memory2ActionPerformed
        // TODO add your handling code here:
        Memory1.setSelected(false);
        Memory2.setSelected(true);
        Memory3.setSelected(false);
        Memory = "Average";
    }//GEN-LAST:event_Memory2ActionPerformed

    private void Memory3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Memory3ActionPerformed
        // TODO add your handling code here:
        Memory1.setSelected(false);
        Memory2.setSelected(false);
        Memory3.setSelected(true);
        Memory = "Very Good";
    }//GEN-LAST:event_Memory3ActionPerformed

    private void Ability1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ability1ActionPerformed
        // TODO add your handling code here:
        Ability1.setSelected(true);
        Ability2.setSelected(false);
        Ability3.setSelected(false);
        Abilitys = "Poor";
    }//GEN-LAST:event_Ability1ActionPerformed

    private void Ability2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ability2ActionPerformed
        // TODO add your handling code here:
        Ability1.setSelected(false);
        Ability2.setSelected(true);
        Ability3.setSelected(false);
        Abilitys = "Average";
    }//GEN-LAST:event_Ability2ActionPerformed

    private void Ability3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ability3ActionPerformed
        // TODO add your handling code here:
        Ability1.setSelected(false);
        Ability2.setSelected(false);
        Ability3.setSelected(true);
        Abilitys = "Very Good";
    }//GEN-LAST:event_Ability3ActionPerformed

    private void Expression1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Expression1ActionPerformed
        // TODO add your handling code here:
        Expression1.setSelected(true);
        Expression2.setSelected(false);
        Expression3.setSelected(false);
        Expression = "Poor";
    }//GEN-LAST:event_Expression1ActionPerformed

    private void Expression2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Expression2ActionPerformed
        // TODO add your handling code here:
        Expression1.setSelected(false);
        Expression2.setSelected(true);
        Expression3.setSelected(false);
        Expression = "Average";
    }//GEN-LAST:event_Expression2ActionPerformed

    private void Expression3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Expression3ActionPerformed
        // TODO add your handling code here:
        Expression1.setSelected(false);
        Expression2.setSelected(false);
        Expression3.setSelected(true);
        Expression = "Very Good";
    }//GEN-LAST:event_Expression3ActionPerformed

    private void Excitable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excitable1ActionPerformed
        // TODO add your handling code here:
        Excitable1.setSelected(true);
        Excitable2.setSelected(false);
        Excitable3.setSelected(false);
        Excitable4.setSelected(false);
        Excitable = "Common";
    }//GEN-LAST:event_Excitable1ActionPerformed

    private void Excitable2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excitable2ActionPerformed
        // TODO add your handling code here:
        Excitable1.setSelected(false);
        Excitable2.setSelected(true);
        Excitable3.setSelected(false);
        Excitable4.setSelected(false);
        Excitable = "Frequent";
    }//GEN-LAST:event_Excitable2ActionPerformed

    private void Excitable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excitable3ActionPerformed
        // TODO add your handling code here:
        Excitable1.setSelected(false);
        Excitable2.setSelected(false);
        Excitable3.setSelected(true);
        Excitable4.setSelected(false);
        Excitable = "Occaisul";
    }//GEN-LAST:event_Excitable3ActionPerformed

    private void Excitable4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excitable4ActionPerformed
        // TODO add your handling code here:
        Excitable1.setSelected(false);
        Excitable2.setSelected(false);
        Excitable3.setSelected(false);
        Excitable4.setSelected(true);
        Excitable = "None";
    }//GEN-LAST:event_Excitable4ActionPerformed

    private void Affect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect1ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(true);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Happy";
    }//GEN-LAST:event_Affect1ActionPerformed

    private void Affect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect2ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(true);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Apathetic";
    }//GEN-LAST:event_Affect2ActionPerformed

    private void Affect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect3ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(true);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Sad";
    }//GEN-LAST:event_Affect3ActionPerformed

    private void Affect4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect4ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(true);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Moody";
    }//GEN-LAST:event_Affect4ActionPerformed

    private void Affect5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect5ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(true);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Anxious";
    }//GEN-LAST:event_Affect5ActionPerformed

    private void Affect6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect6ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(true);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Restless";
    }//GEN-LAST:event_Affect6ActionPerformed

    private void Affect7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect7ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(true);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Cooperative";
    }//GEN-LAST:event_Affect7ActionPerformed

    private void Affect8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect8ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(true);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Autism";
    }//GEN-LAST:event_Affect8ActionPerformed

    private void Affect9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect9ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(true);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Down's";
    }//GEN-LAST:event_Affect9ActionPerformed

    private void Affect10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect10ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(true);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "High Fever";
    }//GEN-LAST:event_Affect10ActionPerformed

    private void Affect11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect11ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(true);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Birth Trauma";
    }//GEN-LAST:event_Affect11ActionPerformed

    private void Affect12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect12ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(true);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Anoxia";
    }//GEN-LAST:event_Affect12ActionPerformed

    private void Affect13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect13ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(true);
        Affect14.setSelected(false);
        Affect15.setSelected(false);
        Affect = "Other Chromes";
    }//GEN-LAST:event_Affect13ActionPerformed

    private void Affect14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect14ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(true);
        Affect15.setSelected(false);
        Affect = "Metab";
    }//GEN-LAST:event_Affect14ActionPerformed

    private void Affect15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affect15ActionPerformed
        // TODO add your handling code here:
        Affect1.setSelected(false);
        Affect2.setSelected(false);
        Affect3.setSelected(false);
        Affect4.setSelected(false);
        Affect5.setSelected(false);
        Affect6.setSelected(false);
        Affect7.setSelected(false);
        Affect8.setSelected(false);
        Affect9.setSelected(false);
        Affect10.setSelected(false);
        Affect11.setSelected(false);
        Affect12.setSelected(false);
        Affect13.setSelected(false);
        Affect14.setSelected(false);
        Affect15.setSelected(true);
        Affect = "Endoc";
    }//GEN-LAST:event_Affect15ActionPerformed

    private void Violent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Violent1ActionPerformed
        // TODO add your handling code here:
        Violent1.setSelected(true);
        Violent2.setSelected(false);
        Violent3.setSelected(false);
        Violent4.setSelected(false);
        Violent = "Common";
    }//GEN-LAST:event_Violent1ActionPerformed

    private void Violent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Violent2ActionPerformed
        // TODO add your handling code here:
        Violent1.setSelected(false);
        Violent2.setSelected(true);
        Violent3.setSelected(false);
        Violent4.setSelected(false);
        Violent = "Frequent";
    }//GEN-LAST:event_Violent2ActionPerformed

    private void Violent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Violent3ActionPerformed
        // TODO add your handling code here:
        Violent1.setSelected(false);
        Violent2.setSelected(false);
        Violent3.setSelected(true);
        Violent4.setSelected(false);
        Violent = "Occaisul";
    }//GEN-LAST:event_Violent3ActionPerformed

    private void Violent4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Violent4ActionPerformed
        // TODO add your handling code here:
        Violent1.setSelected(false);
        Violent2.setSelected(false);
        Violent3.setSelected(false);
        Violent4.setSelected(true);
        Violent = "None";
    }//GEN-LAST:event_Violent4ActionPerformed

    private void Aggressive1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aggressive1ActionPerformed
        // TODO add your handling code here:
        Aggressive1.setSelected(true);
        Aggressive2.setSelected(false);
        Aggressive3.setSelected(false);
        Aggressive4.setSelected(false);
        Aggressive = "Common";
    }//GEN-LAST:event_Aggressive1ActionPerformed

    private void Aggressive2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aggressive2ActionPerformed
        // TODO add your handling code here:
        Aggressive1.setSelected(false);
        Aggressive2.setSelected(true);
        Aggressive3.setSelected(false);
        Aggressive4.setSelected(false);
        Aggressive = "Frequent";
    }//GEN-LAST:event_Aggressive2ActionPerformed

    private void Aggressive3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aggressive3ActionPerformed
        // TODO add your handling code here:
        Aggressive1.setSelected(false);
        Aggressive2.setSelected(false);
        Aggressive3.setSelected(true);
        Aggressive4.setSelected(false);
        Aggressive = "Occaisul";
    }//GEN-LAST:event_Aggressive3ActionPerformed

    private void Aggressive4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aggressive4ActionPerformed
        // TODO add your handling code here:
        Aggressive1.setSelected(false);
        Aggressive2.setSelected(false);
        Aggressive3.setSelected(false);
        Aggressive4.setSelected(true);
        Aggressive = "None";
    }//GEN-LAST:event_Aggressive4ActionPerformed

    private void IR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IR1ActionPerformed
        // TODO add your handling code here:
        IR1.setSelected(true);
        IR2.setSelected(false);
        IR3.setSelected(false);
        InterpersonalRelationships = "Yes";
    }//GEN-LAST:event_IR1ActionPerformed

    private void IR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IR2ActionPerformed
        // TODO add your handling code here:
        IR1.setSelected(false);
        IR2.setSelected(true);
        IR3.setSelected(false);
        InterpersonalRelationships = "Poor";
    }//GEN-LAST:event_IR2ActionPerformed

    private void IR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IR3ActionPerformed
        // TODO add your handling code here:
        IR1.setSelected(false);
        IR2.setSelected(false);
        IR3.setSelected(true);
        InterpersonalRelationships = "Ok";
    }//GEN-LAST:event_IR3ActionPerformed

    private void EC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EC1ActionPerformed
        // TODO add your handling code here:
        EC1.setSelected(true);
        EC2.setSelected(false);
        EC3.setSelected(false);
        EyeContact = "Yes";
    }//GEN-LAST:event_EC1ActionPerformed

    private void EC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EC2ActionPerformed
        // TODO add your handling code here:
        EC1.setSelected(false);
        EC2.setSelected(true);
        EC3.setSelected(false);
        EyeContact = "Poor";
    }//GEN-LAST:event_EC2ActionPerformed

    private void EC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EC3ActionPerformed
        // TODO add your handling code here:
        EC1.setSelected(false);
        EC2.setSelected(false);
        EC3.setSelected(true);
        EyeContact = "No";
    }//GEN-LAST:event_EC3ActionPerformed

    private void Tantrums1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tantrums1ActionPerformed
        // TODO add your handling code here:
        Tantrums1.setSelected(true);
        Tantrums2.setSelected(false);
        Tantrums = "Temper";
    }//GEN-LAST:event_Tantrums1ActionPerformed

    private void Tantrums2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tantrums2ActionPerformed
        // TODO add your handling code here:
        Tantrums1.setSelected(false);
        Tantrums2.setSelected(true);
        Tantrums = "Demand";
    }//GEN-LAST:event_Tantrums2ActionPerformed

    private void Stubborn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stubborn1ActionPerformed
        // TODO add your handling code here:
        Stubborn1.setSelected(true);
        Stubborn2.setSelected(false);
        Stubborn3.setSelected(false);
        Stubborn4.setSelected(false);
        Stubborn = "Major Problem";
    }//GEN-LAST:event_Stubborn1ActionPerformed

    private void Stubborn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stubborn2ActionPerformed
        // TODO add your handling code here:
        Stubborn1.setSelected(false);
        Stubborn2.setSelected(true);
        Stubborn3.setSelected(false);
        Stubborn4.setSelected(false);
        Stubborn = "Frequent";
    }//GEN-LAST:event_Stubborn2ActionPerformed

    private void Stubborn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stubborn3ActionPerformed
        // TODO add your handling code here:
        Stubborn1.setSelected(false);
        Stubborn2.setSelected(false);
        Stubborn3.setSelected(true);
        Stubborn4.setSelected(false);
        Stubborn = "Occaisul";
    }//GEN-LAST:event_Stubborn3ActionPerformed

    private void Stubborn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stubborn4ActionPerformed
        // TODO add your handling code here:
        Stubborn1.setSelected(false);
        Stubborn2.setSelected(false);
        Stubborn3.setSelected(false);
        Stubborn4.setSelected(true);
        Stubborn = "None";
    }//GEN-LAST:event_Stubborn4ActionPerformed

    private void CD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CD1ActionPerformed
        // TODO add your handling code here:
        CD1.setSelected(true);
        CD2.setSelected(false);
        CD3.setSelected(false);
        ConductDisorder = "Breaking Things";
    }//GEN-LAST:event_CD1ActionPerformed

    private void CD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CD2ActionPerformed
        // TODO add your handling code here:
        CD1.setSelected(false);
        CD2.setSelected(true);
        CD3.setSelected(false);
        ConductDisorder = "Disruptive";
    }//GEN-LAST:event_CD2ActionPerformed

    private void CD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CD3ActionPerformed
        // TODO add your handling code here:
        CD1.setSelected(false);
        CD2.setSelected(false);
        CD3.setSelected(true);
        ConductDisorder = "Noisy";
    }//GEN-LAST:event_CD3ActionPerformed

    private void Continence1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continence1ActionPerformed
        // TODO add your handling code here:
        Continence1.setSelected(true);
        Continence2.setSelected(false);
        Continence3.setSelected(false);
        Continence4.setSelected(false);
        Continence5.setSelected(false);
        Continence = "Double";
    }//GEN-LAST:event_Continence1ActionPerformed

    private void Continence2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continence2ActionPerformed
        // TODO add your handling code here:
        Continence1.setSelected(false);
        Continence2.setSelected(true);
        Continence3.setSelected(false);
        Continence4.setSelected(false);
        Continence5.setSelected(false);
        Continence = "Encopresis";
    }//GEN-LAST:event_Continence2ActionPerformed

    private void Continence3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continence3ActionPerformed
        // TODO add your handling code here:
        Continence1.setSelected(false);
        Continence2.setSelected(false);
        Continence3.setSelected(true);
        Continence4.setSelected(false);
        Continence5.setSelected(false);
        Continence = "Enuresis";
    }//GEN-LAST:event_Continence3ActionPerformed

    private void Continence4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continence4ActionPerformed
        // TODO add your handling code here:
        Continence1.setSelected(false);
        Continence2.setSelected(false);
        Continence3.setSelected(false);
        Continence4.setSelected(true);
        Continence5.setSelected(false);
        Continence = "Nocturnal";
    }//GEN-LAST:event_Continence4ActionPerformed

    private void Continence5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continence5ActionPerformed
        // TODO add your handling code here:
        Continence1.setSelected(false);
        Continence2.setSelected(false);
        Continence3.setSelected(false);
        Continence4.setSelected(false);
        Continence5.setSelected(true);
        Continence = "Incontinent";
    }//GEN-LAST:event_Continence5ActionPerformed

    private void CF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF1ActionPerformed
        // TODO add your handling code here:
        CF1.setSelected(true);
        CF2.setSelected(false);
        CF3.setSelected(false);
        CF4.setSelected(false);
        CF5.setSelected(false);
        CF6.setSelected(false);
        Conv_or_Fit = "Grand Mal";
    }//GEN-LAST:event_CF1ActionPerformed

    private void CF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF2ActionPerformed
        // TODO add your handling code here:
        CF1.setSelected(false);
        CF2.setSelected(true);
        CF3.setSelected(false);
        CF4.setSelected(false);
        CF5.setSelected(false);
        CF6.setSelected(false);
        Conv_or_Fit = "Pet Mal";
    }//GEN-LAST:event_CF2ActionPerformed

    private void CF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF3ActionPerformed
        // TODO add your handling code here:
        CF1.setSelected(false);
        CF2.setSelected(false);
        CF3.setSelected(true);
        CF4.setSelected(false);
        CF5.setSelected(false);
        CF6.setSelected(false);
        Conv_or_Fit = "Tic";
    }//GEN-LAST:event_CF3ActionPerformed

    private void CF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF4ActionPerformed
        // TODO add your handling code here:
        CF1.setSelected(false);
        CF2.setSelected(false);
        CF3.setSelected(false);
        CF4.setSelected(true);
        CF5.setSelected(false);
        CF6.setSelected(false);
        Conv_or_Fit = "Jacksonian";
    }//GEN-LAST:event_CF4ActionPerformed

    private void CF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF5ActionPerformed
        // TODO add your handling code here:
        CF1.setSelected(false);
        CF2.setSelected(false);
        CF3.setSelected(false);
        CF4.setSelected(false);
        CF5.setSelected(true);
        CF6.setSelected(false);
        Conv_or_Fit = "Part Focal";
    }//GEN-LAST:event_CF5ActionPerformed

    private void CF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CF6ActionPerformed
        // TODO add your handling code here:
        CF1.setSelected(false);
        CF2.setSelected(false);
        CF3.setSelected(false);
        CF4.setSelected(false);
        CF5.setSelected(false);
        CF6.setSelected(true);
        Conv_or_Fit = "Status";
    }//GEN-LAST:event_CF6ActionPerformed

    private void DownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DownloadActionPerformed
        // TODO add your handling code here:
        Download.setVisible(false);
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print Record");
        printerJob.setPrintable(new Printable()
        {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException
            {
                if (pageIndex > 0) 
                {
                    return Printable.NO_SUCH_PAGE;
                }

                // get the bounds of the component
                Dimension dim = jPanel1.getSize();
                double cHeight = dim.getHeight();
                double cWidth = dim.getWidth();

                // get the bounds of the printable area
                double pHeight = pageFormat.getImageableHeight();
                double pWidth = pageFormat.getImageableWidth();

                double pXStart = pageFormat.getImageableX();
                double pYStart = pageFormat.getImageableY();

                double xRatio = pWidth / cWidth;
                double yRatio = pHeight / cHeight;


                Graphics2D g2 = (Graphics2D)graphics;
                g2.translate(pXStart, pYStart);
                g2.scale(xRatio, yRatio);
                jPanel1.paint(g2);

                return Printable.PAGE_EXISTS;
            }
        });
        boolean returnResult = printerJob.printDialog();
        if(returnResult)
        {
            try{
                printerJob.print();
            }catch(PrinterException pr)
            {
                pr.printStackTrace();
            }
        }
        Download.setVisible(true);
    }//GEN-LAST:event_DownloadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ability1;
    private javax.swing.JRadioButton Ability2;
    private javax.swing.JRadioButton Ability3;
    private javax.swing.JTextField Advised;
    private javax.swing.JRadioButton Affect1;
    private javax.swing.JRadioButton Affect10;
    private javax.swing.JRadioButton Affect11;
    private javax.swing.JRadioButton Affect12;
    private javax.swing.JRadioButton Affect13;
    private javax.swing.JRadioButton Affect14;
    private javax.swing.JRadioButton Affect15;
    private javax.swing.JRadioButton Affect2;
    private javax.swing.JRadioButton Affect3;
    private javax.swing.JRadioButton Affect4;
    private javax.swing.JRadioButton Affect5;
    private javax.swing.JRadioButton Affect6;
    private javax.swing.JRadioButton Affect7;
    private javax.swing.JRadioButton Affect8;
    private javax.swing.JRadioButton Affect9;
    private javax.swing.JComboBox<String> AgeBox;
    private javax.swing.JRadioButton Aggressive1;
    private javax.swing.JRadioButton Aggressive2;
    private javax.swing.JRadioButton Aggressive3;
    private javax.swing.JRadioButton Aggressive4;
    private javax.swing.JRadioButton CD1;
    private javax.swing.JRadioButton CD2;
    private javax.swing.JRadioButton CD3;
    private javax.swing.JRadioButton CF1;
    private javax.swing.JRadioButton CF2;
    private javax.swing.JRadioButton CF3;
    private javax.swing.JRadioButton CF4;
    private javax.swing.JRadioButton CF5;
    private javax.swing.JRadioButton CF6;
    private javax.swing.JComboBox<String> CoherentBox;
    private javax.swing.JRadioButton Comprehension1;
    private javax.swing.JRadioButton Comprehension2;
    private javax.swing.JRadioButton Comprehension3;
    private javax.swing.JRadioButton Continence1;
    private javax.swing.JRadioButton Continence2;
    private javax.swing.JRadioButton Continence3;
    private javax.swing.JRadioButton Continence4;
    private javax.swing.JRadioButton Continence5;
    private javax.swing.JTextField Date;
    private javax.swing.JButton Download;
    private javax.swing.JRadioButton EC1;
    private javax.swing.JRadioButton EC2;
    private javax.swing.JRadioButton EC3;
    private javax.swing.JRadioButton Excitable1;
    private javax.swing.JRadioButton Excitable2;
    private javax.swing.JRadioButton Excitable3;
    private javax.swing.JRadioButton Excitable4;
    private javax.swing.JRadioButton Expression1;
    private javax.swing.JRadioButton Expression2;
    private javax.swing.JRadioButton Expression3;
    private javax.swing.JRadioButton IR1;
    private javax.swing.JRadioButton IR2;
    private javax.swing.JRadioButton IR3;
    private javax.swing.JRadioButton Intelligence1;
    private javax.swing.JRadioButton Intelligence2;
    private javax.swing.JRadioButton Intelligence3;
    private javax.swing.JRadioButton Intelligence4;
    private javax.swing.JRadioButton Intelligence5;
    private javax.swing.JRadioButton Memory1;
    private javax.swing.JRadioButton Memory2;
    private javax.swing.JRadioButton Memory3;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Notes;
    private javax.swing.JComboBox<String> RelevantBox;
    private javax.swing.JComboBox<String> SexBox;
    private javax.swing.JComboBox<String> SigningBox;
    private javax.swing.JRadioButton Speech1;
    private javax.swing.JRadioButton Speech2;
    private javax.swing.JRadioButton Speech3;
    private javax.swing.JRadioButton Speech4;
    private javax.swing.JRadioButton Speech5;
    private javax.swing.JRadioButton Speech6;
    private javax.swing.JRadioButton Speech7;
    private javax.swing.JRadioButton Stubborn1;
    private javax.swing.JRadioButton Stubborn2;
    private javax.swing.JRadioButton Stubborn3;
    private javax.swing.JRadioButton Stubborn4;
    private javax.swing.JComboBox<String> StuttBox;
    private javax.swing.JRadioButton Tantrums1;
    private javax.swing.JRadioButton Tantrums2;
    private javax.swing.JRadioButton Violent1;
    private javax.swing.JRadioButton Violent2;
    private javax.swing.JRadioButton Violent3;
    private javax.swing.JRadioButton Violent4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
