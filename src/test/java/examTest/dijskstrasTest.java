package examTest;
import com.thealgorithms.datastructures.graphs.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class dijskstrasTest {

	private int j;
	private boolean i;
	private int x;
	
	
	@BeforeEach
	void antes(){
		j =3;
		i = true;
		x = 5;
	}
	
	@DisplayName("Primer test")
	@Test
	void test() {
		assertEquals(3,j);
	}
	
	@DisplayName("Segundo test")
	@Test
	void test() {
		assertTrue(i);
	}
	
	@DisplayName("Tercer test")
	@Test
	void test() {
		assertEquals(5,x);
	}

}
