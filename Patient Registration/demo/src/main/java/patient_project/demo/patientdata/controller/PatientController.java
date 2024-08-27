package patient_project.demo.patientdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import patient_project.demo.patientdata.PatientRepository.java.PatientRepository;
import patient_project.demo.patientdata.model.Patient;

public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id){
        return patientRepository.findById(id)
                .map(patient -> ResponseEntity.ok().body(patient))
                .orElse(ResponseEntity.notFound().build());
    }
}
