public class Main {
    public static void main(String[] args) {
        // Array de veículos para teste
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Veiculo("ABC1234", 2010);
        veiculos[1] = new Caminhao("XYZ5678", 2015, 4);
        veiculos[2] = new Onibus("LMN9101", 2018, 50);

        // Exibindo os dados dos veículos no console
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
            System.out.println();
        }
    }
}
