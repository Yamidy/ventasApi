package co.edu.unbosque.proveedores;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/proveedores")
public class ProveedorController {


    private ProveedorService proveedorService;


    @PostMapping
    public void insertarCliente(@RequestBody Proveedor proveedor){
        proveedorService.insertProveedor(proveedor);
    }

    @GetMapping
    public List<Proveedor> getClientes(){
        return proveedorService.getProveedores();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> getProveedor(@PathVariable int id){
        return proveedorService.getProveedorByNit(id);
     }

    @DeleteMapping("/{id}")
    public boolean deleteProveedor(@PathVariable int id){
        return proveedorService.deleteProveedor(id);
        }

    @PutMapping
    public boolean updateProveedor(@RequestBody Proveedor proveedor){
        return proveedorService.updateProveedor(proveedor);
    }


}
