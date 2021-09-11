/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.time.LocalDateTime;
/**
 *
 * @author Admin
 */
public class Persona {
 

    // El accesor "private" significa que ninguna otra clase por fuera puede tener acceso a los atributos
    // La única clase que puede acceder a estos atributos es la clase propietaria o sea la clase Persona
    private String nombres;
    private String apellidos;
    private char genero;
    
    // A continuación se define el método constructor el cual permite crear el objeto por primera vez
    public Persona (String nombres, String apellidos, char genero) {
        // Para crear un objeto de tipo Persona se requieren 3 datos
        // Por eso es que este método constructor tiene tres parámetros
        // la palabra this significa que esta instancia del Objeto va a tomar los nuevos valores
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
    }

    // Este es un método accesor que retorna el valor de los nombres de la Persona
    public String getNombres() {
        return nombres;
    }

    // Este es un método accesor que retorna el valor de los apellidos de la Persona
    public String getApellidos() {
        return apellidos;
    }

    // Este es el método accesor que retorna el valor del género de la Persona
    public char getGenero() {
        return genero;
    }

    // Este es el método accesor que establece o cambia los nombres de la Persona
    public void setNombres(String nombres) {
        this.nombres = nombres;
    
    }
    
    // Este es el método accesor que establece o cambia los apellidos de la Persona
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    // Este es el método accesor que establece o cambia el género de la Persona
    public void setGenero(char genero) {
        /* CODIGO ORGINAL:
        if (genero != 'F' && genero != 'M' && genero != 'I') {
            System.out.println("Error, el género solo acepta los valores F, M, I. No se pudo asignar el genero.");
        }
        else {
            this.genero = genero;
            
        }   MODIFICADO :*/
        
        if (Character.toString(genero).matches("[FMI]")) {
              this.genero = genero;
        } else {
           System.out.println("Error, el género solo acepta los valores F, M, I. No se pudo asignar el genero.");
        }
        
        
    }

    public static void main(String[] args) {
        // Este es el método Main o principal de la clase
        System.out.println("Bienvenido a la clase Persona, hoy es la fecha/hora->" + LocalDateTime.now());
        
        // Se declara una variable de tipo Persona
        Persona Objeto1;
        
        // Se crea una instancia de la clase Persona, es decir que, lo que 
        // se está creando es un objeto de tipo Persona
        // Para crear un objeto se utiliza el método constructor
        Objeto1 = new Persona("Luisa María","Díaz Ruíz", 'F');
        Objeto1.setGenero('R');
        Objeto1.setGenero('M');
        
        System.out.println("Se ha creado un objeto de tipo Persona con los siguientes datos");
        System.out.println("Nombres->" + Objeto1.getNombres());
        System.out.println("Apellidos->" + Objeto1.getApellidos());
        System.out.println("Género->" + Objeto1.getGenero());
    }
    


    
}
