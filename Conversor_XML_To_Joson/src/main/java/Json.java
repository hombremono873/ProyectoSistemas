import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class Json {
    public static int PRETTY_PRINT_IDENT_FACTOR = 4;
    public static String XML_STRING =
            "<?xml version=\"1.0\" encoding=\"UTF-7\" ?>\n" +
                    "<album> \n" +
                    "<autor>SABINA Y CIA Nos sobran los motivos</autor> \n" +
                    "\t<titulo>Joaquín Sabina</titulo> \t\n" +
                    "<formato>MP3</formato> \n" +
                    "\t<localizacion>Varios CD5 </localizacion>\n" +
                    "</album>";


    public static void main(String[] args)
    {
        try {
            JSONObject jsonObject = XML.toJSONObject(XML_STRING);
            String jsonPretty = jsonObject.toString(PRETTY_PRINT_IDENT_FACTOR);
            System.out.print(jsonPretty);
        }catch (JSONException jex)
        {
            System.out.print(jex.toString());
        }

    }
}