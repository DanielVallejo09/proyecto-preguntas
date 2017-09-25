import java.util.ArrayList;

public class opcionMultiple extends Pregunta
{
    private String Respuesta;
    private ArrayList<Pregunta> preguntas;
    private String eleccion;
    
    public opcionMultiple(String Resp)
    {
        Respuesta = Resp;
        preguntas = new ArrayList<Pregunta>();
    }
    
    public void generaPreg(Pregunta cuest)
    {
        preguntas.add(cuest);
    }
    
    public void generaEleccion(String select)
    {
        eleccion = select;
    }
    
    public void MuestraPosiblesResp()
    {
        for(int i = 0; i<preguntas.size(); i++)
        {
            preguntas.get(i);
        }
    }
    
   
    public String respuesta()
    {
        String pregunt = " ";
        
        if(eleccion == Respuesta)
        {
            pregunt ="felicidades es la respuesta correcta";
            
        }
        else{
            pregunt = "Es incorrecto";
        }
        return(pregunt);
    }
}
