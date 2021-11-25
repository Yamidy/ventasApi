package co.edu.unbosque.ventas.repository;

import co.edu.unbosque.ventas.model.DetalleVenta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DetalleVentasRepository extends MongoRepository<DetalleVenta,String> {


}
