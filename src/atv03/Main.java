package atv03;

public class Main {

    public static void main(String[] args) {

        RoboAction robo1 = new AcaoElevarTemperatura();
        RoboAction robo2 = new AcaoAplicarProdutoQuimico();

        Experimento experimento = new Experimento();

        experimento.adicionarAcao(robo1);
        experimento.adicionarAcao(robo2);

        experimento.executarTeste();
    }
}
