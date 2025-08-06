import java.util.Random;
import java.util.Scanner;

public class App {
    static void showHeader() {
        System.out.println("=============================");
        System.out.println("       GERADOR DE CPF        ");
        System.out.println("=============================");
    }

    static String formatCpf(int[] digits) {
        return String.format("%s%s%s.%s%s%s.%s%s%s-%s%s",
                digits[0], digits[1], digits[2],
                digits[3], digits[4], digits[5],
                digits[6], digits[7], digits[8],
                digits[9], digits[10]);
    }

    static int calculateVerifiedDigit(int[] digits, int position) {
        int sum = 0;
        int weight = position + 1;

        // Calcula a soma ponderada
        for (int i = 0; i < position; i++) {
            sum += digits[i] * weight;
            weight--;
        }

        int mod = sum % 11;
        return (mod < 2) ? 0 : 11 - mod;
    }

    static String generateCPF() {
        int[] digits = new int[11];
        Random random = new Random();

        for (int i = 0; i < 9; i++) {
            digits[i] = random.nextInt(10);
        }

        digits[9] = calculateVerifiedDigit(digits, 9);
        digits[10] = calculateVerifiedDigit(digits, 10);

        return formatCpf(digits);
    }

    static String[] generateCPFList(int totalCPFs) {
        String[] cpfs = new String[totalCPFs];

        for (int i = 0; i < totalCPFs; i++) {
            String cpf = generateCPF();
            cpfs[i] = cpf;
        }

        return cpfs;
    }

    static void showCPFs(String[] cpfs) {
        System.out.println("====== EXIBINDO CPFs ======");
        for (String cpf : cpfs) {
            System.out.println(cpf);
        }
        System.out.println("==========================");
    }

    static void createFrame() {
        showHeader();
        final Scanner sc = new Scanner(System.in);
        System.out.println("Informe o total de CPFs para ser gerado >> ");

        final int totalCPFs = sc.nextInt();
        String[] cpfs = generateCPFList(totalCPFs);
        showCPFs(cpfs);
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        createFrame();
    }
}
