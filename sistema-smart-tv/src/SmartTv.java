//OBJETO SMART TV.
  //p1
public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume = 25;
 
    //p9 Atribuindo o numero do canal com parametros. 
    public void mudarCanal (int novocanal){
        canal = novocanal;
  }

  //p8
    public void aumentarCanal(){
        canal++;
    } 

    public void diminuirCanal(){
        canal--;
    } 

     //p6
     public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume); //testando se vai aumentando o vol.
     }

      //p6
      public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume); //testando se vai diminuindo o vol.
     }

    //p3
    // Criar os métodos

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

}
