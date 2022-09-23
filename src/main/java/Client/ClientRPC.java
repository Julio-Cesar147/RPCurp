package Client;

import Server.Person;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClientRPC {

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();

        Scanner scn = new Scanner(System.in);
        int opc;
        System.out.println("Selecciona una opcion");
        System.out.println("1.- Registrar una persona");
        System.out.println("2.- Consultar a una persona");
        opc = scn.nextInt();
        switch(opc){
            case 1:

                System.out.println("Ingresa tu nombre");
                String name = scn.next();
                System.out.println("Tu primer apellido");
                String lastname = scn.next();
                System.out.println("Segundo apellido");
                String surname = scn.next();
                System.out.println("Ahora tu genero");
                String sexo = scn.next();
                System.out.println("Estado de Nacimiento");
                String state = scn.next();
                System.out.println("Tu fecha de Nacimiento");
                String date = scn.next();

                client.setConfig(config);
                Object [] data = {name, lastname, surname, sexo, state, date};
                String response = (String) client.execute("Methods.generateCurp", data);
                System.out.println(response);
        }


    }
}
