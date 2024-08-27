package patient_project.demo.patientdata.PatientRepository.java;

import org.springframework.data.jpa.repository.JpaRepository;

import patient_project.demo.patientdata.model.Patient;
public interface PatientRepository extends JpaRepository<Patient, Long> {}