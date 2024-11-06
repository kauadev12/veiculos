public class Caminhao extends Veiculo {
    private int eixos;

    // Construtor com parâmetros
    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    // Setters e Getters
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    // Sobrescrita do método exibirDados
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Caminhão [Eixos: " + eixos + "]");
    }
}

