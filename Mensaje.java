
public class Mensaje
{
    private String de;
    private String para;
    private String texto;

    public Mensaje(String de, String para, String texto){
        this.de = de;
        this.para = para;
        this.texto = texto;
    }
    
    public String getDe(){
        return this.de;
    }
    public void setDe(String de){
        this.de = de;
    }
    public String getPara(){
        return this.para;
    }
    public void setPara(String para){
        this.para = para;
    }public String getTexto(){
        return this.texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    //metodos
    public void imprimir(){
        System.out.println("De: "+ getDe());
        System.out.println("Para: "+ getPara());
        System.out.println("Texto: "+ getTexto());
    }
}
