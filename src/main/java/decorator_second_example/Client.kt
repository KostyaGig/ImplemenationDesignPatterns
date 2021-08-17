package decorator_second_example

interface Product {

    fun price() : Int

    class Apple : Product {

        override fun price(): Int = 65
    }

    abstract class ProductDecorator(
            private val product: Product
    ) : Product {

        override fun price(): Int = product.price()
    }

    class AppleSmallDiscount(product: Product) : ProductDecorator(product) {

        override fun price(): Int = super.price() - 5
    }

    class AppleBigDiscount(product: Product) : ProductDecorator(product) {
        override fun price(): Int = super.price() - 10
    }
}

fun main() {
    // check test for ProductDecorator
}