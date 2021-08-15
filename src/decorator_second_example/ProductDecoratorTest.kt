package decorator_second_example

import org.junit.Assert.*
import org.junit.Test

/**
 * test for [decorator_second_example.ProductDecorator]
 */
class ProductDecoratorTest {

    @Test
    fun test_apple_small_discount_decorator() {
        val product = Product.Apple()
        val appleDecoratorSmallDiscount = Product.AppleSmallDiscount(product)
        val expected = 60
        val actual = appleDecoratorSmallDiscount.price()
        assertEquals(expected, actual)
    }

    @Test
    fun test_apple_big_discount_decorator() {
        val product = Product.Apple()
        val appleDecoratorBigDiscount = Product.AppleBigDiscount(product)
        val expected = 55
        val actual = appleDecoratorBigDiscount.price()
        assertEquals(expected, actual)
    }

    @Test
    fun test_apple_very_big_dicount_decorator() {
        val product = Product.Apple()
        val appleDecoratorSmallDiscount = Product.AppleSmallDiscount(product)
        val appleDecoratorVeryBigDiscount = Product.AppleBigDiscount(appleDecoratorSmallDiscount)
        val expected = 50
        val actual = appleDecoratorVeryBigDiscount.price()
        assertEquals(expected, actual)
    }
}