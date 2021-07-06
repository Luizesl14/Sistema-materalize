package com.materalize.repository;
import com.materalize.model.EventoVotar;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventoVotarRepository extends CrudRepository<EventoVotar, String> {


}