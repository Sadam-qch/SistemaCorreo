import java.util.ArrayList; 
import java.util.Iterator;

public class ServidorDeCorreo
{
    private ArrayList<Mensaje> items;


    public ServidorDeCorreo(){  
        items = new ArrayList<Mensaje>();
    }
    
    public ArrayList<Mensaje> getItems(){
        return this.items;
    }
    
    public void setItems(ArrayList<Mensaje> items){
        this.items = items;
    }
    
    public int contarMensajes(String quien){
        int contador = 0;
        
        for(Mensaje item : items){
            if(item.getPara().equals(quien)){
                //contabilizar
                contador++;
            }
        }
        return contador;
    }
    
    public Mensaje entregarUnMensaje(String quien){
        Iterator<Mensaje> it = items.iterator();
        while(it.hasNext()){
                Mensaje item = it.next();
                if(item.getPara().equals(quien)){
                    it.remove();
                    return item;
                }
        }
        return null;     
    }
    public void enviar(Mensaje item){
        items.add(item);
    }
}
    
