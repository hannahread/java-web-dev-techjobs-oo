package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJobFirstId;
    Job testJobSecondId;

    @Before
    public void createJobObject() {
        testJobFirstId = new Job();
        testJobSecondId = new Job();
    }

    @Test
    public void testSettingJobId() {
        int firstId = testJobFirstId.getId();
        int secondId = testJobSecondId.getId();
        assertEquals(1, (secondId - firstId), 0);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job allFieldsJob;
        allFieldsJob = new Job("Product Tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

        assertEquals("Product Tester", allFieldsJob.getName());
        assertEquals("ACME", allFieldsJob.getEmployer().getValue());
        assertEquals("Desert", allFieldsJob.getLocation().getValue());
        assertEquals("Quality Control", allFieldsJob.getPositionType().getValue());
        assertEquals("Persistence", allFieldsJob.getCoreCompetency().getValue());

        assertTrue(allFieldsJob instanceof Job);
        assertTrue(allFieldsJob.getEmployer() instanceof Employer);
        assertTrue(allFieldsJob.getLocation() instanceof Location);
        assertTrue(allFieldsJob.getPositionType() instanceof PositionType);
        assertTrue(allFieldsJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality () {
        Job firstAllFieldsJob;
        firstAllFieldsJob = new Job("Product Tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job secondAllFieldsJob;
        secondAllFieldsJob = new Job("Product Tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(firstAllFieldsJob.equals(secondAllFieldsJob));
    }

    @Test
    public void testToStringMethod () {
        Job toStringJob;
        toStringJob = new Job("Product Tester", new Employer("ACME"), new Location ("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\n" +
                "ID: " + toStringJob.getId() + "\n" +
                "Name: " + toStringJob.getName() + "\n" +
                "Employer: " + toStringJob.getEmployer().getValue() + "\n" +
                "Location: " + toStringJob.getLocation().getValue() + "\n" +
                "Position Type: " + toStringJob.getPositionType().getValue() + "\n" +
                "Core Competency: " + toStringJob.getCoreCompetency().getValue() + "\n\n", toStringJob.toString());
    }

    @Test
    public void testEmptyValueToStringMethod() {
        Job toStringJob;
        toStringJob = new Job();
        assertEquals("\n" +
                "ID: " + toStringJob.getId() + "\n" +
                "Name: Data not available\n" +
                "Employer: Data not available\n" +
                "Location: Data not available\n" +
                "Position Type: Data not available\n" +
                "Core Competency: Data not available\n\n", toStringJob.toString());
    }

}
