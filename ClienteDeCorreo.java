
public class ClienteDeCorreo
{
      private ServidorDeCorreo servidor;
      private String usuario;
      
    public ClienteDeCorreo(ServidorDeCorreo servidor, String usuario){
    this.servidor = servidor;
    this.usuario = usuario;
    }
    
    public void enviarMensaje(String para, String texto){
        Mensaje item = new Mensaje(usuario,para,texto);
        servidor.enviar(item);
    }
    public void recibirMensaje(){
        Mensaje item = servidor.entregarUnMensaje(usuario);
        
        if(item == null){
            System.out.println("No tienes mensajes..");
        }else{
            System.out.println("Mensaje recibido: ");
            item.imprimir();
        }
    }
    public void contarMensaje(){
        int cant = 0;
        cant = servidor.contarMensajes(usuario);
        if(cant > 0){
            System.out.println("Tienes "+ cant + " mensajes no leidos");
        }else{
            System.out.println("No tienes menssajes en el servidor");
        }
    }
}
