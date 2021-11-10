package co.usa.ciclo3.ciclo3.repository.crud;

import co.usa.ciclo3.ciclo3.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 * <H2>MessageCrudRepository</H2>
 * Interface Mesaje
 * @since 21-10-2021
 * @version 1.0
 * @author Claudia Díaz
 */

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
    
}
