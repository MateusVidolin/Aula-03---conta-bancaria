public class Conta {
    private String numConta;
    private String agencia;
    private double saldo;
    private String nomeCliente;

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("Num. da Conta = " + numConta);
        System.out.println("Nome do Cliente = " + nomeCliente);
        System.out.println("Agência   = " + agencia);
        System.out.println("Saldo atual = " + saldo);
    }
}
