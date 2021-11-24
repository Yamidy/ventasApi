package co.edu.unbosque.ventas.controller;

import co.edu.unbosque.ventas.service.VentasService;
import co.edu.unbosque.ventas.model.Venta;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/ventas")
public class VentaController {


    private VentasService ventasService;


    @PostMapping
    public void insertarVenta(@RequestBody Venta venta){
        ventasService.insertVenta(venta);
    }

    @GetMapping
    public List<Venta> getVentas(){
        return ventasService.getVentas();
    }

    @GetMapping("/{id}")
    public Optional<Venta> getVenta(@PathVariable int id){
        return ventasService.getVentaByCodigoVenta(id);
     }

    @DeleteMapping("/{id}")
    public boolean deleteVenta(@PathVariable int id){
        return ventasService.deleteVenta(id);
        }

    @PutMapping
    public boolean modificarVenta(@RequestBody Venta venta){
        return ventasService.modificarVenta(venta);
    }


}
