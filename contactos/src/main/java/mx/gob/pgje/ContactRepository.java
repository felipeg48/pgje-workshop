package mx.gob.pgje;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends CrudRepository<Contact, String> {

	//@Query("select c.phone from Contact c where c.name like :q")
	//public List<String> findByNameContains(@Param("q") String text);

	public List<Contact> findByNameContains(@Param("q") String text);

}
