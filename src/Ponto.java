public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    public boolean CompararCoordenadasPontos(int x, int y) {
        if (this.x == x && this.y == y) {
            return true;
        } else {
            return false;
        }
    }
    public boolean CompararCoordenadasPontos(Ponto ponto) {
        if (this.x == ponto.x && this.y == ponto.y) {
            return true;
        } else {
            return false;
        }
    }
    public int calcularDistanciaPontos(int x, int y) {
        double distanciaPontos = Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
        int value = (int)distanciaPontos;
        return value;
        }

    public int calcularDistanciaPontos(Ponto  ponto) {
        double distanciaPontos = Math.sqrt(Math.pow(this.x - ponto.x,2) + Math.pow(this.y - ponto.y,2));
        int value = (int)distanciaPontos;
        return value;
    }
}

