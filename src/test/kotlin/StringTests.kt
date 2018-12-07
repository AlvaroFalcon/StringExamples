import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class  StringTests{

    @Test
    fun should_return_0_when_string_has_no_uppercase(){
        var testString = "abcdefghi"
        Assertions.assertEquals(0,StringUtils.countUppercase(testString))
    }

    @Test
    fun should_return_2_when_string_has_two_uppercase(){
        var testString = "abcdEFghi"
        Assertions.assertEquals(2,StringUtils.countUppercase(testString))
    }
}