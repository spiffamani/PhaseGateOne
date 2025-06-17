import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class MenstralCycleTest{
	
	@Test 
	void testLastMenstralCycle() {
	LocalDate allLastMenstralCycle = LocalDate.of(2026,05,14);
	LocalDate expectedLastMenstralCycle = allLastMenstralCycle;

	LocalDate result =  MenstralCycle.lastMenstralCycle();
	assertEquals(expectedLastMenstralCycle , result);
	

	}


	@Test
	void testNextMenstralCycle() {
	LocalDate lastCycle = LocalDate.of(2026,5,14);
	LocalDate expectedNextCycle = lastCycle.plusDays(14);
	
	LocalDate result = MenstralCycle.nextMenstralCycle(lastCycle , 28);
	assertEquals(expectedNextCycle , result);

	} 

	@Test
	void testLengthOfCycle()  {
	LocalDate lastCycle = LocalDate.of(2025, 5 , 14);
	LocalDate expectedLengthOfCycle = lastCycle.minusDays(14);
	
	LocalDate result = MenstralCycle.lengthOfCycle(lastCycle , 28);
	assertEquals(expectedLengthOfCycle , result);
	}
}