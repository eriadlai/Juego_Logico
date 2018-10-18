/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaisproy;
//Dar formato a resultado de division para no pasar de decimas
import java.text.DecimalFormat;
//Generador de numeros aleatorios
import java.util.Random;
//Input de usuario
import java.util.Scanner;

/**
 *
 * @author fer_h
 */
public class IAISPROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Declarar variables y llamar clases
        int lim = 50;
        int OP;
        double A, B, C = 0, resp = 0;
        String respS = "", Div = "";
        
        String resYN = "";
        //Generador de numeros aleatorios
        Random alea = new Random();
        //Utilizado para leer entrada del usuario
        Scanner lector = new Scanner(System.in);
        //Permite reducir double a decimos
        DecimalFormat df = new DecimalFormat(".#");
        
        System.out.println("Buen día");
        System.out.println("A continuacion recibiras problemas aritmeticos");
        System.out.println("Cada 5 resueltos subira el nivel de dificultad");
        System.out.println("Desea comenzar? Y/N");
        
        //Implementacion de Scanner
        resYN = lector.nextLine();
        
        //Direccion de la respuesta
        if ("Y".equals(resYN) || "y".equals(resYN)) 
        {
            /*
            Comienzo del ciclo utilizando do while para que el ciclo realize
            una primer vuelta antes de comparar el resultado con la respuesta
            */
            do 
            {
                /*
                Generador de numeros aleatorios teniendo como maximo 4
                y un minimo de 1, teniendo "+1" por que empieza desde 0
                */
                OP = alea.nextInt(4) + 1;
                //Asignacion de operacion en base a variable OP (1-4)
                switch(OP)
                {
                    case 1:
                        System.out.println("Suma");
                        /*
                        Generar A y B con un limite predefinido de 50 con un
                        limite de 0
                        */
                        A = alea.nextInt(lim);
                        B = alea.nextInt(lim);
                        /*
                        El sistema realiza la operacion para compararla con
                        la respuesta del usuario
                        */
                        C = A + B;
                        System.out.println(A + " + " + B);
                        //Input del usuario
                        resp = lector.nextDouble();
                        break;
                    
                    case 2:
                        System.out.println("Resta");
                        /*
                        Generar A y B con un limite predefinido de 50 con un
                        limite de 0
                        */
                        A = alea.nextInt(lim);
                        B = alea.nextInt(lim);
                        /*
                        El sistema realiza la operacion para compararla con
                        la respuesta del usuario
                        */
                        C = A - B;
                        System.out.println(A + " - " + B);
                        //Input del usuario
                        resp = lector.nextDouble();
                        break;
                        
                    case 3:
                        System.out.println("Multiplicacion");
                        /*
                        Generar A y B con un limite predefinido de 50 con un
                        limite de 0
                        */
                        A = alea.nextInt(lim);
                        B = alea.nextInt(lim);
                        /*
                        El sistema realiza la operacion para compararla con
                        la respuesta del usuario
                        */
                        C = A * B;
                        System.out.println(A + " * " + B);
                        //Input del usuario
                        resp = lector.nextDouble();
                        break;
                        
                    case 4:
                        System.out.println("Division");
                        /*
                        Generar A y B con un limite predefinido de 50 con un
                        limite de 0
                        */
                        A = alea.nextInt(lim);
                        B = alea.nextInt(lim);
                        /*
                        El sistema realiza la operacion para compararla con
                        la respuesta del usuario
                        */
                        C = A / B;
                        //dar formato a resultado C para no pasar de decimas
                        Div = df.format(C);
                        System.out.println(A + " / " + B);
                        //Input del usuario
                        resp = lector.nextDouble();
                        /*
                        Pasar variable resp de Double a String para poder 
                        comparar en el while y siga dentro del ciclo
                        */
                        respS = Double.toString(resp);
                        break;
                }
                //Mientras la respuesta sea correcta el ciclo seguira corriendo
            } while (resp == C || respS.equals(Div));
            
        }
        else
        {
            System.out.println("Vuelva pronto");
        }
        
    }
    
}
