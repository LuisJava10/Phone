/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author jorge
 */

//Me genera la instruccion SQL
public class DTOServicioTecnico implements IDTO{
    
    private int idCliente;
    private String tipoServicio;
    private String fechaIngreso;   //private Date fechaIngreso; 
    private String fechaEgreso;
    private double valor;
    private DTOCliente cliente;
    
    private int comando;
    

    public DTOServicioTecnico(){
        
    }

    public DTOServicioTecnico(int idCliente, String tipoServicio, String fechaIngreso, String fechaEgreso, double valor, DTOCliente cliente, int comando) {
        this.idCliente = idCliente;
        this.tipoServicio = tipoServicio;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
        this.valor = valor;
        this.cliente = cliente;
        this.comando = comando;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getComando() {
        return comando;
    }

    public void setComando(int comando) {
        this.comando = comando;
    }

    public DTOCliente getCliente() {
        return cliente;
    }

    public void setCliente(DTOCliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    @Override
    public String insertar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarPorID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 
}
