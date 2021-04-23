import java.util.*;

public class BancoFinanças 
{
    int i;
    int c;
    String op;
    
    int num_conta[] = new int[1000];
    int agência[] = new int[1000];
    String tipo[] = new String[1000];
    String banco[] = new String[1000];
    
    Scanner ler = new Scanner(System.in);
    
    void conta()
    {
        num_conta[0] = 194827;
        agência[0] = 2948;
        tipo[0] = "Conta Corrente";
        banco[0] = "Itaú";
        
        num_conta[1] = 592842;
        agência[1] = 3049;
        tipo[1] = "Conta Poupança";
        banco[1] = "Santander";
        
        num_conta[2] = 602932;
        agência[2] = 1049;
        tipo[2] = "Conta Poupança";
        banco[2] = "Bradesco";
        
        num_conta[3] = 109283;
        agência[3] = 5234;
        tipo[3] = "Conta Corrente";
        banco[3] = "HSBC";
        
        num_conta[4] = 320294;
        agência[4] = 7092;
        tipo[4] = "Conta Corrente";
        banco[4] = "Banco do Brasil";
        
        num_conta[5] = 792830;
        agência[5] = 3092;
        tipo[5] = "Conta Poupança";
        banco[5] = "Citibank";
        
        num_conta[6] = 492019;
        agência[6] = 5200;
        tipo[6] = "Conta Corrente";
        banco[6] = "Caixa";
        
        num_conta[7] = 829401;
        agência[7] = 3948;
        tipo[7] = "Conta Poupança";
        banco[7] = "Bradesco";
        
        num_conta[8] = 902348;
        agência[8] = 5083;
        tipo[8] = "Conta Poupança";
        banco[8] = "Santander";
        
        num_conta[9] = 326049;
        agência[9] = 5692;
        tipo[9] = "Conta Corrente";
        banco[9] = "Banco do Brasil";
        
        num_conta[10] = 455692;
        agência[10] = 6976;
        tipo[10] = "Conta Corrente";
        banco[10] = "Itaú";
        
        num_conta[11] = 501928;
        agência[11] = 4922;
        tipo[11] = "Conta Poupança";
        banco[11] = "Caixa";
        
        num_conta[12] = 530222;
        agência[12] = 2378;
        tipo[12] = "Conta Poupança";
        banco[12] = "Itaú";
        
        num_conta[13] = 745569;
        agência[13] = 4928;
        tipo[13] = "Conta Poupança";
        banco[13] = "Santander";
        
        num_conta[14] = 233084;
        agência[14] = 3112;
        tipo[14] = "Conta Corrente";
        banco[14] = "Bradesco";
        
        i = 0;
        c = 1;
        while(i<15)
        {
            System.out.println("Dados do "+c+"º Cliente");
            System.out.println("Número da conta: "+num_conta[i]);
            System.out.println("Número da agência: "+agência[i]);
            System.out.println("Tipo da Conta: "+tipo[i]);
            System.out.println("Nome do Banco: "+banco[i]);
            
            System.out.println("");
            System.out.println("");
            
            i = i + 1;
            c = c + 1;
        }    
        
              
    }
    
    
    
    void consulta()
    {
        System.out.println("");
        System.out.println("");
        
        System.out.println("Dados somente de conta corrente.");
        
        i = 0;
        c = 1;
            while(i<15)
            {
                if(num_conta[i]>=100000 && num_conta[i]<=500000)
                {
                    System.out.println("Dados do "+c+"º Cliente");
                    System.out.println("Número da conta: "+num_conta[i]);
                    System.out.println("Número da agência: "+agência[i]);
                    System.out.println("Tipo da Conta: "+tipo[i]);
                    System.out.println("Nome do Banco: "+banco[i]);

                    System.out.println("");
                    System.out.println("");   
                }    

                i = i + 1;
                c = c + 1;
            }
            System.out.println("Esses clientes acima possuem conta corrente.");
            
            
            
        System.out.println("");
        System.out.println("");
        
        System.out.println("Dados somente de conta poupança.");
        
        i = 0;
        c = 1;
            while(i<15)
            {
                if(num_conta[i]>=500000 && num_conta[i]<=999999)
                {
                    System.out.println("Dados do "+c+"º Cliente");
                    System.out.println("Número da conta: "+num_conta[i]);
                    System.out.println("Número da agência: "+agência[i]);
                    System.out.println("Tipo da Conta: "+tipo[i]);
                    System.out.println("Nome do Banco: "+banco[i]);

                    System.out.println("");
                    System.out.println("");   
                }    

                i = i + 1;
                c = c + 1;
            }
            System.out.println("Esses clientes acima possuem conta poupança.");
    }
    
    public static void main(String[] args) 
    {
        BancoFinanças b = new BancoFinanças();
        b.conta();
        b.consulta();
    }
    
}
