package org.carbonell.sistema;

import java.time.LocalDate;

public class Pedido {

    // Datos de los pedidos
    private Integer idPedido;
    private String nombreCliente;
    private String tipoPedido;
    private String descripcion;
    private LocalDate fechaEntrega;
    private LocalDate fechaRecoleccion;
    private Integer cantidadArticulos;
    private Double costo;

    // Constructor de pedido
    public Pedido(Integer idPedido, String nombreCliente, String tipoPedido, String descripcion, LocalDate fechaEntrega, LocalDate fechaRecoleccion, Integer cantidadArticulos, Double costo) {
        this.idPedido = idPedido;
        this.nombreCliente = nombreCliente;
        this.tipoPedido = tipoPedido;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.fechaRecoleccion = fechaRecoleccion;
        this.cantidadArticulos = cantidadArticulos;
        this.costo = costo;
    }

    // Getters y Setters
    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaRecoleccion() {
        return fechaRecoleccion;
    }

    public void setFechaRecoleccion(LocalDate fechaRecoleccion) {
        this.fechaRecoleccion = fechaRecoleccion;
    }

    public Integer getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(Integer cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
}
