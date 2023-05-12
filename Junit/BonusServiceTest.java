package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusServiceTest {
    @Test
    void bonusDeveriaSerZeroParaFuncionarioCOmSalarioMuitoAlto() {
        BonusService service = new BonusService();
        assertThrows(IllegalArgumentException.class, () -> service.calcularBonus(new Funcionario("Victor", LocalDate.now(), new BigDecimal("25000"))));
    }
    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Victor", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.0"),bonus);
    }   
    @Test
    void bonusDeveriaSer10PorCentoParaSalarioDe10000() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Victor", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.0"),bonus);
    }
}
