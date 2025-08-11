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

    static void createFrame(String[] args) {
        showHeader();
        final CPFGenerator cpfGenerator = new CPFGenerator();
        final int total = Integer.parseInt(args[0]);
        final String[] cpfs = cpfGenerator.getRandomCPFList(total);
        showAllCPFs(cpfs);
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Informe um valor para total.");
            return;
        }

        if (args.length > 1) {
            System.out.println("Aceitamos somente um argumento para total.");
            return;
        }

        createFrame(args);
    }
}
