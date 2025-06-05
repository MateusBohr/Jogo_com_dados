import java.util.Scanner;

public class Jogo {
    int vitoriaJogador;
    int vitoriaPc;
    int decisao=1;
    int rodada=1;

   public void jogar() {
       System.out.println("Lets play a game,best out of 3, shall we?");
       Scanner scanner = new Scanner(System.in);
       System.out.println("Here are the rules young blood");
       System.out.println("1-You´re in");
       System.out.println("0-You´re out");
       Dado dadoJogador = new Dado();
       Dado dadoPC = new Dado();
       while(rodada<=3 && decisao!=0){
           int resultadoJogador=0;
           int resultadoPC = 0;
           System.out.println("Do you wanna play?");
           decisao= scanner.nextInt();
           if(decisao == 0){
               System.out.println("Giving up is not cool");
               break;
           }
           if(decisao == 1){
               resultadoJogador=dadoJogador.rolarDado();
               resultadoPC=dadoPC.rolarDado();
               rodada++;
           }else{
               break;
           }
           if(resultadoJogador>resultadoPC){
               vitoriaJogador++;
           } else if (resultadoPC>resultadoJogador){
               vitoriaPc++;
           } else{
               System.out.println("Tied game");
           }
           if(vitoriaJogador>vitoriaPc){
               System.out.println("You won this time,but i`ll catch you!!!");
           }else if(vitoriaPc>vitoriaJogador){
               System.out.println("Take that loser!!!!!");
           }
       }

   }
}
