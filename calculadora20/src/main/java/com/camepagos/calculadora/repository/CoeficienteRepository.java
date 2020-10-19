package com.camepagos.calculadora.repository;

import com.camepagos.calculadora.bean.Coeficiente;
import com.camepagos.calculadora.bean.CoeficienteRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoeficienteRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    CoeficienteRowMapper coeficienteRowMapper;

    public List<Coeficiente> getCoef(){

        return jdbcTemplate.query("SELECT * FROM tc INNER JOIN cuotas ON cuotas.id_tc=tc.id", coeficienteRowMapper);
    }

}
