package co.edu.unbosque.proveedores;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProveedorService {

    private ProveedorRepository proveedorRepository;

    public void insertProveedor(Proveedor proveedor){
        proveedorRepository.save(proveedor);
    }

    public List<Proveedor> getProveedores(){
        return proveedorRepository.findAll();
    }

    public Optional<Proveedor> getProveedorByNit(int nit){
        return proveedorRepository.findById(nit);
    }

    public boolean deleteProveedor(int nit){
        if(!proveedorRepository.existsById(nit)){
            return false;
        }
        proveedorRepository.deleteById(nit);
        return true;
    }

    public boolean updateProveedor(Proveedor proveedor){
        proveedorRepository.save(proveedor);
        return !proveedorRepository.existsById(proveedor.getNitproveedor());
    }
}
