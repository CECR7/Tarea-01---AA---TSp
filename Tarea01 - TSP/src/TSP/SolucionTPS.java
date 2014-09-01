
package TSP;

import java.util.List;


public class Solucion {

    private List<ciudad> ciudades;

    public Solucion(List<ciudad> ciudades)
    {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "TspSol {" + ciudades + "} = " + this.getFitness();
    }

    public double getFitness(){
        double salida =0.0;

        for (int i=0; i < ciudades.size()-1; i++){
            salida += ciudades.get(i).distancia(ciudades.get(i+1));
        }
        salida += ciudades.get(0).distancia(ciudades.get(ciudades.size()-1));

        return salida;
    }


}
