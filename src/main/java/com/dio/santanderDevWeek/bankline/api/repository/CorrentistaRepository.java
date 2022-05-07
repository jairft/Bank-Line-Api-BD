package com.dio.santanderDevWeek.bankline.api.repository;

import com.dio.santanderDevWeek.bankline.api.model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
