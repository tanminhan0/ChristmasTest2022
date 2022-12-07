import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTestFailure {
    Employee newEmployee;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testName() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {newEmployee = new Employee("CR", "Full-time","Man", "01234567899", 22);});
        assertEquals("Invalid name error", exMessage.getMessage());
    }

    @Test
    void testPPS(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {newEmployee = new Employee("CR7", "Full-time","Man", "012345678", 22);});
        assertEquals("Invalid PPS number error", exMessage.getMessage());
    }

    @Test
    void testEmploymentType(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {newEmployee = new Employee("CR7", "Half-time","Man", "01234567899", 22);});
        assertEquals("Invalid employment type error", exMessage.getMessage());
    }

    @Test
    void testGender(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {newEmployee = new Employee("CR7", "Full-time","Bla", "01234567899", 22);});
        assertEquals("Invalid gender type error", exMessage.getMessage());
    }

    @Test
    void testAge(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, ()-> {newEmployee = new Employee("CR7", "Full-time","Man", "01234567899", 15);});
        assertEquals("Invalid age error", exMessage.getMessage());
    }

    @AfterEach
    void tearDown() {
    }
}