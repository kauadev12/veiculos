public class Veiculo {
    private String placa;
    private int ano;

    // Construtor vazio
    public Veiculo() {}

    // Construtor com parâmetros
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Setters e Getters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Veículo [Placa: " + placa + ", Ano: " + ano + "]");
    }
}
