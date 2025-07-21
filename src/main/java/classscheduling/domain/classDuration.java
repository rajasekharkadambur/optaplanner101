package classscheduling.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.variable.PlanningVariable;


@PlanningEntity
public class classDuration {
    @PlanningId
    private final long id;
    private int classDuration; // duration of the call in hours
    private int classSize; // number of students in the class
    private int timeSlotStart; // earliest time slot the class can start, in hours
    private int timeSlotEnd; // latest time slot the class can end, in

    // Planning variables: changes during planning, between score calculations.
//    @PlanningVariable
//    private teacher computer;

    public classDuration() {
        this.id = 0; // Default ID, should be set properly in practice
    }
    
    public classDuration(long id, int requiredCpuPower, int requiredMemory, int requiredNetworkBandwidth) {
        this.id = id;
        this.classDuration = classDuration;
        this.classSize = classSize;
        this.timeSlotStart = timeSlotStart;
        this.timeSlotEnd = timeSlotEnd;
    }

    public int getClassDuration() {
        return classDuration;
    }

    public void getClassDuration(int classDuration) {
        this.classSize = classDuration;
    }

    public int getClassSize() {
        return classSize;
    }

    public void setClassSize(int classSize) {
        this.classSize = classSize;
    }

    public int getTimeSlotStart() {
        return timeSlotStart;
    }

    public void setTimeSlotStart(int timeSlotStart) {
        this.timeSlotStart = timeSlotStart;
    }

    public int getTimeSlotEnd() {
        return timeSlotEnd;
    }

    public void setTimeSlotEnd(int timeSlotEnd) {
        this.timeSlotEnd = timeSlotEnd;
    }



//    public teacher getComputer() {
//        return computer;
//    }
//
//    public void setComputer(teacher computer) {
//        this.computer = computer;
//    }

    public String getLabel() {
        return "Process " + id;
    }


}
