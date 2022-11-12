package academia;

import java.util.HashMap;
import java.util.Map;

public class CargoFactory {
    private static Map<String, Cargo> cargos = new HashMap<>();

    public static Cargo getCargo(String cargoNaAcademia, float salario) {
        Cargo cargo = cargos.get(cargoNaAcademia);

        if (cargo == null) {
            cargo = new Cargo(cargoNaAcademia, salario);
            cargos.put(cargoNaAcademia, cargo);
        }
        return cargo;
    }

    public static int getTotalCargos() {
        return cargos.size();
    }
}
