package net.laichi.hopital_spring_mvc.Repository;
import net.laichi.hopital_spring_mvc.entities.Patient;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findByNomContains(String keyword, Pageable pageable);
    //avec Pageable je peut transmetter le numero de la page et le size


    //@Query("select p from Patient p where p.nom like :x") //langage HQL !!!
    //Page<Patient> chercher(@Param("x") String keyword);
}
