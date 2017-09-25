public class verdaderoFalso extends Pregunta
{
    private String respuesta;
    private String pregunta;
    private String contestar;
    
    public verdaderoFalso(String resp, String preg)
    {
        respuesta = resp;
        pregunta = preg;
    }
    
    public String responder(String contesta)
    {
         contestar = contesta;
        return contestar;
    }
    
   
    public String respuesta()
    {
        String pregunt = " ";
        
        if(contestar  == respuesta)
        {
            pregunt = "La respuesta es correcta, Felicidades";
        }
        else
        {
            pregunt="La respuesta No es correcta";
        }
        return pregunt;
    }
}
