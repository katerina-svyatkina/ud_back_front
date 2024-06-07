package org.example.hospital.repository;

import org.example.hospital.entity.Appointment;
import org.example.hospital.entity.MedicinesOfAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicinesOfAppointmentRepository extends JpaRepository<MedicinesOfAppointment, Integer> {
   // @Query(
   //         value = "SELECT * FROM medicinesofappointment WHERE id_appointment = :id_appointment"
     //       , nativeQuery = true
   // )
   // List<Appointment> findMedicinesOfAppointmentBy(@Param("id_client") Integer id);//ERROR?
}
