package Get;

import Get.GetProductsQuery;

import java.util.List;

public class GetProductsQueryHandler {
    public List<String> handle(GetProductsQuery query) {
        // Aquí iría la lógica para obtener la lista de productos desde la base de datos o el repositorio
        // Por simplicidad, solo devolvemos una lista de nombres de productos en este ejemplo
        return List.of("Producto 1", "Producto 2", "Producto 3");
    }
}

