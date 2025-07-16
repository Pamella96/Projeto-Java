package NaviosePortos.navios;

import NaviosePortos.interfaces.INavio;
import containers.Container;
import portos.Porto;

import java.util.ArrayList;
import java.util.Collections;

public class navio implements INavio, Comparable<navio> {
    private int id;
    private double abastecer;
    private Porto portoAtual;
    private ArrayList<Container> containers;
    private int totalPeso;
    private int maxNumContainers;
    private int maxNumHeavyContainers;
    private int maxNumRefrigeratedContainers;
    private int maxNumLiquidContainers;
    private double combustivelPerKM;
    private int totalPesoCapacidade;

}
