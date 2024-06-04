package org.carbonell.manejador;

import org.carbonell.sistema.Pedido;

import java.util.ArrayList;

public class ManejadorPedidos {
    private ArrayList<Pedido> listaPedido;
    private static ManejadorPedidos INSTANCIA=new ManejadorPedidos();

    public ManejadorPedidos(){
        listaPedido=new ArrayList<>();
    }

    public void agregar(Pedido p){
        listaPedido.add(p);
    }

    public void eliminar(Pedido p){
        listaPedido.remove(p);
    }

    public Pedido buscar(String nombre){
        Pedido encontrado = null;
        for (Pedido p:listaPedido){
            if (p.getNombreCliente().equals(nombre)==true){
                encontrado=p;
            }
        }
        return encontrado;
    }

    public ArrayList<Pedido> listar(){
        return this.listaPedido;
    }
}
