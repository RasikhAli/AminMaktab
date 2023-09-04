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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ABC
 */
public class HistoryDatasheet_IE extends javax.swing.JInternalFrame {

    /**
     * Creates new form HistoryDatasheet_IE
     */
    String NameToUse = "";
    String Type = "";
    public HistoryDatasheet_IE() throws ParseException {
        initComponents();
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateField.setDate(datee);
        DOBField.setDate(datee);
    }
    public HistoryDatasheet_IE(String GetName, String GetType) throws ParseException, ParseException {
        initComponents();
        NameToUse = GetName;
        Type = GetType;
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateField.setDate(datee);
        DOBField.setDate(datee);
        
        if(Type.equals("Update"))
        {
            SubmitBtn.setText("Update Data");
        }
        else if(Type.equals("Delete"))
        {
            SubmitBtn.setText("Delete Record");
        }
        else if(Type.equals("Read"))
        {
            Download.setVisible(true);
            SubmitBtn.setVisible(false);
        }
        try
        {
            File myFile = new File("IE_HistoryDatasheet.txt");
            if(myFile.exists())
            {
                Scanner myRead = new Scanner(myFile);
                boolean check = false;
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(GetName.equals(data))
                    {
                        NameField.setText(data);
                        data = myRead.nextLine();
                        HistoryNoField.setText(data);
                        data = myRead.nextLine();
                        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                        DateField.setDate(date2);
                        data = myRead.nextLine();
                        AgeField.setSelectedItem(data);
                        data = myRead.nextLine();
                        SexField.setSelectedItem(data);
                        data = myRead.nextLine();
                        Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                        DOBField.setDate(date3);
                        data = myRead.nextLine();
                        BirthOrderField.setSelectedItem(data);
                        data = myRead.nextLine();
                        ReligionField.setSelectedItem(data);
                        data = myRead.nextLine();
                        InformantField.setText(data);
                        data = myRead.nextLine();
                        RefferedByField.setText(data);
                        data = myRead.nextLine();
                        HomeAddressField.setText(data);
                        data = myRead.nextLine();
                        PhoneNumField.setText(data);
                        data = myRead.nextLine();
                        PresentingComplaintsField.setText(data);
                        data = myRead.nextLine();
                        HistoryOfIllnessField.setText(data);
                        data = myRead.nextLine();
                        HeadHoldingField.setText(data);
                        data = myRead.nextLine();
                        SittingField.setText(data);
                        data = myRead.nextLine();
                        CrawlingField.setText(data);
                        data = myRead.nextLine();
                        WalkingField.setText(data);
                        data = myRead.nextLine();
                        SpeechSingleWordField.setText(data);
                        data = myRead.nextLine();
                        CompleteSentencesField.setText(data);
                        data = myRead.nextLine();
                        BladderBowelControlField.setText(data);
                        data = myRead.nextLine();
                        DressingField.setText(data);
                        data = myRead.nextLine();
                        TakingBathWithoutHelpField.setText(data);
                        data = myRead.nextLine();
                        AttendingSchoolBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        AttendedSchoolPreviouslyBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        SchoolTypeBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        ProgressWithSchoolBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        RelationWithTeachersBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        RelationWithClassmatesBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        FatherNameField.setText(data);
                        data = myRead.nextLine();
                        FAgeField.setSelectedItem(data);
                        data = myRead.nextLine();
                        FDeadBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        FAgeDeathField.setText(data);
                        data = myRead.nextLine();
                        FEducationField.setSelectedItem(data);
                        data = myRead.nextLine();
                        FOccupationField.setText(data);
                        data = myRead.nextLine();
                        FIncomeField.setSelectedItem(data);
                        data = myRead.nextLine();
                        FGeneralHealthField.setSelectedItem(data);
                        data = myRead.nextLine();
                        if(data.equals("Loving"))
                        {
                            ATC1.setSelected(true);
                        }else if(data.equals("Over Protective"))
                        {
                            ATC2.setSelected(true);
                        }else if(data.equals("Careless"))
                        {
                            ATC3.setSelected(true);
                        }else if(data.equals("Harsh"))
                        {
                            ATC4.setSelected(true);
                        }
                        data = myRead.nextLine();
                        if(data.equals("First Cousin"))
                        {
                            C1.setSelected(true);
                        }else if(data.equals("Second Cousin"))
                        {
                            C2.setSelected(true);
                        }else if(data.equals("Other Relative"))
                        {
                            C3.setSelected(true);
                        }else if(data.equals("No Relative"))
                        {
                            C4.setSelected(true);
                        }
                        data = myRead.nextLine();
                        DisabilityInFamilyField.setText(data);
                        data = myRead.nextLine();
                        if(data.equals("Cooperative"))
                        {
                            S1.setSelected(true);
                        }else if(data.equals("Harsh"))
                        {
                            S2.setSelected(true);
                        }else if(data.equals("In-Different"))
                        {
                            S3.setSelected(true);
                        }                     
                        data = myRead.nextLine();
                        if(data.equals("Cooperative"))
                        {
                            CRS1.setSelected(true);
                        }else if(data.equals("Non-Cooperative"))
                        {
                            CRS2.setSelected(true);
                        }
                        /*
                        SName1.setText(data);
                        data = myRead.nextLine();
                        SSex1.setText(data);
                        data = myRead.nextLine();
                        SAge1.setText(data);
                        data = myRead.nextLine();
                        SEducation1.setText(data);
                        data = myRead.nextLine();
                        SSchool1.setText(data);
                        data = myRead.nextLine();
                        SFees1.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus1.setText(data);
                        data = myRead.nextLine();
                        SHealth1.setText(data);
                        data = myRead.nextLine();
                        SName2.setText(data);
                        data = myRead.nextLine();
                        SSex2.setText(data);
                        data = myRead.nextLine();
                        SAge2.setText(data);
                        data = myRead.nextLine();
                        SEducation2.setText(data);
                        data = myRead.nextLine();
                        SSchool2.setText(data);
                        data = myRead.nextLine();
                        SFees2.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus2.setText(data);
                        data = myRead.nextLine();
                        SHealth2.setText(data);
                        data = myRead.nextLine();
                        SName3.setText(data);
                        data = myRead.nextLine();
                        SSex3.setText(data);
                        data = myRead.nextLine();
                        SAge3.setText(data);
                        data = myRead.nextLine();
                        SEducation3.setText(data);
                        data = myRead.nextLine();
                        SSchool3.setText(data);
                        data = myRead.nextLine();
                        SFees3.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus3.setText(data);
                        data = myRead.nextLine();
                        SHealth3.setText(data);
                        data = myRead.nextLine();
                        SName4.setText(data);
                        data = myRead.nextLine();
                        SSex4.setText(data);
                        data = myRead.nextLine();
                        SAge4.setText(data);
                        data = myRead.nextLine();
                        SEducation4.setText(data);
                        data = myRead.nextLine();
                        SSchool4.setText(data);
                        data = myRead.nextLine();
                        SFees4.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus4.setText(data);
                        data = myRead.nextLine();
                        SHealth4.setText(data);
                        data = myRead.nextLine();
                        SName5.setText(data);
                        data = myRead.nextLine();
                        SSex5.setText(data);
                        data = myRead.nextLine();
                        SAge5.setText(data);
                        data = myRead.nextLine();
                        SEducation5.setText(data);
                        data = myRead.nextLine();
                        SSchool5.setText(data);
                        data = myRead.nextLine();
                        SFees5.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus5.setText(data);
                        data = myRead.nextLine();
                        SHealth5.setText(data);
                        data = myRead.nextLine();
                        SName6.setText(data);
                        data = myRead.nextLine();
                        SSex6.setText(data);
                        data = myRead.nextLine();
                        SAge6.setText(data);
                        data = myRead.nextLine();
                        SEducation6.setText(data);
                        data = myRead.nextLine();
                        SSchool6.setText(data);
                        data = myRead.nextLine();
                        SFees6.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus6.setText(data);
                        data = myRead.nextLine();
                        SHealth6.setText(data);
                        data = myRead.nextLine();
                        SName7.setText(data);
                        data = myRead.nextLine();
                        SSex7.setText(data);
                        data = myRead.nextLine();
                        SAge7.setText(data);
                        data = myRead.nextLine();
                        SEducation7.setText(data);
                        data = myRead.nextLine();
                        SSchool7.setText(data);
                        data = myRead.nextLine();
                        SFees7.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus7.setText(data);
                        data = myRead.nextLine();
                        SHealth7.setText(data);
                        data = myRead.nextLine();
                        SName8.setText(data);
                        data = myRead.nextLine();
                        SSex8.setText(data);
                        data = myRead.nextLine();
                        SAge8.setText(data);
                        data = myRead.nextLine();
                        SEducation8.setText(data);
                        data = myRead.nextLine();
                        SSchool8.setText(data);
                        data = myRead.nextLine();
                        SFees8.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus8.setText(data);
                        data = myRead.nextLine();
                        SHealth8.setText(data);
                        data = myRead.nextLine();
                        SName9.setText(data);
                        data = myRead.nextLine();
                        SSex9.setText(data);
                        data = myRead.nextLine();
                        SAge9.setText(data);
                        data = myRead.nextLine();
                        SEducation9.setText(data);
                        data = myRead.nextLine();
                        SSchool9.setText(data);
                        data = myRead.nextLine();
                        SFees9.setText(data);
                        data = myRead.nextLine();
                        SMartialStatus9.setText(data);
                        data = myRead.nextLine();
                        SHealth9.setText(data);
                        */
                        data = myRead.nextLine();
                        AssessmentReportField.setText(data);
                        data = myRead.nextLine();
                        AssessmentToolsField.setText(data);
                        data = myRead.nextLine();
                        ResultField.setText(data);
                        data = myRead.nextLine();
                        
                        MedicalCareField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        SpeechTherapyField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        PsychiatricConsultationField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        AudiologyField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        OrthopedicExaminationField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        OpthalmologicConsultationField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        VocationalTrainingField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        PsycologicalCounselingField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        PhysiotherapyField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        GroupTherapyField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        FamilyCounselingField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        BehavioralModificationField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        NutritionalCounselingField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        AutismUnitField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        OccupationalTherapyField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        SportsField.setSelected(Boolean.parseBoolean(data));
                        data = myRead.nextLine();
                        GradClassBox.setSelectedItem(data);
                        data = myRead.nextLine();
                        
                        if(data.equals("--END--"))
                        {
                            check = true;
                            break;
                        }
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
    String HistoryNo= "";
    String Datee = "";
    String Name = "";
    String Age = "";
    String Sex = "";
    String DOB = "";
    String BO = "";
    String Religion = "";
    String Informant = "";
    String RefferedBy = "";
    String HomeAddress = "";
    String PhoneNum = "";
    
    String PresentingComplaints = "";
    String HistoryofIllness = "";
    
    String HeadHolding = "";
    String Sitting = "";
    String Crawling = "";
    String Walking = "";
    String SpeechSingleWord = "";
    String CompleteSentences = "";
    String BladderBowelControl = "";
    String Dressing = "";
    String TakingBathWithoutHelp = "";
    
    String AttendingSchool = "Yes";
    String AttendedSchoolPreviously = "Yes";
    String SchoolType = "Private";
    String ProgressWithSchool = "Poor";
    String RelationWithTeacher = "Poor";
    String RelationWithClassmates = "Co-operative";
    
    String FatherName = "";
    String FatherAge = "";
    String FatherDead = "Yes";
    String FatherAgeAtDeath = "";
    String FatherEducation = "";
    String FatherOccupation = "";
    String FatherIncome = "";
    String FatherGeneralHealth = "";
    String FatherAttitudeTowardsChildren = "";
    
    String Consanguinity = "";
    String DisabilityInFamily = "";
    
    String SiblingsAttitude = "";
    String ChildRelation = "";
    /*
    String Siblings1_Name = "";
    String Siblings1_Sex = "";
    String Siblings1_Age = "";
    String Siblings1_Education = "";
    String Siblings1_School = "";
    String Siblings1_Fees = "";
    String Siblings1_MartialStatus = "";
    String Siblings1_Health = "";
    String Siblings2_Name = "";
    String Siblings2_Sex = "";
    String Siblings2_Age = "";
    String Siblings2_Education = "";
    String Siblings2_School = "";
    String Siblings2_Fees = "";
    String Siblings2_MartialStatus = "";
    String Siblings2_Health = "";
    String Siblings3_Name = "";
    String Siblings3_Sex = "";
    String Siblings3_Age = "";
    String Siblings3_Education = "";
    String Siblings3_School = "";
    String Siblings3_Fees = "";
    String Siblings3_MartialStatus = "";
    String Siblings3_Health = "";
    String Siblings4_Name = "";
    String Siblings4_Sex = "";
    String Siblings4_Age = "";
    String Siblings4_Education = "";
    String Siblings4_School = "";
    String Siblings4_Fees = "";
    String Siblings4_MartialStatus = "";
    String Siblings4_Health = "";
    String Siblings5_Name = "";
    String Siblings5_Sex = "";
    String Siblings5_Age = "";
    String Siblings5_Education = "";
    String Siblings5_School = "";
    String Siblings5_Fees = "";
    String Siblings5_MartialStatus = "";
    String Siblings5_Health = "";
    String Siblings6_Name = "";
    String Siblings6_Sex = "";
    String Siblings6_Age = "";
    String Siblings6_Education = "";
    String Siblings6_School = "";
    String Siblings6_Fees = "";
    String Siblings6_MartialStatus = "";
    String Siblings6_Health = "";
    String Siblings7_Name = "";
    String Siblings7_Sex = "";
    String Siblings7_Age = "";
    String Siblings7_Education = "";
    String Siblings7_School = "";
    String Siblings7_Fees = "";
    String Siblings7_MartialStatus = "";
    String Siblings7_Health = "";
    String Siblings8_Name = "";
    String Siblings8_Sex = "";
    String Siblings8_Age = "";
    String Siblings8_Education = "";
    String Siblings8_School = "";
    String Siblings8_Fees = "";
    String Siblings8_MartialStatus = "";
    String Siblings8_Health = "";
    String Siblings9_Name = "";
    String Siblings9_Sex = "";
    String Siblings9_Age = "";
    String Siblings9_Education = "";
    String Siblings9_School = "";
    String Siblings9_Fees = "";
    String Siblings9_MartialStatus = "";
    String Siblings9_Health = "";
    */
    
    String AssessmentReport = "";
    String AssessmentTools = "";
    String Result = "";
    
    String MedicalCare = "";
    String SpeechTherapy = "";
    String PsychiatricConsultation = "";
    String Audiology = "";
    String OrthopedicExamination = "";
    String OpthalmologicConsultation = "";
    String Physiotherapy = "";
    String VocationalTraining = "";
    String PsycologicalCounseling = "";
    String GroupTherapy = "";
    String FamilyCounseling = "";
    String BehavioralModification = "";
    String NutritionalCounseling = "";
    String AutismUnit = "";
    String OccupationalTherapy = "";
    String Sports = "";
    
    String GradClass = "Play Group";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HistoryNoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        InformantField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RefferedByField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        HomeAddressField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        PhoneNumField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PresentingComplaintsField = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        HistoryOfIllnessField = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        HeadHoldingField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        SittingField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CrawlingField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        WalkingField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        SpeechSingleWordField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CompleteSentencesField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        BladderBowelControlField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        DressingField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TakingBathWithoutHelpField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AttendingSchoolBox = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        AttendedSchoolPreviouslyBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        SchoolTypeBox = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        ProgressWithSchoolBox = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        RelationWithTeachersBox = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        RelationWithClassmatesBox = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        FatherNameField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        FDeadBox = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        FAgeDeathField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        FOccupationField = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        ATC1 = new javax.swing.JCheckBox();
        ATC2 = new javax.swing.JCheckBox();
        ATC3 = new javax.swing.JCheckBox();
        ATC4 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        C1 = new javax.swing.JCheckBox();
        C2 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        C4 = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        DisabilityInFamilyField = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AssessmentReportField = new javax.swing.JTextPane();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AssessmentToolsField = new javax.swing.JTextPane();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ResultField = new javax.swing.JTextPane();
        jLabel65 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        GradClassBox = new javax.swing.JComboBox<>();
        SubmitBtn = new javax.swing.JButton();
        Download = new javax.swing.JButton();
        DateField = new com.toedter.calendar.JDateChooser();
        DOBField = new com.toedter.calendar.JDateChooser();
        AgeField = new javax.swing.JComboBox<>();
        SexField = new javax.swing.JComboBox<>();
        BirthOrderField = new javax.swing.JComboBox<>();
        ReligionField = new javax.swing.JComboBox<>();
        FAgeField = new javax.swing.JComboBox<>();
        FEducationField = new javax.swing.JComboBox<>();
        FIncomeField = new javax.swing.JComboBox<>();
        FGeneralHealthField = new javax.swing.JComboBox<>();
        S1 = new javax.swing.JCheckBox();
        S2 = new javax.swing.JCheckBox();
        S3 = new javax.swing.JCheckBox();
        jLabel45 = new javax.swing.JLabel();
        CRS1 = new javax.swing.JCheckBox();
        CRS2 = new javax.swing.JCheckBox();
        MedicalCareField = new javax.swing.JCheckBox();
        SpeechTherapyField = new javax.swing.JCheckBox();
        PsychiatricConsultationField = new javax.swing.JCheckBox();
        AudiologyField = new javax.swing.JCheckBox();
        OrthopedicExaminationField = new javax.swing.JCheckBox();
        OpthalmologicConsultationField = new javax.swing.JCheckBox();
        PhysiotherapyField = new javax.swing.JCheckBox();
        VocationalTrainingField = new javax.swing.JCheckBox();
        PsycologicalCounselingField = new javax.swing.JCheckBox();
        GroupTherapyField = new javax.swing.JCheckBox();
        FamilyCounselingField = new javax.swing.JCheckBox();
        BehavioralModificationField = new javax.swing.JCheckBox();
        NutritionalCounselingField = new javax.swing.JCheckBox();
        OccupationalTherapyField = new javax.swing.JCheckBox();
        SportsField = new javax.swing.JCheckBox();
        AutismUnitField = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("HISTORY DATASHEET | IE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("History No:");

        HistoryNoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Name:");

        NameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Age:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Sex:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Date of Birth:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Birth Order:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Religion:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Informant:");

        InformantField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Reffered By:");

        RefferedByField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Home Address:");

        HomeAddressField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Phone Num (if Any):");

        PhoneNumField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Presenting Complaints:");

        jScrollPane1.setViewportView(PresentingComplaintsField);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("History of Illness:");

        jScrollPane3.setViewportView(HistoryOfIllnessField);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Development Milestones:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Head Holding:");

        HeadHoldingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Sitting:");

        SittingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Crawling:");

        CrawlingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Walking:");

        WalkingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Speech Single Word:");

        SpeechSingleWordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Complete Sentences:");

        CompleteSentencesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Bladder & Bowel Control");

        BladderBowelControlField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Dressing:");

        DressingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Taking Bath Without Help:");

        TakingBathWithoutHelpField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Educational Status:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Attending School:");

        AttendingSchoolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        AttendingSchoolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendingSchoolBoxActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Attended School Previously:");

        AttendedSchoolPreviouslyBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        AttendedSchoolPreviouslyBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendedSchoolPreviouslyBoxActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("School Type:");

        SchoolTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private", "Govt" }));
        SchoolTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolTypeBoxActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Progress With School Work:");

        ProgressWithSchoolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Satisfactory" }));
        ProgressWithSchoolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgressWithSchoolBoxActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Relations With Teachers:");

        RelationWithTeachersBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Good" }));
        RelationWithTeachersBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelationWithTeachersBoxActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Relations With Classmates:");

        RelationWithClassmatesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Co-operative", "Quarrelsome", "No Communication" }));
        RelationWithClassmatesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelationWithClassmatesBoxActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Family History:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Father's Name:");

        FatherNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel34.setText("Age:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("Alive:");

        FDeadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        FDeadBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDeadBoxActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("Age at Death:");

        FAgeDeathField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("Education:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Occupation:");

        FOccupationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Income:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("General Health:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Attitude Towards Target Children:");

        ATC1.setText("Loving");
        ATC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATC1ActionPerformed(evt);
            }
        });

        ATC2.setText("Over Protective");
        ATC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATC2ActionPerformed(evt);
            }
        });

