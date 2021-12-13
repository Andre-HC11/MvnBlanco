package uv.mx.sistemasweb;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        get("/aprobado", (req, res) -> "Espero pasar con 6 :)");
    }
}
