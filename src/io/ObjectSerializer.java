package io;

import java.io.BufferedOutputStream;
import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

//record Customer(String username,String email) implements Serializable{
//    private static final UUID customerId = UUID.randomUUID();
//    public UUID getCustomerId() {
//        return customerId;
//    }
//}

class Customer implements Serializable {
    private final UUID customerId;
    private final String username;
    private final String email;

    public Customer(String username, String email) {
        this.username = username;
        this.email = email;
        customerId = UUID.randomUUID();
    }

    public String username(){
        return username;
    }

    public String email(){
        return email;
    }

    public UUID customerId() {
        return customerId;
    }
}

public class ObjectSerializer {

    public <T> void serialize(List<T> data){
        try(var objectSerializer = new ObjectOutputStream(new FileOutputStream("customer.txt"))){

            objectSerializer.writeObject(data);

            System.out.println("Object successfully serialized!!!");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
