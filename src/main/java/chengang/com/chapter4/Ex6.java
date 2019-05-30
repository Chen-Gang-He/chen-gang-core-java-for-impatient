package chengang.com.chapter4;

import java.util.Objects;

/*
Suppose that in Section 4.2.2, “The equals Method,” on p. 140, the Item.equals method uses an instanceof test. Implement
DiscountedItem.equals so that it compares only the superclass if otherObject is an Item, but also includes the discount
if it is a DiscountedItem. Show that this method preserves symmetry but fails to be transitive—that is, find a
combination of items and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).
 */
public class Ex6 {
    class Item {
        private String description;
        private double price;

        Item(String description, double price) {
            this.description = description;
            this.price = price;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (obj == this) return true;
            if (!(obj instanceof Item)) return false;
            Item other = (Item) obj;
            return Objects.equals(description, other.description) && Objects.equals(price, other.price);
        }

        @Override
        public int hashCode() {
            return Objects.hash(description, price);
        }
    }

    class DiscountedItem extends Item {
        private double discount;

        DiscountedItem(String description, double price, double discount) {
            super(description, price);
            this.discount = discount;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj.getClass() == Item.class) return super.equals(obj);
            if (obj instanceof DiscountedItem) {
                DiscountedItem other = (DiscountedItem) obj;
                return super.equals(obj) && Objects.equals(discount, other);
            } else {
                return super.equals(obj);

            }
        }

    }

    public static void main(String[] args) {
        Ex6 ex6 = new Ex6();
        Item y = ex6.new Item("Cereal", 4);
        DiscountedItem x = ex6.new DiscountedItem("Cereal", 4, .25);
        //preserves symmetry
        System.out.println(y.equals(x));
        System.out.println(x.equals(y));

        DiscountedItem z = ex6.new DiscountedItem("Cereal", 4, .35);
        //but fails to be transitive
        System.out.println("Transitive?");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
    }
}
