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
public class MedicalRecordSheet_ORP extends javax.swing.JInternalFrame {

    /**
     * Creates new form MedicalRecordSheet_ORP
     */
    String NameToUse = "";
    String Type = "";
    public MedicalRecordSheet_ORP() throws ParseException {
        initComponents();
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateofExamField.setDate(datee);
        DOBField.setDate(datee);
    }
    public MedicalRecordSheet_ORP(String GetName, String GetType) throws ParseException {
        initComponents();
        NameToUse = GetName;
        Type = GetType;
        Download.setVisible(false);
        
        Date date0 = new Date();
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date datee = new SimpleDateFormat("yyyy-MM-dd").parse(date1.format(date0));
        
        DateofExamField.setDate(datee);
        DOBField.setDate(datee);
        
        if(Type.equals("Delete"))
        {
            SubmitBtn.setText("Delete Record");
        }
        else if(Type.equals("Update"))
        {
            SubmitBtn.setText("Update Data");
        }
        else if(Type.equals("Read"))
        {
            SubmitBtn.setVisible(false);
            Download.setVisible(true);
        }
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
                    if(data.equals("Medical Recordsheet"))
                    {
                        data = myRead.nextLine();
                        if(data.equals(GetName))
                        {
                            PatientNameField.setText(data);
                            data = myRead.nextLine();
                            Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                            DateofExamField.setDate(date4);
                            data = myRead.nextLine();
                            FatherNameField.setText(data);
                            data = myRead.nextLine();
                            CategoryBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse(data);
                            DOBField.setDate(date5);
                            data = myRead.nextLine();
                            AgeYearsField.setText(data);
                            data = myRead.nextLine();
                            AgeMonthsField.setText(data);
                            data = myRead.nextLine();
                            SexBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            OnZakatField.setText(data);
                            data = myRead.nextLine();
                            NotOnZakatField.setText(data);
                            data = myRead.nextLine();
                            HistoryGivenByField.setText(data);
                            data = myRead.nextLine();
                            PresentingComplaintsField.setText(data);
                            data = myRead.nextLine();
                            IllnessInPastField.setText(data);
                            data = myRead.nextLine();
                            PreviousHospitalizationField.setText(data);
                            data = myRead.nextLine();
                            HearingField.setText(data);
                            data = myRead.nextLine();
                            VisionField.setText(data);
                            data = myRead.nextLine();
                            SpeechField.setText(data);
                            data = myRead.nextLine();
                            HOConsanguinityField.setText(data);
                            data = myRead.nextLine();
                            FatherAgeField.setSelectedItem(data);
                            data = myRead.nextLine();
                            MotherAgeField.setSelectedItem(data);
                            data = myRead.nextLine();
                            SiblingsField.setText(data);
                            data = myRead.nextLine();
                            AnteNatalHistoryField.setText(data);
                            data = myRead.nextLine();
                            NatalField.setText(data);
                            data = myRead.nextLine();
                            PostNatalField.setText(data);
                            data = myRead.nextLine();
                            BreastMilkExclusiveField.setText(data);
                            data = myRead.nextLine();
                            FormulaCowMilkField.setText(data);
                            data = myRead.nextLine();
                            AgeWeaningStartedField.setText(data);
                            data = myRead.nextLine();
                            DietaryHabitsField.setText(data);
                            data = myRead.nextLine();
                            NoneCompIncompField.setText(data);
                            data = myRead.nextLine();
                            HOReactionField.setText(data);
                            data = myRead.nextLine();
                            SocialSmileAgeField.setText(data);
                            data = myRead.nextLine();
                            HeadControlAgeField.setText(data);
                            data = myRead.nextLine();
                            SittingAgeField.setText(data);
                            data = myRead.nextLine();
                            CrawlingAgeField.setText(data);
                            data = myRead.nextLine();
                            StandingAgeField.setText(data);
                            data = myRead.nextLine();
                            WalkingAgeField.setText(data);
                            data = myRead.nextLine();
                            SpeechAgeField.setText(data);
                            data = myRead.nextLine();
                            ControlAgeField.setText(data);
                            data = myRead.nextLine();
                            HistoryofAllergiesField.setText(data);
                            data = myRead.nextLine();
                            HistoryofSkinInfectionField.setText(data);
                            data = myRead.nextLine();
                            DrugHistoryField.setText(data);
                            data = myRead.nextLine();
                            GeneralAppearanceField.setText(data);
                            data = myRead.nextLine();
                            GrossAbnormalitiesField.setText(data);
                            data = myRead.nextLine();
                            HTCMField.setText(data);
                            data = myRead.nextLine();
                            HTPField.setText(data);
                            data = myRead.nextLine();
                            WTKGField.setText(data);
                            data = myRead.nextLine();
                            WTPField.setText(data);
                            data = myRead.nextLine();
                            HCCMField.setText(data);
                            data = myRead.nextLine();
                            HCPField.setText(data);
                            data = myRead.nextLine();
                            MACField.setText(data);
                            data = myRead.nextLine();
                            SkinFoldThicknessField.setText(data);
                            data = myRead.nextLine();
                            TempField.setText(data);
                            data = myRead.nextLine();
                            PulseField.setText(data);
                            data = myRead.nextLine();
                            RespRateField.setText(data);
                            data = myRead.nextLine();
                            BPField.setText(data);
                            data = myRead.nextLine();
                            PallorBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            CyanosisBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            JuandiceBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            EdemaBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            ClubbingBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            LymphaBox.setSelectedItem(data);
                            data = myRead.nextLine();
                            OroDentalField.setText(data);
                            data = myRead.nextLine();
                            RespiratorySystemField.setText(data);
                            data = myRead.nextLine();
                            HeartSoundsField.setText(data);
                            data = myRead.nextLine();
                            MurmursField.setText(data);
                            data = myRead.nextLine();
                            StateofConsciousnessField.setText(data);
                            data = myRead.nextLine();
                            MotorSystemField.setText(data);
                            data = myRead.nextLine();
                            SensorySystemField.setText(data);
                            data = myRead.nextLine();
                            UpperNField.setText(data);
                            data = myRead.nextLine();
                            UpperUpField.setText(data);
                            data = myRead.nextLine();
                            UpperDownField.setText(data);
                            data = myRead.nextLine();
                            LowerNField.setText(data);
                            data = myRead.nextLine();
                            LowerUpField.setText(data);
                            data = myRead.nextLine();
                            LowerDownField.setText(data);
                            data = myRead.nextLine();
                            BabinskiSignField.setText(data);
                            data = myRead.nextLine();
                            AnteriorFontanelleField.setText(data);
                            data = myRead.nextLine();
                            EyeExaminationField.setText(data);
                            data = myRead.nextLine();
                            HONightField.setText(data);
                            data = myRead.nextLine();
                            ENTExaminationField.setText(data);
                            data = myRead.nextLine();
                            MusculoskeletalField.setText(data);
                            data = myRead.nextLine();
                            ProvisionalDiagnosisField.setText(data);
                            data = myRead.nextLine();
                            PMedicationField.setText(data);
                            data = myRead.nextLine();
                            PsychologicalField.setText(data);
                            data = myRead.nextLine();
                            PsychiatricField.setText(data);
                            data = myRead.nextLine();
                            PhysiotherapyField.setText(data);
                            data = myRead.nextLine();
                            SpeechTherapyField.setText(data);
                            data = myRead.nextLine();
                            NutritionalRehabilitationField.setText(data);
                            data = myRead.nextLine();
                            OrthopaedicConsultationField.setText(data);
                            data = myRead.nextLine();
                            OpthalmologicConsultationField.setText(data);
                            data = myRead.nextLine();
                            OccupationalTherapyField.setText(data);
                            data = myRead.nextLine();
                            VocationalTrainingField.setText(data);
                            data = myRead.nextLine();
                            AudiologyField.setText(data);
                            data = myRead.nextLine();
                            MedicationField.setText(data);
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
    }
    
    String PatientName = "";
    String DateofExam = "";
    String FatherName = "";
    String Category = "AM";
    String DOB = "";
    String AgeinYears = "";
    String AgeinMonths = "";
    String Sex = "Male";
    
    String OnZakat = "";
    String NotOnZakat = "";
    
    String HistoryGivenBy = "";
    
    String PresentingComplaints = "";
    
    String IllnessInPast = "";
    String PreviousHospitalization = "";
    String Hearing = "";
    String Vision = "";
    String Speech = "";
    
    String HOConsanguinity = "";
    String FatherAge = "";
    String MotherAge = "";
    String Siblings = "";
    
    String AnteNatalHistory = "";
    String Natal ="";
    String PostNatal = "";
    
    String BreastMilkExclusive = "";
    String FormulaCowMilk = "";
    String AgeWeaningStarted = "";
    String DietaryHabits = "";
    
    String NoneCompIncomp = "";
    String HOReaction = "";
    
    String SocialSmileAge = "";
    String HeadControlAge = "";
    String SittingAge = "";
    String CrawlingAge = "";
    String StandingAge = "";
    String WalkingAge = "";
    String SpeechAge = "";
    String ControlAge = "";
    
    String HistoryofAllergies = "";
    String HistoryofSkinInfection = "";
    String DrugHistory = "";
    
    String GeneralAppearance = "";
    String GrossAbnormalities = "";
    String HTCM = "";
    String HTP = "";
    String WTKG = "";
    String WTP = "";
    String HCCM = "";
    String HCP = "";
    String MAC = "";
    String SkinFoldThickness = "";
    String Temp = "";
    String Pulse = "";
    String RespRate = "";
    String BP = "";
    String Pallor = "Yes";
    String Cyanosis = "Yes";
    String Juandice = "Yes";
    String Edema = "Yes";
    String Clubbing = "Yes";
    String Lympha = "Yes";
    
    String OroDental = "";
    String RespiratorySystem = "";
    String HeartSounds = "";
    String Murmurs = "";
    String StateofConsciousness = "";
    String MotorSystem = "";
    String SensorySystem = "";
    String UpperN = "";
    String UpperUp = "";
    String UpperDown = "";
    String LowerN = "";
    String LowerUp = "";
    String LowerDown = "";
    String BabinskiSign = "";
    String AnteriorFontanelle = "";
    
    String EyeExamination = "";
    String HONight = "";
    
    String ENTExamination = "";
    
    String Musculoskeletal = "";
    
    String ProvisionalDiagnosis = "";
    
    String PMedication = "";
    String Psychological = "";
    String Psychiatric = "";
    String Physiotherapy = "";
    String SpeechTherapy = "";
    String NutritionalRehabilitation = "";
    String OrthopaedicConsultation = "";
    String OpthalmologicConsultation = "";
    String OccupationalTherapy = "";
    String VocationalTraining = "";
    String Audiology = "";
    
    String Medication = "";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PatientNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FatherNameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CategoryBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AgeYearsField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgeMonthsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SexBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        OnZakatField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NotOnZakatField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        HistoryGivenByField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PresentingComplaintsField = new javax.swing.JTextPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        IllnessInPastField = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        PreviousHospitalizationField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        HearingField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        VisionField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        SpeechField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        HOConsanguinityField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        SiblingsField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        AnteNatalHistoryField = new javax.swing.JTextPane();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        NatalField = new javax.swing.JTextPane();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        PostNatalField = new javax.swing.JTextPane();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        BreastMilkExclusiveField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        FormulaCowMilkField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        AgeWeaningStartedField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        DietaryHabitsField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        NoneCompIncompField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        HOReactionField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        SocialSmileAgeField = new javax.swing.JTextField();
        HeadControlAgeField = new javax.swing.JTextField();
        SittingAgeField = new javax.swing.JTextField();
        CrawlingAgeField = new javax.swing.JTextField();
        StandingAgeField = new javax.swing.JTextField();
        WalkingAgeField = new javax.swing.JTextField();
        SpeechAgeField = new javax.swing.JTextField();
        ControlAgeField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        HistoryofAllergiesField = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        HistoryofSkinInfectionField = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        DrugHistoryField = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        GeneralAppearanceField = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        GrossAbnormalitiesField = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        HTCMField = new javax.swing.JTextField();
        WTKGField = new javax.swing.JTextField();
        HCCMField = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        HTPField = new javax.swing.JTextField();
        WTPField = new javax.swing.JTextField();
        HCPField = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        MACField = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        SkinFoldThicknessField = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        TempField = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        PulseField = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        RespRateField = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        BPField = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        LymphaBox = new javax.swing.JComboBox<>();
        ClubbingBox = new javax.swing.JComboBox<>();
        EdemaBox = new javax.swing.JComboBox<>();
        JuandiceBox = new javax.swing.JComboBox<>();
        CyanosisBox = new javax.swing.JComboBox<>();
        PallorBox = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        OroDentalField = new javax.swing.JTextPane();
        jLabel78 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        RespiratorySystemField = new javax.swing.JTextPane();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        HeartSoundsField = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        MurmursField = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        StateofConsciousnessField = new javax.swing.JTextField();
        MotorSystemField = new javax.swing.JTextField();
        SensorySystemField = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        UpperNField = new javax.swing.JTextField();
        UpperUpField = new javax.swing.JTextField();
        UpperDownField = new javax.swing.JTextField();
        LowerNField = new javax.swing.JTextField();
        LowerUpField = new javax.swing.JTextField();
        LowerDownField = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        BabinskiSignField = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        AnteriorFontanelleField = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        EyeExaminationField = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        HONightField = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ENTExaminationField = new javax.swing.JTextPane();
        jLabel97 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        MusculoskeletalField = new javax.swing.JTextPane();
        jLabel98 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        ProvisionalDiagnosisField = new javax.swing.JTextPane();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        PMedicationField = new javax.swing.JTextField();
        PsychologicalField = new javax.swing.JTextField();
        PsychiatricField = new javax.swing.JTextField();
        PhysiotherapyField = new javax.swing.JTextField();
        SpeechTherapyField = new javax.swing.JTextField();
        NutritionalRehabilitationField = new javax.swing.JTextField();
        OrthopaedicConsultationField = new javax.swing.JTextField();
        OpthalmologicConsultationField = new javax.swing.JTextField();
        OccupationalTherapyField = new javax.swing.JTextField();
        VocationalTrainingField = new javax.swing.JTextField();
        AudiologyField = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        MedicationField = new javax.swing.JTextPane();
        SubmitBtn = new javax.swing.JButton();
        Download = new javax.swing.JButton();
        DateofExamField = new com.toedter.calendar.JDateChooser();
        DOBField = new com.toedter.calendar.JDateChooser();
        FatherAgeField = new javax.swing.JComboBox<>();
        MotherAgeField = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("MEDICAL RECORD SHEET | ORP");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Date of Examination:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Patient's Name:");

        PatientNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Father's Name:");

        FatherNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Category:");

        CategoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "ORP", "RUP" }));
        CategoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryBoxActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Date of Birth:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Age in Years:");

        AgeYearsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AgeYearsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeYearsFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Age in Months:");

        AgeMonthsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Sex:");

        SexBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        SexBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Socioeconomic History:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("On Zakat:");

        OnZakatField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Not On Zakat:");

        NotOnZakatField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("History Given By:");

        HistoryGivenByField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Presenting Complaints:");

        jScrollPane2.setViewportView(PresentingComplaintsField);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Past History:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Any Illness In Past:");

        jScrollPane3.setViewportView(IllnessInPastField);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Previous Hospitalization:");
        jLabel16.setToolTipText("");

        PreviousHospitalizationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Hearing:");
        jLabel17.setToolTipText("");

        HearingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Vision:");
        jLabel18.setToolTipText("");

        VisionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Speech:");
        jLabel19.setToolTipText("");

        SpeechField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Family History:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("H/O Consanguinity:");
        jLabel21.setToolTipText("");

        HOConsanguinityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Father's Age:");
        jLabel22.setToolTipText("");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Mother's Age:");
        jLabel23.setToolTipText("");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Siblings:");
        jLabel24.setToolTipText("");

        SiblingsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Birth History:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Ante-Natal History of Mother:");
        jLabel26.setToolTipText("");

        jScrollPane4.setViewportView(AnteNatalHistoryField);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("Natal:");
        jLabel27.setToolTipText("");

        jScrollPane5.setViewportView(NatalField);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Post-Natal:");
        jLabel28.setToolTipText("");

        jScrollPane6.setViewportView(PostNatalField);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Feeding/Nutrition History:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Breast Milk Exclusive:");
        jLabel30.setToolTipText("");

        BreastMilkExclusiveField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Formula/Cow's Milk:");
        jLabel31.setToolTipText("");

        FormulaCowMilkField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Age at which \"WEANING\" was started:");
        jLabel32.setToolTipText("");

        AgeWeaningStartedField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Dietary Habits:");
        jLabel33.setToolTipText("");

        DietaryHabitsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Vaccination History:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel35.setText("None/Complete/Incomplete:");
        jLabel35.setToolTipText("");

        NoneCompIncompField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel36.setText("H/O any reaction following Vaccination:");
        jLabel36.setToolTipText("");

        HOReactionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Developmental History:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel38.setText("Milestones");
        jLabel38.setToolTipText("");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setText("Age at which Achieved");
        jLabel39.setToolTipText("");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Social Smile:");
        jLabel40.setToolTipText("");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel41.setText("Head Control:");
        jLabel41.setToolTipText("");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel42.setText("Sitting:");
        jLabel42.setToolTipText("");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel43.setText("Crawling:");
        jLabel43.setToolTipText("");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel44.setText("Standing:");
        jLabel44.setToolTipText("");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("Walking:");
        jLabel45.setToolTipText("");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel46.setText("Speech:");
        jLabel46.setToolTipText("");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel47.setText("Control of Bladder & Bowel:");
        jLabel47.setToolTipText("");

        SocialSmileAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        HeadControlAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SittingAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CrawlingAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        StandingAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        WalkingAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SpeechAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ControlAgeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("History of Allergies:");

        HistoryofAllergiesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("History of Skin Infection:");

        HistoryofSkinInfectionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Drug History:");

        DrugHistoryField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Examination:");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("General Physical Examination:");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel53.setText("General Appearance:");
        jLabel53.setToolTipText("");

        GeneralAppearanceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel54.setText("Gross Abnormalities:");
        jLabel54.setToolTipText("");

        GrossAbnormalitiesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel55.setText("Ht in cm:");
        jLabel55.setToolTipText("");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel56.setText("Wt in kg:");
        jLabel56.setToolTipText("");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel57.setText("HC in cm:");
        jLabel57.setToolTipText("");

        HTCMField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        WTKGField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        HCCMField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel58.setText("Ht in percentile:");
        jLabel58.setToolTipText("");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel59.setText("Wt in percentile:");
        jLabel59.setToolTipText("");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel60.setText("HC in percentile:");
        jLabel60.setToolTipText("");

        HTPField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        WTPField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        HCPField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel61.setText("MAC (if any Nutritional problem) :");
        jLabel61.setToolTipText("");

        MACField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel62.setText("Skin Fold Thickness:");
        jLabel62.setToolTipText("");

        SkinFoldThicknessField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setText("Vital Signs:");
        jLabel63.setToolTipText("");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel64.setText("Temp in F:");
        jLabel64.setToolTipText("");

        TempField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel65.setText("Pulse per min:");
        jLabel65.setToolTipText("");

        PulseField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel66.setText("Resp. Rate per min:");
        jLabel66.setToolTipText("");

        RespRateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel67.setText("Blood Pressure in mm Hg:");
        jLabel67.setToolTipText("");

        BPField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Others:");
        jLabel68.setToolTipText("");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel69.setText("Pallor:");
        jLabel69.setToolTipText("");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel70.setText("Cyanosis:");
        jLabel70.setToolTipText("");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel71.setText("Juandice:");
        jLabel71.setToolTipText("");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel72.setText("Edema:");
        jLabel72.setToolTipText("");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel73.setText("Clubbing:");
        jLabel73.setToolTipText("");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel74.setText("Lymphadenopathy:");
        jLabel74.setToolTipText("");

        LymphaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        LymphaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LymphaBoxActionPerformed(evt);
            }
        });

        ClubbingBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        ClubbingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClubbingBoxActionPerformed(evt);
            }
        });

        EdemaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        EdemaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdemaBoxActionPerformed(evt);
            }
        });

        JuandiceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        JuandiceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuandiceBoxActionPerformed(evt);
            }
        });

        CyanosisBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        CyanosisBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CyanosisBoxActionPerformed(evt);
            }
        });

        PallorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        PallorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PallorBoxActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setText("Systemic Examination:");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setText("Gastro-Intestinal System:");
        jLabel76.setToolTipText("");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel77.setText("Oro-Dental Hygiene:");
        jLabel77.setToolTipText("");

        jScrollPane7.setViewportView(OroDentalField);

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setText("Respiratory System:");
        jLabel78.setToolTipText("");

        jScrollPane8.setViewportView(RespiratorySystemField);

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setText("Cardio-Vascular System:");
        jLabel79.setToolTipText("");

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel80.setText("Heart Sounds (S1 & S2):");
        jLabel80.setToolTipText("");

        HeartSoundsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("Murmurs:");
        jLabel81.setToolTipText("");

        MurmursField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setText("Central Nervous System:");
        jLabel82.setToolTipText("");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel83.setText("State of Consciousness:");
        jLabel83.setToolTipText("");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel84.setText("Motor System:");
        jLabel84.setToolTipText("");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel85.setText("Sensory System:");
        jLabel85.setToolTipText("");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel86.setText("Reflexes:");
        jLabel86.setToolTipText("");

        StateofConsciousnessField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        MotorSystemField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SensorySystemField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel87.setText("Upper Limbs:");
        jLabel87.setToolTipText("");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("Lower Limbs:");
        jLabel88.setToolTipText("");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("N");
        jLabel89.setToolTipText("");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel90.setText("UP");
        jLabel90.setToolTipText("");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel91.setText("DOWN");
        jLabel91.setToolTipText("");

        UpperNField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UpperNField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperNFieldActionPerformed(evt);
            }
        });

        UpperUpField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UpperUpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperUpFieldActionPerformed(evt);
            }
        });

        UpperDownField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UpperDownField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperDownFieldActionPerformed(evt);
            }
        });

        LowerNField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LowerNField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerNFieldActionPerformed(evt);
            }
        });

        LowerUpField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LowerUpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerUpFieldActionPerformed(evt);
            }
        });

        LowerDownField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LowerDownField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerDownFieldActionPerformed(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel92.setText("Babinski's Sign +/-:");
        jLabel92.setToolTipText("");

        BabinskiSignField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel93.setText("Anterior Fontanelle (if age below 18 months):");
        jLabel93.setToolTipText("");

        AnteriorFontanelleField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setText("Eye Examination:");

        EyeExaminationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setText("H/O Night Blindness:");
        jLabel95.setToolTipText("");

        HONightField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel96.setText("ENT Examination:");

        jScrollPane9.setViewportView(ENTExaminationField);

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel97.setText("Musculoskeletal System:");
        jLabel97.setToolTipText("");

        jScrollPane10.setViewportView(MusculoskeletalField);

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setText("Provisional Diagnosis:");
        jLabel98.setToolTipText("");

        jScrollPane11.setViewportView(ProvisionalDiagnosisField);

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setText("Plan:");
        jLabel99.setToolTipText("");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel100.setText("Medication:");
        jLabel100.setToolTipText("");

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel101.setText("Psychological Counselling:");
        jLabel101.setToolTipText("");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel102.setText("Psychiatric Consultation:");
        jLabel102.setToolTipText("");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel103.setText("Physiotherapy:");
        jLabel103.setToolTipText("");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel104.setText("Speech Therapy:");
        jLabel104.setToolTipText("");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel105.setText("Nutritional Rehabilitation:");
        jLabel105.setToolTipText("");

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel106.setText("Orthopaedic Consultation:");
        jLabel106.setToolTipText("");

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel107.setText("Opthalmologic Consultation:");
        jLabel107.setToolTipText("");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel108.setText("Occupational Therapy:");
        jLabel108.setToolTipText("");

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel109.setText("Vocational Training:");
        jLabel109.setToolTipText("");

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel110.setText("Audiology:");
        jLabel110.setToolTipText("");

        PMedicationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PsychologicalField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PsychiatricField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        PhysiotherapyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SpeechTherapyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NutritionalRehabilitationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OrthopaedicConsultationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OpthalmologicConsultationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        OccupationalTherapyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        VocationalTrainingField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        AudiologyField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("Medications:");
        jLabel111.setToolTipText("");

        jScrollPane12.setViewportView(MedicationField);

        SubmitBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        DateofExamField.setDateFormatString("yyyy-MM-dd");
        DateofExamField.setMinSelectableDate(new java.util.Date(-62135783912000L));

        DOBField.setDateFormatString("yyyy-MM-dd");

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
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel84)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MotorSystemField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StateofConsciousnessField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel86)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel89)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel90)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel91)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SensorySystemField)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel88)
                                                .addGap(18, 18, 18)
                                                .addComponent(LowerNField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LowerUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LowerDownField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel87)
                                                .addGap(18, 18, 18)
                                                .addComponent(UpperNField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UpperUpField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UpperDownField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel92)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BabinskiSignField)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnteriorFontanelleField)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel111)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PreviousHospitalizationField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HearingField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VisionField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpeechField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(5, 5, 5)
                                .addComponent(HOConsanguinityField))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BreastMilkExclusiveField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FormulaCowMilkField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AgeWeaningStartedField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DietaryHabitsField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NoneCompIncompField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HOReactionField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HistoryofAllergiesField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HistoryofSkinInfectionField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DrugHistoryField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GeneralAppearanceField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GrossAbnormalitiesField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MACField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SkinFoldThicknessField))
                            .addComponent(jScrollPane8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel94)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EyeExaminationField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HONightField))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel80)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HeartSoundsField))
                                    .addComponent(jScrollPane7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MurmursField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel101)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PsychologicalField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PMedicationField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel102)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PsychiatricField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel103)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PhysiotherapyField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel77)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel104)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SpeechTherapyField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel105)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NutritionalRehabilitationField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel106)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OrthopaedicConsultationField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel107)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OpthalmologicConsultationField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel108)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OccupationalTherapyField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel109)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VocationalTrainingField))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel110)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AudiologyField))))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel38)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel39))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OnZakatField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NotOnZakatField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(HistoryGivenByField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel37)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel47))
                                        .addGap(46, 46, 46)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SocialSmileAgeField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(HeadControlAgeField)
                                            .addComponent(SittingAgeField)
                                            .addComponent(CrawlingAgeField)
                                            .addComponent(StandingAgeField)
                                            .addComponent(WalkingAgeField)
                                            .addComponent(SpeechAgeField)
                                            .addComponent(ControlAgeField)))
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel52)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel57)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(HCCMField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(WTKGField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel55)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(HTCMField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel60)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(HCPField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel58)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(HTPField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel59)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(WTPField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel68)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel74)
                                            .addComponent(jLabel73)
                                            .addComponent(jLabel72)
                                            .addComponent(jLabel71)
                                            .addComponent(jLabel70)
                                            .addComponent(jLabel69))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PallorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CyanosisBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JuandiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EdemaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ClubbingBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LymphaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel64)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TempField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel65)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PulseField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel66)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RespRateField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel67)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BPField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel75)
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel79)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel99)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AgeYearsField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AgeMonthsField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, 0)
                                        .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PatientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(DateofExamField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addGap(11, 11, 11)
                                        .addComponent(FatherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23)
                                        .addGap(5, 5, 5)
                                        .addComponent(MotherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SiblingsField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(SubmitBtn)
                .addGap(18, 18, 18)
                .addComponent(Download)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(PatientNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateofExamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CategoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(AgeYearsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(AgeMonthsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DOBField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SexBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(OnZakatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(NotOnZakatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(HistoryGivenByField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(PreviousHospitalizationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(HearingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(VisionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(SpeechField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(HOConsanguinityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(SiblingsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FatherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MotherAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(BreastMilkExclusiveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(FormulaCowMilkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(AgeWeaningStartedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(DietaryHabitsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(NoneCompIncompField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(HOReactionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(SocialSmileAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(HeadControlAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(SittingAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(CrawlingAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(StandingAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(WalkingAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(SpeechAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(ControlAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(HistoryofAllergiesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistoryofSkinInfectionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrugHistoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(GeneralAppearanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(GrossAbnormalitiesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(HTCMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(HTPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(WTKGField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(WTPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(HCCMField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(HCPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(MACField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(SkinFoldThicknessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(TempField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(PulseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(RespRateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(BPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(PallorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(CyanosisBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(JuandiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(EdemaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(ClubbingBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(LymphaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(HeartSoundsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(MurmursField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(StateofConsciousnessField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(MotorSystemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(SensorySystemField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(UpperNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpperUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpperDownField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(LowerNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LowerUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LowerDownField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(BabinskiSignField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(AnteriorFontanelleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(EyeExaminationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(HONightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel100)
                    .addComponent(PMedicationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101)
                    .addComponent(PsychologicalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(PsychiatricField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(PhysiotherapyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(SpeechTherapyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(NutritionalRehabilitationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(OrthopaedicConsultationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(OpthalmologicConsultationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(OccupationalTherapyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109)
                    .addComponent(VocationalTrainingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(AudiologyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    if(pageIndex>0 && pageIndex<3)
                    {
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D graphics2D = (Graphics2D)graphics;
                    graphics2D.translate(pageFormat.getImageableX()*2, pageFormat.getImageableY()*2);
                    graphics2D.scale(0.3, 0.2);
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

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
        PatientName = PatientNameField.getText().toString();
        DateofExam = ((JTextField)DateofExamField.getDateEditor().getUiComponent()).getText();
        FatherName = FatherNameField.getText().toString();
        DOB = ((JTextField)DOBField.getDateEditor().getUiComponent()).getText();
        AgeinYears = AgeYearsField.getText().toString();
        AgeinMonths = AgeMonthsField.getText().toString();
        OnZakat = OnZakatField.getText().toString();
        NotOnZakat = NotOnZakatField.getText().toString();
        HistoryGivenBy = HistoryGivenByField.getText().toString();
        PresentingComplaints = PresentingComplaintsField.getText().toString();
        IllnessInPast = IllnessInPastField.getText().toString();
        PreviousHospitalization = PreviousHospitalizationField.getText().toString();
        Hearing = HearingField.getText().toString();
        Vision = VisionField.getText().toString();
        Speech = SpeechField.getText().toString();
        HOConsanguinity = HOConsanguinityField.getText().toString();
        FatherAge = FatherAgeField.getSelectedItem().toString();
        MotherAge = MotherAgeField.getSelectedItem().toString();
        Siblings = SiblingsField.getText().toString();
        AnteNatalHistory = AnteNatalHistoryField.getText().toString();
        Natal = NatalField.getText().toString();
        PostNatal = PostNatalField.getText().toString();
        BreastMilkExclusive = BreastMilkExclusiveField.getText().toString();
        FormulaCowMilk = FormulaCowMilkField.getText().toString();
        AgeWeaningStarted = AgeWeaningStartedField.getText().toString();
        DietaryHabits = DietaryHabitsField.getText().toString();
        NoneCompIncomp = NoneCompIncompField.getText().toString();
        HOReaction = HOReactionField.getText().toString();
        SocialSmileAge = SocialSmileAgeField.getText().toString();
        HeadControlAge = HeadControlAgeField.getText().toString();
        SittingAge = SittingAgeField.getText().toString();
        CrawlingAge = CrawlingAgeField.getText().toString();
        StandingAge = StandingAgeField.getText().toString();
        WalkingAge = WalkingAgeField.getText().toString();
        SpeechAge = SpeechAgeField.getText().toString();
        ControlAge = ControlAgeField.getText().toString();
        HistoryofAllergies = HistoryofAllergiesField.getText().toString();
        HistoryofSkinInfection = HistoryofSkinInfectionField.getText().toString();
        DrugHistory = DrugHistoryField.getText().toString();
        GeneralAppearance = GeneralAppearanceField.getText().toString();
        GrossAbnormalities = GrossAbnormalitiesField.getText().toString();
        HTCM = HTCMField.getText().toString();
        HTP = HTPField.getText().toString();
        WTKG = WTKGField.getText().toString();
        WTP = WTPField.getText().toString();
        HCCM = HCCMField.getText().toString();
        HCP = HCPField.getText().toString();
        MAC = MACField.getText().toString();
        SkinFoldThickness = SkinFoldThicknessField.getText().toString();
        Temp = TempField.getText().toString();
        Pulse = PulseField.getText().toString();
        RespRate = RespRateField.getText().toString();
        BP = BPField.getText().toString();
        OroDental = OroDentalField.getText().toString();
        RespiratorySystem = RespiratorySystemField.getText().toString();
        HeartSounds = HeartSoundsField.getText().toString();
        Murmurs = MurmursField.getText().toString();
        StateofConsciousness = StateofConsciousnessField.getText().toString();
        MotorSystem = MotorSystemField.getText().toString();
        SensorySystem = SensorySystemField.getText().toString();
        UpperN = UpperNField.getText().toString();
        UpperUp = UpperUpField.getText().toString();
        UpperDown = UpperDownField.getText().toString();
        LowerN = LowerNField.getText().toString();
        LowerUp = LowerUpField.getText().toString();
        LowerDown = LowerDownField.getText().toString();
        BabinskiSign = BabinskiSignField.getText().toString();
        AnteriorFontanelle = AnteriorFontanelleField.getText().toString();
        EyeExamination = EyeExaminationField.getText().toString();
        HONight = HONightField.getText().toString();
        ENTExamination = ENTExaminationField.getText().toString();
        Musculoskeletal = MusculoskeletalField.getText().toString();
        ProvisionalDiagnosis = ProvisionalDiagnosisField.getText().toString();
        PMedication = PMedicationField.getText().toString();
        Psychological = PsychologicalField.getText().toString();
        Psychiatric = PsychiatricField.getText().toString();
        Physiotherapy = PhysiotherapyField.getText().toString();
        SpeechTherapy = SpeechTherapyField.getText().toString();
        NutritionalRehabilitation = NutritionalRehabilitationField.getText().toString();
        OrthopaedicConsultation = OrthopaedicConsultationField.getText().toString();
        OpthalmologicConsultation = OpthalmologicConsultationField.getText().toString();
        OccupationalTherapy = OccupationalTherapyField.getText().toString();
        VocationalTraining = VocationalTrainingField.getText().toString();
        Audiology = AudiologyField.getText().toString();
        Medication = MedicationField.getText().toString();
        if(!Type.equals("Delete") && !Type.equals("Update"))
        {
            try
            {
                FileWriter writer = new FileWriter("ORP.txt", true);
                writer.append("Medical Recordsheet");
                writer.append(System.getProperty("line.separator"));
                writer.append(PatientName);
                writer.append(System.getProperty("line.separator"));
                writer.append(DateofExam);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherName);
                writer.append(System.getProperty("line.separator"));
                writer.append(Category);
                writer.append(System.getProperty("line.separator"));
                writer.append(DOB);
                writer.append(System.getProperty("line.separator"));
                writer.append(AgeinYears);
                writer.append(System.getProperty("line.separator"));
                writer.append(AgeinMonths);
                writer.append(System.getProperty("line.separator"));
                writer.append(Sex);
                writer.append(System.getProperty("line.separator"));
                writer.append(OnZakat);
                writer.append(System.getProperty("line.separator"));
                writer.append(NotOnZakat);
                writer.append(System.getProperty("line.separator"));
                writer.append(HistoryGivenBy);
                writer.append(System.getProperty("line.separator"));
                writer.append(PresentingComplaints);
                writer.append(System.getProperty("line.separator"));
                writer.append(IllnessInPast);
                writer.append(System.getProperty("line.separator"));
                writer.append(PreviousHospitalization);
                writer.append(System.getProperty("line.separator"));
                writer.append(Hearing);
                writer.append(System.getProperty("line.separator"));
                writer.append(Vision);
                writer.append(System.getProperty("line.separator"));
                writer.append(Speech);
                writer.append(System.getProperty("line.separator"));
                writer.append(HOConsanguinity);
                writer.append(System.getProperty("line.separator"));
                writer.append(FatherAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotherAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(Siblings);
                writer.append(System.getProperty("line.separator"));
                writer.append(AnteNatalHistory);
                writer.append(System.getProperty("line.separator"));
                writer.append(Natal);
                writer.append(System.getProperty("line.separator"));
                writer.append(PostNatal);
                writer.append(System.getProperty("line.separator"));
                writer.append(BreastMilkExclusive);
                writer.append(System.getProperty("line.separator"));
                writer.append(FormulaCowMilk);
                writer.append(System.getProperty("line.separator"));
                writer.append(AgeWeaningStarted);
                writer.append(System.getProperty("line.separator"));
                writer.append(DietaryHabits);
                writer.append(System.getProperty("line.separator"));
                writer.append(NoneCompIncomp);
                writer.append(System.getProperty("line.separator"));
                writer.append(HOReaction);
                writer.append(System.getProperty("line.separator"));
                writer.append(SocialSmileAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(HeadControlAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(SittingAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(CrawlingAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(StandingAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(WalkingAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(SpeechAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(ControlAge);
                writer.append(System.getProperty("line.separator"));
                writer.append(HistoryofAllergies);
                writer.append(System.getProperty("line.separator"));
                writer.append(HistoryofSkinInfection);
                writer.append(System.getProperty("line.separator"));
                writer.append(DrugHistory);
                writer.append(System.getProperty("line.separator"));
                writer.append(GeneralAppearance);
                writer.append(System.getProperty("line.separator"));
                writer.append(GrossAbnormalities);
                writer.append(System.getProperty("line.separator"));
                writer.append(HTCM);
                writer.append(System.getProperty("line.separator"));
                writer.append(HTP);
                writer.append(System.getProperty("line.separator"));
                writer.append(WTKG);
                writer.append(System.getProperty("line.separator"));
                writer.append(WTP);
                writer.append(System.getProperty("line.separator"));
                writer.append(HCCM);
                writer.append(System.getProperty("line.separator"));
                writer.append(HCP);
                writer.append(System.getProperty("line.separator"));
                writer.append(MAC);
                writer.append(System.getProperty("line.separator"));
                writer.append(SkinFoldThickness);
                writer.append(System.getProperty("line.separator"));
                writer.append(Temp);
                writer.append(System.getProperty("line.separator"));
                writer.append(Pulse);
                writer.append(System.getProperty("line.separator"));
                writer.append(RespRate);
                writer.append(System.getProperty("line.separator"));
                writer.append(BP);
                writer.append(System.getProperty("line.separator"));
                writer.append(Pallor);
                writer.append(System.getProperty("line.separator"));
                writer.append(Cyanosis);
                writer.append(System.getProperty("line.separator"));
                writer.append(Juandice);
                writer.append(System.getProperty("line.separator"));
                writer.append(Edema);
                writer.append(System.getProperty("line.separator"));
                writer.append(Clubbing);
                writer.append(System.getProperty("line.separator"));
                writer.append(Lympha);
                writer.append(System.getProperty("line.separator"));
                writer.append(OroDental);
                writer.append(System.getProperty("line.separator"));
                writer.append(RespiratorySystem);
                writer.append(System.getProperty("line.separator"));
                writer.append(HeartSounds);
                writer.append(System.getProperty("line.separator"));
                writer.append(Murmurs);
                writer.append(System.getProperty("line.separator"));
                writer.append(StateofConsciousness);
                writer.append(System.getProperty("line.separator"));
                writer.append(MotorSystem);
                writer.append(System.getProperty("line.separator"));
                writer.append(SensorySystem);
                writer.append(System.getProperty("line.separator"));
                writer.append(UpperN);
                writer.append(System.getProperty("line.separator"));
                writer.append(UpperUp);
                writer.append(System.getProperty("line.separator"));
                writer.append(UpperDown);
                writer.append(System.getProperty("line.separator"));
                writer.append(LowerN);
                writer.append(System.getProperty("line.separator"));
                writer.append(LowerUp);
                writer.append(System.getProperty("line.separator"));
                writer.append(LowerDown);
                writer.append(System.getProperty("line.separator"));
                writer.append(BabinskiSign);
                writer.append(System.getProperty("line.separator"));
                writer.append(AnteriorFontanelle);
                writer.append(System.getProperty("line.separator"));
                writer.append(EyeExamination);
                writer.append(System.getProperty("line.separator"));
                writer.append(HONight);
                writer.append(System.getProperty("line.separator"));
                writer.append(ENTExamination);
                writer.append(System.getProperty("line.separator"));
                writer.append(Musculoskeletal);
                writer.append(System.getProperty("line.separator"));
                writer.append(ProvisionalDiagnosis);
                writer.append(System.getProperty("line.separator"));
                writer.append(PMedication);
                writer.append(System.getProperty("line.separator"));
                writer.append(Psychological);
                writer.append(System.getProperty("line.separator"));
                writer.append(Psychiatric);
                writer.append(System.getProperty("line.separator"));
                writer.append(Physiotherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(SpeechTherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(NutritionalRehabilitation);
                writer.append(System.getProperty("line.separator"));
                writer.append(OrthopaedicConsultation);
                writer.append(System.getProperty("line.separator"));
                writer.append(OpthalmologicConsultation);
                writer.append(System.getProperty("line.separator"));
                writer.append(OccupationalTherapy);
                writer.append(System.getProperty("line.separator"));
                writer.append(VocationalTraining);
                writer.append(System.getProperty("line.separator"));
                writer.append(Audiology);
                writer.append(System.getProperty("line.separator"));
                writer.append(Medication);
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
                    if(!data.equals("Medical Recordsheet"))
                    {
                        pw.println(data);
                    }
                    else
                    {
                        String temp = data;
                        data = myRead.nextLine();
                        if(!NameToUse.equals(data))
                        {
                            pw.println(temp);
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
                    if(!data.equals("Medical Recordsheet"))
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
                            pw.println(PatientNameField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(((JTextField)DateofExamField.getDateEditor().getUiComponent()).getText());
                            data = myRead.nextLine();
                            pw.println(FatherNameField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(CategoryBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(((JTextField)DOBField.getDateEditor().getUiComponent()).getText());
                            data = myRead.nextLine();
                            pw.println(AgeYearsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AgeMonthsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SexBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(OnZakatField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(NotOnZakatField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HistoryGivenByField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PresentingComplaintsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(IllnessInPastField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PreviousHospitalizationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HearingField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(VisionField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SpeechField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HOConsanguinityField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(FatherAgeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(MotherAgeField.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(SiblingsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AnteNatalHistoryField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(NatalField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PostNatalField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(BreastMilkExclusiveField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(FormulaCowMilkField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AgeWeaningStartedField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(DietaryHabitsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(NoneCompIncompField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HOReactionField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SocialSmileAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HeadControlAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SittingAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(CrawlingAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(StandingAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(WalkingAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SpeechAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(ControlAgeField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HistoryofAllergiesField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HistoryofSkinInfectionField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(DrugHistoryField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(GeneralAppearanceField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(GrossAbnormalitiesField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HTCMField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HTPField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(WTKGField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(WTPField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HCCMField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HCPField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MACField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SkinFoldThicknessField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(TempField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PulseField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(RespRateField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(BPField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PallorBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(CyanosisBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(JuandiceBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(EdemaBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(ClubbingBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(LymphaBox.getSelectedItem().toString());
                            data = myRead.nextLine();
                            pw.println(OroDentalField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(RespiratorySystemField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HeartSoundsField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MurmursField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(StateofConsciousnessField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MotorSystemField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SensorySystemField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(UpperNField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(UpperUpField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(UpperDownField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(LowerNField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(LowerUpField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(LowerDownField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(BabinskiSignField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AnteriorFontanelleField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(EyeExaminationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(HONightField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(ENTExaminationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MusculoskeletalField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(ProvisionalDiagnosisField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PMedicationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PsychologicalField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PsychiatricField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(PhysiotherapyField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(SpeechTherapyField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(NutritionalRehabilitationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(OrthopaedicConsultationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(OpthalmologicConsultationField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(OccupationalTherapyField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(VocationalTrainingField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(AudiologyField.getText().toString());
                            data = myRead.nextLine();
                            pw.println(MedicationField.getText().toString());
                            data = myRead.nextLine();
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

    private void LowerDownFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerDownFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LowerDownFieldActionPerformed

    private void LowerUpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerUpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LowerUpFieldActionPerformed

    private void LowerNFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerNFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LowerNFieldActionPerformed

    private void UpperDownFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperDownFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpperDownFieldActionPerformed

    private void UpperUpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperUpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpperUpFieldActionPerformed

    private void UpperNFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperNFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpperNFieldActionPerformed

    private void PallorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PallorBoxActionPerformed
        // TODO add your handling code here:
        Pallor = PallorBox.getSelectedItem().toString();
    }//GEN-LAST:event_PallorBoxActionPerformed

    private void CyanosisBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CyanosisBoxActionPerformed
        // TODO add your handling code here:
        Cyanosis = CyanosisBox.getSelectedItem().toString();
    }//GEN-LAST:event_CyanosisBoxActionPerformed

    private void JuandiceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuandiceBoxActionPerformed
        // TODO add your handling code here:
        Juandice = JuandiceBox.getSelectedItem().toString();
    }//GEN-LAST:event_JuandiceBoxActionPerformed

    private void EdemaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdemaBoxActionPerformed
        // TODO add your handling code here:
        Edema = EdemaBox.getSelectedItem().toString();
    }//GEN-LAST:event_EdemaBoxActionPerformed

    private void ClubbingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClubbingBoxActionPerformed
        // TODO add your handling code here:
        Clubbing = ClubbingBox.getSelectedItem().toString();
    }//GEN-LAST:event_ClubbingBoxActionPerformed

    private void LymphaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LymphaBoxActionPerformed
        // TODO add your handling code here:
        Lympha = LymphaBox.getSelectedItem().toString();
    }//GEN-LAST:event_LymphaBoxActionPerformed

    private void SexBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexBoxActionPerformed
        // TODO add your handling code here:
        Sex = SexBox.getSelectedItem().toString();
    }//GEN-LAST:event_SexBoxActionPerformed

    private void CategoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryBoxActionPerformed
        // TODO add your handling code here:
        Category = CategoryBox.getSelectedItem().toString();
    }//GEN-LAST:event_CategoryBoxActionPerformed

    private void AgeYearsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeYearsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeYearsFieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeMonthsField;
    private javax.swing.JTextField AgeWeaningStartedField;
    private javax.swing.JTextField AgeYearsField;
    private javax.swing.JTextPane AnteNatalHistoryField;
    private javax.swing.JTextField AnteriorFontanelleField;
    private javax.swing.JTextField AudiologyField;
    private javax.swing.JTextField BPField;
    private javax.swing.JTextField BabinskiSignField;
    private javax.swing.JTextField BreastMilkExclusiveField;
    private javax.swing.JComboBox<String> CategoryBox;
    private javax.swing.JComboBox<String> ClubbingBox;
    private javax.swing.JTextField ControlAgeField;
    private javax.swing.JTextField CrawlingAgeField;
    private javax.swing.JComboBox<String> CyanosisBox;
    private com.toedter.calendar.JDateChooser DOBField;
    private com.toedter.calendar.JDateChooser DateofExamField;
    private javax.swing.JTextField DietaryHabitsField;
    private javax.swing.JButton Download;
    private javax.swing.JTextField DrugHistoryField;
    private javax.swing.JTextPane ENTExaminationField;
    private javax.swing.JComboBox<String> EdemaBox;
    private javax.swing.JTextField EyeExaminationField;
    private javax.swing.JComboBox<String> FatherAgeField;
    private javax.swing.JTextField FatherNameField;
    private javax.swing.JTextField FormulaCowMilkField;
    private javax.swing.JTextField GeneralAppearanceField;
    private javax.swing.JTextField GrossAbnormalitiesField;
    private javax.swing.JTextField HCCMField;
    private javax.swing.JTextField HCPField;
    private javax.swing.JTextField HOConsanguinityField;
    private javax.swing.JTextField HONightField;
    private javax.swing.JTextField HOReactionField;
    private javax.swing.JTextField HTCMField;
    private javax.swing.JTextField HTPField;
    private javax.swing.JTextField HeadControlAgeField;
    private javax.swing.JTextField HearingField;
    private javax.swing.JTextField HeartSoundsField;
    private javax.swing.JTextField HistoryGivenByField;
    private javax.swing.JTextField HistoryofAllergiesField;
    private javax.swing.JTextField HistoryofSkinInfectionField;
    private javax.swing.JTextPane IllnessInPastField;
    private javax.swing.JComboBox<String> JuandiceBox;
    private javax.swing.JTextField LowerDownField;
    private javax.swing.JTextField LowerNField;
    private javax.swing.JTextField LowerUpField;
    private javax.swing.JComboBox<String> LymphaBox;
    private javax.swing.JTextField MACField;
    private javax.swing.JTextPane MedicationField;
    private javax.swing.JComboBox<String> MotherAgeField;
    private javax.swing.JTextField MotorSystemField;
    private javax.swing.JTextField MurmursField;
    private javax.swing.JTextPane MusculoskeletalField;
    private javax.swing.JTextPane NatalField;
    private javax.swing.JTextField NoneCompIncompField;
    private javax.swing.JTextField NotOnZakatField;
    private javax.swing.JTextField NutritionalRehabilitationField;
    private javax.swing.JTextField OccupationalTherapyField;
    private javax.swing.JTextField OnZakatField;
    private javax.swing.JTextField OpthalmologicConsultationField;
    private javax.swing.JTextPane OroDentalField;
    private javax.swing.JTextField OrthopaedicConsultationField;
    private javax.swing.JTextField PMedicationField;
    private javax.swing.JComboBox<String> PallorBox;
    private javax.swing.JTextField PatientNameField;
    private javax.swing.JTextField PhysiotherapyField;
    private javax.swing.JTextPane PostNatalField;
    private javax.swing.JTextPane PresentingComplaintsField;
    private javax.swing.JTextField PreviousHospitalizationField;
    private javax.swing.JTextPane ProvisionalDiagnosisField;
    private javax.swing.JTextField PsychiatricField;
    private javax.swing.JTextField PsychologicalField;
    private javax.swing.JTextField PulseField;
    private javax.swing.JTextField RespRateField;
    private javax.swing.JTextPane RespiratorySystemField;
    private javax.swing.JTextField SensorySystemField;
    private javax.swing.JComboBox<String> SexBox;
    private javax.swing.JTextField SiblingsField;
    private javax.swing.JTextField SittingAgeField;
    private javax.swing.JTextField SkinFoldThicknessField;
    private javax.swing.JTextField SocialSmileAgeField;
    private javax.swing.JTextField SpeechAgeField;
    private javax.swing.JTextField SpeechField;
    private javax.swing.JTextField SpeechTherapyField;
    private javax.swing.JTextField StandingAgeField;
    private javax.swing.JTextField StateofConsciousnessField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField TempField;
    private javax.swing.JTextField UpperDownField;
    private javax.swing.JTextField UpperNField;
    private javax.swing.JTextField UpperUpField;
    private javax.swing.JTextField VisionField;
    private javax.swing.JTextField VocationalTrainingField;
    private javax.swing.JTextField WTKGField;
    private javax.swing.JTextField WTPField;
    private javax.swing.JTextField WalkingAgeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
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
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
