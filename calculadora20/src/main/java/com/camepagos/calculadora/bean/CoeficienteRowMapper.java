package com.camepagos.calculadora.bean;

import org.springframework.stereotype.Component;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CoeficienteRowMapper implements RowMapper<Coeficiente> {

    @Override
    public Coeficiente mapRow (ResultSet rs, int rowNum) throws SQLException{
        Coeficiente coeficiente = new Coeficiente();
        coeficiente.setId_cuota(rs.getInt("id_cuota"));
        coeficiente.setNombre_tc(rs.getString("nombre_tc"));
        coeficiente.setCuota(rs.getInt("cuota"));
        coeficiente.setCoef(rs.getDouble("coef"));
        return coeficiente;
    }
}
