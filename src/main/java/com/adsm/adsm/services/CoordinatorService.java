package com.adsm.adsm.services;

import com.adsm.adsm.model.Diagnosis;
import com.adsm.adsm.model.Patient;
import com.adsm.adsm.model.Receipt;
import com.adsm.adsm.model.Staff;
import com.adsm.adsm.model.Drug;
import com.adsm.adsm.repositories.DiagnosysRepository;
import com.adsm.adsm.repositories.PatientRepository;
import com.adsm.adsm.repositories.ReceiptRepository;
import com.adsm.adsm.repositories.StaffRepository;
import org.springframework.stereotype.Service;
import com.adsm.adsm.repositories.DrugRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoordinatorService {

    private StaffRepository staffRepository;
    private PatientRepository patientRepository;
    private DiagnosysRepository diagnosysRepository;
    private ReceiptRepository receiptRepository;
    private DrugRepository drugRepository;
    public CoordinatorService(StaffRepository staffRepository, PatientRepository patientRepository, DiagnosysRepository diagnosysRepository, ReceiptRepository receiptRepository, DrugRepository drugRepository) {
        this.staffRepository = staffRepository;
        this.patientRepository = patientRepository;
        this.diagnosysRepository = diagnosysRepository;
        this.receiptRepository = receiptRepository;
        this.drugRepository = drugRepository;

    }





    //create functions
    public void createStaff(Staff staff) {
        staffRepository.save(staff);
    }

    public void createPatientReciept(Receipt receipt) {
        receiptRepository.save(receipt);
    }


    //get functions


    //Show all Staffs
    public List<Staff> ListAllStaff() {
        List<Staff> staffs = new ArrayList<>();
        staffRepository.findAll().forEach(staffs::add);
        System.out.println(staffs + "______________");
        return staffs;
    }

    //show all Patients
    public List<Patient> ListAllPatient() {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll().forEach(patients::add);
        System.out.println(patients + "______________");
        return patients;
    }

    public Patient findPatientById(Long patientCode) {
        Patient patient;
        patient=patientRepository.findByPatientId(patientCode);
        System.out.println(patient + "______________"+patientCode);
        return patient;
    }

    public Drug findDrugById(Long drugID){
        Drug drug;
        drug=drugRepository.getOne(drugID);
        return drug;
    }
    //Show all diagnosys
    public List<Diagnosis> ListAllDiagnosys() {
        List<Diagnosis> diagnoses = new ArrayList<>();
        diagnosysRepository.findAll().forEach(diagnoses::add);
        return diagnoses;
    }
}



