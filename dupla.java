import java.util.Scanner;

/**
 * Programa para devolver 2 valores predeterminados y editarlos
 * 
 * @author Sandra Martin, Israel Severiche, Jose Alvarez
 * @version 20190907
 */

public class dupla{
    static Scanner teclado = new Scanner (System.in);
    private int a, b;
    public dupla(){
        this.a = 12;
        this.b = 32;
    }
    
    public void dardupla(){
        System.out.println( this.a + ", " + this.b );
    }
    
    public void newDuplaA( int newDuplaA2 ){
        this.a = newDuplaA2;
    }
    
    public void newDuplaB( int newDuplaB2 ){
        this.b = newDuplaB2;
    }
    
    public void leer(){
        System.out.println( "Inserte la primera dupla" );
        int a = teclado.nextInt();
        System.out.println( "inserte la segunda dupla" );
        int b = teclado.nextInt();
        newDuplaA(a);
        newDuplaB(b);
    }
    
    public static void main( String[] args ){
        dupla dupla = new dupla();
        int select = 0;
        while( select != 3 ){
            System.out.println( "Por favor seleccione una opción" );
            System.out.println( "Presione la tecla 1 para ver la dupla" );
            System.out.println( "Presione la tecla 2 para cambiar dupla" );
            System.out.println( "Presione la tecla 3 para terminar el programa" );
            select = teclado.nextInt();
            if( select == 1 ){
                dupla.dardupla();
            }
            
            if( select == 2 ){
                dupla.leer();
            }
            
            if( select > 3 ){
                System.out.println( "No entiendo" );
            }     
        }
    }
}
