/*
 *Trabajo, realizar un juego llamado el ahorcado
 */
package ahorcado;

import javax.swing.JOptionPane;


/**
 *
 * @author john Fredy Mosquera Acosta
 */
public class Ahorcado {

  
    public static void main(String[] args) {
        
        int rendirce=0,dificultad=0,i=1,r=5;
        String usuario,palabra;
        String facil ="tomate",medio="electronica",dificil="estructuras";
        boolean resultado;
        
        do{
            try{
                dificultad=Integer.parseInt(JOptionPane.showInputDialog(null,"//***AHORCADO***//"+" \nDIFICULTAD DEL JUEGO "
                                                                   +"\n1.FACIL"+"\n2.MEDIO"+"\n3.DIFICIL"+"\n4.NO JUGAR"));
                switch(dificultad){
                    case 1:
                        usuario=JOptionPane.showInputDialog("INGRESE NOMBRE DEL JUGADOR ");//para ingreso del jugador
                        JOptionPane.showMessageDialog(null,"Tienes 5 Intentos ");
                        
                        while(i<=5){
                            palabra=JOptionPane.showInputDialog("Ingrese palabra de 6 letras "); 
                            resultado=palabra.equals(facil);//pasamos la palabra a booleano
                             if(resultado == true){
                               JOptionPane.showMessageDialog(null,"la pabra "+palabra+" es correcta "); 
                               i=4+1;
                           }else{
                                 r--;
                               JOptionPane.showMessageDialog(null,"la pabra "+palabra+" es incorrecta.\nTiene "+r+" intentos"); 
                           }
                              i++;
                        }
                         for(int j=0;j<=0;j++){
                              JOptionPane.showMessageDialog(null,"la pabra empiesa por 'T' y termina en 'O' ");
                         } 
                         //--------------------------------------------------------------
                        //colocamos un mensaje para mostrar la palabra  
                       
                         rendirce=Integer.parseInt(JOptionPane.showInputDialog(null,"1.rendice\n2.mostrar palabra"));
                                switch(rendirce){
                                    case 1: 
                                         JOptionPane.showMessageDialog(null," GAME OVER ");
                                     break;
                                    case 2: 
                                          JOptionPane.showMessageDialog(null,"La palabra es "+facil);
                                     break;
                                }
                    break;    
                    case 2: 
                            usuario=JOptionPane.showInputDialog("INGRESE NOMBRE DEL JUGADOR ");
                             JOptionPane.showMessageDialog(null,"Tienes 5 Intentos ");
                        while(i<=5){
                            palabra=JOptionPane.showInputDialog("Ingrese palabra de 11 letras ");
                            resultado=palabra.equals(medio);//pasamos la palabra a booleano
                            if(resultado == true){
                               JOptionPane.showMessageDialog(null,"la pabra "+palabra+" es correcta "); 
                               i=4+1;
                            }else{
                                 r--;
                                 JOptionPane.showMessageDialog(null,"la pabra "+palabra+" es incorrecta.\nTiene "+r+" intentos"); 
                                }
                              i++;
                        }
                        for(int j=0;j<=0;j++){
                              JOptionPane.showMessageDialog(null,"la pabra empiesa por 'E' y termina en 'A' ");
                        }  
                         //--------------------------------------------------------------
                        //colocamos un mensaje para mostrar la palabra  
                        
                        
                        rendirce=Integer.parseInt(JOptionPane.showInputDialog(null,"1.rendice\n2.mostrar palabra"));
                                switch(rendirce){
                                    case 1: 
                                         JOptionPane.showMessageDialog(null," GAME OVER ");
                                     break;
                                    case 2: 
                                          JOptionPane.showMessageDialog(null,"La palabra es "+medio);
                                     break;
                                }
                    break;
                    case 3:
                             usuario=JOptionPane.showInputDialog("INGRESE NOMBRE DEL JUGADOR ");
                             JOptionPane.showMessageDialog(null,"Tienes 5 Intentos ");
                        while(i<=5){
                            palabra=JOptionPane.showInputDialog("Ingrese palabra de 11 letras ");
                            resultado=palabra.equals(dificil);//pasamos la palabra a booleano
                            if(resultado == true){
                               JOptionPane.showMessageDialog(null,"la pabra "+palabra+" es correcta "); 
                               i=4+1;
                            }else{
                                 r--;
                                 JOptionPane.showMessageDialog(null,"la pabra "+palabra+" es incorrecta.\nTiene "+r+" intentos"); 
                                }
                              i++;
                        }
                        for(int j=0;j<=0;j++){
                              JOptionPane.showMessageDialog(null,"la pabra empiesa por 'E' y termina en 'S' ");
                        } 
                        //--------------------------------------------------------------
                        //colocamos un mensaje para mostrar la palabra  
                        
                        
                        rendirce=Integer.parseInt(JOptionPane.showInputDialog(null,"1.rendice\n2.mostrar palabra"));
                                switch(rendirce){
                                    case 1: 
                                         JOptionPane.showMessageDialog(null," GAME OVER ");
                                     break;
                                    case 2: 
                                          JOptionPane.showMessageDialog(null,"La palabra es "+dificil);
                                     break;
                                }
                    break;
                    case 4:
                           JOptionPane.showMessageDialog(null," GAME OVER ");
                    default: 
                          JOptionPane.showMessageDialog(null," OPCION NO VALIDA ");
                }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"USTED SELECCIONO CANCELAR ");
            }
            
        }while(dificultad !=4);
        
    }
    
}
