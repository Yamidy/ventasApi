package co.edu.unbosque.ventas.controller;

import co.edu.unbosque.ventas.model.DetalleVenta;
import co.edu.unbosque.ventas.service.DetalleVentasService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/detalleVentas")
public class DetalleVentaController {


    private DetalleVentasService detalleVentasService;


    @PostMapping
    public void insertarDetalleVenta(@RequestBody DetalleVenta detalleVenta){
        detalleVentasService.insertDetalleVenta(detalleVenta);
    }

    @GetMapping("/{id}")
    public Optional<DetalleVenta> getDetalleVenta(@PathVariable String id){
        return detalleVentasService.getDetalleVentaById(id);
     }

    @DeleteMapping("/{id}")
    public boolean deleteDetalleVenta(@PathVariable String id){
        return detalleVentasService.deleteDetalleVenta(id);
        }

    @PutMapping
    public boolean modificarDetalleVenta(@RequestBody DetalleVenta detalleVenta){
        return detalleVentasService.modificarDetalleVenta(detalleVenta);
    }


}
