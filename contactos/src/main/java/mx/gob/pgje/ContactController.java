package mx.gob.pgje;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	private DataSource ds;

	public ContactController(DataSource ds) {
		this.ds = ds;
	}

	@GetMapping("/dbinfo")
	public String dbInfo() throws SQLException {
		return this.ds.getConnection().getMetaData().getURL();
	}
}
