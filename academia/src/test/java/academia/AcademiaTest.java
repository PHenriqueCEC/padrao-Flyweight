package academia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;


public class AcademiaTest {

    @Test
    void deveRetornarFuncionarios() {
        Academia academia = new Academia();

        academia.contratar("Carol", "Recepcionista", 2000f);
        academia.contratar("Jorge", "Recepcionista", 2000f);
        academia.contratar("Ana", "Recepcionista", 2000f);
        academia.contratar("Luan", "Estagiario", 1000f);
        academia.contratar("Letícia", "Estagiario", 1000f);
        academia.contratar("Everaldo", "Personal Trainer", 3000f);
        academia.contratar("Vitor", "Personal Trainer", 3000f);

        List<String> exibir = Arrays.asList(
                "Funcionario{nome='Carol', cargo='Recepcionista', salario='2000.0'}",
                "Funcionario{nome='Jorge', cargo='Recepcionista', salario='2000.0'}",
                "Funcionario{nome='Ana', cargo='Recepcionista', salario='2000.0'}",
                "Funcionario{nome='Luan', cargo='Estagiario', salario='1000.0'}",
                "Funcionario{nome='Letícia', cargo='Estagiario', salario='1000.0'}",
                "Funcionario{nome='Everaldo', cargo='Personal Trainer', salario='3000.0'}",
                "Funcionario{nome='Vitor', cargo='Personal Trainer', salario='3000.0'}"
        );
        assertEquals(exibir, academia.obterFuncionarios());

    }

    @Test
    void deveRetornarTotalCargos() {
        Academia academia = new Academia();

        academia.contratar("Carol", "Recepcionista", 2000f);
        academia.contratar("Jorge", "Recepcionista", 2000f);
        academia.contratar("Ana", "Recepcionista", 2000f);
        academia.contratar("Luan", "Estagiario", 1000f);
        academia.contratar("Letícia", "Estagiario", 1000f);
        academia.contratar("Everaldo", "Personal Trainer", 3000f);
        academia.contratar("Vitor", "Personal Trainer", 3000f);

        assertEquals(3, CargoFactory.getTotalCargos());
    }

}
