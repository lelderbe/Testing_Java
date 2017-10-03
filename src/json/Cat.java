package json;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;

/**
 * Created by user on 23.05.2017.
 */
@JsonAutoDetect
public class Cat {
    @JsonProperty("alias")
    public String name;
    public int age;
    @JsonIgnore
    public int weight;

    public static void main(String[] args) throws IOException {
        //создание объекта для сериализации в JSON
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем во Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //это объект Jackson, который выполняет сериализацию
        ObjectMapper mapper = new ObjectMapper();

//        mapper.setVisibility(FIELD, JsonAutoDetect.Visibility.ANY);
        // сама сериализация: 1-куда, 2-что
        mapper.writeValue(writer, cat);

        //преобразовываем все записанное во StringWriter в строку
        String result = writer.toString();
        System.out.println(result);



//        String jsonString = "{ \"name\":\"Murka\", \"age\":5, \"weight\":4}";
        String jsonString = "{ \"age\":5, \"alias\":\"Murka\"}";
        StringReader reader = new StringReader(jsonString);

        ObjectMapper mapper2 = new ObjectMapper();

        Cat cat2 = mapper2.readValue(reader, Cat.class);

        System.out.println(cat2);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
