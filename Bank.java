public class Bank 
{

    public static void main(String[] args) 
    {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
        //complete sua resposta aqui:
        
        //Valor da conta Corrente CC1
        System.out.println("Saldo da conta Corrente CC1.");
        b1.depositMoney(12900);
        b1.withdrawMoney(1200.90);
        b1.depositMoney(527);
        b1.withdrawMoney(3560.50);
        b1.getBalance();
                
        //Valor da conta Corrente CC2
        System.out.println("Saldo da conta Corrente CC2.");
        b2.depositMoney(905);
        b2.withdrawMoney(1000);
        b2.getBalance();
        
        //Valor da conta Corrente CC3
        System.out.println("Saldo da conta Corrente CC3.");
        b3.depositMoney(1220);
        b3.withdrawMoney(922);
        b3.getBalance();                
    }
}

