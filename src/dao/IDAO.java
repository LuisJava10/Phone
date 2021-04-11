package dao;

/**
 *
 * @author jorge
 */
public interface IDAO {

    public void insertar();

    public void eliminar();

    public void actualizar();

    public Object consultar();

    public Object consultarTodos();
}
