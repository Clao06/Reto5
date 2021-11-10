package co.usa.ciclo3.ciclo3.repository.crud;


import co.usa.ciclo3.ciclo3.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * <H2>CategoryCrudRepository</H2>
 * Interface Categoria
 * @since 21-10-2021
 * @version 1.0
 * @author Claudia Díaz
 */
public interface CategoryCrudRepository extends CrudRepository<Category,Integer> {
    
}

