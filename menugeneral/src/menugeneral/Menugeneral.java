/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menugeneral;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Menugeneral {
    
    public void me(){
        
        Scanner entradaTeclado = new Scanner(System.in);
        
        int opciongen=0;
        
        do{
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Salir");
            opciongen=entradaTeclado.nextInt();
            
            if (opciongen == 1){
                
                System.out.println("Cuadrado");
                
                int lado1=0;
                int area=0;
                int perimetro=0;
        
                System.out.println("Digite la medida del lado del cuadrado: ");
                lado1=entradaTeclado.nextInt();
        
                area= lado1*lado1;
                perimetro=lado1*4;
        
                System.out.println("El area del cuadrado es: "+area);
                System.out.println("El perimetro del cuadrado es: "+perimetro);
            }
            
            if (opciongen == 2){
                System.out.println("Rectangulo");
                
                int largo=0;
                int ancho=0;
                int area=0;
                int perimetro=0;
        
                System.out.println("Digite el largo del rectangulo: ");
                largo=entradaTeclado.nextInt();
                System.out.println("Digite el ancho del rectangulo: ");
                ancho=entradaTeclado.nextInt();
        
                area=largo*ancho;
                perimetro=(largo*2)+(ancho*2);
        
                System.out.println("El area del Rectangulo digitado es: "+area);
                System.out.println("El Perimetro del Rectangulo digitado es: "+perimetro);
            }
            if(opciongen == 3){
                
                System.out.println("Circulo");
                
                double radio;
                double area=0;
                double diametro;
                int opcion=0;
                double pi=3.1416;
                double aux=0.5;
        
                do{
            
                    System.out.println("1. Ingresar radio");
                    System.out.println("2. Ingresar diametro");
                    System.out.println("3. Salir");
                    opcion=entradaTeclado.nextInt();
            
                    if(opcion==1){
                        System.out.println("Ingrese la medida del radio: ");
                        radio=entradaTeclado.nextDouble();
                
                        area=pi*(radio*radio);
                        diametro=2*radio;
                        System.out.println("El area del circulo es: "+area);
                        System.out.println("El diametro del circulo es: "+diametro);
                    }
            
                    if(opcion==2){
                        System.out.println("Ingrese la medida del diametro: ");
                        diametro=entradaTeclado.nextDouble();
                
                        radio=aux*diametro;
                        area=pi*(radio*radio);
                        System.out.println("El radio del circulo es:"+radio);
                        System.out.println("El area del radio es: "+area);
                    }
            
                    if (opcion==3){
                
                        System.out.println(" ");
                    }
            
            
                }while (opcion!=3);
            }
            
            if(opciongen == 4){
                
                System.out.println("salida");
            }
            
        }while(opciongen !=4 );
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menugeneral log=new Menugeneral();
        log.me();
        
        // TODO code application logic here
    }
    
}
