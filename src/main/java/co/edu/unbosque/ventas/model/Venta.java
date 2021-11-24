package co.edu.unbosque.ventas.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@Document
public class Venta {

    @Id
    private int codigo_venta;
    private int cedula_cliente;
    private ArrayList<DetalleVenta> detalle_venta;
    private double total_venta;
    private double ivaventa;
    private double valor_venta;
}
