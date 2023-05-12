package br.com.alura.tdd.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;




public class ReajusteServeTeste {
    private  ReajusteServe reajusteserve;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializa(){
        this.reajusteserve = new ReajusteServe();
        this.funcionario = new Funcionario("Ana", LocalDate.now(),new BigDecimal("1000") );
    }

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoODesempenhoForADesejar(){
        reajusteserve.concederReajuste(funcionario,Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"),funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoODesempenhoForBom(){
        reajusteserve.concederReajuste(funcionario,Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"),funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeTrintaPorcentoQuandoODesempenhoForExcelente(){
        reajusteserve.concederReajuste(funcionario,Desempenho.EXCELENTE);
        assertEquals(new BigDecimal("1300.00"),funcionario.getSalario());
    }

}
