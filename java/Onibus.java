public class Onibus extends Veiculo {
    private int assentos;

    // Construtor com parâmetros
    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    // Setters e Getters
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    // Sobrescrita do método exibirDados
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Ônibus [Assentos: " + assentos + "]");
    }
}
