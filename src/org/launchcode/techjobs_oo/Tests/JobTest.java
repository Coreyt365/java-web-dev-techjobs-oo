package org.launchcode.techjobs_oo.Tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job job1;
    private Job job2;
    private Job test_job1;
    private Job test_job2;

    @Before
    public void createJobObject(){
        job1 = new Job();
        job2 = new Job();
        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void settingUniqueIdFields(){
        assertFalse(job1.equals(job2 ));
    }

    @Test
    public void idFieldIsSet(){
       assertEquals(job1.getId(),1);
    }

    @Test
    public void idFieldsDifferByOne(){ assertTrue(job2.getId()-job1.getId()==1);}

    @Test
    public void nameFieldSet(){assertTrue(test_job1.getName()=="Product tester");}

    @Test
    public void employerFieldSet(){assertTrue(test_job1.getEmployer() instanceof Employer);}

    @Test
    public void locationFieldSet(){assertTrue(test_job1.getLocation() instanceof Location);}

    @Test
    public void positionTypeSet(){
        assertTrue(test_job1.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_job1.getPositionType().getValue());
    }

    @Test
    public void  coreCompetencySet(){
        assertTrue(test_job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality (){
        assertFalse(job1.equals(job2));
    }





}
