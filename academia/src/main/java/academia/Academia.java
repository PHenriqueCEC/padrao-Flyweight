package academia;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void contratar(String nomeFuncionario, String nomeCargoAcademia, float valorSalario) {
        Cargo cargo = CargoFactory.getCargo(nomeCargoAcademia, valorSalario);
        Funcionario funcionario = new Funcionario(nomeFuncionario, cargo);
        funcionarios.add(funcionario);
    }
    public List<String> obterFuncionarios() {
        List<String> exibicao = new ArrayList<>();
        for (Funcionario funcionario : this.funcionarios) {
            exibicao.add(funcionario.toString());
        }
        return exibicao;
    }

}