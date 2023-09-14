package Add;

import Add.AddProductCommand;

public class AddProductCommandHandler {
    public void handle(AddProductCommand command) {
        // Aquí iría la lógica para agregar el producto a la base de datos o el repositorio
        System.out.println("Producto agregado: " + command.getName() + " - Precio: " + command.getPrice());
    }
}

