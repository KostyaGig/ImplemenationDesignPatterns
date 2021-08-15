package elegant_objects.lesson1_constructors;

import java.util.ArrayList;
import java.util.List;

class Run {
    public static void main(String[]args){
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop.BaseShop("2000"));
        shops.add(new Shop.BaseShop(10000));
        shops.add(new Shop.BaseShop(1000.400f));

        for(Shop shop: shops) {
            System.out.println(shop.buyMackBook());
        }
    }
}

