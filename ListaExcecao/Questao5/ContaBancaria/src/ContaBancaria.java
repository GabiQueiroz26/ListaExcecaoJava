public class ContaBancaria {
    private double saldo; 
    private double limite; 


    public ContaBancaria(double valorSaldo, double valorLimite){
        this.saldo = valorSaldo;
        this.limite = valorLimite;

    }

  
    public double getSaldo(){
        return saldo;
    };


    protected double getLimite(){
        return limite;
    };

    
    public double getSaldoComLimite(){
        return saldo + limite;
    };

    
    public boolean sacar(double valor) throws ContaException {
        if(valor > 500){
            throw new ContaException("Não pode ser maior que 500 reais");
        }
        else if(valor > saldo + limite){
            throw new ContaException("Sem limite");
        }
        else{
            saldo = saldo - valor;
            if(saldo < 0){
                limite = limite + saldo;
                saldo = 0;
            }
            return true;
        }
    };


    public void depositar(double valor) throws ContaException {
        if (valor > 1000){
            throw new ContaException("Somente são aceitos depósitos de até R$1.000,00");
        }
        else{
            saldo = saldo + valor;
        }
    }
}
