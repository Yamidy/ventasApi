package co.edu.unbosque.ventas.service;

import co.edu.unbosque.ventas.model.DetalleVenta;
import co.edu.unbosque.ventas.model.Venta;
import co.edu.unbosque.ventas.repository.DetalleVentasRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DetalleVentasService {


    private DetalleVentasRepository DetalleVentasRepository;

    public void insertDetalleVenta(DetalleVenta detalleVenta){
        DetalleVentasRepository.save(detalleVenta);
    }


    public Optional<DetalleVenta> getDetalleVentaById(String id){
        return DetalleVentasRepository.findById(id);
    }

    public boolean deleteDetalleVenta(String id){
        if(!DetalleVentasRepository.existsById(id)){
            return false;
        }
        DetalleVentasRepository.deleteById(id);
        return true;
    }

    public boolean modificarDetalleVenta(DetalleVenta detalleVenta){
        DetalleVentasRepository.save(detalleVenta);
        return !DetalleVentasRepository.existsById(detalleVenta.getCodigo_detalleVenta());
    }

}
