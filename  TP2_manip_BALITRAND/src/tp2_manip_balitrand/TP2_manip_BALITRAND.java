/*
 *Flavie Balitrand
* TDC
* TP1
* 24/10/21
 */
package tp2_manip_balitrand;

/**
 *
 * @author Flavie BALITRAND
 */
public class TP2_manip_BALITRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int echange=0; 
        
       
      //creation 2 objet de classe tartiflette 
        
      Tartiflette assiette1 = new Tartiflette(500) ; 
      
      Tartiflette assiette2 = new Tartiflette(600) ;   
        
       //on base l objet assiette 3 sur les memes infos que l assiette 2 
      Tartiflette assiette3 = assiette2 ;  
      
      System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
      
      System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
 
      System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
      
      //on ajoute 1 aux calories de l'assiette 1
      assiette2.nbCalories++;
      
       System.out.println("Apres l'incrementation :");
      
      
      System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
      
      System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
 
      System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
      
      //apres test on confirme que seulement 2 objets ont ete crees l assiette 1 et
      //2 la trois suit exactement les infos de l assiette 2 meme apres incrementation
      
      
      //on inverse les donnees en assiette 1 et 2
      
      echange=assiette1.nbCalories;
      
      assiette1.nbCalories=assiette2.nbCalories;
      
      assiette2.nbCalories=echange;
      
   
      System.out.println("Apres inversion :");
      
      System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
      
      System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
 
      System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
      
      
      //Moussaka assiette666 = assiette1 ; 
      
      //Moussaka assiette667 = new Tartiflette() ;
      
      //les deus instructions sont fausses on ne peut pas passer de 2 classes differentes
      //dans un seul objet
      
      
      int [] Tab = new int[10];
      
   
      for(int i=0; i<=9; i++){
          Tab[i]=100*(i+1);
          
      
      }
      
      
      Moussaka plat1 = new Moussaka(Tab[0]);
      Moussaka plat2 = new Moussaka(Tab[1]);
      Moussaka plat3 = new Moussaka(Tab[2]);
      Moussaka plat4 = new Moussaka(Tab[3]);
      Moussaka plat5 = new Moussaka(Tab[4]);
      Moussaka plat6 = new Moussaka(Tab[5]);
      Moussaka plat7 = new Moussaka(Tab[6]);
      Moussaka plat8 = new Moussaka(Tab[7]);
      Moussaka plat9 = new Moussaka(Tab[8]);
      Moussaka plat10 = new Moussaka(Tab[9]);
                                   
      
    }
    
}
