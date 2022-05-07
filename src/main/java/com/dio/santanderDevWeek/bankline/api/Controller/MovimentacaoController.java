package com.dio.santanderDevWeek.bankline.api.Controller;

import com.dio.santanderDevWeek.bankline.api.dto.NovaMovimentacao;
import com.dio.santanderDevWeek.bankline.api.dto.NovoCorrentista;
import com.dio.santanderDevWeek.bankline.api.model.Correntista;
import com.dio.santanderDevWeek.bankline.api.model.Movimentacao;
import com.dio.santanderDevWeek.bankline.api.repository.CorrentistaRepository;
import com.dio.santanderDevWeek.bankline.api.repository.MovimentacaoRepository;
import com.dio.santanderDevWeek.bankline.api.service.CorrentistaService;
import com.dio.santanderDevWeek.bankline.api.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentaçoes")
public class MovimentacaoController {
    @Autowired
    private MovimentacaoRepository repository;

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> findAll() {
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody NovaMovimentacao movimentacao){
        service.save(movimentacao);
    }
}
