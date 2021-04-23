public class BankAccount
{
   private double balance;
   
   public void depositMoney(double moneyAmount)
   {
     balance += moneyAmount;  // balance = balance + moneyAmout;
   }
   
   public double withdrawMoney(double moneyAmount)
   {
       if (balance >= moneyAmount)
       {
           balance = balance - moneyAmount;
           return moneyAmount;
       }
       else
       {
           return 0;
       }
   }
   
   public void getBalance()
   {
      System.out.printf("Saldo atual: R$%.2f \n\n",balance);
   } 
}
