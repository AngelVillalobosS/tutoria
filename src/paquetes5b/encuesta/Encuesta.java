package paquetes5b.encuesta;

public class Encuesta {
    private Reactivo[] reactivos;
    private int i = 0;

    public void addReactivo(String r){
        this.reactivos[this.i] = reactivo;
        this.i++;
    }
    public String getReactivo(int folio){

        return reactivos == null?null:reactivos[folio].getReactivo();
    }
}
