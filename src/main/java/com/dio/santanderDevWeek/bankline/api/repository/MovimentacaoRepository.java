package com.dio.santanderDevWeek.bankline.api.repository;

import com.dio.santanderDevWeek.bankline.api.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
}
