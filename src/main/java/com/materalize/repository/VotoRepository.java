package com.materalize.repository;

import com.materalize.model.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, String> {
    String findByLejardin(String le);
    String findByEvian(String evi);
    String findByOlimpia(String oli);

}
