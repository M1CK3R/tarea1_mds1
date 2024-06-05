package org.carbonell.sistema;

import org.carbonell.manejador.ManejadorPedidos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws IOException {

        Usuario userAutenticado = new Usuario("Erick", "erick124", "abc123", "erick123@gmail.com");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Datos de Usuario: ");
        Usuario user=new Usuario();
        System.out.println("Nombre: ");
        user.setNombre(br.readLine());
        System.out.println("Username: ");
        user.setUsername(br.readLine());
        System.out.println("Contraseña: ");
        user.setPassword(br.readLine());
        System.out.println("Email: ");
        user.setEmail(br.readLine());

        int opcion=0;
        String usernameUsuario = user.getUsername();
        String usernameUsuarioAut = userAutenticado.getUsername();
        do {
            if (usernameUsuario == usernameUsuarioAut){
                System.out.println("--------Menu--------");
                System.out.println("  Agregar -------> 1");
                System.out.println("  Editar  -------> 2");
                System.out.println("  Listar  -------> 3");
                System.out.println(" Eliminar -------> 4");
                System.out.println("  Salir   -------> 5");
                opcion=Integer.parseInt(br.readLine());
                switch (opcion) {
                    case 1:
                        Pedido nuevo = new Pedido();
                        System.out.println("--  Selecciono Agregar  --");
                        nuevo.setIdPedido(ManejadorPedidos.getInstance().listar().size());
                        System.out.println(nuevo.getIdPedido());
                        nuevo.setNombreCliente(user.getNombre());
                        System.out.println("Tipo de pedido: ");
                        nuevo.setTipoPedido(br.readLine());
                        System.out.println("Descripción del pedido: ");
                        nuevo.setDescripcion(br.readLine());
                        System.out.println("Fecha de entrega (Ingresar en formato YYYY-MM-DD): ");
                        nuevo.setFechaEntrega(LocalDate.parse(br.readLine()));
                        System.out.println("Fecha de recolección: "+LocalDate.now());
                        nuevo.setFechaRecoleccion(LocalDate.now());
                        System.out.println("Cantidad de articulos del pedido: ");
                        nuevo.setCantidadArticulos(Integer.parseInt(br.readLine()));
                        System.out.println("Costo: ");
                        nuevo.setCosto(Double.parseDouble(br.readLine()));
                        ManejadorPedidos.getInstance().agregar(nuevo);
                        System.out.println("Se agrego con exito el siguiente pedido:");
                        System.out.println("Id del Pedido: "+nuevo.getIdPedido()+" Nombre del cliente: "+nuevo.getNombreCliente()+" Tipo de pedido: "+nuevo.getTipoPedido()+" Descripción: "+nuevo.getDescripcion()+" Fecha de entrega: "+nuevo.getFechaEntrega()+" Fecha de recolección"+nuevo.getFechaRecoleccion()+" Cantidad de articulos: "+nuevo.getCantidadArticulos()+" Costo: "+nuevo.getCosto());
                        break;

                    case 2:
                        System.out.println("--  Selecciono Editar   --");
                        for (Pedido p:ManejadorPedidos.getInstance().listar()){
                            System.out.println("Id del Pedido: "+p.getIdPedido()+" Nombre del cliente: "+p.getNombreCliente()+" Tipo de pedido: "+p.getTipoPedido()+" Descripción: "+p.getDescripcion()+" Fecha de entrega: "+p.getFechaEntrega()+" Fecha de recolección"+p.getFechaRecoleccion()+" Cantidad de articulos: "+p.getCantidadArticulos()+" Costo: "+p.getCosto());

                        }
                        System.out.println("¿Qué pedido desea editar?");
                        int index = Integer.parseInt(br.readLine()) - 1;
                        Pedido pedidoA_Editar = new Pedido();
                        pedidoA_Editar.setIdPedido(ManejadorPedidos.getInstance().listar().size());
                        System.out.println(pedidoA_Editar.getIdPedido());
                        pedidoA_Editar.setNombreCliente(user.getNombre());
                        System.out.println("Nuevo tipo de pedido: ");
                        pedidoA_Editar.setTipoPedido(br.readLine());
                        System.out.println("Nueva descripción del pedido: ");
                        pedidoA_Editar.setDescripcion(br.readLine());
                        System.out.println("Nueva fecha de entrega (Ingresar en formato YYYY-MM-DD): ");
                        pedidoA_Editar.setFechaEntrega(LocalDate.parse(br.readLine()));
                        System.out.println("Nueva fecha de recolección: "+LocalDate.now());
                        pedidoA_Editar.setFechaRecoleccion(LocalDate.now());
                        System.out.println("Nueva cantidad de articulos del pedido: ");
                        pedidoA_Editar.setCantidadArticulos(Integer.parseInt(br.readLine()));
                        System.out.println("Nuevo costo: ");
                        pedidoA_Editar.setCosto(Double.parseDouble(br.readLine()));
                        ManejadorPedidos.getInstance().editar(index, pedidoA_Editar);
                        System.out.println("Se edito con exito el siguiente pedido:");
                        System.out.println("Id del Pedido: "+pedidoA_Editar.getIdPedido()+" Nombre del cliente: "+pedidoA_Editar.getNombreCliente()+" Tipo de pedido: "+pedidoA_Editar.getTipoPedido()+" Descripción: "+pedidoA_Editar.getDescripcion()+" Fecha de entrega: "+pedidoA_Editar.getFechaEntrega()+" Fecha de recolección"+pedidoA_Editar.getFechaRecoleccion()+" Cantidad de articulos: "+pedidoA_Editar.getCantidadArticulos()+" Costo: "+pedidoA_Editar.getCosto());
                        break;

                    case 3:
                        System.out.println("--  Selecciono Listar   --");
                        System.out.println(ManejadorPedidos.getInstance().listar());
                        break;

                    case 4:
                        System.out.println("-- Selecciono Eliminar  --");
                        for (Pedido p:ManejadorPedidos.getInstance().listar()){
                            System.out.println("Id del Pedido: "+p.getIdPedido()+" Nombre del cliente: "+p.getNombreCliente()+" Tipo de pedido: "+p.getTipoPedido()+" Descripción: "+p.getDescripcion()+" Fecha de entrega: "+p.getFechaEntrega()+" Fecha de recolección"+p.getFechaRecoleccion()+" Cantidad de articulos: "+p.getCantidadArticulos()+" Costo: "+p.getCosto());

                        }
                        System.out.println("Ingrese el Id del pedido a eliminar");
                        Pedido pedidoA_Eliminar = ManejadorPedidos.getInstance().buscar(br.readLine());
                        ManejadorPedidos.getInstance().eliminar(pedidoA_Eliminar);
                        System.out.println("Se elimino con éxito el pedido");
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema");
                    default:
                        System.out.println("Opción no valida, intente nuevamente");
                        break;
                }
            } else if (usernameUsuario != usernameUsuarioAut){
                System.out.println("--------Menu--------");
                System.out.println("  Agregar -------> 1");
                System.out.println("  Salir   -------> 2");
                opcion=Integer.parseInt(br.readLine());
                switch (opcion) {
                    case 1:
                        Pedido nuevo = new Pedido();
                        System.out.println("--  Selecciono Agregar  --");
                        nuevo.setIdPedido(ManejadorPedidos.getInstance().listar().size());
                        System.out.println(nuevo.getIdPedido());
                        nuevo.setNombreCliente(user.getNombre());
                        System.out.println("Tipo de pedido: ");
                        nuevo.setTipoPedido(br.readLine());
                        System.out.println("Descripción del pedido: ");
                        nuevo.setDescripcion(br.readLine());
                        System.out.println("Fecha de entrega (Ingresar en formato YYYY-MM-DD): ");
                        nuevo.setFechaEntrega(LocalDate.parse(br.readLine()));
                        System.out.println("Fecha de recolección: "+LocalDate.now());
                        nuevo.setFechaRecoleccion(LocalDate.now());
                        System.out.println("Cantidad de articulos del pedido: ");
                        nuevo.setCantidadArticulos(Integer.parseInt(br.readLine()));
                        System.out.println("Costo: ");
                        nuevo.setCosto(Double.parseDouble(br.readLine()));
                        ManejadorPedidos.getInstance().agregar(nuevo);
                        System.out.println("Se agrego con exito el siguiente pedido:");
                        System.out.println("Id del Pedido: "+nuevo.getIdPedido()+" Nombre del cliente: "+nuevo.getNombreCliente()+" Tipo de pedido: "+nuevo.getTipoPedido()+" Descripción: "+nuevo.getDescripcion()+" Fecha de entrega: "+nuevo.getFechaEntrega()+" Fecha de recolección"+nuevo.getFechaRecoleccion()+" Cantidad de articulos: "+nuevo.getCantidadArticulos()+" Costo: "+nuevo.getCosto());
                        break;

                    case 2:
                        System.out.println("Saliendo del sistema");
                        opcion=5;
                        break;

                    default:
                        System.out.println("Opción no valida, intente nuevamente");
                        break;
                }
            }
        } while (opcion!=5);
    }
}