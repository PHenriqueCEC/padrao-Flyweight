package academia;

public class Cargo {

    private String cargoNaAcademia;
    private float salario;

    public Cargo(String cargoNaAcademia, float salario) {
        this.cargoNaAcademia = cargoNaAcademia;
        this.salario = salario;

    }

    public String getCargoNaAcademia()
    {
        return cargoNaAcademia;
    }

    public float getSalario() {
        return salario;
    }
}
