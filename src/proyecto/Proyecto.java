/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luisa fernanda Riascos
 */
public class Proyecto {
    
   
    private  int presupuesto;
    private String nombre;
    private int duracionMeses;
    
    
    public Proyecto (String nombreProyecto,int presupuestoProyecto,int duracionProyecto){
    this.nombre= nombreProyecto;
    this.presupuesto= presupuestoProyecto;
    this.duracionMeses= duracionProyecto;
    }
    
     

    /**
     * @return the presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the duracionMeses
     */
    public int getDuracionMeses() {
        return duracionMeses;
    }

    /**
     * @param duracionMeses the duracionMeses to set
     */
    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Proyecto> proyecto = new ArrayList();
        proyecto.add(new Proyecto("Construcción de un puente vehícular",1500,6));
        proyecto.add(new Proyecto("Desarrollo Aplicativo Web de Nómina",480,6));
        proyecto.add(new Proyecto("Vacunación primera línea COVID",2000,4));
    
        for (int i = 0; i < proyecto.size(); i++) {
           
           System.out.println("Nombre: "+proyecto.get(i).getNombre() +", Presupuesto " + proyecto.get(i).getPresupuesto() + " Millones, Duracion: " + proyecto.get(i).getDuracionMeses() + " meses" );
            
        }
       
    }

    
}
