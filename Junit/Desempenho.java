package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
    A_DESEJAR{
        @Override
        public BigDecimal porcentualReajuste() {
            return new BigDecimal("0.03");
        }
    }    ,BOM{
        @Override
        public BigDecimal porcentualReajuste() {
            return new BigDecimal("0.15");
        }
    },EXCELENTE{
        @Override
        public BigDecimal porcentualReajuste() {
            return new BigDecimal("0.30");
        }
    } ;
       public abstract BigDecimal porcentualReajuste();

}
