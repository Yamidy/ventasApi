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
    private String codigo_venta;
    private int cedula_cliente;
    private ArrayList<DetalleVenta> detalle_venta;
    private double total_venta; // total venta sin iva
    private double ivaventa; // total iva de la venta
    private double valor_venta; // suma del total de la venta más el total del iva
}
