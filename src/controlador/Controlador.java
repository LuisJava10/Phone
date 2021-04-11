/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.DTOArticulo;
import dto.DTOServicioTecnico;
import modelos.ListaDoblementeEnlazadaGenerica;
import utils.ComandosSql;
import vista.Principal;

/**
 *
 * @author Samuel
 */

    public class Controlador {
    
    private Principal vista;
    private DTOArticulo producto;
    
    public Controlador(Principal vista, DTOArticulo producto) {
        this.vista = vista;
        this.producto = producto;
       
    }
    
     public void iniciar(){
        
        vista.setTitle("Phone Store");
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
    }
    
   public ListaDoblementeEnlazadaGenerica obtenerTodosArticulos() {
        DTOArticulo articulo = new DTOArticulo();
        articulo.setComando(ComandosSql.ARTICULO_CONSULTAR_TODOS);
        
        return (ListaDoblementeEnlazadaGenerica) ClienteSocket.ejecutar(articulo);
    }
   
    public ListaDoblementeEnlazadaGenerica obtenerTodosServicios(){
        
        DTOServicioTecnico servicio = new DTOServicioTecnico();
        servicio.setComando(ComandosSql.SERVICIO_CONSULTAR_TODOS);
        
        return (ListaDoblementeEnlazadaGenerica) ClienteSocket.ejecutarServicio(servicio);
        
    }

    public ListaDoblementeEnlazadaGenerica obtenerCategorias() {
        DTOArticulo articulo = new DTOArticulo();
        articulo.setComando(ComandosSql.CATEGORIA_CONSULTAR_TODAS);
        
        return (ListaDoblementeEnlazadaGenerica) ClienteSocket.ejecutar(articulo);
    }

    public void crearArticulo(DTOArticulo articulo) {
        ClienteSocket.ejecutar(articulo);
    }
    
}
