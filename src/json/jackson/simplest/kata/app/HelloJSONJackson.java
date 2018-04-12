package kata.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloJSONJackson {

    public static void main(String... args)  throws Exception{
        System.out.println("Hello JSON using Jackson!");

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        Field field = new Field("Hat", 5, false, "The Queen likes them");
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(field));

        Field[] fields = {
                new Field("Coat", 7, true, "Out of fashion"),
                new Field("Shoes", 8, false, null),
        };

        FieldWithSubfields fieldWithSubfields = new FieldWithSubfields("Bundle", fields);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(fieldWithSubfields));
    }
}
