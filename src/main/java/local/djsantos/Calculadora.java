package local.djsantos;

public class Calculadora {
        public int somar(String expression) {
            int soma =0;
            for (String valor: expression.split("\\+")) {
                soma += Integer.valueOf(valor.trim());
            }

            System.out.println(soma);
            return soma;
        }

}
