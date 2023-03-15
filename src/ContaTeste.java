import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ContaTeste teste = new ContaTeste();
        int opcao = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4 . Consultar");
            System.out.println("9 . Sair");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(teste.sc.nextLine());
            switch (opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execSacar();
                    break;
                case 4:
                    teste.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao!=9);
    }
    public void execCadastrar(){
        System.out.println("Digite o num. da conta: ");
        cc.setNumConta(sc.nextLine());
        System.out.println("Digite o nome do cliente:");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Digite o nome da agência:");
        cc.setAgencia(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execConsultar(){
        cc.imprimir();
    }

    public void execSacar(){
        double valor;
        System.out.println("Digite um valor para o saque: ");
        valor = Double.parseDouble(sc.nextLine());
        boolean ok = cc.sacar(valor);
        if(ok){
            System.out.println("Saque efetuado com suceso");
        }else{
            System.out.println("Você possui saldo suficiente");
        }
    }

    public void execDepositar(){
        double valor;
        System.out.println("Digite um valor para o deposito: ");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Depósito efetuado com sucesso");
    }
}