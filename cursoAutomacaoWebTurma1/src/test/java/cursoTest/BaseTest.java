package cursoTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import core.Driver;

public class BaseTest {

	@BeforeEach
	public void abreNavegador() {
		Driver.abreNavegador();
	}

	@AfterEach
	public void fechaNavegador() {
		Driver.fechaNavegador();
	}

}
