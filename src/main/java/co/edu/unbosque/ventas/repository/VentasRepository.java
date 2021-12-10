package co.edu.unbosque.ventas.repository;

import co.edu.unbosque.ventas.model.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VentasRepository extends MongoRepository<Venta,String> {

}
