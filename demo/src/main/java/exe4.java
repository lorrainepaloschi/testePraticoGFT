
public class exe4 {

    public abstract class Transporte {

    }

    public class Carga extends Transporte {
        int valor;
        double peso;

        public int getValor() {
            return this.valor;
        }

        public void setValor(final int valor) {
            this.valor = valor;
        }

        public double getPeso() {
            return this.peso;
        }

        public void setPeso(final double peso) {
            this.peso = peso;
        }

        public double calculaFrete(peso, valor);

    }
    public class Vagao extends Transporte{
        
    }
    public class Caminhao extends Transporte{

    }
}