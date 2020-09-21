package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    //First constructor
    public Job()  {
        id = nextId;
        nextId++;
    }

    //Second constructor
    public Job (String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    //toString method
    public String toString () {
        String defaultString = "Data not available";
        String nameValue;
        String employerValue;
        String locationValue;
        String positionTypeValue;
        String coreCompetencyValue;

        if (this.name == null || this.name == "") {
            nameValue = defaultString;
        } else {
            nameValue = this.name;
        }

        if (this.employer == null || this.employer.toString() == "") {
            employerValue = defaultString;
        } else {
            employerValue = this.employer.toString();
        }

        if (this.location == null || this.location.toString() == "") {
            locationValue = defaultString;
        } else {
            locationValue = this.location.toString();
        }

        if (this.positionType == null || this.positionType.toString() == "") {
            positionTypeValue = defaultString;
        } else {
            positionTypeValue = this.positionType.toString();
        }

        if (this.coreCompetency == null || this.coreCompetency.toString() == "") {
            coreCompetencyValue = defaultString;
        } else {
            coreCompetencyValue = this.coreCompetency.toString();
        }

        return "\n" +
                "ID: " + this.id + "\n" +
                "Name: " + nameValue + "\n" +
                "Employer: " + employerValue + "\n" +
                "Location: " + locationValue + "\n" +
                "Position Type: " + positionTypeValue + "\n" +
                "Core Competency: " + coreCompetencyValue + "\n\n";

    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
