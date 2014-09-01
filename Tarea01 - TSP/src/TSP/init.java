package TSP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class init {
    public static void main(String[] args)
    {
    	Random rnd = new Random(111);
        List<ciudad> lista = new ArrayList<ciudad>();
        List<TspSol> listaSoluciones = new ArrayList<TspSol>();
        //llenarCiudades(lista);
        
        for (int i=0; i < 10; i++)
            lista.add(new ciudad(i,rnd.nextInt(100),rnd.nextInt(100)));
        
        PermutacionesIterator iter = new PermutacionesIterator(lista);
        while (iter.hasNext())
        {
            TspSol sol = new TspSol(iter.next());
            listaSoluciones.add(sol);
        }  
        
        Collections.sort(listaSoluciones, new Comparator<TspSol>() {
            @Override
            public int compare(TspSol c1, TspSol c2) {
                return Double.compare(c1.getFitness(), c2.getFitness());
            }
        });
        for(int i=0;i<10;i++)
        {
        	System.out.println(listaSoluciones.get(i));
        }
    }
    public static void llenarCiudades(List<ciudad> lista)
    {
    	lista.add(new ciudad(1,3600,2300));
        lista.add(new ciudad(2,3100,330));
        lista.add(new ciudad(3,4700,5750));
        lista.add(new ciudad(4,5400,5750));
        lista.add(new ciudad(5,5608,7103));
        lista.add(new ciudad(6,4493,7102));
        lista.add(new ciudad(7,3600,6950));
        lista.add(new ciudad(8,3100,7250));
        lista.add(new ciudad(9,4700,8450));
        lista.add(new ciudad(10,5400,8450));
        lista.add(new ciudad(11,5610,10053));
        lista.add(new ciudad(12,4492,10052));
        lista.add(new ciudad(13,3600,10800));
        lista.add(new ciudad(14,3100,10950));
        lista.add(new ciudad(15,4700,11650));
        lista.add(new ciudad(16,5400,11650));
        lista.add(new ciudad(17,6650,10800));
        lista.add(new ciudad(18,7300,10950));
        lista.add(new ciudad(19,7300,7250));
        lista.add(new ciudad(20,6650,6950));
        lista.add(new ciudad(21,7300,3300));
        lista.add(new ciudad(22,6650,2300));
        lista.add(new ciudad(23,5400,1600));
        lista.add(new ciudad(24,8350,2300));
        lista.add(new ciudad(25,7850,3300));
        lista.add(new ciudad(26,9450,5750));
        lista.add(new ciudad(27,10150,5750));
        lista.add(new ciudad(28,10358,7103));
        lista.add(new ciudad(29,9243,7102));
        lista.add(new ciudad(30,8350,6950));
        lista.add(new ciudad(31,7850,7250));
        lista.add(new ciudad(32,9450,8450));
        lista.add(new ciudad(33,10150,8450));
        lista.add(new ciudad(34,10360,10053));
        lista.add(new ciudad(35,9242,10052));
        lista.add(new ciudad(36,8350,10800));
        lista.add(new ciudad(37,7850,10950));
        lista.add(new ciudad(38,9450,11650));
        lista.add(new ciudad(39,10150,11650));
        lista.add(new ciudad(40,11400,10800));
        lista.add(new ciudad(41,12050,10950));
        lista.add(new ciudad(42,12050,7250));
        lista.add(new ciudad(43,11400,6050));
        lista.add(new ciudad(44,12050,3300));
        lista.add(new ciudad(45,11400,2300));
        lista.add(new ciudad(46,10150,1600));
        lista.add(new ciudad(47,13100,2300));
        lista.add(new ciudad(48,12600,3300));
        lista.add(new ciudad(49,14200,5750));
        lista.add(new ciudad(50,14900,5750));
        lista.add(new ciudad(51,15108,7103));
        lista.add(new ciudad(52,13993,7102));
        lista.add(new ciudad(53,13100,6950));
        lista.add(new ciudad(54,12600,7250));
        lista.add(new ciudad(55,14200,8450));
        lista.add(new ciudad(56,14900,8450));
        lista.add(new ciudad(57,15110,10053));
        lista.add(new ciudad(58,13992,10052));
        lista.add(new ciudad(59,13100,10800));
        lista.add(new ciudad(60,12600,10950));
        lista.add(new ciudad(61,14200,11650));
        lista.add(new ciudad(62,14900,11650));
        lista.add(new ciudad(63,16150,10800));
        lista.add(new ciudad(64,16800,10950));
        lista.add(new ciudad(65,16800,7250));
        lista.add(new ciudad(66,16150,6050));
        lista.add(new ciudad(67,16800,3300));
        lista.add(new ciudad(68,16150,2300));
        lista.add(new ciudad(69,14900,1600));
        lista.add(new ciudad(70,19800,800));
        lista.add(new ciudad(71,19800,10000));
        lista.add(new ciudad(72,19800,11900));
        lista.add(new ciudad(73,19800,12200));
        lista.add(new ciudad(74,200,12200));
        lista.add(new ciudad(75,200,1100));
        lista.add(new ciudad(76,200,800));
    }
}
