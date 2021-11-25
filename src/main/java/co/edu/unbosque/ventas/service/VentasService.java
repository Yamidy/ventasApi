package co.edu.unbosque.ventas.service;

import co.edu.unbosque.ventas.repository.VentasRepository;
import co.edu.unbosque.ventas.model.Venta;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VentasService {

    private VentasRepository ventasRepository;

    public void insertVenta(Venta venta){
        ventasRepository.save(venta);
    }

    public List<Venta> getVentas(){
        return ventasRepository.findAll();
    }

    public Optional<Venta> getVentaByCodigoVenta(String id){
        return ventasRepository.findById(id);
    }

    public boolean deleteVenta(String id){
        if(!ventasRepository.existsById(id)){
            return false;
        }
        ventasRepository.deleteById(id);
        return true;
    }

    public boolean modificarVenta(Venta venta, String id){
        if(ventasRepository.existsById(id)) ventasRepository.save(venta);
        return ventasRepository.existsById(id);
    }
}
