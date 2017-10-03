package xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by user on 24.05.2017.
 */
public class Solution {
    public static void main(String[] args) throws JAXBException {
        //создание объекта для сериализации в XML
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(Cat.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(cat, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();
        System.out.println(result);

        // Deserialization ----------------------------------------------------------------------------
        String xmldata = "<cat><name>Murka</name><age>5</age><weight>4</weight></cat>";
        StringReader reader = new StringReader(xmldata);

        JAXBContext context2 = JAXBContext.newInstance(Cat.class);
        Unmarshaller unmarshaller = context2.createUnmarshaller();

        Cat cat2 = (Cat) unmarshaller.unmarshal(reader);

        System.out.println(cat2);
    }


    @XmlType(name = "cat") @XmlRootElement
    public static class Cat {
        public String name;
        public int age;
        public int weight;

        Cat() { }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }
}
