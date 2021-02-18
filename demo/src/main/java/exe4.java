
public class exe4 {

    public abstract class Transporte {

    }

    public class Carga extends Transporte {
        int valor;
        double peso;

        public int getValor() {
            return this.valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public double getPeso() {
            return this.peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public class Vagao extends Transporte{

        }
        public class Caminhao extends Transporte{
            
        }
    }
}