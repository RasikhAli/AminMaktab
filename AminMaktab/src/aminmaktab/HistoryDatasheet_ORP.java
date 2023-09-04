/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminmaktab;

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
public class HistoryDatasheet_ORP extends javax.swing.JInternalFrame {

    /**
     * Creates new form HistoryDatasheet_ORP
     */
    String NameToUse = "";
    String Type = "";
    public HistoryDatasheet_ORP() throws ParseException {
        initComponents();
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateField.setDate(datee);
        DOBField.setDate(datee);
    }
    public HistoryDatasheet_ORP(String GetName, String GetType) throws ParseException {
        initComponents();
        NameToUse = GetName;
        Type = GetType;
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateField.setDate(datee);
        DOBField.setDate(datee);
        
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
                    if(data.equals("History Datasheet"))
                    {
                        data = myRead.nextLine();
                        if(data.equals(NameToUse))
                        {
                            NameField.setText(data);
                            data = myRead.nextLine();
                            RegistrationNoField.setText(data);
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
                            if(data.equals("Physical"))
                            {
                                PT1.setSelected(true);
                            }
                            else if(data.equals("Psychiatry"))
                            {
                                PT2.setSelected(true);
                            }
                            else if(data.equals("Taweez Ganda"))
                            {
                                PT3.setSelected(true);
                            }
                            else if(data.equals("Hakeem"))
                            {
                                PT4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            FatherNameField.setText(data);
                            data = myRead.nextLine();
                            MAgeField.setSelectedItem(data);
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
                                FATC1.setSelected(true);
                            }else if(data.equals("Over Protective"))
                            {
                                FATC2.setSelected(true);
                            }else if(data.equals("Careless"))
                            {
                                FATC3.setSelected(true);
                            }else if(data.equals("Harsh"))
                            {
                                FATC4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            MotherNameField.setText(data);
                            data = myRead.nextLine();
                            MAgeField.setSelectedItem(data);
                            data = myRead.nextLine();
                            MDeadBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            MAgeDeathField.setText(data);
                            data = myRead.nextLine();
                            MEducationField.setSelectedItem(data);
                            data = myRead.nextLine();
                            MOccupationField.setText(data);
                            data = myRead.nextLine();
                            MIncomeField.setSelectedItem(data);
                            data = myRead.nextLine();
                            MGeneralHealthField.setSelectedItem(data);
                            data = myRead.nextLine();
                            if(data.equals("Loving"))
                            {
                                MATC1.setSelected(true);
                            }else if(data.equals("Over Protective"))
                            {
                                MATC2.setSelected(true);
                            }else if(data.equals("Careless"))
                            {
                                MATC3.setSelected(true);
                            }else if(data.equals("Harsh"))
                            {
                                MATC4.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Normal"))
                            {
                                MR1.setSelected(true);
                            }else if(data.equals("Conflicting"))
                            {
                                MR2.setSelected(true);
                            }else if(data.equals("Separation"))
                            {
                                MR3.setSelected(true);
                            }else if(data.equals("Divorce"))
                            {
                                MR4.setSelected(true);
                            }else if(data.equals("Widow"))
                            {
                                MR5.setSelected(true);
                            }
                            data = myRead.nextLine();
                            if(data.equals("Nuclear"))
                            {
                                ToF1.setSelected(true);
                            }else if(data.equals("Joint"))
                            {
                                ToF2.setSelected(true);
                            }else if(data.equals("Extended"))
                            {
                                ToF3.setSelected(true);
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
                            /*
                            data = myRead.nextLine();
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
                            FamilyWillingToContributeBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            ContributeAmountField.setText(data);
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
                            data = myRead.nextLine();
                            EarlySulkingField.setSelectedItem(data);
                            data = myRead.nextLine();
                            SocialSmileField.setText(data);
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
                            TakingBathWithoutHelpField.setText(data);
                            data = myRead.nextLine();
                            if(data.equals("Active"))
                            {
                                GO1.setSelected(true);
                            }
                            else if(data.equals("Passive"))
                            {
                                GO2.setSelected(true);
                            }
                            data = myRead.nextLine();
                            AppearanceField.setSelectedItem(data);
                            data = myRead.nextLine();
                            EyeContactField.setSelectedItem(data);
                            data = myRead.nextLine();
                            ComplianceField.setSelectedItem(data);
                            data = myRead.nextLine();
                            OnFeetField.setSelectedItem(data);
                            data = myRead.nextLine();
                            HobbiesField.setSelectedItem(data);
                            data = myRead.nextLine();
                            TalkAndSampleofTalkField.setText(data);
                            data = myRead.nextLine();
                            AttentionSpanAndConcentrationField.setText(data);
                            data = myRead.nextLine();
                            ComprehensionField.setText(data);
                            data = myRead.nextLine();
                            VisualMotorBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            FineMotorBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            GrossMotorBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            InterestAndHobbiesField.setText(data);
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
                            AnyOtherProblemField.setText(data);
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
        if(Type.equals("Delete"))
        {
            Download.setVisible(false);
            SubmitBtn.setText("Delete Record");
        }
        else if(Type.equals("Update"))
        {
            Download.setVisible(false);
            SubmitBtn.setText("Update Data");
        }
        else if(Type.equals("Read"))
        {
            SubmitBtn.setVisible(false);
            Download.setVisible(true);
        }
    }
    String RegistrationNo= "";
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
    String PastTreatment = "";
    
    String FatherName = "";
    String FatherAge = "";
    String FatherDead = "Yes";
    String FatherAgeAtDeath = "";
    String FatherEducation = "";
    String FatherOccupation = "";
    String FatherIncome = "";
    String FatherGeneralHealth = "";
    String FatherAttitudeTowardsChildren = "";
    String MotherName = "";
    String MotherAge = "";
    String MotherDead = "Yes";
    String MotherAgeAtDeath = "";
    String MotherEducation = "";
    String MotherOccupation = "";
    String MotherIncome = "";
    String MotherGeneralHealth = "";
    String MotherAttitudeTowardsChildren = "";
    String MartialRelationShip = "";
    String TypeofFamily = "";
    
    String Consanguinity = "";
    String DisabilityInFamily = "";
    
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
    
    String SiblingsAttitude = "";
    String ChildRelation = "";
    
    String FamilyWillingToContribute = "Yes";
    String ContributeAmount = "";
    String SiblingAttitudeTowardsChildren = "";
    String ChildRelationshipWithSiblings = "";
    
    String EarlySulking = "Yes";
    String SocialSmile = "";
    String HeadHolding = "";
    String Sitting = "";
    String Crawling = "";
    String Walking = "";
    String SpeechSingleWord = "";
    String CompleteSentences = "";
    String BladderBowelControl = "";
    String TakingBathWithoutHelp = "";
    
    String GeneralOutlook = "";
//    String SpecificBehaviour = "";
    String Appearance = "Good";
    String EyeContact = "Good";
    String Compliance = "Good";
    String OnFeet = "Good";
    String Hobbies = "Good";
    String TalkAndSampleofTalk = "";
    String AttentionSpanAndConcentration = "";
    String Comprehension = "";
    
    String VisualMotor = "Poor";
    String FineMotor = "Poor";
    String GrossMotor = "Poor";
    
    String InterestAndHobbies = "";
    
    String AttendingSchool = "Yes";
    String AttendedSchoolPreviously = "Yes";
    String SchoolType = "Private";
    String ProgressWithSchool = "Poor";
    String RelationWithTeacher = "Poor";
    String RelationWithClassmates = "Co-operative";
    String AnyOtherProblem = "";
    
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
        RegistrationNoField = new javax.swing.JTextField();
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
        FATC1 = new javax.swing.JCheckBox();
        FATC2 = new javax.swing.JCheckBox();
        FATC3 = new javax.swing.JCheckBox();
        FATC4 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        C1 = new javax.swing.JCheckBox();
        C2 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        C4 = new javax.swing.JCheckBox();
        jLabel43 = new javax.swing.JLabel();
        DisabilityInFamilyField = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        InterestAndHobbiesField = new javax.swing.JTextPane();
        jLabel65 = new javax.swing.JLabel();
        SubmitBtn = new javax.swing.JButton();
        PT1 = new javax.swing.JCheckBox();
        PT2 = new javax.swing.JCheckBox();
        PT3 = new javax.swing.JCheckBox();
        PT4 = new javax.swing.JCheckBox();
        jLabel83 = new javax.swing.JLabel();
        MotherNameField = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        MDeadBox = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        MAgeDeathField = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        MOccupationField = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        MATC1 = new javax.swing.JCheckBox();
        MATC2 = new javax.swing.JCheckBox();
        MATC3 = new javax.swing.JCheckBox();
        MATC4 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        MR1 = new javax.swing.JCheckBox();
        MR2 = new javax.swing.JCheckBox();
        MR3 = new javax.swing.JCheckBox();
        MR4 = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        ToF1 = new javax.swing.JCheckBox();
        ToF2 = new javax.swing.JCheckBox();
        ToF3 = new javax.swing.JCheckBox();
        jLabel82 = new javax.swing.JLabel();
        FamilyWillingToContributeBox = new javax.swing.JComboBox<>();
        jLabel93 = new javax.swing.JLabel();
        ContributeAmountField = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        HeadHoldingField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        SittingField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        CrawlingField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        WalkingField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        SpeechSingleWordField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        CompleteSentencesField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        BladderBowelControlField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TakingBathWithoutHelpField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        SocialSmileField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        GO1 = new javax.swing.JCheckBox();
        GO2 = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        TalkAndSampleofTalkField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        AttentionSpanAndConcentrationField = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        ComprehensionField = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        VisualMotorBox = new javax.swing.JComboBox<>();
        FineMotorBox = new javax.swing.JComboBox<>();
        jLabel98 = new javax.swing.JLabel();
        GrossMotorBox = new javax.swing.JComboBox<>();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        AttendingSchoolBox = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        AttendedSchoolPreviouslyBox = new javax.swing.JComboBox<>();
        jLabel102 = new javax.swing.JLabel();
        SchoolTypeBox = new javax.swing.JComboBox<>();
        jLabel103 = new javax.swing.JLabel();
        ProgressWithSchoolBox = new javax.swing.JComboBox<>();
        jLabel104 = new javax.swing.JLabel();
        RelationWithTeachersBox = new javax.swing.JComboBox<>();
        jLabel105 = new javax.swing.JLabel();
        RelationWithClassmatesBox = new javax.swing.JComboBox<>();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        AnyOtherProblemField = new javax.swing.JTextPane();
        Download = new javax.swing.JButton();
        DateField = new com.toedter.calendar.JDateChooser();
        DOBField = new com.toedter.calendar.JDateChooser();
        AgeField = new javax.swing.JComboBox<>();
        SexField = new javax.swing.JComboBox<>();
        FAgeField = new javax.swing.JComboBox<>();
        MAgeField = new javax.swing.JComboBox<>();
        BirthOrderField = new javax.swing.JComboBox<>();
        ReligionField = new javax.swing.JComboBox<>();
        MEducationField = new javax.swing.JComboBox<>();
        FEducationField = new javax.swing.JComboBox<>();
        FIncomeField = new javax.swing.JComboBox<>();
        FGeneralHealthField = new javax.swing.JComboBox<>();
        MIncomeField = new javax.swing.JComboBox<>();
        MGeneralHealthField = new javax.swing.JComboBox<>();
        MR5 = new javax.swing.JCheckBox();
        S1 = new javax.swing.JCheckBox();
        S2 = new javax.swing.JCheckBox();
        S3 = new javax.swing.JCheckBox();
        CRS1 = new javax.swing.JCheckBox();
        CRS2 = new javax.swing.JCheckBox();
        EarlySulkingField = new javax.swing.JComboBox<>();
        SportsField = new javax.swing.JCheckBox();
        MedicalCareField = new javax.swing.JCheckBox();
        SpeechTherapyField = new javax.swing.JCheckBox();
        PsychiatricConsultationField = new javax.swing.JCheckBox();
        AudiologyField = new javax.swing.JCheckBox();
        OrthopedicExaminationField = new javax.swing.JCheckBox();
        PsycologicalCounselingField = new javax.swing.JCheckBox();
        VocationalTrainingField = new javax.swing.JCheckBox();
        BehavioralModificationField = new javax.swing.JCheckBox();
        NutritionalCounselingField = new javax.swing.JCheckBox();
        PhysiotherapyField = new javax.swing.JCheckBox();
        FamilyCounselingField = new javax.swing.JCheckBox();
        OpthalmologicConsultationField = new javax.swing.JCheckBox();
        GroupTherapyField = new javax.swing.JCheckBox();
        AutismUnitField = new javax.swing.JCheckBox();
        OccupationalTherapyField = new javax.swing.JCheckBox();
        AppearanceField = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        EyeContactField = new javax.swing.JComboBox<>();
        ComplianceField = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        OnFeetField = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        HobbiesField = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("HISTORY DATASHEET | ORP");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Registration No:");

        RegistrationNoField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
        jLabel6.setText("DOB:");

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
        jLabel12.setText("Phone Num:");

        PhoneNumField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Presenting Complaints:");

        jScrollPane1.setViewportView(PresentingComplaintsField);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("History of Illness:");

        jScrollPane3.setViewportView(HistoryOfIllnessField);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Past Treatment:");

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

        FATC1.setText("Loving");
        FATC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FATC1ActionPerformed(evt);
            }
        });

        FATC2.setText("Over Protective");
        FATC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FATC2ActionPerformed(evt);
            }
        });

        FATC3.setText("Careless");
        FATC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FATC3ActionPerformed(evt);
            }
        });

        FATC4.setText("Harsh");
        FATC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FATC4ActionPerformed(evt);
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

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setText("Interests & Hobbies:");

        jScrollPane4.setViewportView(InterestAndHobbiesField);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Management Plan:");

        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitBtn.setText("Submit Data");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        PT1.setText("Physical");
        PT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT1ActionPerformed(evt);
            }
        });

        PT2.setText("Psychiatry");
        PT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT2ActionPerformed(evt);
            }
        });

        PT3.setText("Taweez Ganda");
        PT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT3ActionPerformed(evt);
            }
        });

        PT4.setText("Hakeem");
        PT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT4ActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("Mother's Name:");

        MotherNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setText("Age:");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("Alive:");

        MDeadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        MDeadBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDeadBoxActionPerformed(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel86.setText("Age at Death:");

        MAgeDeathField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel87.setText("Education:");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("Occupation:");

        MOccupationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("Income:");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel90.setText("General Health:");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel91.setText("Attitude Towards Target Children:");

        MATC1.setText("Loving");
        MATC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATC1ActionPerformed(evt);
            }
        });

        MATC2.setText("Over Protective");
        MATC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATC2ActionPerformed(evt);
            }
        });

        MATC3.setText("Careless");
        MATC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATC3ActionPerformed(evt);
            }
        });

        MATC4.setText("Harsh");
        MATC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATC4ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setText("Martial Relationship:");

        MR1.setText("Normal");
        MR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR1ActionPerformed(evt);
            }
        });

        MR2.setText("Conflicting");
        MR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR2ActionPerformed(evt);
            }
        });

        MR3.setText("Separation");
        MR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR3ActionPerformed(evt);
            }
        });

        MR4.setText("Divorce");
        MR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR4ActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel92.setText("Type of Family:");

        ToF1.setText("Nuclear");
        ToF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToF1ActionPerformed(evt);
            }
        });

        ToF2.setText("Joint");
        ToF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToF2ActionPerformed(evt);
            }
        });

        ToF3.setText("Extended");
        ToF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToF3ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel82.setText("Is the family willing to contribute?");

        FamilyWillingToContributeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        FamilyWillingToContributeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyWillingToContributeBoxActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("If Yes, How much?");

        ContributeAmountField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel94.setText("Siblings Attitude towards Target Children:");

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel95.setText("Child Relationship with Siblings:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Development Milestones:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Head Holding:");

        HeadHoldingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Sitting:");

        SittingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Crawling:");

        CrawlingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Walking:");

        WalkingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Speech Single Word:");

        SpeechSingleWordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Complete Sentences:");

        CompleteSentencesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Bladder & Bowel Control");

        BladderBowelControlField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Taking Bath Without Help:");

        TakingBathWithoutHelpField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Early Sucking Response Delayed:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Social Smile:");

        SocialSmileField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Initial Observation:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("General Outlook:");

        GO1.setText("Active");
        GO1.setToolTipText("");
        GO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GO1ActionPerformed(evt);
            }
        });

        GO2.setText("Passive");
        GO2.setToolTipText("");
        GO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GO2ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Specific Behaviour:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Talk and Sample of Talk:");

        TalkAndSampleofTalkField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Attention Span And Concentration:");

        AttentionSpanAndConcentrationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel63.setText("Comprehension:");

        ComprehensionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setText("Co-ordination:");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel96.setText("Visual Motor:");

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel97.setText("Fine Motor:");

        VisualMotorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Good", "Very Good" }));
        VisualMotorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualMotorBoxActionPerformed(evt);
            }
        });

        FineMotorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Good", "Very Good" }));
        FineMotorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FineMotorBoxActionPerformed(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel98.setText("Gross Motor:");

        GrossMotorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Good", "Very Good" }));
        GrossMotorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrossMotorBoxActionPerformed(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setText("Educational Status:");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel100.setText("Attending School:");

        AttendingSchoolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        AttendingSchoolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendingSchoolBoxActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel101.setText("Attended School Previously:");

        AttendedSchoolPreviouslyBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        AttendedSchoolPreviouslyBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendedSchoolPreviouslyBoxActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel102.setText("School Type:");

        SchoolTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Private", "Govt" }));
        SchoolTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchoolTypeBoxActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel103.setText("Progress With School Work:");

        ProgressWithSchoolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Satisfactory" }));
        ProgressWithSchoolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgressWithSchoolBoxActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel104.setText("Relations With Teachers:");

        RelationWithTeachersBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Poor", "Good" }));
        RelationWithTeachersBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelationWithTeachersBoxActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel105.setText("Relations With Classmates:");

        RelationWithClassmatesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Co-operative", "Quarrelsome", "No Communication" }));
        RelationWithClassmatesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelationWithClassmatesBoxActionPerformed(evt);
            }
        });

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel106.setText("Any Other Problem (specify):");
        jLabel106.setToolTipText("");

        jScrollPane5.setViewportView(AnyOtherProblemField);

        Download.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        FAgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        MAgeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85" }));

        BirthOrderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        ReligionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Muslim", "Christian", "Hindu", "Other" }));

        MEducationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nill", "Primary", "Secondary", "Intermediate", "Bachelors Graduate", "Post Graduate" }));
        MEducationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEducationFieldActionPerformed(evt);
            }
        });

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

        MIncomeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<10k", "10k -- 20k", "20k -- 50k", "50k -- 100k", ">100k" }));
        MIncomeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIncomeFieldActionPerformed(evt);
            }
        });

        MGeneralHealthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor", "Specify:" }));
        MGeneralHealthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGeneralHealthFieldActionPerformed(evt);
            }
        });

        MR5.setText("Widow");
        MR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MR5ActionPerformed(evt);
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

        EarlySulkingField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        EarlySulkingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EarlySulkingFieldActionPerformed(evt);
            }
        });

        SportsField.setText("Sports");
        SportsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportsFieldActionPerformed(evt);
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

        PsycologicalCounselingField.setText("Psycological Counseling");
        PsycologicalCounselingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsycologicalCounselingFieldActionPerformed(evt);
            }
        });

        VocationalTrainingField.setText("Vocational Training");
        VocationalTrainingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VocationalTrainingFieldActionPerformed(evt);
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

        PhysiotherapyField.setText("Physiotherapy");
        PhysiotherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhysiotherapyFieldActionPerformed(evt);
            }
        });

        FamilyCounselingField.setText("Family Counseling");
        FamilyCounselingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FamilyCounselingFieldActionPerformed(evt);
            }
        });

        OpthalmologicConsultationField.setText("Opthalmologic Consultation");
        OpthalmologicConsultationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpthalmologicConsultationFieldActionPerformed(evt);
            }
        });

        GroupTherapyField.setText("Group Therapy");
        GroupTherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupTherapyFieldActionPerformed(evt);
            }
        });

        AutismUnitField.setText("Autism Unit");
        AutismUnitField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutismUnitFieldActionPerformed(evt);
            }
        });

        OccupationalTherapyField.setText("Occupational Therapy");
        OccupationalTherapyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OccupationalTherapyFieldActionPerformed(evt);
            }
        });

        AppearanceField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor" }));
        AppearanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppearanceFieldActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("Appearance:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Eye Contact:");

        EyeContactField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor" }));
        EyeContactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EyeContactFieldActionPerformed(evt);
            }
        });

        ComplianceField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor" }));
        ComplianceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComplianceFieldActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("Compliance:");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("On Feet:");

        OnFeetField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor" }));
        OnFeetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnFeetFieldActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("Hobbies:");

        HobbiesField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Good", "Poor" }));
        HobbiesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HobbiesFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitBtn)
                .addGap(37, 37, 37)
                .addComponent(Download)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegistrationNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BirthOrderField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ReligionField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SexField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InformantField))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
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
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FDeadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FAgeDeathField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FEducationField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel83)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MotherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel84)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(5, 5, 5)
                                    .addComponent(jLabel85)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MDeadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel86)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MAgeDeathField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel87)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MEducationField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel94)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(S1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(S2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(S3)
                                    .addGap(226, 226, 226))
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PT1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PT2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PT3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PT4))
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
                                    .addComponent(FATC1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FATC2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FATC3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(FATC4))
                                .addComponent(jLabel42)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel92)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ToF1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ToF2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ToF3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel88)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel89)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel90)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(MGeneralHealthField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel91)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MATC1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MATC2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MATC3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MATC4))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel81)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MR1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MR2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MR3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MR4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(MR5))
                                .addComponent(jLabel16)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel82)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FamilyWillingToContributeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel93))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel95)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(CRS1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(CRS2))
                                                .addComponent(EarlySulkingField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ContributeAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel62)
                                .addComponent(jLabel65)
                                .addComponent(jLabel24)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(GO1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(GO2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel63)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComprehensionField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AttentionSpanAndConcentrationField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TalkAndSampleofTalkField))
                                .addComponent(jLabel29)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BladderBowelControlField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SpeechSingleWordField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CrawlingField))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(HeadHoldingField))
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel27)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SocialSmileField))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TakingBathWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CompleteSentencesField))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(WalkingField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(SittingField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel64)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel96)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(VisualMotorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel97)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FineMotorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel98)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(GrossMotorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel99)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel105)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RelationWithClassmatesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel106)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel100)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AttendingSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel101)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(AttendedSchoolPreviouslyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel102)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(SchoolTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel103)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ProgressWithSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel104)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RelationWithTeachersBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(SportsField)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OnFeetField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AppearanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EyeContactField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComplianceField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HobbiesField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(RegistrationNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(PT1)
                    .addComponent(PT2)
                    .addComponent(PT3)
                    .addComponent(PT4))
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
                    .addComponent(FATC1)
                    .addComponent(FATC2)
                    .addComponent(FATC3)
                    .addComponent(FATC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(MotherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85)
                    .addComponent(MDeadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(MAgeDeathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(MAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MEducationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(MOccupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90)
                    .addComponent(MIncomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MGeneralHealthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(MATC1)
                    .addComponent(MATC2)
                    .addComponent(MATC3)
                    .addComponent(MATC4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(MR1)
                    .addComponent(MR2)
                    .addComponent(MR3)
                    .addComponent(MR4)
                    .addComponent(MR5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(ToF1)
                    .addComponent(ToF2)
                    .addComponent(ToF3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(C3)
                    .addComponent(C4)
                    .addComponent(jLabel43)
                    .addComponent(DisabilityInFamilyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(FamilyWillingToContributeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(ContributeAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(S1)
                    .addComponent(S2)
                    .addComponent(S3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(CRS1)
                    .addComponent(CRS2))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(SocialSmileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EarlySulkingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(HeadHoldingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(SittingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(CrawlingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(WalkingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(SpeechSingleWordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(CompleteSentencesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BladderBowelControlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(TakingBathWithoutHelpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(GO1)
                    .addComponent(GO2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(AppearanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(EyeContactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(ComplianceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(HobbiesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(OnFeetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(TalkAndSampleofTalkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(AttentionSpanAndConcentrationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(ComprehensionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(VisualMotorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97)
                    .addComponent(FineMotorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98)
                    .addComponent(GrossMotorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(AttendingSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101)
                    .addComponent(AttendedSchoolPreviouslyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102)
                    .addComponent(SchoolTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(ProgressWithSchoolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(RelationWithTeachersBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(RelationWithClassmatesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Download)
                    .addComponent(SubmitBtn))
                .addGap(42, 42, 42))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1586, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        RegistrationNo = RegistrationNoField.getText().toString();
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
        FatherName = FatherNameField.getText().toString();
        FatherAge = MAgeField.getSelectedItem().toString();
        FatherAgeAtDeath = FAgeDeathField.getText().toString();
        FatherEducation = FEducationField.getSelectedItem().toString();
        FatherOccupation = FOccupationField.getText().toString();
        FatherIncome = FIncomeField.getSelectedItem().toString();
        FatherGeneralHealth = FGeneralHealthField.getSelectedItem().toString();
        MotherName = MotherNameField.getText().toString();
        MotherAge = MAgeField.getSelectedItem().toString();
        MotherAgeAtDeath = MAgeDeathField.getText().toString();
        MotherEducation = MEducationField.getSelectedItem().toString();
        MotherOccupation = MOccupationField.getText().toString();
        MotherIncome = MIncomeField.getSelectedItem().toString();
        MotherGeneralHealth = MGeneralHealthField.getSelectedItem().toString();
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
        ContributeAmount = ContributeAmountField.getText().toString();
//        SiblingAttitudeTowardsChildren = SiblingAttitudeTowardsChildrenField.getText().toString();
//        ChildRelationshipWithSiblings = ChildRelationshipWithSiblingsField.getText().toString();
        EarlySulking = EarlySulkingField.getSelectedItem().toString();
        SocialSmile = SocialSmileField.getText().toString();
        HeadHolding = HeadHoldingField.getText().toString();
        Sitting = SittingField.getText().toString();
        Crawling = CrawlingField.getText().toString();
        Walking = WalkingField.getText().toString();
        SpeechSingleWord = SpeechSingleWordField.getText().toString();
        CompleteSentences = CompleteSentencesField.getText().toString();
        BladderBowelControl = BladderBowelControlField.getText().toString();
        TakingBathWithoutHelp = TakingBathWithoutHelpField.getText().toString();
//        SpecificBehaviour = SpecificBehaviourField.getText().toString();
        Appearance = AppearanceField.getSelectedItem().toString();
        EyeContact = EyeContactField.getSelectedItem().toString();
        Compliance = ComplianceField.getSelectedItem().toString();
        OnFeet = OnFeetField.getSelectedItem().toString();
        Hobbies = HobbiesField.getSelectedItem().toString();
        TalkAndSampleofTalk = TalkAndSampleofTalkField.getText().toString();
        AttentionSpanAndConcentration = AttentionSpanAndConcentrationField.getText().toString();
        Comprehension = ComprehensionField.getText().toString();
        InterestAndHobbies = InterestAndHobbiesField.getText().toString();
        AnyOtherProblem = AnyOtherProblemField.getText().toString();
        
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
                FileWriter writer = new FileWriter("ORP.txt", true);
                writer.append("History Datasheet");
                writer.append(System.getProperty("line.separator"));
                writer.append(Name);
                writer.append(System.getProperty("line.separator"));
                writer.append(RegistrationNo);
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
                writer.append(PastTreatment);
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
                writer.append(MotherName);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherDead);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherAgeAtDeath);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherEducation);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherOccupation);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherIncome);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherGeneralHealth);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherAttitudeTowardsChildren);
                writer.append(System.getProperty("line.separator"));
                writer.append(MartialRelationShip);
                writer.append(System.getProperty("line.separator"));
                writer.append(TypeofFamily);
                writer.append(System.getProperty("line.separator"));
                writer.append(Consanguinity);
                writer.append(System.getProperty("line.separator"));
                writer.append(DisabilityInFamily);
                /*
                writer.append(System.getProperty("line.separator"));
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
                writer.append(System.getProperty("line.separator"));
                writer.append(FamilyWillingToContribute);
                writer.append(System.getProperty("line.separator"));
                writer.append(ContributeAmount);
                writer.append(System.getProperty("line.separator"));
                writer.append(SiblingsAttitude);
                writer.append(System.getProperty("line.separator"));
                writer.append(ChildRelation);
                writer.append(System.getProperty("line.separator"));
                writer.append(EarlySulking);
                writer.append(System.getProperty("line.separator"));
                writer.append(SocialSmile);
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
                writer.append(TakingBathWithoutHelp);
                writer.append(System.getProperty("line.separator"));
                writer.append(GeneralOutlook);
                writer.append(System.getProperty("line.separator"));
//                writer.append(SpecificBehaviour);
                writer.append(Appearance);
                writer.append(System.getProperty("line.separator"));
                writer.append(EyeContact);
                writer.append(System.getProperty("line.separator"));
                writer.append(Compliance);
                writer.append(System.getProperty("line.separator"));
                writer.append(OnFeet);
                writer.append(System.getProperty("line.separator"));
                writer.append(Hobbies);
                writer.append(System.getProperty("line.separator"));
                writer.append(TalkAndSampleofTalk);
                writer.append(System.getProperty("line.separator"));
                writer.append(AttentionSpanAndConcentration);
                writer.append(System.getProperty("line.separator"));
                writer.append(Comprehension);
                writer.append(System.getProperty("line.separator"));
                writer.append(VisualMotor);
                writer.append(System.getProperty("line.separator"));
                writer.append(FineMotor);
                writer.append(System.getProperty("line.separator"));
                writer.append(GrossMotor);
                writer.append(System.getProperty("line.separator"));
                writer.append(InterestAndHobbies);
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
                writer.append(AnyOtherProblem);
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
            File oldFile = new File("ORP.txt");
            File newFile = new File(tempFile);
            try
            {
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner myRead = new Scanner(new File("ORP.txt"));
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(!data.equals("History Datasheet"))
                    {
                        pw.println(data);
                    }
                    else
                    {
                        pw.println(data);
                        data = myRead.nextLine();
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
                }
                myRead.close();
                pw.flush();
                pw.close();
                
                oldFile.delete();
                File dump = new File("ORP.txt");
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
            File oldFile = new File("ORP.txt");
            File newFile = new File(tempFile);
            try
            {
                FileWriter fw = new FileWriter(tempFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner myRead = new Scanner(new File("ORP.txt"));
                while(myRead.hasNextLine())
                {
                    String data = myRead.nextLine();
                    if(!data.equals("History Datasheet"))
                    {
                        pw.println(data);
                    }
                    else
                    {
                        pw.println(data);
                        data = myRead.nextLine();
                        if(!data.equals(NameToUse))
                        {
                            pw.println(data);
                        }
                        else
                        {
                            data = myRead.nextLine();
                            pw.println(NameField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(RegistrationNoField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(((JTextField)DateField.getDateEditor().getUiComponent()).getText());
                            data = myRead.nextLine();
                            pw.println(AgeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(SexField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(((JTextField)DOBField.getDateEditor().getUiComponent()).getText());
                            data = myRead.nextLine();
                            pw.println(BirthOrderField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(ReligionField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(InformantField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(RefferedByField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HomeAddressField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PhoneNumField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PresentingComplaintsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HistoryOfIllnessField.getText().toString());
                            data = myRead.nextLine();
                            if(PT1.isSelected()==true)
                            {
                                PastTreatment = "Physical";
                            }else if(PT2.isSelected()==true)
                            {
                                PastTreatment = "Psychiatry";
                            }else if(PT3.isSelected()==true)
                            {
                                PastTreatment = "Taweez Ganda";
                            }else if(PT4.isSelected()==true)
                            {
                                PastTreatment = "Hakeem";
                            }
                            pw.println(PastTreatment);
                            data = myRead.nextLine();
                            pw.println(FatherNameField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MAgeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(FDeadBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(FAgeDeathField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(FEducationField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(FOccupationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(FIncomeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(FGeneralHealthField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            if(FATC1.isSelected()==true)
                            {
                                FatherAttitudeTowardsChildren = "Loving";
                            }else if(FATC2.isSelected()==true)
                            {
                                FatherAttitudeTowardsChildren = "Over Protective";
                            }else if(FATC3.isSelected()==true)
                            {
                                FatherAttitudeTowardsChildren = "Careless";
                            }else if(FATC4.isSelected()==true)
                            {
                                FatherAttitudeTowardsChildren = "Harsh";
                            }
                            pw.println(FatherAttitudeTowardsChildren);
                            data = myRead.nextLine();
                            pw.println(MotherNameField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MAgeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(MDeadBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(MAgeDeathField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MEducationField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(MOccupationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MIncomeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(MGeneralHealthField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            if(MATC1.isSelected()==true)
                            {
                                MotherAttitudeTowardsChildren = "Loving";
                            }else if(MATC2.isSelected()==true)
                            {
                                MotherAttitudeTowardsChildren = "Over Protective";
                            }else if(MATC3.isSelected()==true)
                            {
                                MotherAttitudeTowardsChildren = "Careless";
                            }else if(MATC4.isSelected()==true)
                            {
                                MotherAttitudeTowardsChildren = "Harsh";
                            }
                            pw.println(MotherAttitudeTowardsChildren);
                            data = myRead.nextLine();
                            if(MR1.isSelected()==true)
                            {
                                MartialRelationShip = "Normal";
                            }else if(MR2.isSelected()==true)
                            {
                                MartialRelationShip = "Conflicting";
                            }else if(MR3.isSelected()==true)
                            {
                                MartialRelationShip = "Separation";
                            }else if(MR4.isSelected()==true)
                            {
                                MartialRelationShip = "Divorce";
                            }else if(MR5.isSelected()==true)
                            {
                                MartialRelationShip = "Widow";
                            }
                            pw.println(MartialRelationShip);
                            data = myRead.nextLine();
                            if(ToF1.isSelected()==true)
                            {
                                TypeofFamily = "Nuclear";
                            }else if(ToF2.isSelected()==true)
                            {
                                TypeofFamily = "Joint";
                            }else if(ToF3.isSelected()==true)
                            {
                                TypeofFamily = "Extended";
                            }
                            pw.println(TypeofFamily);
                            data = myRead.nextLine();
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
                            data = myRead.nextLine();
                            pw.println(DisabilityInFamilyField.getText().toString());
                            /*
                            data = myRead.nextLine();
                            pw.println(SName1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth2.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth3.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees1.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth4.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth5.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth6.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth7.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth8.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SName9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSex9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SAge9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SEducation9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SSchool9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SFees9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SMartialStatus9.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SHealth9.getText().toString());
                            */
                            data = myRead.nextLine();
                            pw.println(FamilyWillingToContributeBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(ContributeAmountField.getText().toString());
                            data = myRead.nextLine();
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
                            data = myRead.nextLine();
                            if(CRS1.isSelected()==true)
                            {
                                ChildRelation = "Cooperative";
                            }else if(CRS2.isSelected()==true)
                            {
                                ChildRelation = "Non-Cooperative";
                            }
                            pw.println(ChildRelation);
                            data = myRead.nextLine();
                            pw.println(EarlySulkingField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(SocialSmileField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HeadHoldingField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SittingField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(CrawlingField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(WalkingField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SpeechSingleWordField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(CompleteSentencesField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(BladderBowelControlField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(TakingBathWithoutHelpField.getText().toString());
                            data = myRead.nextLine();
                            if(GO1.isSelected() == true)
                            {
                                GeneralOutlook = "Active";
                            }else if(GO2.isSelected() == true)
                            {
                                GeneralOutlook = "Passive";
                            }
                            pw.println(GeneralOutlook);
//                            data = myRead.nextLine();
//                            pw.println(SpecificBehaviourField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AppearanceField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(EyeContactField.getSelectedItem());
                            data = myRead.nextLine();
                            pw.println(ComplianceField.getSelectedItem());
                            data = myRead.nextLine();
                            pw.println(OnFeetField.getSelectedItem());
                            data = myRead.nextLine();
                            pw.println(HobbiesField.getSelectedItem());
                            data = myRead.nextLine();
                            pw.println(TalkAndSampleofTalkField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AttentionSpanAndConcentrationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(ComprehensionField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(VisualMotorBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(FineMotorBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(GrossMotorBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(InterestAndHobbiesField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AttendingSchoolBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(AttendedSchoolPreviouslyBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(SchoolTypeBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(ProgressWithSchoolBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(RelationWithTeachersBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(RelationWithClassmatesBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(AnyOtherProblemField.getText().toString());
                            data = myRead.nextLine();
                            MedicalCare = String.valueOf(MedicalCareField.isSelected());
                            pw.println(MedicalCare);
                            data = myRead.nextLine();
                            SpeechTherapy = String.valueOf(SpeechTherapyField.isSelected());
                            pw.println(SpeechTherapy);
                            data = myRead.nextLine();
                            PsychiatricConsultation = String.valueOf(PsychiatricConsultationField.isSelected());
                            pw.println(PsychiatricConsultation);
                            data = myRead.nextLine();
                            Audiology = String.valueOf(AudiologyField.isSelected());
                            pw.println(Audiology);
                            data = myRead.nextLine();
                            OrthopedicExamination = String.valueOf(OrthopedicExaminationField.isSelected());
                            pw.println(OrthopedicExamination);
                            data = myRead.nextLine();
                            OpthalmologicConsultation = String.valueOf(OpthalmologicConsultationField.isSelected());
                            pw.println(OpthalmologicConsultation);
                            data = myRead.nextLine();
                            VocationalTraining = String.valueOf(VocationalTrainingField.isSelected());
                            pw.println(VocationalTraining);
                            data = myRead.nextLine();
                            PsycologicalCounseling = String.valueOf(PsycologicalCounselingField.isSelected());
                            pw.println(PsycologicalCounseling);
                            data = myRead.nextLine();
                            Physiotherapy = String.valueOf(PhysiotherapyField.isSelected());
                            pw.println(Physiotherapy);
                            data = myRead.nextLine();
                            GroupTherapy = String.valueOf(GroupTherapyField.isSelected());
                            pw.println(GroupTherapy);
                            data = myRead.nextLine();
                            FamilyCounseling = String.valueOf(FamilyCounselingField.isSelected());
                            pw.println(FamilyCounseling);
                            data = myRead.nextLine();
                            BehavioralModification = String.valueOf(BehavioralModificationField.isSelected());
                            pw.println(BehavioralModification);
                            data = myRead.nextLine();
                            NutritionalCounseling = String.valueOf(NutritionalCounselingField.isSelected());
                            pw.println(NutritionalCounseling);
                            data = myRead.nextLine();
                            AutismUnit = String.valueOf(AutismUnitField.isSelected());
                            pw.println(AutismUnit);
                            data = myRead.nextLine();
                            OccupationalTherapy = String.valueOf(OccupationalTherapyField.isSelected());
                            pw.println(OccupationalTherapy);
                            data = myRead.nextLine();
                            Sports = String.valueOf(SportsField.isSelected());
                            pw.println(Sports);
                            pw.println("");
                        }
                    }
                }
                myRead.close();
                pw.flush();
                pw.close();
                
                oldFile.delete();
                File dump = new File("ORP.txt");
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

    
    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(false);
        C2.setSelected(false);
        C3.setSelected(false);
        C4.setSelected(true);
        Consanguinity = "No Relative";
    }//GEN-LAST:event_C4ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(false);
        C2.setSelected(false);
        C3.setSelected(true);
        C4.setSelected(false);
        Consanguinity = "Other Relative";
    }//GEN-LAST:event_C3ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(false);
        C2.setSelected(true);
        C3.setSelected(false);
        C4.setSelected(false);
        Consanguinity = "Second Cousin";
    }//GEN-LAST:event_C2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        C1.setSelected(true);
        C2.setSelected(false);
        C3.setSelected(false);
        C4.setSelected(false);
        Consanguinity = "First Cousin";
    }//GEN-LAST:event_C1ActionPerformed

    
    private void FATC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FATC4ActionPerformed
        // TODO add your handling code here:
        FATC1.setSelected(false);
        FATC2.setSelected(false);
        FATC3.setSelected(false);
        FATC4.setSelected(true);
        FatherAttitudeTowardsChildren = "Harsh";
    }//GEN-LAST:event_FATC4ActionPerformed

    private void FATC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FATC3ActionPerformed
        // TODO add your handling code here:
        FATC1.setSelected(false);
        FATC2.setSelected(false);
        FATC3.setSelected(true);
        FATC4.setSelected(false);
        FatherAttitudeTowardsChildren = "Careless";
    }//GEN-LAST:event_FATC3ActionPerformed

    private void FATC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FATC2ActionPerformed
        // TODO add your handling code here:
        FATC1.setSelected(false);
        FATC2.setSelected(true);
        FATC3.setSelected(false);
        FATC4.setSelected(false);
        FatherAttitudeTowardsChildren = "Over Protective";
    }//GEN-LAST:event_FATC2ActionPerformed

    private void FATC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FATC1ActionPerformed
        // TODO add your handling code here:
        FATC1.setSelected(true);
        FATC2.setSelected(false);
        FATC3.setSelected(false);
        FATC4.setSelected(false);
        FatherAttitudeTowardsChildren = "Loving";
    }//GEN-LAST:event_FATC1ActionPerformed

    
    private void FDeadBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDeadBoxActionPerformed
        // TODO add your handling code here:
        FatherDead = FDeadBox.getSelectedItem().toString();
    }//GEN-LAST:event_FDeadBoxActionPerformed

    
    private void PT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT1ActionPerformed
        // TODO add your handling code here:
        PT1.setSelected(true);
        PT2.setSelected(false);
        PT3.setSelected(false);
        PT4.setSelected(false);
        PastTreatment = "Physical";
    }//GEN-LAST:event_PT1ActionPerformed

    private void PT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT2ActionPerformed
        // TODO add your handling code here:
        PT1.setSelected(false);
        PT2.setSelected(true);
        PT3.setSelected(false);
        PT4.setSelected(false);
        PastTreatment = "Psychiatry";
    }//GEN-LAST:event_PT2ActionPerformed

    private void PT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT3ActionPerformed
        // TODO add your handling code here:
        PT1.setSelected(false);
        PT2.setSelected(false);
        PT3.setSelected(true);
        PT4.setSelected(false);
        PastTreatment = "Taweez Ganda";
    }//GEN-LAST:event_PT3ActionPerformed

    private void PT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT4ActionPerformed
        // TODO add your handling code here:
        PT1.setSelected(false);
        PT2.setSelected(false);
        PT3.setSelected(false);
        PT4.setSelected(true);
        PastTreatment = "Hakeem";
    }//GEN-LAST:event_PT4ActionPerformed

    
    private void MDeadBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDeadBoxActionPerformed
        // TODO add your handling code here:
        MotherDead = MDeadBox.getSelectedItem().toString();
    }//GEN-LAST:event_MDeadBoxActionPerformed

    
    private void MATC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATC1ActionPerformed
        // TODO add your handling code here:
        MATC1.setSelected(true);
        MATC2.setSelected(false);
        MATC3.setSelected(false);
        MATC4.setSelected(false);
        MotherAttitudeTowardsChildren = "Loving";
    }//GEN-LAST:event_MATC1ActionPerformed

    private void MATC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATC2ActionPerformed
        // TODO add your handling code here:
        MATC1.setSelected(false);
        MATC2.setSelected(true);
        MATC3.setSelected(false);
        MATC4.setSelected(false);
        MotherAttitudeTowardsChildren = "Over Protective";
    }//GEN-LAST:event_MATC2ActionPerformed

    private void MATC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATC3ActionPerformed
        // TODO add your handling code here:
        MATC1.setSelected(false);
        MATC2.setSelected(false);
        MATC3.setSelected(true);
        MATC4.setSelected(false);
        MotherAttitudeTowardsChildren = "Careless";
    }//GEN-LAST:event_MATC3ActionPerformed

    private void MATC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATC4ActionPerformed
        // TODO add your handling code here:
        MATC1.setSelected(false);
        MATC2.setSelected(false);
        MATC3.setSelected(false);
        MATC4.setSelected(true);
        MotherAttitudeTowardsChildren = "Harsh";
    }//GEN-LAST:event_MATC4ActionPerformed

    
    private void MR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR1ActionPerformed
        // TODO add your handling code here:
        MR1.setSelected(true);
        MR2.setSelected(false);
        MR3.setSelected(false);
        MR4.setSelected(false);
        MR5.setSelected(false);
        MartialRelationShip = "Normal";
    }//GEN-LAST:event_MR1ActionPerformed

    private void MR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR2ActionPerformed
        // TODO add your handling code here:
        MR1.setSelected(false);
        MR2.setSelected(true);
        MR3.setSelected(false);
        MR4.setSelected(false);
        MR5.setSelected(false);
        MartialRelationShip = "Conflicting";
    }//GEN-LAST:event_MR2ActionPerformed

    private void MR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR3ActionPerformed
        // TODO add your handling code here:
        MR1.setSelected(false);
        MR2.setSelected(false);
        MR3.setSelected(true);
        MR4.setSelected(false);
        MR5.setSelected(false);
        MartialRelationShip = "Separation";
    }//GEN-LAST:event_MR3ActionPerformed

