/* 
Vamos criar Um exemplo de uma classe para repesentar uma SmartTV onde:
1. Ela tenha as caracteristicas: ligada (boolean), canal(int) e volume (int)
2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente.  
*/

public class Usuario {
    public static void main(String[] args) throws Exception {
       
        //p2
        // Construtor
        SmartTv smartTv =  new SmartTv();

        
        //p7 // Testando  o Usuario diminuindo e aumentando o volume da TV com Controle remoto.
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual : " + smartTv.canal);
        //p10
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smartTv.canal);
        
       
        System.out.println("Volume atual : " + smartTv.volume);

       
        System.out.println("TV Ligada ? " + smartTv.ligada);
        
        System.out.println("Volume Atual : " + smartTv.volume);

          //p4
        smartTv.ligar();
        System.out.println("Novo Status ~> TV Ligada ? " + smartTv.ligada);

        
          //p5
          smartTv.desligar();
          System.out.println("Novo Status ~> TV Ligada ? " + smartTv.ligada);
    }
}
