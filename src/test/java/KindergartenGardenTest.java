import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Test cases adapted from <a
 * href="http://exercism.io/exercises/java/kindergarten-garden/test-suite"
 * >Exercism.io</a>
 */
public class KindergartenGardenTest {


	@Test
	public void singleStudent() {
		String student = "Alice";
		String plants = "RC\nGG";
		List<Plant> expected = Arrays.asList(Plant.RADISHES, Plant.CLOVER,
				Plant.GRASS, Plant.GRASS);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}

	@Test
	public void singleStudent2() {
		String student = "Alice";
		String plants = "VC\nRC";
		List<Plant> expected = Arrays.asList(Plant.VIOLETS, Plant.CLOVER,
				Plant.RADISHES, Plant.CLOVER);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}

	@Test
	public void twoStudents() {
		String student = "Bob";
		String plants = "VVCG\nVVRC";
		List<Plant> expected = Arrays.asList(Plant.CLOVER, Plant.GRASS,
				Plant.RADISHES, Plant.CLOVER);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}


	@Test
	public void oneGardenSecondStudent() {
		String student = "Bob";
		String plants = "VVCCGG\nVVCCGG";
		List<Plant> expected = Arrays.asList(Plant.CLOVER, Plant.CLOVER,
				Plant.CLOVER, Plant.CLOVER);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}

	@Test
	public void oneGardenThirdStudent() {
		String student = "Charlie";
		String plants = "VVCCGG\nVVCCGG";
		List<Plant> expected = Arrays.asList(Plant.GRASS, Plant.GRASS,
				Plant.GRASS, Plant.GRASS);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}

	@Test
	public void fullGardenFirstStudent() {
		String student = "Alice";
		String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
		List<Plant> expected = Arrays.asList(Plant.VIOLETS, Plant.RADISHES,
				Plant.VIOLETS, Plant.RADISHES);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}


	@Test
	public void fullGardenSecondStudent() {
		String student = "Bob";
		String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
		List<Plant> expected = Arrays.asList(Plant.CLOVER, Plant.GRASS,
				Plant.CLOVER, Plant.CLOVER);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}


	@Test
	public void fullGardenSecondToLastStudent() {
		String student = "Kincaid";
		String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
		List<Plant> expected = Arrays.asList(Plant.GRASS, Plant.CLOVER,
				Plant.CLOVER, Plant.GRASS);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}

	@Test
	public void fullGardenLastStudent() {
		String student = "Larry";
		String plants = "VRCGVVRVCGGCCGVRGCVCGCGV\nVRCCCGCRRGVCGCRVVCVGCGCV";
		List<Plant> expected = Arrays.asList(Plant.GRASS, Plant.VIOLETS,
				Plant.CLOVER, Plant.VIOLETS);

		assertEquals(expected,
				new KindergartenGarden(plants).getPlantsOfStudent(student));
	}

	@Test
	public void customStudentGardenFirstStudent() {
		String[] studentArray = { "Patricia", "Roger", "Samantha", "Xander" };
		String student = "Patricia";
		String plants = "VCRRGVRG\nRVGCCGCV";
		List<Plant> expected = Arrays.asList(Plant.VIOLETS, Plant.CLOVER,
				Plant.RADISHES, Plant.VIOLETS);

		assertEquals(expected,
				new KindergartenGarden(plants, studentArray)
						.getPlantsOfStudent(student));
	}


	@Test
	public void customStudentGardenFirstStudentInAlphabeticalOrder() {
		String[] studentArray = { "Samantha", "Patricia", "Xander", "Roger" };
		String student = "Patricia";
		String plants = "VCRRGVRG\nRVGCCGCV";
		List<Plant> expected = Arrays.asList(Plant.VIOLETS, Plant.CLOVER,
				Plant.RADISHES, Plant.VIOLETS);

		assertEquals(expected,
				new KindergartenGarden(plants, studentArray)
						.getPlantsOfStudent(student));
	}


	@Test
	public void customStudentGardenSecondStudentInAlphabeticalOrder() {
		String[] studentArray = { "Samantha", "Patricia", "Xander", "Roger" };
		String student = "Roger";
		String plants = "VCRRGVRG\nRVGCCGCV";
		List<Plant> expected = Arrays.asList(Plant.RADISHES, Plant.RADISHES,
				Plant.GRASS, Plant.CLOVER);

		assertEquals(expected,
				new KindergartenGarden(plants, studentArray)
						.getPlantsOfStudent(student));
	}

	@Test
	public void customStudentGardenThirdStudentInAlphabeticalOrder() {
		String[] studentArray = { "Samantha", "Patricia", "Xander", "Roger" };
		String student = "Samantha";
		String plants = "VCRRGVRG\nRVGCCGCV";
		List<Plant> expected = Arrays.asList(Plant.GRASS, Plant.VIOLETS,
				Plant.CLOVER, Plant.GRASS);

		assertEquals(expected,
				new KindergartenGarden(plants, studentArray)
						.getPlantsOfStudent(student));
	}

	@Test
	public void customStudentGardenFourthStudentInAlphabeticalOrder() {
		String[] studentArray = { "Samantha", "Patricia", "Xander", "Roger" };
		String student = "Xander";
		String plants = "VCRRGVRG\nRVGCCGCV";
		List<Plant> expected = Arrays.asList(Plant.RADISHES, Plant.GRASS,
				Plant.CLOVER, Plant.VIOLETS);

		assertEquals(expected,
				new KindergartenGarden(plants, studentArray)
						.getPlantsOfStudent(student));
	}
}
