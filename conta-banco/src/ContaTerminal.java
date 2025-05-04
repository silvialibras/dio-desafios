import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class ContaTerminal {

    public static void main(String[] args) {

        //TODO:Criando o objeto scanner - (conhecer e importar a scanner)
        Scanner scanner = new Scanner(System.in);
        
        /*identificando as variáveis:
       int - numero da conta (tipo inteiro)
       String - agencia (tipo texto)
       String - nomeCliente (tipo texto)
       double - saldo (tipo decimal)*/
    
       // Obter pela classe scanner os valores digitados no terminal
    
      // Exibir as mensagens para  nosso usuário
      
      System.out.println("digite seu nome");
      String nome = scanner.next();

      System.out.println("digite seu sobrenome");
      String sobrenome = scanner.next();

      // Usando o operador (+) 
      String nomeCompleto = nome + " " + sobrenome;
      String Cliente = nomeCompleto;

      System.out.println("Por favor" + ",digite o número da Agência");
      String agencia = scanner.next();

      System.out.println("Digite o número da sua conta:");
      int numero = scanner.nextInt();

      //double saldo = 237.48;

      //Exibir a mensagem da conta criada com saldo disponível para o cliente.  
    
        String mensagem = "Olá " + nomeCompleto + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        " conta " + numero + 
        " e seu saldo 337.48 já está disponível para saque.";
        
        System.out.println(mensagem);

        scanner.close();
        
     }
}
