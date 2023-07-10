package pe.isil.microservicios_2978.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.isil.microservicios_2978.model.Login;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    List<Login> findByEmail(String email);


}