        ATC3.setText("Careless");
        ATC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATC3ActionPerformed(evt);
            }
        });

        ATC4.setText("Harsh");
        ATC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATC4ActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Consanguinity:");

        C1.setText("First Cousin");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setText("Second Cousin");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setText("Other Relative");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setText("No Relative");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Any Disability In Family:");

        DisabilityInFamilyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("Siblings Attitude Towards Children:");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setText("Assessment Report:");

        jScrollPane4.setViewportView(AssessmentReportField);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setText("Assessment Tools:");

        jScrollPane5.setViewportView(AssessmentToolsField);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Result:");

        jScrollPane6.setViewportView(ResultField);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Management Plan:");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setText("Grad/Class:");

        GradClassBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Play Group", "Nursery", "Prep", "1st", "2nd", "3rd", "4th", "5th", "6th" }));
        GradClassBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradClassBoxActionPerformed(evt);
            }
        });

        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitBtn.setText("Submit Button");
        SubmitBtn.setActionCommand("Submit Data");
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

        DateField.setDateFormatString("yyyy-MM-dd");

        DOBField.setDateFormatString("yyyy-MM-dd");

        AgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        SexField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        BirthOrderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ReligionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muslim", "Christian", "Hindu", "Other" }));
        ReligionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReligionFieldActionPerformed(evt);
            }
        });

        FAgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        FEducationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nill", "Primary", "Secondary", "Intermediate", "Bachelors Graduate", "Post Graduate" }));
        FEducationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEducationFieldActionPerformed(evt);
            }
        });

        FIncomeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<10k", "10k -- 20k", "20k -- 50k", "50k -- 100k", ">100k" }));
        FIncomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIncomeFieldActionPerformed(evt);
            }
        });

        FGeneralHealthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor", "Specify:" }));
        FGeneralHealthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FGeneralHealthFieldActionPerformed(evt);
            }
        });

        S1.setText("Cooperative");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S2.setText("Harsh");
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        S3.setText("In-Different");
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Child Relationship with Siblings:");

        CRS1.setText("Cooperative");
        CRS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRS1ActionPerformed(evt);
            }
        });

        CRS2.setText("Non-Cooperative");
        CRS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRS2ActionPerformed(evt);
            }
        });

        MedicalCareField.setText("Medical Care");
        MedicalCareField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalCareFieldActionPerformed(evt);
            }
        });

        SpeechTherapyField.setText("Speech Therapy");
        SpeechTherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeechTherapyFieldActionPerformed(evt);
            }
        });

        PsychiatricConsultationField.setText("Psychiatric Consultation");
        PsychiatricConsultationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsychiatricConsultationFieldActionPerformed(evt);
            }
        });

        AudiologyField.setText("Audiology");
        AudiologyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AudiologyFieldActionPerformed(evt);
            }
        });

        OrthopedicExaminationField.setText("Orthopedic Examination");
        OrthopedicExaminationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrthopedicExaminationFieldActionPerformed(evt);
            }
        });

        OpthalmologicConsultationField.setText("Opthalmologic Consultation");
        OpthalmologicConsultationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpthalmologicConsultationFieldActionPerformed(evt);
            }
        });

        PhysiotherapyField.setText("Physiotherapy");
        PhysiotherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysiotherapyFieldActionPerformed(evt);
            }
        });

        VocationalTrainingField.setText("Vocational Training");
        VocationalTrainingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VocationalTrainingFieldActionPerformed(evt);
            }
        });

        PsycologicalCounselingField.setText("Psycological Counseling");
        PsycologicalCounselingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsycologicalCounselingFieldActionPerformed(evt);
            }
        });

        GroupTherapyField.setText("Group Therapy");
        GroupTherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupTherapyFieldActionPerformed(evt);
            }
        });

        FamilyCounselingField.setText("Family Counseling");
        FamilyCounselingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyCounselingFieldActionPerformed(evt);
            }
        });

        BehavioralModificationField.setText("Behavioral Modification");
        BehavioralModificationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BehavioralModificationFieldActionPerformed(evt);
            }
        });

        NutritionalCounselingField.setText("Nutritional Counseling");
        NutritionalCounselingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutritionalCounselingFieldActionPerformed(evt);
            }
        });

        OccupationalTherapyField.setText("Occupational Therapy");
        OccupationalTherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupationalTherapyFieldActionPerformed(evt);
            }
        });

        SportsField.setText("Sports");
        SportsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsFieldActionPerformed(evt);
            }
        });

        AutismUnitField.setText("Autism Unit");
        AutismUnitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutismUnitFieldActionPerformed(evt);
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
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PhoneNumField))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RefferedByField)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addComponent(HomeAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HistoryNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BirthOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ReligionField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SexField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(InformantField))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HeadHoldingField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SittingField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CrawlingField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(WalkingField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SpeechSingleWordField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CompleteSentencesField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BladderBowelControlField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DressingField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TakingBathWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel25)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AttendingSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AttendedSchoolPreviouslyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SchoolTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ProgressWithSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RelationWithTeachersBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RelationWithClassmatesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel32)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FGeneralHealthField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ATC1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ATC2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ATC3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ATC4))
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel62)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(C1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(C2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(C3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(C4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel43)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DisabilityInFamilyField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel33)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel34)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel35)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FDeadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FAgeDeathField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(5, 5, 5)
                                            .addComponent(jLabel37)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FEducationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel63)
                                        .addGap(191, 191, 191)
                                        .addComponent(jLabel64))
                                    .addComponent(jLabel65)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel80)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(GradClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(SubmitBtn)
                                        .addGap(32, 32, 32)
                                        .addComponent(Download))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(OpthalmologicConsultationField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PhysiotherapyField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(VocationalTrainingField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PsycologicalCounselingField))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(MedicalCareField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SpeechTherapyField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PsychiatricConsultationField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AudiologyField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OrthopedicExaminationField))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(GroupTherapyField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FamilyCounselingField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BehavioralModificationField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NutritionalCounselingField))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(AutismUnitField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(OccupationalTherapyField)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(SportsField)))))
                                .addGap(0, 17, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(S1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(S2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(S3))
                            .addComponent(jLabel45)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CRS1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CRS2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(HistoryNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(InformantField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BirthOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ReligionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(RefferedByField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(HomeAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(PhoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(HeadHoldingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(SittingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(CrawlingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(WalkingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(SpeechSingleWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(CompleteSentencesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(BladderBowelControlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(DressingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(TakingBathWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(AttendingSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(AttendedSchoolPreviouslyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(SchoolTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(ProgressWithSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(RelationWithTeachersBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(RelationWithClassmatesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(FDeadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(FAgeDeathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(FAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FEducationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(FOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(FIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FGeneralHealthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(ATC1)
                    .addComponent(ATC2)
                    .addComponent(ATC3)
                    .addComponent(ATC4))
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(C3)
                    .addComponent(C4)
                    .addComponent(jLabel43)
                    .addComponent(DisabilityInFamilyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1)
                    .addComponent(S2)
                    .addComponent(S3))
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CRS1)
                    .addComponent(CRS2))
                .addGap(30, 30, 30)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedicalCareField)
                    .addComponent(SpeechTherapyField)
                    .addComponent(PsychiatricConsultationField)
                    .addComponent(AudiologyField)
                    .addComponent(OrthopedicExaminationField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpthalmologicConsultationField)
                    .addComponent(PhysiotherapyField)
                    .addComponent(VocationalTrainingField)
                    .addComponent(PsycologicalCounselingField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GroupTherapyField)
                    .addComponent(FamilyCounselingField)
                    .addComponent(BehavioralModificationField)
                    .addComponent(NutritionalCounselingField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OccupationalTherapyField)
                    .addComponent(SportsField)
                    .addComponent(AutismUnitField))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(GradClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubmitBtn)
                    .addComponent(Download))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AttendingSchoolBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendingSchoolBoxActionPerformed
        // TODO add your handling code here:
        AttendingSchool = AttendingSchoolBox.getSelectedItem().toString();
    }//GEN-LAST:event_AttendingSchoolBoxActionPerformed

    private void AttendedSchoolPreviouslyBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendedSchoolPreviouslyBoxActionPerformed
        // TODO add your handling code here:
        AttendedSchoolPreviously = AttendedSchoolPreviouslyBox.getSelectedItem().toString();
    }//GEN-LAST:event_AttendedSchoolPreviouslyBoxActionPerformed

    private void SchoolTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchoolTypeBoxActionPerformed
        // TODO add your handling code here:
        SchoolType = SchoolTypeBox.getSelectedItem().toString();
    }//GEN-LAST:event_SchoolTypeBoxActionPerformed

    private void ProgressWithSchoolBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgressWithSchoolBoxActionPerformed
        // TODO add your handling code here:
        ProgressWithSchool = ProgressWithSchoolBox.getSelectedItem().toString();
    }//GEN-LAST:event_ProgressWithSchoolBoxActionPerformed

    private void RelationWithTeachersBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelationWithTeachersBoxActionPerformed
        // TODO add your handling code here:
        RelationWithTeacher = RelationWithTeachersBox.getSelectedItem().toString();
    }//GEN-LAST:event_RelationWithTeachersBoxActionPerformed

    private void RelationWithClassmatesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelationWithClassmatesBoxActionPerformed
        // TODO add your handling code here:
        RelationWithClassmates = RelationWithClassmatesBox.getSelectedItem().toString();
    }//GEN-LAST:event_RelationWithClassmatesBoxActionPerformed
    
    private void FDeadBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDeadBoxActionPerformed
        // TODO add your handling code here:
        FatherDead = FDeadBox.getSelectedItem().toString();
    }//GEN-LAST:event_FDeadBoxActionPerformed

    private void GradClassBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradClassBoxActionPerformed
        // TODO add your handling code here:
        GradClass = GradClassBox.getSelectedItem().toString();
    }//GEN-LAST:event_GradClassBoxActionPerformed

    
    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(true);
        C2.setSelected(false);
        C3.setSelected(false);
        C4.setSelected(false);
        Consanguinity = "First Cousin";
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(false);
        C2.setSelected(true);
        C3.setSelected(false);
        C4.setSelected(false);
        Consanguinity = "Second Cousin";
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(false);
        C2.setSelected(false);
        C3.setSelected(true);
        C4.setSelected(false);
        Consanguinity = "Other Relative";
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(false);
        C2.setSelected(false);
        C3.setSelected(false);
        C4.setSelected(true);
        Consanguinity = "No Relative";
    }//GEN-LAST:event_C4ActionPerformed

    
    private void ATC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATC1ActionPerformed
        // TODO add your handling code here:
        ATC1.setSelected(true);
        ATC2.setSelected(false);
        ATC3.setSelected(false);
        ATC4.setSelected(false);
        FatherAttitudeTowardsChildren = "Loving";
    }//GEN-LAST:event_ATC1ActionPerformed

    private void ATC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATC2ActionPerformed
        // TODO add your handling code here:
        ATC1.setSelected(false);
        ATC2.setSelected(true);
        ATC3.setSelected(false);
        ATC4.setSelected(false);
        FatherAttitudeTowardsChildren = "Over Protective";
    }//GEN-LAST:event_ATC2ActionPerformed

    private void ATC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATC3ActionPerformed
        // TODO add your handling code here:
        ATC1.setSelected(false);
        ATC2.setSelected(false);
        ATC3.setSelected(true);
        ATC4.setSelected(false);
        FatherAttitudeTowardsChildren = "Careless";
    }//GEN-LAST:event_ATC3ActionPerformed

    private void ATC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATC4ActionPerformed
        // TODO add your handling code here:
        ATC1.setSelected(false);
        ATC2.setSelected(false);
        ATC3.setSelected(false);
        ATC4.setSelected(true);
        FatherAttitudeTowardsChildren = "Harsh";
    }//GEN-LAST:event_ATC4ActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        HistoryNo = HistoryNoField.getText().toString();
        Datee = ((JTextField)DateField.getDateEditor().getUiComponent()).getText();
        Name = NameField.getText().toString();
        Age = AgeField.getSelectedItem().toString();
        Sex = SexField.getSelectedItem().toString();
        DOB = ((JTextField)DOBField.getDateEditor().getUiComponent()).getText();
        BO = BirthOrderField.getSelectedItem().toString();
        Religion = ReligionField.getSelectedItem().toString();
        Informant = InformantField.getText().toString();
        RefferedBy = RefferedByField.getText().toString();
        HomeAddress = HomeAddressField.getText().toString();
        PhoneNum = PhoneNumField.getText().toString();
        PresentingComplaints = PresentingComplaintsField.getText().toString();
        HistoryofIllness = HistoryOfIllnessField.getText().toString();
        HeadHolding = HeadHoldingField.getText().toString();
        Sitting = SittingField.getText().toString();
        Crawling = CrawlingField.getText().toString();
        Walking = WalkingField.getText().toString();
        SpeechSingleWord = SpeechSingleWordField.getText().toString();
        CompleteSentences = CompleteSentencesField.getText().toString();
        BladderBowelControl = BladderBowelControlField.getText().toString();
        Dressing = DressingField.getText().toString();
        TakingBathWithoutHelp = TakingBathWithoutHelpField.getText().toString();
        FatherName = FatherNameField.getText().toString();
        FatherAge = FAgeField.getSelectedItem().toString();
        FatherAgeAtDeath = FAgeDeathField.getText().toString();
        FatherEducation = FEducationField.getSelectedItem().toString();
        FatherOccupation = FOccupationField.getText().toString();
        FatherIncome = FIncomeField.getSelectedItem().toString();
        FatherGeneralHealth = FGeneralHealthField.getSelectedItem().toString();
        DisabilityInFamily = DisabilityInFamilyField.getText().toString();
        /*
        Siblings1_Name = SName1.getText().toString();
        Siblings1_Sex = SSex1.getText().toString();
        Siblings1_Age = SAge1.getText().toString();
        Siblings1_Education = SEducation1.getText().toString();
        Siblings1_School = SSchool1.getText().toString();
        Siblings1_Fees = SFees1.getText().toString();
        Siblings1_MartialStatus = SMartialStatus1.getText().toString();
        Siblings1_Health = SHealth1.getText().toString();
        Siblings2_Name = SName2.getText().toString();
        Siblings2_Sex = SSex2.getText().toString();
        Siblings2_Age = SAge2.getText().toString();
        Siblings2_Education = SEducation2.getText().toString();
        Siblings2_School = SSchool2.getText().toString();
        Siblings2_Fees = SFees2.getText().toString();
        Siblings2_MartialStatus = SMartialStatus2.getText().toString();
        Siblings2_Health = SHealth2.getText().toString();
        Siblings3_Name = SName3.getText().toString();
        Siblings3_Sex = SSex3.getText().toString();
        Siblings3_Age = SAge3.getText().toString();
        Siblings3_Education = SEducation3.getText().toString();
        Siblings3_School = SSchool3.getText().toString();
        Siblings3_Fees = SFees3.getText().toString();
        Siblings3_MartialStatus = SMartialStatus3.getText().toString();
        Siblings3_Health = SHealth3.getText().toString();
        Siblings4_Name = SName4.getText().toString();
        Siblings4_Sex = SSex4.getText().toString();
        Siblings4_Age = SAge4.getText().toString();
        Siblings4_Education = SEducation4.getText().toString();
        Siblings4_School = SSchool4.getText().toString();
        Siblings4_Fees = SFees4.getText().toString();
        Siblings4_MartialStatus = SMartialStatus4.getText().toString();
        Siblings4_Health = SHealth4.getText().toString();
        Siblings5_Name = SName5.getText().toString();
        Siblings5_Sex = SSex5.getText().toString();
        Siblings5_Age = SAge5.getText().toString();
        Siblings5_Education = SEducation5.getText().toString();
        Siblings5_School = SSchool5.getText().toString();
        Siblings5_Fees = SFees5.getText().toString();
        Siblings5_MartialStatus = SMartialStatus5.getText().toString();
        Siblings5_Health = SHealth5.getText().toString();
        Siblings6_Name = SName6.getText().toString();
        Siblings6_Sex = SSex6.getText().toString();
        Siblings6_Age = SAge6.getText().toString();
        Siblings6_Education = SEducation6.getText().toString();
        Siblings6_School = SSchool6.getText().toString();
        Siblings6_Fees = SFees6.getText().toString();
        Siblings6_MartialStatus = SMartialStatus6.getText().toString();
        Siblings6_Health = SHealth6.getText().toString();
        Siblings7_Name = SName7.getText().toString();
        Siblings7_Sex = SSex7.getText().toString();
        Siblings7_Age = SAge7.getText().toString();
        Siblings7_Education = SEducation7.getText().toString();
        Siblings7_School = SSchool7.getText().toString();
        Siblings7_Fees = SFees7.getText().toString();
        Siblings7_MartialStatus = SMartialStatus7.getText().toString();
        Siblings7_Health = SHealth7.getText().toString();
        Siblings8_Name = SName8.getText().toString();
        Siblings8_Sex = SSex8.getText().toString();
        Siblings8_Age = SAge8.getText().toString();
        Siblings8_Education = SEducation8.getText().toString();
        Siblings8_School = SSchool8.getText().toString();
        Siblings8_Fees = SFees8.getText().toString();
        Siblings8_MartialStatus = SMartialStatus8.getText().toString();
        Siblings8_Health = SHealth8.getText().toString();
        Siblings9_Name = SName9.getText().toString();
        Siblings9_Sex = SSex9.getText().toString();
        Siblings9_Age = SAge9.getText().toString();
        Siblings9_Education = SEducation9.getText().toString();
        Siblings9_School = SSchool9.getText().toString();
        Siblings9_Fees = SFees9.getText().toString();
        Siblings9_MartialStatus = SMartialStatus9.getText().toString();
        Siblings9_Health = SHealth9.getText().toString();
        */
        AssessmentReport = AssessmentReportField.getText().toString();
        AssessmentTools = AssessmentToolsField.getText().toString();
        Result = ResultField.getText().toString();
        MedicalCare = String.valueOf(MedicalCareField.isSelected());
        SpeechTherapy = String.valueOf(SpeechTherapyField.isSelected());
        PsychiatricConsultation = String.valueOf(PsychiatricConsultationField.isSelected());
        Audiology = String.valueOf(AudiologyField.isSelected());
        OrthopedicExamination = String.valueOf(OrthopedicExaminationField.isSelected());
        OpthalmologicConsultation = String.valueOf(OpthalmologicConsultationField.isSelected());
        Physiotherapy = String.valueOf(PhysiotherapyField.isSelected());
        VocationalTraining = String.valueOf(VocationalTrainingField.isSelected());
        PsycologicalCounseling = String.valueOf(PsycologicalCounselingField.isSelected());
        GroupTherapy = String.valueOf(GroupTherapyField.isSelected());
        FamilyCounseling = String.valueOf(FamilyCounselingField.isSelected());
        BehavioralModification = String.valueOf(BehavioralModificationField.isSelected());
        NutritionalCounseling = String.valueOf(NutritionalCounselingField.isSelected());
        AutismUnit = String.valueOf(AutismUnitField.isSelected());
        OccupationalTherapy = String.valueOf(OccupationalTherapyField.isSelected());
        Sports = String.valueOf(SportsField.isSelected());
                 
        if(!Type.equals("Delete") && !Type.equals("Update"))
        {
            try
            {
                FileWriter writer = new FileWriter("IE_HistoryDatasheet.txt", true);
                writer.append(Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(HistoryNo);
                writer.append(System.getProperty("line.separator"));
                writer.append(Datee);
                writer.append(System.getProperty("line.separator"));
                writer.append(Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(DOB);
                writer.append(System.getProperty("line.separator"));
                writer.append(BO);
                writer.append(System.getProperty("line.separator"));
                writer.append(Religion);
                writer.append(System.getProperty("line.separator"));
                writer.append(Informant);
                writer.append(System.getProperty("line.separator"));
                writer.append(RefferedBy);
                writer.append(System.getProperty("line.separator"));
                writer.append(HomeAddress);
                writer.append(System.getProperty("line.separator"));
                writer.append(PhoneNum);
                writer.append(System.getProperty("line.separator"));
                writer.append(PresentingComplaints);
                writer.append(System.getProperty("line.separator"));
                writer.append(HistoryofIllness);
                writer.append(System.getProperty("line.separator"));
                writer.append(HeadHolding);
                writer.append(System.getProperty("line.separator"));
                writer.append(Sitting);
                writer.append(System.getProperty("line.separator"));
                writer.append(Crawling);
                writer.append(System.getProperty("line.separator"));
                writer.append(Walking);
                writer.append(System.getProperty("line.separator"));
                writer.append(SpeechSingleWord);
                writer.append(System.getProperty("line.separator"));
                writer.append(CompleteSentences);
                writer.append(System.getProperty("line.separator"));
                writer.append(BladderBowelControl);
                writer.append(System.getProperty("line.separator"));
                writer.append(Dressing);
                writer.append(System.getProperty("line.separator"));
                writer.append(TakingBathWithoutHelp);
                writer.append(System.getProperty("line.separator"));
                writer.append(AttendingSchool);
                writer.append(System.getProperty("line.separator"));
                writer.append(AttendedSchoolPreviously);
                writer.append(System.getProperty("line.separator"));
                writer.append(SchoolType);
                writer.append(System.getProperty("line.separator"));
                writer.append(ProgressWithSchool);
                writer.append(System.getProperty("line.separator"));
                writer.append(RelationWithTeacher);
                writer.append(System.getProperty("line.separator"));
                writer.append(RelationWithClassmates);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherName);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherDead);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherAgeAtDeath);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherEducation);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherOccupation);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherIncome);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherGeneralHealth);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherAttitudeTowardsChildren);
                writer.append(System.getProperty("line.separator"));
                writer.append(Consanguinity);
                writer.append(System.getProperty("line.separator"));
                writer.append(DisabilityInFamily);
                writer.append(System.getProperty("line.separator"));
                /*
                writer.append(Siblings1_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings1_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings2_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings3_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings4_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings5_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings6_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings7_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings8_Health);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_Age);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_Education);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_School);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_Fees);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_MartialStatus);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings9_Health);
                */
                writer.append(SiblingsAttitude);
                writer.append(System.getProperty("line.separator"));
                writer.append(ChildRelation);
                writer.append(System.getProperty("line.separator"));
                writer.append(AssessmentReport);
                writer.append(System.getProperty("line.separator"));
                writer.append(AssessmentTools);
                writer.append(System.getProperty("line.separator"));
                writer.append(Result);
                writer.append(System.getProperty("line.separator"));
                writer.append(MedicalCare);
                writer.append(System.getProperty("line.separator"));
                writer.append(SpeechTherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(PsychiatricConsultation);
                writer.append(System.getProperty("line.separator"));
                writer.append(Audiology);
                writer.append(System.getProperty("line.separator"));
                writer.append(OrthopedicExamination);
                writer.append(System.getProperty("line.separator"));
                writer.append(OpthalmologicConsultation);
                writer.append(System.getProperty("line.separator"));
                writer.append(VocationalTraining);
                writer.append(System.getProperty("line.separator"));
                writer.append(PsycologicalCounseling);
                writer.append(System.getProperty("line.separator"));
                writer.append(Physiotherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(GroupTherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(FamilyCounseling);
                writer.append(System.getProperty("line.separator"));
                writer.append(BehavioralModification);
                writer.append(System.getProperty("line.separator"));
                writer.append(NutritionalCounseling);
                writer.append(System.getProperty("line.separator"));
                writer.append(AutismUnit);
                writer.append(System.getProperty("line.separator"));
                writer.append(OccupationalTherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(Sports);
                writer.append(System.getProperty("line.separator"));
                writer.append(GradClass);
                writer.append(System.getProperty("line.separator"));
                writer.append("--END--");
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
            File oldFile = new File("IE_HistoryDatasheet.txt");
            File newFile = new File(tempFile);
            try
            {
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner myRead = new Scanner(new File("IE_HistoryDatasheet.txt"));
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(!NameToUse.equals(data))
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
                File dump = new File("IE_HistoryDatasheet.txt");
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
            File oldFile = new File("IE_HistoryDatasheet.txt");
            File newFile = new File(tempFile);
            try
            {
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner myRead = new Scanner(new File("IE_HistoryDatasheet.txt"));
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(!NameToUse.equals(data))
                    {
                        pw.println(data);
                    }
                    else
                    {
                        Name = NameField.getText().toString();
                        pw.println(Name);
                        HistoryNo = HistoryNoField.getText().toString();
                        pw.println(HistoryNo);
                        Datee = ((JTextField)DateField.getDateEditor().getUiComponent()).getText();
                        pw.println(Datee);
                        Age = AgeField.getSelectedItem().toString();
                        pw.println(Age);
                        Sex = SexField.getSelectedItem().toString();
                        pw.println(Sex);
                        DOB = ((JTextField)DOBField.getDateEditor().getUiComponent()).getText();
                        pw.println(DOB);
                        BO = BirthOrderField.getSelectedItem().toString();
                        pw.println(BO);
                        Religion = ReligionField.getSelectedItem().toString();
                        pw.println(Religion);
                        Informant = InformantField.getText().toString();
                        pw.println(Informant);
                        RefferedBy = RefferedByField.getText().toString();
                        pw.println(RefferedBy);
                        HomeAddress = HomeAddressField.getText().toString();
                        pw.println(HomeAddress);
                        PhoneNum = PhoneNumField.getText().toString();
                        pw.println(PhoneNum);
                        PresentingComplaints = PresentingComplaintsField.getText().toString();
                        pw.println(PresentingComplaints);
                        HistoryofIllness = HistoryOfIllnessField.getText().toString();
                        pw.println(HistoryofIllness);
                        HeadHolding = HeadHoldingField.getText().toString();
                        pw.println(HeadHolding);
                        Sitting = SittingField.getText().toString();
                        pw.println(Sitting);
                        Crawling = CrawlingField.getText().toString();
                        pw.println(Crawling);
                        Walking = WalkingField.getText().toString();
                        pw.println(Walking);
                        SpeechSingleWord = SpeechSingleWordField.getText().toString();
                        pw.println(SpeechSingleWord);
                        CompleteSentences = CompleteSentencesField.getText().toString();
                        pw.println(CompleteSentences);
                        BladderBowelControl = BladderBowelControlField.getText().toString();
                        pw.println(BladderBowelControl);
                        Dressing = DressingField.getText().toString();
                        pw.println(Dressing);
                        TakingBathWithoutHelp = TakingBathWithoutHelpField.getText().toString();
                        pw.println(TakingBathWithoutHelp);
                        AttendingSchool = AttendingSchoolBox.getSelectedItem().toString();
                        pw.println(AttendingSchool);
                        AttendedSchoolPreviously = AttendedSchoolPreviouslyBox.getSelectedItem().toString();
                        pw.println(AttendedSchoolPreviously);
                        SchoolType = SchoolTypeBox.getSelectedItem().toString();
                        pw.println(SchoolType);
                        ProgressWithSchool = ProgressWithSchoolBox.getSelectedItem().toString();
                        pw.println(ProgressWithSchool);
                        RelationWithTeacher = RelationWithTeachersBox.getSelectedItem().toString();
                        pw.println(RelationWithTeacher);
                        RelationWithClassmates = RelationWithClassmatesBox.getSelectedItem().toString();
                        pw.println(RelationWithClassmates);
                        FatherName = FatherNameField.getText().toString();
                        pw.println(FatherName);
                        FatherAge = FAgeField.getSelectedItem().toString();
                        pw.println(FatherAge);
                        FatherDead = FDeadBox.getSelectedItem().toString();
                        pw.println(FatherDead);
                        FatherAgeAtDeath = FAgeDeathField.getText().toString();
                        pw.println(FatherAgeAtDeath);
                        FatherEducation = FEducationField.getSelectedItem().toString();
                        pw.println(FatherEducation);
                        FatherOccupation = FOccupationField.getText().toString();
                        pw.println(FatherOccupation);
                        FatherIncome = FIncomeField.getSelectedItem().toString();
                        pw.println(FatherIncome);
                        FatherGeneralHealth = FGeneralHealthField.getSelectedItem().toString();
                        pw.println(FatherGeneralHealth);
                        if(ATC1.isSelected()==true)
                        {
                            FatherAttitudeTowardsChildren = "Loving";
                        }else if(ATC2.isSelected()==true)
                        {
                            FatherAttitudeTowardsChildren = "Over Protective";
                        }else if(ATC3.isSelected()==true)
                        {
                            FatherAttitudeTowardsChildren = "Careless";
                        }else if(ATC4.isSelected()==true)
                        {
                            FatherAttitudeTowardsChildren = "Harsh";
                        }
                        pw.println(FatherAttitudeTowardsChildren);
                        if(C1.isSelected()==true)
                        {
                            Consanguinity = "First Cousin";
                        }else if(C2.isSelected()==true)
                        {
                            Consanguinity = "Second Cousin";
                        }else if(C3.isSelected()==true)
                        {
                            Consanguinity = "Other Relative";
                        }else if(C4.isSelected()==true)
                        {
                            Consanguinity = "No Relative";
                        }
                        pw.println(Consanguinity);
                        DisabilityInFamily = DisabilityInFamilyField.getText().toString();
                        pw.println(DisabilityInFamily);
                        if(S1.isSelected()==true)
                        {
                            SiblingsAttitude = "Cooperative";
                        }else if(S2.isSelected()==true)
                        {
                            SiblingsAttitude = "Harsh";
                        }else if(S3.isSelected()==true)
                        {
                            SiblingsAttitude = "In-Different";
                        }
                        pw.println(SiblingsAttitude);
                        if(CRS1.isSelected()==true)
                        {
                            ChildRelation = "Cooperative";
                        }else if(CRS2.isSelected()==true)
                        {
                            ChildRelation = "Non-Cooperative";
                        }
                        pw.println(ChildRelation);
                        /*
                        Siblings1_Name = SName1.getText().toString();
                        pw.println(Siblings1_Name);
                        Siblings1_Sex = SSex1.getText().toString();
                        pw.println(Siblings1_Sex);
                        Siblings1_Age = SAge1.getText().toString();
                        pw.println(Siblings1_Age);
                        Siblings1_Education = SEducation1.getText().toString();
                        pw.println(Siblings1_Education);
                        Siblings1_School = SSchool1.getText().toString();
                        pw.println(Siblings1_School);
                        Siblings1_Fees = SFees1.getText().toString();
                        pw.println(Siblings1_Fees);
                        Siblings1_MartialStatus = SMartialStatus1.getText().toString();
                        pw.println(Siblings1_MartialStatus);
                        Siblings1_Health = SHealth1.getText().toString();
                        pw.println(Siblings1_Health);
                        Siblings2_Name = SName2.getText().toString();
                        pw.println(Siblings2_Name);
                        Siblings2_Sex = SSex2.getText().toString();
                        pw.println(Siblings2_Sex);
                        Siblings2_Age = SAge2.getText().toString();
                        pw.println(Siblings2_Age);
                        Siblings2_Education = SEducation2.getText().toString();
                        pw.println(Siblings2_Education);
                        Siblings2_School = SSchool1.getText().toString();
                        pw.println(Siblings2_School);
                        Siblings2_Fees = SFees2.getText().toString();
                        pw.println(Siblings2_Fees);
                        Siblings2_MartialStatus = SMartialStatus2.getText().toString();
                        pw.println(Siblings2_MartialStatus);
                        Siblings2_Health = SHealth2.getText().toString();
                        pw.println(Siblings2_Health);
                        Siblings3_Name = SName3.getText().toString();
                        pw.println(Siblings3_Name);
                        Siblings3_Sex = SSex3.getText().toString();
                        pw.println(Siblings3_Sex);
                        Siblings3_Age = SAge3.getText().toString();
                        pw.println(Siblings3_Age);
                        Siblings3_Education = SEducation3.getText().toString();
                        pw.println(Siblings3_Education);
                        Siblings3_School = SSchool3.getText().toString();
                        pw.println(Siblings3_School);
                        Siblings3_Fees = SFees3.getText().toString();
                        pw.println(Siblings3_Fees);
                        Siblings3_MartialStatus = SMartialStatus3.getText().toString();
                        pw.println(Siblings3_MartialStatus);
                        Siblings3_Health = SHealth3.getText().toString();
                        pw.println(Siblings3_Health);
                        Siblings4_Name = SName4.getText().toString();
                        pw.println(Siblings4_Name);
                        Siblings4_Sex = SSex4.getText().toString();
                        pw.println(Siblings4_Sex);
                        Siblings4_Age = SAge4.getText().toString();
                        pw.println(Siblings4_Age);
                        Siblings4_Education = SEducation4.getText().toString();
                        pw.println(Siblings4_Education);
                        Siblings4_School = SSchool4.getText().toString();
                        pw.println(Siblings4_School);
                        Siblings4_Fees = SFees4.getText().toString();
                        pw.println(Siblings4_Fees);
                        Siblings4_MartialStatus = SMartialStatus4.getText().toString();
                        pw.println(Siblings4_MartialStatus);
                        Siblings4_Health = SHealth4.getText().toString();
                        pw.println(Siblings4_Health);
                        Siblings5_Name = SName5.getText().toString();
                        pw.println(Siblings5_Name);
                        Siblings5_Sex = SSex5.getText().toString();
                        pw.println(Siblings5_Sex);
                        Siblings5_Age = SAge5.getText().toString();
                        pw.println(Siblings5_Age);
                        Siblings5_Education = SEducation5.getText().toString();
                        pw.println(Siblings5_Education);
                        Siblings5_School = SSchool5.getText().toString();
                        pw.println(Siblings5_School);
                        Siblings5_Fees = SFees5.getText().toString();
                        pw.println(Siblings5_Fees);
                        Siblings5_MartialStatus = SMartialStatus5.getText().toString();
                        pw.println(Siblings5_MartialStatus);
                        Siblings5_Health = SHealth5.getText().toString();
                        pw.println(Siblings5_Health);
                        Siblings6_Name = SName6.getText().toString();
                        pw.println(Siblings6_Name);
                        Siblings6_Sex = SSex6.getText().toString();
                        pw.println(Siblings6_Sex);
                        Siblings6_Age = SAge6.getText().toString();
                        pw.println(Siblings6_Age);
                        Siblings6_Education = SEducation6.getText().toString();
                        pw.println(Siblings6_Education);
                        Siblings6_School = SSchool6.getText().toString();
                        pw.println(Siblings6_School);
                        Siblings6_Fees = SFees6.getText().toString();
                        pw.println(Siblings6_Fees);
                        Siblings6_MartialStatus = SMartialStatus6.getText().toString();
                        pw.println(Siblings6_MartialStatus);
                        Siblings6_Health = SHealth6.getText().toString();
                        pw.println(Siblings6_Health);
                        Siblings7_Name = SName7.getText().toString();
                        pw.println(Siblings7_Name);
                        Siblings7_Sex = SSex7.getText().toString();
                        pw.println(Siblings7_Sex);
                        Siblings7_Age = SAge7.getText().toString();
                        pw.println(Siblings7_Age);
                        Siblings7_Education = SEducation7.getText().toString();
                        pw.println(Siblings7_Education);
                        Siblings7_School = SSchool7.getText().toString();
                        pw.println(Siblings7_School);
                        Siblings7_Fees = SFees7.getText().toString();
                        pw.println(Siblings7_Fees);
                        Siblings7_MartialStatus = SMartialStatus7.getText().toString();
                        pw.println(Siblings7_MartialStatus);
                        Siblings7_Health = SHealth7.getText().toString();
                        pw.println(Siblings7_Health);
                        Siblings8_Name = SName8.getText().toString();
                        pw.println(Siblings8_Name);
                        Siblings8_Sex = SSex8.getText().toString();
                        pw.println(Siblings8_Sex);
                        Siblings8_Age = SAge8.getText().toString();
                        pw.println(Siblings8_Age);
                        Siblings8_Education = SEducation8.getText().toString();
                        pw.println(Siblings8_Education);
                        Siblings8_School = SSchool8.getText().toString();
                        pw.println(Siblings8_School);
                        Siblings8_Fees = SFees8.getText().toString();
                        pw.println(Siblings8_Fees);
                        Siblings8_MartialStatus = SMartialStatus8.getText().toString();
                        pw.println(Siblings8_MartialStatus);
                        Siblings8_Health = SHealth8.getText().toString();
                        pw.println(Siblings8_Health);
                        Siblings9_Name = SName9.getText().toString();
                        pw.println(Siblings9_Name);
                        Siblings9_Sex = SSex9.getText().toString();
                        pw.println(Siblings9_Sex);
                        Siblings9_Age = SAge9.getText().toString();
                        pw.println(Siblings9_Age);
                        Siblings9_Education = SEducation9.getText().toString();
                        pw.println(Siblings9_Education);
                        Siblings9_School = SSchool9.getText().toString();
                        pw.println(Siblings9_School);
                        Siblings9_Fees = SFees9.getText().toString();
                        pw.println(Siblings9_Fees);
                        Siblings9_MartialStatus = SMartialStatus9.getText().toString();
                        pw.println(Siblings9_MartialStatus);
                        Siblings9_Health = SHealth9.getText().toString();
                        pw.println(Siblings9_Health);
                        */
                        AssessmentReport = AssessmentReportField.getText().toString();
                        pw.println(AssessmentReport);
                        AssessmentTools = AssessmentToolsField.getText().toString();
                        pw.println(AssessmentTools);
                        Result = ResultField.getText().toString();
                        pw.println(Result);
                        MedicalCare = String.valueOf(MedicalCareField.isSelected());
                        pw.println(MedicalCare);
                        SpeechTherapy = String.valueOf(SpeechTherapyField.isSelected());
                        pw.println(SpeechTherapy);
                        PsychiatricConsultation = String.valueOf(PsychiatricConsultationField.isSelected());
                        pw.println(PsychiatricConsultation);
                        Audiology = String.valueOf(AudiologyField.isSelected());
                        pw.println(Audiology);
                        OrthopedicExamination = String.valueOf(OrthopedicExaminationField.isSelected());
                        pw.println(OrthopedicExamination);
                        OpthalmologicConsultation = String.valueOf(OpthalmologicConsultationField.isSelected());
                        pw.println(OpthalmologicConsultation);
                        VocationalTraining = String.valueOf(VocationalTrainingField.isSelected());
                        pw.println(VocationalTraining);
                        PsycologicalCounseling = String.valueOf(PsycologicalCounselingField.isSelected());
                        pw.println(PsycologicalCounseling);
                        Physiotherapy = String.valueOf(PhysiotherapyField.isSelected());
                        pw.println(Physiotherapy);
                        GroupTherapy = String.valueOf(GroupTherapyField.isSelected());
                        pw.println(GroupTherapy);
                        FamilyCounseling = String.valueOf(FamilyCounselingField.isSelected());
                        pw.println(FamilyCounseling);
                        BehavioralModification = String.valueOf(BehavioralModificationField.isSelected());
                        pw.println(BehavioralModification);
                        NutritionalCounseling = String.valueOf(NutritionalCounselingField.isSelected());
                        pw.println(NutritionalCounseling);
                        AutismUnit = String.valueOf(AutismUnitField.isSelected());
                        pw.println(AutismUnit);
                        OccupationalTherapy = String.valueOf(OccupationalTherapyField.isSelected());
                        pw.println(OccupationalTherapy);
                        Sports = String.valueOf(SportsField.isSelected());
                        pw.println(Sports);
                        GradClass = GradClassBox.getSelectedItem().toString();
                        pw.println(GradClass);
                        pw.println("--END--");
                        
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
                File dump = new File("IE_HistoryDatasheet.txt");
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

    private void ReligionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReligionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReligionFieldActionPerformed

    private void FEducationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEducationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEducationFieldActionPerformed

    private void FIncomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIncomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIncomeFieldActionPerformed

    private void FGeneralHealthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FGeneralHealthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FGeneralHealthFieldActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        // TODO add your handling code here:
        S1.setSelected(true);
        S2.setSelected(false);
        S3.setSelected(false);
        SiblingsAttitude = "Cooperative";
    }//GEN-LAST:event_S1ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed
        // TODO add your handling code here:
        S1.setSelected(false);
        S2.setSelected(true);
        S3.setSelected(false);
        SiblingsAttitude = "Harsh";
    }//GEN-LAST:event_S2ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed
        // TODO add your handling code here:
        S1.setSelected(false);
        S2.setSelected(false);
        S3.setSelected(true);
        SiblingsAttitude = "In-Different";
    }//GEN-LAST:event_S3ActionPerformed

    private void CRS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRS1ActionPerformed
        // TODO add your handling code here:
        CRS1.setSelected(true);
        CRS2.setSelected(false);
        ChildRelation = "Cooperative";
    }//GEN-LAST:event_CRS1ActionPerformed

    private void CRS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRS2ActionPerformed
        // TODO add your handling code here:
        CRS1.setSelected(false);
        CRS2.setSelected(true);
        ChildRelation = "Non-Cooperative";
    }//GEN-LAST:event_CRS2ActionPerformed

    private void MedicalCareFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalCareFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicalCareFieldActionPerformed

    private void SpeechTherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeechTherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeechTherapyFieldActionPerformed

    private void PsychiatricConsultationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsychiatricConsultationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsychiatricConsultationFieldActionPerformed

    private void AudiologyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AudiologyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AudiologyFieldActionPerformed

    private void OrthopedicExaminationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrthopedicExaminationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrthopedicExaminationFieldActionPerformed

    private void OpthalmologicConsultationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpthalmologicConsultationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpthalmologicConsultationFieldActionPerformed

    private void PhysiotherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysiotherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhysiotherapyFieldActionPerformed

    private void VocationalTrainingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VocationalTrainingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VocationalTrainingFieldActionPerformed

    private void PsycologicalCounselingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsycologicalCounselingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsycologicalCounselingFieldActionPerformed

    private void GroupTherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupTherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupTherapyFieldActionPerformed

    private void FamilyCounselingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyCounselingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FamilyCounselingFieldActionPerformed

    private void BehavioralModificationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BehavioralModificationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BehavioralModificationFieldActionPerformed

    private void NutritionalCounselingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutritionalCounselingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NutritionalCounselingFieldActionPerformed

    private void OccupationalTherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupationalTherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccupationalTherapyFieldActionPerformed

    private void SportsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SportsFieldActionPerformed

    private void AutismUnitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutismUnitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutismUnitFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ATC1;
    private javax.swing.JCheckBox ATC2;
    private javax.swing.JCheckBox ATC3;
    private javax.swing.JCheckBox ATC4;
    private javax.swing.JComboBox<String> AgeField;
    private javax.swing.JTextPane AssessmentReportField;
    private javax.swing.JTextPane AssessmentToolsField;
    private javax.swing.JComboBox<String> AttendedSchoolPreviouslyBox;
    private javax.swing.JComboBox<String> AttendingSchoolBox;
    private javax.swing.JCheckBox AudiologyField;
    private javax.swing.JCheckBox AutismUnitField;
    private javax.swing.JCheckBox BehavioralModificationField;
    private javax.swing.JComboBox<String> BirthOrderField;
    private javax.swing.JTextField BladderBowelControlField;
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C4;
    private javax.swing.JCheckBox CRS1;
    private javax.swing.JCheckBox CRS2;
    private javax.swing.JTextField CompleteSentencesField;
    private javax.swing.JTextField CrawlingField;
    private com.toedter.calendar.JDateChooser DOBField;
    private com.toedter.calendar.JDateChooser DateField;
    private javax.swing.JTextField DisabilityInFamilyField;
    private javax.swing.JButton Download;
    private javax.swing.JTextField DressingField;
    private javax.swing.JTextField FAgeDeathField;
    private javax.swing.JComboBox<String> FAgeField;
    private javax.swing.JComboBox<String> FDeadBox;
    private javax.swing.JComboBox<String> FEducationField;
    private javax.swing.JComboBox<String> FGeneralHealthField;
    private javax.swing.JComboBox<String> FIncomeField;
    private javax.swing.JTextField FOccupationField;
    private javax.swing.JCheckBox FamilyCounselingField;
    private javax.swing.JTextField FatherNameField;
    private javax.swing.JComboBox<String> GradClassBox;
    private javax.swing.JCheckBox GroupTherapyField;
    private javax.swing.JTextField HeadHoldingField;
    private javax.swing.JTextField HistoryNoField;
    private javax.swing.JTextPane HistoryOfIllnessField;
    private javax.swing.JTextField HomeAddressField;
    private javax.swing.JTextField InformantField;
    private javax.swing.JCheckBox MedicalCareField;
    private javax.swing.JTextField NameField;
    private javax.swing.JCheckBox NutritionalCounselingField;
    private javax.swing.JCheckBox OccupationalTherapyField;
    private javax.swing.JCheckBox OpthalmologicConsultationField;
    private javax.swing.JCheckBox OrthopedicExaminationField;
    private javax.swing.JTextField PhoneNumField;
    private javax.swing.JCheckBox PhysiotherapyField;
    private javax.swing.JTextPane PresentingComplaintsField;
    private javax.swing.JComboBox<String> ProgressWithSchoolBox;
    private javax.swing.JCheckBox PsychiatricConsultationField;
    private javax.swing.JCheckBox PsycologicalCounselingField;
    private javax.swing.JTextField RefferedByField;
    private javax.swing.JComboBox<String> RelationWithClassmatesBox;
    private javax.swing.JComboBox<String> RelationWithTeachersBox;
    private javax.swing.JComboBox<String> ReligionField;
    private javax.swing.JTextPane ResultField;
    private javax.swing.JCheckBox S1;
    private javax.swing.JCheckBox S2;
    private javax.swing.JCheckBox S3;
    private javax.swing.JComboBox<String> SchoolTypeBox;
    private javax.swing.JComboBox<String> SexField;
    private javax.swing.JTextField SittingField;
    private javax.swing.JTextField SpeechSingleWordField;
    private javax.swing.JCheckBox SpeechTherapyField;
    private javax.swing.JCheckBox SportsField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField TakingBathWithoutHelpField;
    private javax.swing.JCheckBox VocationalTrainingField;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
