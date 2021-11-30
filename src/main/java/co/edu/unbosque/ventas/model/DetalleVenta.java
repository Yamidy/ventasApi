package co.edu.unbosque.ventas.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class DetalleVenta {

    // Se considera un solo producto ¿?

    @Id
    private String codigo_detalleVenta;
    private int codigo_producto;
    private int cantidad_producto;
    private double valor_total; //cantidad_producto x precioDelProducto (¿?)
    private double valoriva; // valor_total * ivaDelProducto (¿?)
    private double valor_venta; //valor_total + valoriva
}
