import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.documents.generators.CPFGenerator;

public class App {
    static void showHeader() {
        System.out.println("=============================");
        System.out.println("       GERADOR DE CPF        ");
        System.out.println("=============================");
    }

    static void showAllCPFs(String[] cpfs) {
        String templateData = "=== CPFs Gerados ===\n";

        for (String cpf : cpfs) {
            templateData += cpf + "\n";
        }

        templateData += "==================";

        System.out.println(templateData);
    }

    static void createFrame() {
        showHeader();
        final Scanner sc = new Scanner(System.in);
        System.out.println("Informe o total de CPFs para ser gerado >> ");
        final int totalCPFs = sc.nextInt();
        final CPFGenerator cpfGenerator = new CPFGenerator();
        final String[] cpfs = cpfGenerator.getRandomCPFList(totalCPFs);
        showAllCPFs(cpfs);
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        createFrame();
    }
}
