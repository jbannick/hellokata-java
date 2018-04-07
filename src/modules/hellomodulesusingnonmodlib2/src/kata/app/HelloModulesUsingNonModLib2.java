package kata.app;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloModulesUsingNonModLib2 {

    public static void main(String... args)  throws Exception{
        System.out.println("Hello Modules Using Non-Modularized Library 2!");

        Field[] fields = {
            new Field("FieldA"),
            new Field("FieldB")
        };

        FieldWithSubfields field01 = new FieldWithSubfields("Field01", fields);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(field01);
        System.out.println(json);
    }
}
