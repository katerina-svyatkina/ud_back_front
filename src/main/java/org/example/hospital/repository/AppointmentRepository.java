package org.example.hospital.repository;

import org.example.hospital.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {

    @Query(
            value = "SELECT * FROM appointment WHERE id_client = :id_client"
            , nativeQuery = true
    )
    List<Appointment> findByClient_Id_client(@Param("id_client") Integer id);//ERROR?

    @Query(
            value = "SELECT * FROM appointment WHERE id_employee = :id_employee"
            , nativeQuery = true
    )
    List<Appointment> findByEmployee_Id_employee(@Param("id_employee") Integer id);//ERROR?
}
