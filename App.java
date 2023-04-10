import java.awt.GridBagLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Cachorro marley = new Cachorro("Marley", "poodle", "Maria", "pequeno", 5500);
        marley.start();

        // JFrame meuFrame = new JFrame("Meu cachorro Marley");
        // meuFrame.setSize(900, 600);

        // JPanel meuPainel = new JPanel();
        // meuPainel.setLayout(new GridBagLayout());
        // meuPainel.setSize(900, 600);
        // meuFrame.add(meuPainel);

        // JLabel labelNome = new JLabel();
        // labelNome.setText("Nome");

        // meuFrame.setVisible(true);
        // meuFrame.add(labelNome);

        System.out.println(marley.especie);
        System.out.println(marley.nome);
        System.out.println(marley.getRaca());
        System.out.println(marley.getPorte());
        System.out.println(marley.getPeso());

        marley.setRaca("pug");

        System.out.println("Short minimo = " + Short.MIN_VALUE);
        System.out.println("Short maximo = " + Short.MAX_VALUE);

        System.out.println("Long minimo = " + Long.MIN_VALUE);
        System.out.println("Long maximo = " + Long.MAX_VALUE);

        System.out.println("Double minimo = " + Double.MIN_VALUE);
        System.out.println("Double maximo = " + Double.MAX_VALUE);

        System.out.println("Integer minimo = " + Integer.MIN_VALUE);
        System.out.println("Integer maximo = " + Integer.MAX_VALUE);

        System.out.println("Float minimo = " + Float.MIN_VALUE);
        System.out.println("Float maximo = " + Float.MAX_VALUE);

        int x = 5;
        System.out.println(((Object) x).getClass().getSimpleName());
        System.out.println(marley.getClass().getSimpleName());

        // if else
        if (x == 5) {
            System.out.println("o valor de x == 5");
        } else if (x == 55) {
            System.out.println("o valor de x = 55");
        }

        // switch case
        switch (x) {
            case 1:
                System.out.println("o valor de x = 1");
            case 2:
                System.out.println("o valor de x = 2");
            case 3:
                System.out.println("o valor de x = 3");
            case 4:
                System.out.println("o valor de x = 4");
            case 5:
                System.out.println("o valor de x = 5");
            default:
                System.out.println("o valor de x nao corresponde a nenhuma opcao");
        }

        // while
        while (x >= 6) {
            System.out.println("O valor de x agora = " + x);
            x--;
        }

        // do while
        do {
            System.out.println("O valor de x agora = " + x);
            x--;
        } while (x >= 6);

        // for
        for (int iControle = 0; iControle < 10; iControle++) {
            System.out.println("O valor de iControle = " + iControle);
        }

        // Array
        int numeros[] = { 234, 567, 789, 1178 };

        // for each
        for (int numero : numeros) {
            System.out.println("o valor do numero na posicao do array = " + numero);
        }

        // metodo
        List<String> racas = new ArrayList<>(
                Arrays.asList("pug",
                        "poodle",
                        "shnauzer",
                        "bulldog",
                        "pitbull"));

        // racas.forEach(nome -> System.out.println(nome));

        for (int i = 0; i < 10; i++) {
            // System.out.println(marley.Latir(2, 50));
            System.out.println(marley.getPeso());
        }

        System.out.println(Thread.currentThread().getName());
        System.out.println(marley.getName());

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe um número:\n");
        int num1 = ler.nextInt();

        if (num1 % 2 == 0) { // se o numero for par
            System.out.println("O " + num1 + " é par");
        } else {
            System.out.println("O " + num1 + " é impar");
        }

        System.out.println("Quantos numeros? ");
        int num2 = ler.nextInt();

        float[] nums = new float[num2];

        for (int i = 0; i < num2; i++) {
            System.out.println("Digite o nr. " + (i + 1));
            nums[i] = ler.nextFloat();
            System.out.println(i + " = " + nums[i]);
        }
    }
}
