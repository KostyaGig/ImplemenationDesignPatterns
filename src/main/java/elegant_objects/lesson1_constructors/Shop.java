package elegant_objects.lesson1_constructors;

public interface Shop {

    boolean buyMackBook();

    class BaseShop implements Shop {
        private Number number;

        public BaseShop(Float price) {
            this.number = new Number.FloatAsFloat(price);
        }

        public BaseShop(String price) {
            this.number = new Number.StringAsFloat(price);
        }

        public BaseShop(int price) {
            this.number = new Number.IntAsFloat(price);
        }

        @Override
        public boolean buyMackBook() {
            if (number.giveValue() > 2000f) {
                return true;
            } else {
                return false;
            }
        }
    }
}
