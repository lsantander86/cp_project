package com.camepagos.calculadora.controller;

import com.camepagos.calculadora.bean.Coeficiente;
import com.camepagos.calculadora.repository.CoeficienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cuotas")

public class CoeficienteController {
    @Autowired
    public CoeficienteRepository coeficienteRepository;

    @GetMapping
    List<Coeficiente> getCoef(){

        return coeficienteRepository.getCoef();
    }
}
