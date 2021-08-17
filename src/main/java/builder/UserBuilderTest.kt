package builder

import org.junit.Assert.*
import org.junit.Test

class UserBuilderTest {

    @Test
    fun test_user_build() {
        val userBuilder = User.Builder()
                .name("Kostya")
                .secondName("HB")
                .age(23)
                .salary("450000")
                .musics(listOf("LTE","Mambl"))
                .movies(listOf("TNTM","Vikings"))

        val expected = User(
                "Kostya",
                "HB",
                23,
                "450000" ,
                listOf("LTE","Mambl"),
                listOf("TNTM","Vikings")
        )
        val actual = userBuilder.build()
        assertEquals(expected, actual)
    }
}