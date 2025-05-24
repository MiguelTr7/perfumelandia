package com.perfulandia.productoservice.service;
import com.perfulandia.productoservice.model.Producto;
import com.perfulandia.productoservice.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductoService {
    private final ProductoRepository repo;
    public ProductoService(ProductoRepository repo){
        this.repo = repo;
    }
    //Listar
    public List<Producto> listar(){
        return repo.findAll();
    }
    //Guardar
    public Producto guardar(Producto producto){
        return repo.save(producto);
    }
    //Buscar x Id
    public Producto buscarPorId(long id){
        return repo.findById(id).orElse(null);
    }
    //Eliminar
    public void eliminar(long id){
        repo.deleteById(id);
    }
}
