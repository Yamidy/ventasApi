package co.edu.unbosque.ventas.controller;

import co.edu.unbosque.ventas.jwtutil.JWTChecker;
import co.edu.unbosque.ventas.service.VentasService;
import co.edu.unbosque.ventas.model.Venta;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.message.AuthException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/ventas")
@CrossOrigin(origins="*")
public class VentaController {


    private VentasService ventasService;
    private final JWTChecker jwtchecker;


    @PostMapping
    public void insertarVenta(@RequestHeader Map<String, String> headers, @RequestBody Venta venta) throws AuthException {
        if(jwtchecker.doFilter(headers)){
            ventasService.insertVenta(venta);
    }else{
        throw new AuthException("No authorizado");
    }
}

    @GetMapping
    public List<Venta> getVentas(@RequestHeader Map<String, String> headers) throws AuthException {
        if(jwtchecker.doFilter(headers)){
            return ventasService.getVentas();
    }else{
        throw new AuthException("No authorizado");
        }
    }

    @GetMapping("/{id}")
    public Optional<Venta> getVenta(@RequestHeader Map<String, String> headers, @PathVariable String id) throws AuthException {
        if(jwtchecker.doFilter(headers)){
            return ventasService.getVentaByCodigoVenta(id);
        }else{
        throw new AuthException("No authorizado");
        }
     }

    @DeleteMapping("/{id}")
    public boolean deleteVenta(@RequestHeader Map<String, String> headers, @PathVariable String id) throws AuthException {
        if(jwtchecker.doFilter(headers)){
            return ventasService.deleteVenta(id);
        }else{
        throw new AuthException("No authorizado");
        }
        }

    @PutMapping("/{id}")
    public boolean modificarVenta(@RequestHeader Map<String, String> headers, @RequestBody Venta venta , @PathVariable String id) throws AuthException {
        if(jwtchecker.doFilter(headers)){
            return ventasService.modificarVenta(venta, id);
        }else{
        throw new AuthException("No authorizado");
        }
    }


}
