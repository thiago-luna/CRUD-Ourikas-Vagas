package com.AppRH.AppRH.repository;

import com.AppRH.AppRH.Models.Vaga;
import jakarta.validation.Valid;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface VagaRepository extends CrudRepository<Vaga, String>{

	Vaga findByCodigo(long codigo);
	List<Vaga> findByNome(String nome);

}
