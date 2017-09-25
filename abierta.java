public class abierta extends Pregunta
{
    private String Pregunta;
    private String respuesta;
    private String contestacion;
    
    public abierta(String cuest, String answ)
    {
        Pregunta = cuest;
        respuesta = answ;
    }
    
    public String contestaPreg(String resp)
    {
        contestacion = resp;
        return (contestacion);
    }
    
    public void respuesa()
    {
        if(respuesta.equals(contestacion))
        {
            System.out.println("Felicidades es correcto");
        }
        else
        {
            System.out.println("Es incorrecto");
        }
    }
}