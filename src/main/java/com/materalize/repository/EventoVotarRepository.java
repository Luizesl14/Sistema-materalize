package com.materalize.repository;

import com.materalize.model.EventoCadastro;
import org.springframework.data.repository.CrudRepository;

public interface EventoVotarRepository extends CrudRepository<EventoCadastro, String> {
}
