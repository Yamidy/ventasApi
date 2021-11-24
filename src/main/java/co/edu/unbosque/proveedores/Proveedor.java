package co.edu.unbosque.proveedores;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Proveedor {

    @Id
    private int nitproveedor;
    private String ciudad_proveedor;
    private String direccion_proveedor;
    private String nombre_proveedor;
    private int telefono_proveedor;
}
