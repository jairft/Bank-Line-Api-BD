package com.dio.santanderDevWeek.bankline.api.service;

import com.dio.santanderDevWeek.bankline.api.dto.NovoCorrentista;
import com.dio.santanderDevWeek.bankline.api.model.Conta;
import com.dio.santanderDevWeek.bankline.api.model.Correntista;
import com.dio.santanderDevWeek.bankline.api.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CorrentistaService {
    @Autowired
    private CorrentistaRepository repository;

    public void save(NovoCorrentista novoCorrentista){
        Correntista correntista = new Correntista();
        correntista.setCpf(novoCorrentista.getCpf());
        correntista.setNome(novoCorrentista.getNome());

        Conta conta = new Conta();
        conta.setSaldo(0.00);
        conta.getNumero(new Date().getTime());

        correntista.setConta(conta);
        repository.save(correntista);
    }
}
