package paquete;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.*;

public class Main {
    public static void main(String[] args) throws JSONException {
        ObjectMapper mapper = new ObjectMapper();

        Respuesta res;
        Link linkNuevo = new Link();
        
        // Parseando un JSON a un POJO
        try {
            res = mapper.readValue(new File("./respuesta.json"), Respuesta.class);
            imprimirObjetoParseado(res);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convirtiendo un objeto a un JSON
        System.out.println();
        linkNuevo.setHref("testing");
        linkNuevo.setRel("this");
        linkNuevo.setName("shit");
        linkNuevo.setKind("out");

        linkNuevo.imprimir();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("miNuevoJSON.json"), linkNuevo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nDONE.");
    }

    public static void imprimirObjetoParseado(Respuesta r) {
        System.out.println("TransactionHeaderId: " + r.getTransactionHeaderId());
        System.out.println("ReturnStatus: " + r.getReturnStatus());
        System.out.println("ErrorCode: " + r.getErrorCode());
        System.out.println("ErrorExplanation: " + r.getErrorExplanation());
        System.out.println("PickSlip: " + r.getPickSlip());
        System.out.println("PickSlipLine: " + r.getPickSlipLine());
        for(int i = 0 ; i < r.getPicklines().size() ; i++) {
            System.out.println("\n  Pickline " + (i+1) + "\n");
            System.out.println("    Locator: " + r.getPicklines().get(i).getLocator());
            System.out.println("    PickSlipLine: " + r.getPicklines().get(i).getPickSlipLine());
            System.out.println("    PickSlip: " + r.getPicklines().get(i).getPickSlip());
            System.out.println("    PickedQuantity: " + r.getPicklines().get(i).getPickedQuantity());
            System.out.println("    SecondaryPickedQuantity: " + r.getPicklines().get(i).getSecondaryPickedQuantity());
            System.out.println("    SubInventoryCode: " + r.getPicklines().get(i).getSubinventoryCode());
            for(int j = 0 ; j < r.getPicklines().get(i).getLinks().size() ; j++) {
                System.out.println("\n      Link " + (j+1) + "\n");
                System.out.println("        rel: " + r.getPicklines().get(i).getLinks().get(j).getRel());
                System.out.println("        href: " + r.getPicklines().get(i).getLinks().get(j).getHref());
                System.out.println("        name: " + r.getPicklines().get(i).getLinks().get(j).getName());
                System.out.println("        kind: " + r.getPicklines().get(i).getLinks().get(j).getKind());
            }
        }
        for(int j = 0 ; j < r.getLinks().size() ; j++) {
            System.out.println("\nLink " + (j+1) + "\n");
            System.out.println("rel: " + r.getLinks().get(j).getRel());
            System.out.println("href: " + r.getLinks().get(j).getHref());
            System.out.println("name: " + r.getLinks().get(j).getName());
            System.out.println("kind: " + r.getLinks().get(j).getKind());
        }
    }
}