    private void MR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR4ActionPerformed
        // TODO add your handling code here:
        MR1.setSelected(false);
        MR2.setSelected(false);
        MR3.setSelected(false);
        MR4.setSelected(true);
        MR5.setSelected(false);
        MartialRelationShip = "Divorce";
    }//GEN-LAST:event_MR4ActionPerformed
          
    
    private void ToF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToF1ActionPerformed
        // TODO add your handling code here:
        ToF1.setSelected(true);
        ToF2.setSelected(false);
        ToF3.setSelected(false);
        TypeofFamily = "Nuclear";
    }//GEN-LAST:event_ToF1ActionPerformed

    private void ToF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToF2ActionPerformed
        // TODO add your handling code here:
        ToF1.setSelected(false);
        ToF2.setSelected(true);
        ToF3.setSelected(false);
        TypeofFamily = "Joint";
    }//GEN-LAST:event_ToF2ActionPerformed

    private void ToF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToF3ActionPerformed
        // TODO add your handling code here:
        ToF1.setSelected(false);
        ToF2.setSelected(false);
        ToF3.setSelected(true);
        TypeofFamily = "Extended";
    }//GEN-LAST:event_ToF3ActionPerformed

    
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

    
    private void FamilyWillingToContributeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyWillingToContributeBoxActionPerformed
        // TODO add your handling code here:
        FamilyWillingToContribute = FamilyWillingToContributeBox.getSelectedItem().toString();
    }//GEN-LAST:event_FamilyWillingToContributeBoxActionPerformed

    
    private void GO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GO1ActionPerformed
        // TODO add your handling code here:
        GO1.setSelected(true);
        GO2.setSelected(false);
        GeneralOutlook = "Active";
    }//GEN-LAST:event_GO1ActionPerformed

    private void GO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GO2ActionPerformed
        // TODO add your handling code here:
        GO1.setSelected(false);
        GO2.setSelected(true);
        GeneralOutlook = "Passive";
    }//GEN-LAST:event_GO2ActionPerformed

    
    private void VisualMotorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualMotorBoxActionPerformed
        // TODO add your handling code here:
        VisualMotor = VisualMotorBox.getSelectedItem().toString();
    }//GEN-LAST:event_VisualMotorBoxActionPerformed

    private void FineMotorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FineMotorBoxActionPerformed
        // TODO add your handling code here:
        FineMotor = FineMotorBox.getSelectedItem().toString();
    }//GEN-LAST:event_FineMotorBoxActionPerformed

    private void GrossMotorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrossMotorBoxActionPerformed
        // TODO add your handling code here:
        GrossMotor = GrossMotorBox.getSelectedItem().toString();
    }//GEN-LAST:event_GrossMotorBoxActionPerformed

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
                if(pageIndex>0)
                {
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D graphics2D = (Graphics2D)graphics;
                graphics2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
                graphics2D.scale(0.6, 0.3);
                jPanel1.print(graphics2D);
                
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

    private void MEducationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEducationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MEducationFieldActionPerformed

    private void FEducationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEducationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEducationFieldActionPerformed

    private void FIncomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIncomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIncomeFieldActionPerformed

    private void FGeneralHealthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FGeneralHealthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FGeneralHealthFieldActionPerformed

    private void MIncomeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIncomeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIncomeFieldActionPerformed

    private void MGeneralHealthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGeneralHealthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MGeneralHealthFieldActionPerformed

    private void MR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MR5ActionPerformed
        // TODO add your handling code here:
        MR1.setSelected(false);
        MR2.setSelected(false);
        MR3.setSelected(false);
        MR4.setSelected(false);
        MR5.setSelected(true);
        MartialRelationShip = "Widow";
    }//GEN-LAST:event_MR5ActionPerformed

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

    private void EarlySulkingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EarlySulkingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EarlySulkingFieldActionPerformed

    private void SportsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SportsFieldActionPerformed

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

    private void PsycologicalCounselingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsycologicalCounselingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsycologicalCounselingFieldActionPerformed

    private void VocationalTrainingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VocationalTrainingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VocationalTrainingFieldActionPerformed

    private void BehavioralModificationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BehavioralModificationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BehavioralModificationFieldActionPerformed

    private void NutritionalCounselingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutritionalCounselingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NutritionalCounselingFieldActionPerformed

    private void PhysiotherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhysiotherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhysiotherapyFieldActionPerformed

    private void FamilyCounselingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FamilyCounselingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FamilyCounselingFieldActionPerformed

    private void OpthalmologicConsultationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpthalmologicConsultationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OpthalmologicConsultationFieldActionPerformed

    private void GroupTherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupTherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupTherapyFieldActionPerformed

    private void AutismUnitFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutismUnitFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutismUnitFieldActionPerformed

    private void OccupationalTherapyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OccupationalTherapyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OccupationalTherapyFieldActionPerformed

    private void AppearanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppearanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AppearanceFieldActionPerformed

    private void EyeContactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EyeContactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EyeContactFieldActionPerformed

    private void ComplianceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComplianceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComplianceFieldActionPerformed

    private void OnFeetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnFeetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OnFeetFieldActionPerformed

    private void HobbiesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HobbiesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HobbiesFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgeField;
    private javax.swing.JTextPane AnyOtherProblemField;
    private javax.swing.JComboBox<String> AppearanceField;
    private javax.swing.JComboBox<String> AttendedSchoolPreviouslyBox;
    private javax.swing.JComboBox<String> AttendingSchoolBox;
    private javax.swing.JTextField AttentionSpanAndConcentrationField;
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
    private javax.swing.JComboBox<String> ComplianceField;
    private javax.swing.JTextField ComprehensionField;
    private javax.swing.JTextField ContributeAmountField;
    private javax.swing.JTextField CrawlingField;
    private com.toedter.calendar.JDateChooser DOBField;
    private com.toedter.calendar.JDateChooser DateField;
    private javax.swing.JTextField DisabilityInFamilyField;
    private javax.swing.JButton Download;
    private javax.swing.JComboBox<String> EarlySulkingField;
    private javax.swing.JComboBox<String> EyeContactField;
    private javax.swing.JCheckBox FATC1;
    private javax.swing.JCheckBox FATC2;
    private javax.swing.JCheckBox FATC3;
    private javax.swing.JCheckBox FATC4;
    private javax.swing.JTextField FAgeDeathField;
    private javax.swing.JComboBox<String> FAgeField;
    private javax.swing.JComboBox<String> FDeadBox;
    private javax.swing.JComboBox<String> FEducationField;
    private javax.swing.JComboBox<String> FGeneralHealthField;
    private javax.swing.JComboBox<String> FIncomeField;
    private javax.swing.JTextField FOccupationField;
    private javax.swing.JCheckBox FamilyCounselingField;
    private javax.swing.JComboBox<String> FamilyWillingToContributeBox;
    private javax.swing.JTextField FatherNameField;
    private javax.swing.JComboBox<String> FineMotorBox;
    private javax.swing.JCheckBox GO1;
    private javax.swing.JCheckBox GO2;
    private javax.swing.JComboBox<String> GrossMotorBox;
    private javax.swing.JCheckBox GroupTherapyField;
    private javax.swing.JTextField HeadHoldingField;
    private javax.swing.JTextPane HistoryOfIllnessField;
    private javax.swing.JComboBox<String> HobbiesField;
    private javax.swing.JTextField HomeAddressField;
    private javax.swing.JTextField InformantField;
    private javax.swing.JTextPane InterestAndHobbiesField;
    private javax.swing.JCheckBox MATC1;
    private javax.swing.JCheckBox MATC2;
    private javax.swing.JCheckBox MATC3;
    private javax.swing.JCheckBox MATC4;
    private javax.swing.JTextField MAgeDeathField;
    private javax.swing.JComboBox<String> MAgeField;
    private javax.swing.JComboBox<String> MDeadBox;
    private javax.swing.JComboBox<String> MEducationField;
    private javax.swing.JComboBox<String> MGeneralHealthField;
    private javax.swing.JComboBox<String> MIncomeField;
    private javax.swing.JTextField MOccupationField;
    private javax.swing.JCheckBox MR1;
    private javax.swing.JCheckBox MR2;
    private javax.swing.JCheckBox MR3;
    private javax.swing.JCheckBox MR4;
    private javax.swing.JCheckBox MR5;
    private javax.swing.JCheckBox MedicalCareField;
    private javax.swing.JTextField MotherNameField;
    private javax.swing.JTextField NameField;
    private javax.swing.JCheckBox NutritionalCounselingField;
    private javax.swing.JCheckBox OccupationalTherapyField;
    private javax.swing.JComboBox<String> OnFeetField;
    private javax.swing.JCheckBox OpthalmologicConsultationField;
    private javax.swing.JCheckBox OrthopedicExaminationField;
    private javax.swing.JCheckBox PT1;
    private javax.swing.JCheckBox PT2;
    private javax.swing.JCheckBox PT3;
    private javax.swing.JCheckBox PT4;
    private javax.swing.JTextField PhoneNumField;
    private javax.swing.JCheckBox PhysiotherapyField;
    private javax.swing.JTextPane PresentingComplaintsField;
    private javax.swing.JComboBox<String> ProgressWithSchoolBox;
    private javax.swing.JCheckBox PsychiatricConsultationField;
    private javax.swing.JCheckBox PsycologicalCounselingField;
    private javax.swing.JTextField RefferedByField;
    private javax.swing.JTextField RegistrationNoField;
    private javax.swing.JComboBox<String> RelationWithClassmatesBox;
    private javax.swing.JComboBox<String> RelationWithTeachersBox;
    private javax.swing.JComboBox<String> ReligionField;
    private javax.swing.JCheckBox S1;
    private javax.swing.JCheckBox S2;
    private javax.swing.JCheckBox S3;
    private javax.swing.JComboBox<String> SchoolTypeBox;
    private javax.swing.JComboBox<String> SexField;
    private javax.swing.JTextField SittingField;
    private javax.swing.JTextField SocialSmileField;
    private javax.swing.JTextField SpeechSingleWordField;
    private javax.swing.JCheckBox SpeechTherapyField;
    private javax.swing.JCheckBox SportsField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField TakingBathWithoutHelpField;
    private javax.swing.JTextField TalkAndSampleofTalkField;
    private javax.swing.JCheckBox ToF1;
    private javax.swing.JCheckBox ToF2;
    private javax.swing.JCheckBox ToF3;
    private javax.swing.JComboBox<String> VisualMotorBox;
    private javax.swing.JCheckBox VocationalTrainingField;
    private javax.swing.JTextField WalkingField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
