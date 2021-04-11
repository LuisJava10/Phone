package controlador;

import dto.DTOArticulo;
import dto.DTOServicioTecnico;
import dto.IDTO;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import modelos.ListaDoblementeEnlazadaGenerica;

/**
 *
 * @author jorge
 */
public class ClienteSocket {

    public static Object ejecutar(IDTO data) { //public static Object ejecutar(DTOArticulo articulo)

        try {
            Socket socket = new Socket("localhost", 7070);

            data.setComando(data.getComando()); //Comando obetener todos en la base de datos.

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            objectOutputStream.writeObject(data);

            Object object = objectInputStream.readObject();

            ListaDoblementeEnlazadaGenerica lista = (ListaDoblementeEnlazadaGenerica) object;

            socket.close();

            return object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    /*
    public static Object ejecutarServicio(DTOServicioTecnico servicio) {

        

        try {
            Socket socket = new Socket("localhost", 7070);

            servicio.setComando(servicio.getComando()); //Comando obetener todos en la base de datos.

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            objectOutputStream.writeObject(servicio);

            System.out.println("1...");
           
            // read the list of messages from the socket
            Object object = objectInputStream.readObject();
            System.out.println("2.1...");
            
            ListaDoblementeEnlazadaGenerica lista = (ListaDoblementeEnlazadaGenerica) object;
            System.out.println("2...");
            
//            ObjetoGenerico og = lista.getCabecera();
//
//            while (og != null) {
//                articulo = (DTOArticulo) og.getT();
//
//                System.out.println(articulo.getNombre());
//
//                og = og.getSiguiente();
//            }
            
            socket.close();
            
            return object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return null;
    }
     */
}
