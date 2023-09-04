/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminmaktab;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ABC
 */
public class Newsletter_CBRP extends javax.swing.JInternalFrame {

    /**
     * Creates new form Newsletter_CBRP
     */
    String NameToUse = "";
    String Type = "";
    
    public Newsletter_CBRP() throws ParseException {
        initComponents();
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateField.setDate(datee);
        DOBField.setDate(datee);
    }
    public Newsletter_CBRP(String GetName, String GetType) throws ParseException 
    {
        initComponents();
        NameToUse = GetName;
        Type = GetType;
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateField.setDate(datee);
        DOBField.setDate(datee);
        
        if(Type.equals("Delete"))
        {
            SubmitBtn.setText("Delete Record");
        }else if(Type.equals("Update"))
        {
            SubmitBtn.setText("Update Data");
        }else if(Type.equals("Read"))
        {
            SubmitBtn.setVisible(false);
            Download.setVisible(true);
        }
        try
        {
            File myFile = new File("Newsletter_CBRP.txt");
            if(myFile.exists())
            {
                Scanner myRead = new Scanner(myFile);
                boolean check = false;
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(data.equals(GetName))
                    {
                        StudentNameField.setText(data);
                        data = myRead.nextLine();
                        RegistrationNoField.setText(data);
                        data = myRead.nextLine();
                        Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                        DateField.setDate(date3);
                        data = myRead.nextLine();
                        AgeField.setSelectedItem(data);
                        data = myRead.nextLine();
                        GenderField.setSelectedItem(data);
                        data = myRead.nextLine();
                        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                        DOBField.setDate(date2);
                        data = myRead.nextLine();
                        SiblingsField.setText(data);
                        data = myRead.nextLine();
                        PhoneNumField.setText(data);
                        data = myRead.nextLine();
                        HomeAddressField.setText(data);
                        data = myRead.nextLine();
                        ChildCurrentIssuesField.setText(data);
                        data = myRead.nextLine();
                        FatherNameField.setText(data);
                        data = myRead.nextLine();
                        FatherAgeField.setSelectedItem(data);
                        data = myRead.nextLine();
                        FatherOccupationField.setText(data);
                        data = myRead.nextLine();
                        MotherNameField.setText(data);
                        data = myRead.nextLine();
                        MotherAgeField.setSelectedItem(data);
                        data = myRead.nextLine();
                        MotherOccupationField.setText(data);
                        data = myRead.nextLine();
                        RelationParentsBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        NeckControlField.setText(data);
                        data = myRead.nextLine();
                        SittingField.setText(data);
                        data = myRead.nextLine();
                        WalkingField.setText(data);
                        data = myRead.nextLine();
                        SpeechSingleWordField.setText(data);
                        data = myRead.nextLine();
                        CompleteSentencesField.setText(data);
                        data = myRead.nextLine();
                        BladderBowelControlField.setText(data);
                        data = myRead.nextLine();
                        EatingWithoutHelpField.setText(data);
                        data = myRead.nextLine();
                        DressingWithoutHelpField.setText(data);
                        data = myRead.nextLine();
                        ChildFavouritesField.setText(data);
                        data = myRead.nextLine();
                        AttendedSchoolBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        ClassField.setText(data);
                        data = myRead.nextLine();
                        MedicalExaminationField.setText(data);
                        data = myRead.nextLine();
                        PsychiatryField.setText(data);
                        data = myRead.nextLine();
                        PhysiotherapyField.setText(data);
                        data = myRead.nextLine();
                        OtherField.setText(data);
                        data = myRead.nextLine();
                        
                        check = true;
                        break;
                    }
                    else
                    {
                        check = false;
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
    
    String StudentName = "";
    String RegistrationNo = "";
    String Date = "";
    String Age = "";
    String Gender = "";
    String DOB = "";
    String NumberofSiblings = "";
    String PhoneNum = "";
    String HomeAddress = "";
    String ChildCurrentIssues = "";
    String FatherName = "";
    String FatherAge = "";
    String FatherOccupation = "";
    String MotherName = "";
    String MotherAge = "";
    String MotherOccupation = "";
    String RelationParents = "First Cousin";
    String NeckControl = "";
    String Sitting = "";
    String Walking = "";
    String SpeechSingleWord = "";
    String CompleteSentences = "";
    String BladderBowelControl = "";
    String EatingWithoutHelp = "";
    String DressingUpWithoutHelp = "";
    String ChildFavourites = "";
    String AttendedSchool = "Yes";
    String Class = "";
    String MedicalExamination = "";
    String Psychiatry = "";
    String Physiotherapy = "";
    String Other = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RegistrationNoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        StudentNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SiblingsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HomeAddressField = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        PhoneNumField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ChildCurrentIssuesField = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FatherNameField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        MotherNameField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FatherOccupationField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        MotherOccupationField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        RelationParentsBox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        NeckControlField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        SittingField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        WalkingField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        SpeechSingleWordField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        CompleteSentencesField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        BladderBowelControlField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        EatingWithoutHelpField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        DressingWithoutHelpField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ChildFavouritesField = new javax.swing.JTextPane();
        jLabel29 = new javax.swing.JLabel();
        AttendedSchoolBox = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        ClassField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        MedicalExaminationField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        PsychiatryField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        PhysiotherapyField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        OtherField = new javax.swing.JTextPane();
        SubmitBtn = new javax.swing.JButton();
        Download = new javax.swing.JButton();
        DOBField = new com.toedter.calendar.JDateChooser();
        DateField = new com.toedter.calendar.JDateChooser();
        AgeField = new javax.swing.JComboBox<>();
        GenderField = new javax.swing.JComboBox<>();
        FatherAgeField = new javax.swing.JComboBox<>();
        MotherAgeField = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("NEWSLETTER | CBRP");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Registration No:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Student Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Number of Siblings:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Home Address:");

        jScrollPane2.setViewportView(HomeAddressField);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Phone Number:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Child's Current Issues:");

        jScrollPane3.setViewportView(ChildCurrentIssuesField);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Family Data:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Father's Name:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Mother's Name:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Father's Age:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Mother's Age:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Father's Occupation:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Mother's Occupation:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Relation Between Parents:");

        RelationParentsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Cousin", "Second Cousin", "Relative", "Non Relative" }));
        RelationParentsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelationParentsBoxActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Developmental Milestones:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Neck Control:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Sitting:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Walking:");

        WalkingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WalkingFieldActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Speech Single Word:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("Complete Sentences:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Bladder & Bowel Control:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setText("Eating Without Help:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Dressing Up Without Help:");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Child's Favourites:");

        jScrollPane4.setViewportView(ChildFavouritesField);

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Attended School Previously:");

        AttendedSchoolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        AttendedSchoolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendedSchoolBoxActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("Class:");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("For Office Use:");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setText("Medical Examination:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Psychiatry:");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setText("Physiotherapy:");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Other:");

        jScrollPane5.setViewportView(OtherField);

        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubmitBtn.setText("Submit Data");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        Download.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Download.setText("Download");
        Download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DownloadActionPerformed(evt);
            }
        });

        DOBField.setDateFormatString("yyyy-MM-dd");

        DateField.setDateFormatString("yyyy-MM-dd");

        AgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        GenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        FatherAgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        MotherAgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MotherNameField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FatherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FatherOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MotherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MotherOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RelationParentsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpeechSingleWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CompleteSentencesField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NeckControlField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SittingField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WalkingField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BladderBowelControlField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EatingWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DressingWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AttendedSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel31)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MedicalExaminationField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PsychiatryField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhysiotherapyField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(74, 74, 74)
                                            .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RegistrationNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(jLabel2)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SiblingsField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StudentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(GenderField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(PhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(SubmitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Download)
                .addGap(246, 246, 246))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(RegistrationNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(StudentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SiblingsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(PhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(FatherOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FatherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(MotherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(MotherOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MotherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(RelationParentsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(NeckControlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(SittingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(WalkingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(SpeechSingleWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(CompleteSentencesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(BladderBowelControlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(EatingWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(DressingWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(AttendedSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(ClassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(MedicalExaminationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(PsychiatryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(PhysiotherapyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitBtn)
                    .addComponent(Download))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WalkingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WalkingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WalkingFieldActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        StudentName = StudentNameField.getText().toString();
        RegistrationNo = RegistrationNoField.getText().toString();
        Date = ((JTextField)DateField.getDateEditor().getUiComponent()).getText();
        Age = AgeField.getSelectedItem().toString();
        Gender = GenderField.getSelectedItem().toString();
        DOB = ((JTextField)DOBField.getDateEditor().getUiComponent()).getText();
        NumberofSiblings = SiblingsField.getText().toString();
        PhoneNum = PhoneNumField.getText().toString();
        HomeAddress = HomeAddressField.getText().toString();
        ChildCurrentIssues = ChildCurrentIssuesField.getText().toString();
        FatherName = FatherNameField.getText().toString();
        FatherAge = FatherAgeField.getSelectedItem().toString();
        FatherOccupation = FatherOccupationField.getText().toString();
        MotherName = MotherNameField.getText().toString();
        MotherAge = MotherAgeField.getSelectedItem().toString();
        MotherOccupation = MotherOccupationField.getText().toString();
        RelationParents = RelationParentsBox.getSelectedItem().toString();
        NeckControl = NeckControlField.getText().toString();
        Sitting = SittingField.getText().toString();
        Walking = WalkingField.getText().toString();
        SpeechSingleWord = SpeechSingleWordField.getText().toString();
        CompleteSentences = CompleteSentencesField.getText().toString();
        BladderBowelControl = BladderBowelControlField.getText().toString();
        EatingWithoutHelp = EatingWithoutHelpField.getText().toString();
        DressingUpWithoutHelp = DressingWithoutHelpField.getText().toString();
        ChildFavourites = ChildFavouritesField.getText().toString();
        AttendedSchool = AttendedSchoolBox.getSelectedItem().toString();
        Class = ClassField.getText().toString();
        MedicalExamination = MedicalExaminationField.getText().toString();
        Psychiatry = PsychiatryField.getText().toString();
        Physiotherapy = PhysiotherapyField.getText().toString();
        if(OtherField.getText().toString() != "")
        {
            Other = OtherField.getText().toString();   
        }
        else
        {
            Other = "--Nill--";
        }
        
        if(!Type.equals("Delete") && !Type.equals("Update"))
        {
            try
            {
                FileWriter writer = new FileWriter("Newsletter_CBRP.txt", true);
                writer.append(StudentName);
                writer.append(System.getProperty("line.separator"));
                writer.append(RegistrationNo);
                writer.append(System.getProperty("line.separator"));
                writer.append(Date);
                writer.append(System.getProperty("line.separator"));
                writer.append(Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Gender);
                writer.append(System.getProperty("line.separator"));
                writer.append(DOB);
                writer.append(System.getProperty("line.separator"));
                writer.append(NumberofSiblings);
                writer.append(System.getProperty("line.separator"));
                writer.append(PhoneNum);
                writer.append(System.getProperty("line.separator"));
                writer.append(HomeAddress);
                writer.append(System.getProperty("line.separator"));
                writer.append(ChildCurrentIssues);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherName);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherOccupation);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherName);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherOccupation);
                writer.append(System.getProperty("line.separator"));
                writer.append(RelationParents);
                writer.append(System.getProperty("line.separator"));
                writer.append(NeckControl);
                writer.append(System.getProperty("line.separator"));
                writer.append(Sitting);
                writer.append(System.getProperty("line.separator"));
                writer.append(Walking);
                writer.append(System.getProperty("line.separator"));
                writer.append(SpeechSingleWord);
                writer.append(System.getProperty("line.separator"));
                writer.append(CompleteSentences);
                writer.append(System.getProperty("line.separator"));
                writer.append(BladderBowelControl);
                writer.append(System.getProperty("line.separator"));
                writer.append(EatingWithoutHelp);
                writer.append(System.getProperty("line.separator"));
                writer.append(DressingUpWithoutHelp);
                writer.append(System.getProperty("line.separator"));
                writer.append(ChildFavourites);
                writer.append(System.getProperty("line.separator"));
                writer.append(AttendedSchool);
                writer.append(System.getProperty("line.separator"));
                writer.append(Class);
                writer.append(System.getProperty("line.separator"));
                writer.append(MedicalExamination);
                writer.append(System.getProperty("line.separator"));
                writer.append(Psychiatry);
                writer.append(System.getProperty("line.separator"));
                writer.append(Physiotherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(Other);
                writer.append(System.getProperty("line.separator"));
                writer.append(System.getProperty("line.separator"));
                writer.close();

                JOptionPane.showMessageDialog(rootPane,"Successfull...");
            }
            catch(IOException ex)
            {
                System.out.println("Error");
                ex.printStackTrace();
            }
        }
        else if(Type.equals("Delete"))
        {
            String tempFile = "temp.txt";
            File oldFile = new File("Newsletter_CBRP.txt");
            File newFile = new File(tempFile);
            
            try
            {
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner myRead = new Scanner(new File("Newsletter_CBRP.txt"));
                
                while(myRead.hasNext())
                {
                    String data = myRead.nextLine();
                    if(!data.equals(NameToUse))
                    {
                        pw.println(data);
                    }
                    else
                    {
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                        data = myRead.nextLine();
                    }
                }
                myRead.close();
                pw.flush();
                pw.close();
                
                oldFile.delete();
                File dump = new File("Newsletter_CBRP.txt");
                newFile.renameTo(dump);
                JOptionPane.showMessageDialog(rootPane,"Deleted Successfully...");
            }
            catch(IOException ex)
            {
                System.out.println("Error");
                ex.printStackTrace();
            }
        }
        else if(Type.equals("Update"))
        {
            String tempFile = "temp.txt";
            File oldFile = new File("Newsletter_CBRP.txt");
            File newFile = new File(tempFile);
            
            try
            {
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner myRead = new Scanner(new File("Newsletter_CBRP.txt"));
                
                while(myRead.hasNext())
                {
                    String data = myRead.nextLine();
                    if(!data.equals(NameToUse))
                    {
                        pw.println(data);
                    }
                    else
                    {
                        pw.println(data);
                        data = myRead.nextLine();
                        pw.println(RegistrationNo);
                        data = myRead.nextLine();
                        pw.println(Date);
                        data = myRead.nextLine();
                        pw.println(Age);
                        data = myRead.nextLine();
                        pw.println(Gender);
                        data = myRead.nextLine();
                        pw.println(DOB);
                        data = myRead.nextLine();
                        pw.println(NumberofSiblings);
                        data = myRead.nextLine();
                        pw.println(PhoneNum);
                        data = myRead.nextLine();
                        pw.println(HomeAddress);
                        data = myRead.nextLine();
                        pw.println(ChildCurrentIssues);
                        data = myRead.nextLine();
                        pw.println(FatherName);
                        data = myRead.nextLine();
                        pw.println(FatherAge);
                        data = myRead.nextLine();
                        pw.println(FatherOccupation);
                        data = myRead.nextLine();
                        pw.println(MotherName);
                        data = myRead.nextLine();
                        pw.println(MotherAge);
                        data = myRead.nextLine();
                        pw.println(MotherOccupation);
                        data = myRead.nextLine();
                        pw.println(RelationParents);
                        data = myRead.nextLine();
                        pw.println(NeckControl);
                        data = myRead.nextLine();
                        pw.println(Sitting);
                        data = myRead.nextLine();
                        pw.println(Walking);
                        data = myRead.nextLine();
                        pw.println(SpeechSingleWord);
                        data = myRead.nextLine();
                        pw.println(CompleteSentences);
                        data = myRead.nextLine();
                        pw.println(BladderBowelControl);
                        data = myRead.nextLine();
                        pw.println(EatingWithoutHelp);
                        data = myRead.nextLine();
                        pw.println(DressingUpWithoutHelp);
                        data = myRead.nextLine();
                        pw.println(ChildFavourites);
                        data = myRead.nextLine();
                        pw.println(AttendedSchool);
                        data = myRead.nextLine();
                        pw.println(Class);
                        data = myRead.nextLine();
                        pw.println(MedicalExamination);
                        data = myRead.nextLine();
                        pw.println(Psychiatry);
                        data = myRead.nextLine();
                        pw.println(Physiotherapy);
                        data = myRead.nextLine();
                        pw.println(Other);
                        data = myRead.nextLine();
                        pw.println("");
                    }
                }
                myRead.close();
                pw.flush();
                pw.close();
                
                oldFile.delete();
                File dump = new File("Newsletter_CBRP.txt");
                newFile.renameTo(dump);
                JOptionPane.showMessageDialog(rootPane,"Updated Successfully...");
            }
            catch(IOException ex)
            {
                System.out.println("Error");
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void RelationParentsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelationParentsBoxActionPerformed
        // TODO add your handling code here:
        RelationParents = RelationParentsBox.getSelectedItem().toString();
    }//GEN-LAST:event_RelationParentsBoxActionPerformed

    private void AttendedSchoolBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendedSchoolBoxActionPerformed
        // TODO add your handling code here:
        AttendedSchool = AttendedSchoolBox.getSelectedItem().toString();
    }//GEN-LAST:event_AttendedSchoolBoxActionPerformed

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
    private javax.swing.JComboBox<String> AgeField;
    private javax.swing.JComboBox<String> AttendedSchoolBox;
    private javax.swing.JTextField BladderBowelControlField;
    private javax.swing.JTextPane ChildCurrentIssuesField;
    private javax.swing.JTextPane ChildFavouritesField;
    private javax.swing.JTextField ClassField;
    private javax.swing.JTextField CompleteSentencesField;
    private com.toedter.calendar.JDateChooser DOBField;
    private com.toedter.calendar.JDateChooser DateField;
    private javax.swing.JButton Download;
    private javax.swing.JTextField DressingWithoutHelpField;
    private javax.swing.JTextField EatingWithoutHelpField;
    private javax.swing.JComboBox<String> FatherAgeField;
    private javax.swing.JTextField FatherNameField;
    private javax.swing.JTextField FatherOccupationField;
    private javax.swing.JComboBox<String> GenderField;
    private javax.swing.JTextPane HomeAddressField;
    private javax.swing.JTextField MedicalExaminationField;
    private javax.swing.JComboBox<String> MotherAgeField;
    private javax.swing.JTextField MotherNameField;
    private javax.swing.JTextField MotherOccupationField;
    private javax.swing.JTextField NeckControlField;
    private javax.swing.JTextPane OtherField;
    private javax.swing.JTextField PhoneNumField;
    private javax.swing.JTextField PhysiotherapyField;
    private javax.swing.JTextField PsychiatryField;
    private javax.swing.JTextField RegistrationNoField;
    private javax.swing.JComboBox<String> RelationParentsBox;
    private javax.swing.JTextField SiblingsField;
    private javax.swing.JTextField SittingField;
    private javax.swing.JTextField SpeechSingleWordField;
    private javax.swing.JTextField StudentNameField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField WalkingField;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
