package local.djsantos;

public class Calculator {
        public int sum(String expression) {
            int sum =0;
            for (String valor: expression.split("\\+")) {
                sum += Integer.valueOf(valor.trim());
            }

            System.out.println(sum);
            return sum;
        }

}
