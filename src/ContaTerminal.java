import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //region CONTA
        // @description - Valida o número da conta
        // @validation - Deve ser positivo
        // @validation - Deve ser numero
        // Inicialização de variáreis(CONTA)
        int accountNumber = 0;
        boolean isValidAccountNumber = false;

        while(!isValidAccountNumber){
            System.out.print("Por favor, digite o número da Conta (Numero maior que 0): \n");

            if (scanner.hasNextInt()) {
                accountNumber = scanner.nextInt();

                if (accountNumber > 0) {
                    isValidAccountNumber = true;
                } else {
                    System.out.println("Erro: Número deve ser positivo. Tente novamente. \n");
                }
            } else {
                System.out.println("Erro: Formato de inteiro inválido. Tente Novamente. \n");
                scanner.next();  // Remove o caracter inválido
            }

            scanner.nextLine();  // Consome o caracter da função next do scanner
        }
        //endregion

        //region AGÊNCIA
        // @description - Valida o número da agência
        // @validation - Deve conter pelo menos um caracter(Não pode ser vazio)
        // Inicialização de variáveis
        String agencyNumber = "";
        boolean isValidAgencyNumber = false;

        while (!isValidAgencyNumber) {
            System.out.print("Por favor, digite o número da agência (Não pode ser vazio): \n");

            if(scanner.hasNextLine()){
                agencyNumber = scanner.nextLine();

                if (!agencyNumber.trim().isEmpty()) {
                    isValidAgencyNumber = true;
                }else{
                    System.out.println("Erro: O número da agência não pode ser vazio. Tente Novamente. \n");
                }
            }else{
                System.out.println("Erro: Formato de string inválido. Tente Novamente. \n");
                scanner.next();  // Remove o caracter inválido
            }
        }
        //endregion

        //region NOME
        // @description - Valida o Nome
        // @validation - Deve conter pelo menos um caracter(Não pode ser vazio)
        // Inicialização de variáveis
        String name = "";
        boolean isValidName = false;

        while (!isValidName) {
            System.out.print("Por favor, digite o Nome (Não pode ser vazio): \n");

            if(scanner.hasNextLine()){
                name = scanner.nextLine();

                if (!name.trim().isEmpty()) {
                    isValidName = true;
                }else{
                    System.out.println("Erro: Nome não pode ser vazio. Tente Novamente. \n");
                }
            }else{
                System.out.println("Erro: Formato de string inválido. Tente Novamente. \n");
                scanner.next();  // Remove o caracter inválido
            }
        }
        //endregion

        //region SALDO
        // @description - Valida o saldo
        // @validation - Deve ser maior ou igual a 0
        // @validation - Deve ser numero
        // Inicialização de variáreis(SALDO)
        double balance = 0;
        boolean isValidBalance = false;

        while (!isValidBalance) {
            System.out.print("Por favor, digite o Saldo (Numero maior ou igual a 0): \n");

            if (scanner.hasNextDouble()) {
                balance = scanner.nextDouble();

                if (balance >= 0) {
                    isValidBalance = true;
                } else {
                    System.out.println("Erro: Número deve ser positivo. Tente novamente. \n");
                }
            } else {
                System.out.println("Erro: Formato de decimal inválido. Tente Novamente. \n");
                scanner.next();  // Remove o caracter inválido
            }

            scanner.nextLine();  // Consome o caracter da função next do scanner
        }
        //endregion

        scanner.close();

        System.out.printf
                ("\nOlá %s, " +
                        "obrigado por criar uma conta em nosso banco, \n" +
                        "sua agência é %s, \n" +
                        "conta %s e seu saldo %s já está disponível para saque.",
                        name, agencyNumber, accountNumber, balance);
    }
}
