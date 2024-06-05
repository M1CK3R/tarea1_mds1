package org.carbonell.manejador;

import org.carbonell.sistema.Pedido;

import java.util.ArrayList;

public class ManejadorPedidos {
    private ArrayList<Pedido> listaPedido;
    private static ManejadorPedidos INSTANCIA=new ManejadorPedidos();

    public ManejadorPedidos(){
        listaPedido=new ArrayList<>();
    }

    public static ManejadorPedidos getInstance(){
        return INSTANCIA;
    }

    public void agregar(Pedido p){
        listaPedido.add(p);
    }

    public void eliminar(Pedido p){
        listaPedido.remove(p);
    }

    public void editar(Integer index, Pedido nuevoPedido){
        if (index >= 0 && index < listaPedido.size()){
            listaPedido.set(index, nuevoPedido);
        } else {
            throw new IndexOutOfBoundsException("Ese pedido no se encuentra en la lista");
        }
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
