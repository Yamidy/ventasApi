package co.edu.unbosque.ventas.repository;

import co.edu.unbosque.ventas.model.DetalleVenta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DetalleVentasRepository extends MongoRepository<DetalleVenta,String> {

}
