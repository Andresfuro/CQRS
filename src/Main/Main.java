package Main;

import Add.AddProductCommand;
import Add.AddProductCommandHandler;
import Get.GetProductsQuery;
import Get.GetProductsQueryHandler;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Comando: Agregar un nuevo producto
        AddProductCommand addCommand = new AddProductCommand("Nuevo Producto", 10.000);
        AddProductCommandHandler addHandler = new AddProductCommandHandler();
        addHandler.handle(addCommand);

        // Consulta: Obtener la lista de productos
        GetProductsQuery getQuery = new GetProductsQuery();
        GetProductsQueryHandler getHandler = new GetProductsQueryHandler();
        List<String> products = getHandler.handle(getQuery);

        System.out.println("Lista de productos disponibles:");
        for (String productName : products) {
            System.out.println(productName);
        }
    }
}
