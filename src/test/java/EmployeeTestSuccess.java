import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestSuccess {
    Employee newEmployee;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testName() {
        newEmployee = new Employee("TAN", "Full-time","Man", "01234567899", 22);
        assertEquals("TAN", newEmployee.getName());
    }

    @Test
    void testPPS(){
        newEmployee = new Employee("TAN", "Full-time","Man", "01234567899", 22);
        assertEquals("01234567899", newEmployee.getPPS());
    }

    @Test
    void testEmploymentTypeFullTime(){
        newEmployee = new Employee("TAN", "Full-time","Man", "01234567899", 22);
        assertEquals("Full-time", newEmployee.getEmploymentType());
    }

    @Test
    void testEmploymentTypePartTime(){
        newEmployee = new Employee("TAN", "Part-time","Man", "01234567899", 22);
        assertEquals("Part-time", newEmployee.getEmploymentType());
    }

    @Test
    void testEmploymentTypeContract(){
        newEmployee = new Employee("TAN", "Contract","Man", "01234567899", 22);
        assertEquals("Contract", newEmployee.getEmploymentType());
    }

    @Test
    void testGenderMan(){
        newEmployee = new Employee("TAN", "Part-time","Man", "01234567899", 22);
        assertEquals("Man", newEmployee.getGender());
    }

    @Test
    void testGenderWoman(){
        newEmployee = new Employee("TAN", "Part-time","Woman", "01234567899", 22);
        assertEquals("Woman", newEmployee.getGender());
    }

    @Test
    void testGenderNonBinary(){
        newEmployee = new Employee("TAN", "Part-time","Non-Binary", "01234567899", 22);
        assertEquals("Non-Binary", newEmployee.getGender());
    }

    @Test
    void testAge(){
        newEmployee = new Employee("TAN", "Part-time","Man", "01234567899", 22);
        assertEquals(22, newEmployee.getAge());
    }

    @AfterEach
    void tearDown() {
    }
}