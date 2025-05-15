package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectDeserializer {
    public <T extends Customer> List<T> deserialize(){
        try(var objectDeserializer = new ObjectInputStream(new FileInputStream("customer.txt"))){
            return (List<T>)objectDeserializer.readObject();
        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
