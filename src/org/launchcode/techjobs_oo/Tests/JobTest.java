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

}
