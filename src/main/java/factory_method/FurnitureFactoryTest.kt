package factory_method

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Test for [factory_method.FurnitureFactory]
*/

class FurnitureFactoryTest {

    @Test
    fun test_creating_chair() {

        val furnitureFactory = FurnitureFactory.Chair()
        val furniture = furnitureFactory.create()

        assertTrue(furniture is Furniture.Chair)

        val expected = "Chair"
        val actual = furniture.type()

        assertEquals(expected,actual)
    }

    @Test
    fun test_creating_table() {

        val furnitureFactory = FurnitureFactory.Table()
        val furniture = furnitureFactory.create()

        assertTrue(furniture is Furniture.Table)

        val expected = "Table"
        val actual = furniture.type()

        assertEquals(expected,actual)
    }

}