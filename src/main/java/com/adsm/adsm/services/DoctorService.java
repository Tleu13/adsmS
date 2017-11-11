package com.adsm.adsm.services;

import com.adsm.adsm.model.Patient;
import com.adsm.adsm.model.Staff;
import com.adsm.adsm.model.TaskPrototype;
import com.adsm.adsm.repositories.DiagnosysRepository;
import com.adsm.adsm.repositories.PatientRepository;
import com.adsm.adsm.repositories.ResearchRepository;
import com.adsm.adsm.repositories.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    private ResearchRepository researchRepository;
    private StaffRepository staffRepository;
    private PatientRepository patientRepository;
    private DiagnosysRepository diagnosysRepository;

    public DoctorService(ResearchRepository researchRepository, StaffRepository staffRepository, PatientRepository patientRepository,DiagnosysRepository diagnosysRepository) {
        this.researchRepository = researchRepository;
        this.staffRepository = staffRepository;
        this.patientRepository = patientRepository;
        this.diagnosysRepository=diagnosysRepository;
    }

   public List<Patient> listMyPatients(long doctorId) {
        List<Patient> patients = new ArrayList<>();
        patientRepository.findAllPatientsByDoctor_Id(doctorId).forEach(patients::add);
       return patients;
    }
    public Patient listMyPatient(long patientId) {
        Patient patients = new Patient();
        patientRepository.findOne(patientId);
        return patients;
    }
}

