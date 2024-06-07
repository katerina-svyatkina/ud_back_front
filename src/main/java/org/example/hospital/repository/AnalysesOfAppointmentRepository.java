package org.example.hospital.repository;

import org.example.hospital.entity.AnalysesOfAppointment;
import org.example.hospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnalysesOfAppointmentRepository extends JpaRepository<AnalysesOfAppointment, Integer>
{

}
