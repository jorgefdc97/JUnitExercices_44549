import exercise_3.CurricularUnit;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CurricularUnitTest {
    static private CurricularUnit cu;

    @BeforeAll
    static void setUp(){
        cu = new CurricularUnit("UC", 5);
        cu.insertGradeCU(44549, 10);
        cu.insertGradeCU(43431, 8);
        cu.insertGradeCU(43093, 9.4);
        cu.insertGradeCU(43321, 20);
        cu.insertGradeCU(44827, 10);
    }

    @ParameterizedTest
    @CsvSource(value = {"44549, 10", "43431, 8", "43093, 0", "43321, 20", "44827, 10"})
    void searchStudentTest(int student_number, double grade){
        assertEquals(cu.searchStudent(student_number), grade);
    }

    @Test
    void averageCUTest(){
        double average = (double)(10 + 8 + 0 + 20 + 10) / 5;
        assertEquals(cu.averageCU(), average);
    }

    @ParameterizedTest
    @ValueSource(ints = {44549, 43431, 43093, 43321, 44827})
    void isApprovedTest(int student_number){
        assertTrue(cu.isApproved(student_number));
    }


}
