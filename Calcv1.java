package calculadora;

import java.util.Scanner;

public class Calcv1 {
   public float n1, n2, resul;
    
  public  Scanner scanner = new Scanner(System.in); 

public void suma() {
        resul = n1 + n2;
}

public void resta() {    
            resul = n1 - n2;     
    }

public void multiplicacion() {   
            resul = n1 * n2;
    }

public void division() {
            resul = n1 / n2;           
}
public void potenene() {
    resul = (float) Math.pow(n1, 10.0);            
    }

public void diviene() {       
            resul=(float) Math.pow(n1,(1.0/10.0));         
    }

public void iva() {            
            resul = n1 * (n2/100);                
    }

public void seno(){         
                resul = (float) Math.sin(Math.toRadians(n1));
    }
public void coseno(){       
                resul = (float) Math.cos(Math.toRadians(n1));           
    }
public void tangente(){      
                resul = (float) Math.tan(Math.toRadians(n1));                
    }
    public void calcularmenu() {
        int opcion1,opcion2,opcion3,opcion4;
        do {
            System.out.println("Seleccione la operacion matematica:");
            System.out.println("1. operaciones basicas");
            System.out.println("2. operaciones trigonometricas");
            System.out.println("3. raiz enesima-exponente enesimo");
            System.out.println("4. iva");
            System.out.println("0. salir");
            opcion1 = scanner.nextInt();
            

            switch (opcion1) {
                case 1:
            System.out.print("Ingrese el primer valor a operar: ");
            n1 = scanner.nextFloat();
            System.out.print("Ingrese el segundo valor a operar: ");
            n2 = scanner.nextFloat();
            System.out.println("Seleccione la operacion matematica:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            opcion2 = scanner.nextInt();
            switch(opcion2){
                case 1:
                    suma();
                    System.out.println("resultado es: "+resul);
                    break;
                case 2:
                    resta();
                    System.out.println("resultado es: "+resul);
                    break;
                case 3:
                    multiplicacion();
                    System.out.println("resultado es: "+resul);
                    break;
                case 4:
                    division();
                    System.out.println("resultado es: "+resul);
                    break; 
                default:
                    System.out.println("Opcion no válida");
                    break;
            
            }
                    break;
                case 2:
            System.out.print("Ingrese el valor a operar: ");
            n1 = scanner.nextFloat();
            System.out.println("Seleccione la operacion matematica:");
            System.out.println("1. seno");
            System.out.println("2. coseno");
            System.out.println("3. tangente");
            opcion3 = scanner.nextInt();
            switch(opcion3){
                case 1:
                    seno();
                    System.out.println("resultado es: "+resul);
                    break;
                case 2:
                    coseno();
                    System.out.println("resultado es: "+resul);
                    break;
                case 3:
                    tangente();
                    System.out.println("resultado es: "+resul);
                    break;
                default:
                    System.out.println("Opcion no válida");
                   break; 
            }
            break;
                    
                case 3:
            System.out.print("Ingrese el primer valor a operar: ");
            n1 = scanner.nextFloat();
            System.out.println("Seleccione la operacion matematica:");
            System.out.println("1. potencia enesima");
            System.out.println("2. raiz enesima");
            opcion4 = scanner.nextInt();
            switch(opcion4){
                case 1:           
                    potenene();                   
                     System.out.println("resultado es: "+resul);
                    break;
                case 2:
                    diviene();
                     System.out.println("resultado es: "+resul);
                    break;
                default:
                    System.out.println("Opcion no válida");
                   break; 
            }
                    break;
                case 4:
                    System.out.print("Ingrese el valor a sacarle iva: ");
            n1 = scanner.nextFloat();
            System.out.print("Ingrese el valor a el porcentaje del iva: ");
            n2 = scanner.nextFloat();
                    iva();
                    System.out.println("resultado es: "+resul);  
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        } while (opcion1 != 0);
    }
    public static void main(String[] args) {
        Calcv1 calculadora = new Calcv1();
        calculadora.calcularmenu();         
    }
}