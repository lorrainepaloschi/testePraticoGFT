import java.util.Scanner;

public class exe3 {
    abstract class Operacao{
        protected int x;
        protected int y;

        public int getX() {
            return this.x;
        }

        public void setX(final int x) {
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public void setY(final int y) {
            this.y = y;
        }

        public abstract int efetuarOperacao(int x, int y);

    }

    public class Soma extends Operacao {

        @Override
        public int efetuarOperacao(x,y) {
            return x+y;
        }
    }
    public class Subtracao extends Operacao {

        @Override
        public int efetuarOperacao(x,y) {
            return x-y;
        }
    }
    public class Divisao extends Operacao {

        @Override
        public int efetuarOperacao(x,y) {
            if (y!=0){
                return x/y;
            }
            else{
                System.out.println("Não é possivel dividir por 0");
                return 0;
            }

        }
    }
    public class Multiplicacao extends Operacao {

        @Override
        public int efetuarOperacao(x,y) {
            return x*y;
        }
    }
    public static void main(String[] args){
        Scanner recebe = new Scanner(System.in);
        int x = recebe.nextInt();
        int y = recebe.nextInt();

        Soma soma = new efetuarOperacao(x,y);
        Subtracao sub = new efetuarOperacao();
        Divisao div = new efetuarOperacao();
        Multiplicacao mult = new efetuarOperacao();

        System.out.println("Soma = " +soma+"\nSubtração = " +sub+ "\nDivisão = " +div+ "\nMultiplicação = " + mult);
    }
}

