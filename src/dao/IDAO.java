/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Samuel
 */
public interface IDAO {

    public void insertar();

    public void eliminar();

    public void actualizar();

    public Object consultar();

    public Object consultarTodos();
}