package item_mapper

import org.junit.Assert.*
import org.junit.Test

class MyItemMapperTest {

    @Test
    fun test_success_compare_items_id() {
        val item = Item(1,"text1")
        val actual = item.map(MyItemMapper.CompareId(1))
        assertTrue(actual)
    }

    @Test
    fun test_success_compare_items() {
        val compareItem = Item(2,"text for compare item")
        val item = Item(2,"text for compare item")
        val actual = compareItem.map(MyItemMapper.CompareItem(item))
        assertTrue(actual)
    }

    @Test
    fun test_failure_comapre_items_id() {
        val item = Item(123,"text for fail test")
        val actual = item.map(MyItemMapper.CompareId(321))
        assertFalse(actual)
    }

    @Test
    fun test_failure_compare_items() {
        val compareItem = Item(249,"compare item text")
        val item = Item(928,"compare item text")
        val actual = compareItem.map(MyItemMapper.CompareItem(item))
        assertFalse(actual)
    }

}