package com.materalize.repository;

import com.materalize.model.EventoCadastro;
import org.springframework.data.repository.CrudRepository;

public interface EvendoRepository extends CrudRepository<EventoCadastro, String> {
}
