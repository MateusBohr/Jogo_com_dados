import java.util.Scanner;

public class Rolar {
    /*Uma tentativa minha de um pequeno jogo entre usuário e PC optei pelo uso de
    for + do while para testar se tinha compreendido o uso de diferentes formas de
    controle de fluxo.
     */
    public static void main(String[] args) {
        Dado dado = new Dado();
        System.out.println("Lets play a game, shall we?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are the rules young blood");
        System.out.println("1-You´re in");
        System.out.println("0-You´re out");
        int vitoriaJogador =0;
        int vitoriaPc =0;
        int decisao;
        for(int tentativas=1;tentativas<3;tentativas++){
            do{
                System.out.println("Best out of 3 okay?");
                System.out.println("Round: "+tentativas);
                decisao=scanner.nextInt();
                if(decisao ==0){
                    System.out.println("Humans used to be braver");
                    break;
                }
                if(decisao !=1){
                    System.out.println("Just follow the rules");
                }
                int resultadoJogador = dado.rolarDado();
                int resultadoPc= dado.rolarDado2();

                if(resultadoJogador>resultadoPc){
                    System.out.println("You won this time but i´m coming for you");
                    System.out.println("----------------------------------");
                    vitoriaJogador++;
                }else if(resultadoJogador<resultadoPc){
                    System.out.println("The matrix is building up");
                    System.out.println("----------------------------------");
                    vitoriaPc++;

                }else{
                    System.out.println("Tied game");
                    System.out.println("----------------------------------");
                }
                tentativas++;
            }while(tentativas<3 && decisao!=0);
        }
        System.out.println("------------------------------------");
        if(vitoriaJogador>vitoriaPc){
            System.out.println("Nice game, but we are just getting stronger");
        }else{
            System.out.println("Just the begining");
        }
    }
}
