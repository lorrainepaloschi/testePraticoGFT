
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
        calculaFrete(peso, valor){
            if (peso<15000){
                return (peso*0,2)+(valor*0,1)+ 5000; 
            }
            return (peso*0,2)+(valor*0,1);   
        }
    }
    public class Caminhao extends Transporte{
        calculaFrete(peso, valor){
            return (peso*0,12)+ (valor*0,30);   
        }
        
    }
}