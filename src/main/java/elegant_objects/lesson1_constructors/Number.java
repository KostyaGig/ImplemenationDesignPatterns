package elegant_objects.lesson1_constructors;

public interface Number {
    Float giveValue();

    class StringAsFloat implements Number {
        private String price;

        public StringAsFloat(String price) {
            this.price = price;
        }

        @Override
        public Float giveValue() {
            return Float.parseFloat(price);
        }
    }

    class IntAsFloat implements Number {

        private int price;

        public IntAsFloat (int price) {
            this.price = price;
        }

        @Override
        public Float giveValue() {
            return Float.parseFloat(String.valueOf(price));
        }
    }

    class FloatAsFloat implements Number{

        private Float price;

        public FloatAsFloat(Float price) {
            this.price = price;
        }

        @Override
        public Float giveValue() {
            return price;
        }
    }
}
