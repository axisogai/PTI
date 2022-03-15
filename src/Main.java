public class Main {
    public static void main(String[] args) throws Exception {

            Ponto ponto1 = new Ponto (5,3);
            
            Ponto ponto2 = new Ponto(3,3);
            
            boolean comparacaoDosPontos = ponto1.CompararCoordenadasPontos(8,1);
            boolean comparacaoDosPontos2 = ponto1.CompararCoordenadasPontos(ponto2);
        
            int distanciaEntrePontos = ponto1.calcularDistanciaPontos(1,1);
            int distanciaEntrePontos2 = ponto1.calcularDistanciaPontos(ponto2);
        
            // String result = (comparacaoDosPontos=true) ? "Sim" : "Não";
            // String result2 = (comparacaoDosPontos2=true) ? "Sim" : "Não";

        
        System.out.println("Pontos possuem as mesmas coordenadas:" + " " + comparacaoDosPontos);
        System.out.println("Pontos possuem as mesmas coordenadas:" + " " + comparacaoDosPontos2);
        System.out.println("Distância entre pontos:" + " " + distanciaEntrePontos);
        System.out.println("Distância entre pontos:" + " " + distanciaEntrePontos2);
    }
}

