package view;

import model.*;

import java.util.Date;
import java.util.Properties;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class FormInputData {

    private File photoFile;
    private File signatureFile;

    public FormInputData() {
        showForm();
    }

    public void showForm() {
        JFrame formKTP = new JFrame("Input Data KTP");
        formKTP.setSize(1000, 700);
        formKTP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        formKTP.setLocationRelativeTo(null);
        formKTP.setLayout(null);
        
        
        JLabel labelJudul = new JLabel("FORM KTP");
        labelJudul.setBounds(10, 10, 100, 10);
        formKTP.add(labelJudul);
        
        JLabel labelNIK = new JLabel("NIK");
        labelNIK.setBounds(10, 40, 50, 20);
        formKTP.add(labelNIK);
        
        JTextField inputNIK = new JTextField();
        inputNIK.setBounds(120, 40, 100, 20);
        formKTP.add(inputNIK);
        
        JLabel labelNama = new JLabel("Nama");
        labelNama.setBounds(10, 80, 50, 20);
        formKTP.add(labelNama);
        
        JTextField inputNama = new JTextField();
        inputNama.setBounds(120, 80, 100, 20);
        formKTP.add(inputNama);
        
        JLabel labelTempatLahir = new JLabel("Tempat Lahir");
        labelTempatLahir.setBounds(10, 120, 200, 20);
        formKTP.add(labelTempatLahir);
        
        JTextField inputTempatLahir = new JTextField();
        inputTempatLahir.setBounds(120, 120, 100, 20);
        formKTP.add(inputTempatLahir);

        JLabel labelTanggalLahir = new JLabel("Tanggal Lahir");
        labelTanggalLahir.setBounds(10, 160, 100, 20);
        formKTP.add(labelTanggalLahir);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        datePicker.setBounds(120, 160, 100, 30);
        formKTP.add(datePicker);
        
        JLabel labelJenisKelamin = new JLabel("Jenis Kelamin");
        labelJenisKelamin.setBounds(10, 200, 100, 20);
        formKTP.add(labelJenisKelamin);
        
        JRadioButton inputJenisKelaminPria = new JRadioButton();
        inputJenisKelaminPria.setText("Pria");
        inputJenisKelaminPria.setBounds(115, 200,50, 20);

        JRadioButton inputJenisKelaminWanita = new JRadioButton();
        inputJenisKelaminWanita.setText("Wanita");
        inputJenisKelaminWanita.setBounds(165, 200, 75, 20);

        formKTP.add(inputJenisKelaminPria);
        formKTP.add(inputJenisKelaminWanita);

        ButtonGroup groupJenisKelamin = new ButtonGroup();
        groupJenisKelamin.add(inputJenisKelaminPria);
        groupJenisKelamin.add(inputJenisKelaminWanita);

        JLabel labelGolonganDarah = new JLabel("Golongan Darah");
        labelGolonganDarah.setBounds(10, 240, 100, 20);
        formKTP.add(labelGolonganDarah);
        
        JRadioButton inputGolonganDarahA = new JRadioButton();
        inputGolonganDarahA.setText("A");
        inputGolonganDarahA.setBounds(115, 240,50, 20);

        JRadioButton inputGolonganDarahB = new JRadioButton();
        inputGolonganDarahB.setText("B");
        inputGolonganDarahB.setBounds(165, 240, 75, 20);

        JRadioButton inputGolonganDarahAB = new JRadioButton();
        inputGolonganDarahAB.setText("AB");
        inputGolonganDarahAB.setBounds(115, 280,50, 20);

        JRadioButton inputGolonganDarahO = new JRadioButton();
        inputGolonganDarahO.setText("O");
        inputGolonganDarahO.setBounds(165, 280, 75, 20);

        formKTP.add(inputGolonganDarahA);
        formKTP.add(inputGolonganDarahB);
        formKTP.add(inputGolonganDarahAB);
        formKTP.add(inputGolonganDarahO);

        ButtonGroup groupGolonganDarah = new ButtonGroup();
        groupGolonganDarah.add(inputGolonganDarahA);
        groupGolonganDarah.add(inputGolonganDarahB);
        groupGolonganDarah.add(inputGolonganDarahAB);
        groupGolonganDarah.add(inputGolonganDarahO);

        JLabel labelAlamat = new JLabel("Alamat");
        labelAlamat.setBounds(10, 320, 200, 20);
        formKTP.add(labelAlamat);
        
        JTextField inputAlamat = new JTextField();
        inputAlamat.setBounds(120, 320, 100, 20);
        formKTP.add(inputAlamat);

        JLabel labelRTRW = new JLabel("RT/RW");
        labelRTRW.setBounds(10, 360, 200, 20);
        formKTP.add(labelRTRW);
        
        JTextField inputRTRW = new JTextField();
        inputRTRW.setBounds(120, 360, 100, 20);
        formKTP.add(inputRTRW);

        JLabel labelKelDesa = new JLabel("Kel/Desa");
        labelKelDesa.setBounds(10, 400, 200, 20);
        formKTP.add(labelKelDesa);
        
        JTextField inputKelDesa = new JTextField();
        inputKelDesa.setBounds(120, 400, 100, 20);
        formKTP.add(inputKelDesa);

        JLabel labelKecamatan = new JLabel("Kecamatan");
        labelKecamatan.setBounds(10, 440, 200, 20);
        formKTP.add(labelKecamatan);
        
        JTextField inputKecamatan = new JTextField();
        inputKecamatan.setBounds(120, 440, 100, 20);
        formKTP.add(inputKecamatan);

        JLabel labelAgama = new JLabel("Agama");
        labelAgama.setBounds(10, 480, 200, 20);
        formKTP.add(labelAgama);

        JComboBox<String> agamaComboBox = new JComboBox<>();
        agamaComboBox.addItem("KRISTEN");
        agamaComboBox.addItem("KATHOLIK");
        agamaComboBox.addItem("ISLAM");
        agamaComboBox.addItem("HINDU");
        agamaComboBox.addItem("BUDDHA");
        agamaComboBox.addItem("KONGHUCU");
        agamaComboBox.addItem("ADAT_KEPERCAYAAN");

        agamaComboBox.setBounds(120, 480, 100, 20);
        formKTP.add(agamaComboBox);

        JLabel labelStatusPerkawinan = new JLabel("Status Kawin");
        labelStatusPerkawinan.setBounds(10, 520, 200, 20);
        formKTP.add(labelStatusPerkawinan);

        JComboBox<String> kawinComboBox = new JComboBox<>();
        kawinComboBox.addItem("BELUM_MENIKAH");
        kawinComboBox.addItem("MENIKAH");
        kawinComboBox.addItem("JANDA");
        kawinComboBox.addItem("DUDA");
    
        kawinComboBox.setBounds(120, 520, 100, 20);
        formKTP.add(kawinComboBox);

        JLabel pekerjaanLabel = new JLabel("Pekerjaan");
        pekerjaanLabel.setBounds(400, 40, 100, 20);
        formKTP.add(pekerjaanLabel);

        JCheckBox karyawanSwastaCheck = new JCheckBox("Karyawan Swasta");
        karyawanSwastaCheck.setBounds(600, 40, 150, 20);

        JCheckBox pnsCheck = new JCheckBox("PNS");
        pnsCheck.setBounds(750, 40, 100, 20);

        JCheckBox wiraswastaCheck = new JCheckBox("Wiraswasta");
        wiraswastaCheck.setBounds(600, 80, 100, 20);

        JCheckBox akademisiCheck = new JCheckBox("Akademisi");
        akademisiCheck.setBounds(750, 80, 100, 20);

        JCheckBox pengangguranCheck = new JCheckBox("Pengangguran");
        pengangguranCheck.setBounds(600, 120, 150, 20);

        formKTP.add(karyawanSwastaCheck);
        formKTP.add(pnsCheck);
        formKTP.add(wiraswastaCheck);
        formKTP.add(akademisiCheck);
        formKTP.add(pengangguranCheck);

        pengangguranCheck.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                if (pengangguranCheck.isSelected()) {
                    karyawanSwastaCheck.setEnabled(false);
                    pnsCheck.setEnabled(false);
                    wiraswastaCheck.setEnabled(false);
                    akademisiCheck.setEnabled(false);
                    karyawanSwastaCheck.setSelected(false);
                    pnsCheck.setSelected(false);
                    wiraswastaCheck.setSelected(false);
                    akademisiCheck.setSelected(false);
                } else {
                    karyawanSwastaCheck.setEnabled(true);
                    pnsCheck.setEnabled(true);
                    wiraswastaCheck.setEnabled(true);
                    akademisiCheck.setEnabled(true);
                }
            }
        });

        JLabel citizenshipLabel = new JLabel("Kewarganegaraan");
        citizenshipLabel.setBounds(400, 160, 200, 20);
        formKTP.add(citizenshipLabel);

        JRadioButton wniRadio = new JRadioButton("WNI");
        wniRadio.setBounds(600, 160, 100, 20);
        formKTP.add(wniRadio);

        JRadioButton wnaRadio = new JRadioButton("WNA");
        wnaRadio.setBounds(700, 160, 100, 20);
        formKTP.add(wnaRadio);

        ButtonGroup citizenshipGroup = new ButtonGroup();
        citizenshipGroup.add(wniRadio);
        citizenshipGroup.add(wnaRadio);

        JLabel countryLabel = new JLabel("Asal Negara");
        countryLabel.setBounds(400, 200, 200, 20);
        countryLabel.setVisible(false);
        formKTP.add(countryLabel);

        JTextField citizenshipField = new JTextField();
        citizenshipField.setBounds(600, 200, 200, 20);
        citizenshipField.setVisible(false);
        formKTP.add(citizenshipField);

        wnaRadio.addActionListener(e -> {
            countryLabel.setVisible(true);
            citizenshipField.setVisible(true);
        });

        wniRadio.addActionListener(e -> {
            countryLabel.setVisible(false);
            citizenshipField.setVisible(false);
            citizenshipField.setText("");
        });

        JLabel photoLabel = new JLabel("Foto");
        photoLabel.setBounds(400, 240, 200, 20);
        formKTP.add(photoLabel);

        JButton photoButton = new JButton("Upload Photo");
        photoButton.setBounds(600, 240, 200, 20);
        formKTP.add(photoButton);

        photoButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                photoFile = fileChooser.getSelectedFile();
            }
        });

        JLabel signatureLabel = new JLabel("Tanda Tangan");
        signatureLabel.setBounds(400, 280, 200, 20);
        formKTP.add(signatureLabel);

        JButton signatureButton = new JButton("Upload Signature");
        signatureButton.setBounds(600, 280, 200, 20);
        formKTP.add(signatureButton);

        signatureButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                signatureFile = fileChooser.getSelectedFile();
            }
        });

        JLabel tglBerlakuLabel = new JLabel("Berlaku Hingga");
        tglBerlakuLabel.setBounds(400, 320, 200, 20);
        formKTP.add(tglBerlakuLabel);

        JTextField tglBerlakuField = new JTextField();
        tglBerlakuField.setBounds(600, 320, 200, 20);
        formKTP.add(tglBerlakuField);

        JLabel kotaPembuatanLabel = new JLabel("Kota Pembuatan");
        kotaPembuatanLabel.setBounds(400, 360, 200, 20);
        formKTP.add(kotaPembuatanLabel);

        JTextField kotaPembuatanField = new JTextField();
        kotaPembuatanField.setBounds(600, 360, 200, 20);
        formKTP.add(kotaPembuatanField);

        JLabel tglPembuatanLabel = new JLabel("Tanggal Pembuatan");
        tglPembuatanLabel.setBounds(400, 400, 220, 20);
        formKTP.add(tglPembuatanLabel);

        UtilDateModel tglPembuatanmodel = new UtilDateModel();
        Properties tglPembuatanProperties = new Properties();
        JDatePanelImpl tglPembuatanPanel = new JDatePanelImpl(tglPembuatanmodel, tglPembuatanProperties);
        JDatePickerImpl tglPembuatanPicker = new JDatePickerImpl(tglPembuatanPanel, new DateLabelFormatter());

        tglPembuatanPicker.setBounds(600, 400, 200, 30);
        formKTP.add(tglPembuatanPicker);

        JButton submitButton = new JButton("SUBMIT");
        submitButton.setBounds(400, 440, 400, 70);
        formKTP.add(submitButton);

        formKTP.setVisible(true);
    }

}