
package com.Portfolio.Ap.Repository;

import com.Portfolio.Ap.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
    
    
    
}
