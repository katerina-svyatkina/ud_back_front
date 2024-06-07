package org.example.hospital.repository;


import org.example.hospital.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Integer> {

  //  @Query(
   //        value = "SELECT * FROM resultsofanalyses WHERE id_appointment = :id_appointment"
     //       , nativeQuery = true
   // )
  // List<Results> findByResults(@Param("id_appointment") Integer id);//ERROR?
}
