package com.materalize.repository;

import com.materalize.entities.EventoCadastro;
import org.springframework.data.repository.CrudRepository;

public interface EvendoRepository extends CrudRepository<EventoCadastro, String> {
}
