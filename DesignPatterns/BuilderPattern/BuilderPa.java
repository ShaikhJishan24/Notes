package BuilderPattern;

    class Pizza {
        private String dough;
        private String sauce;
        private String topping;

        // Private constructor to enforce building via Builder
        private Pizza(Builder builder) {
            this.dough = builder.dough;
            this.sauce = builder.sauce;
            this.topping = builder.topping;
        }

    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
    public void display() {
        System.out.println("Pizza with Dough: " + dough + ", Sauce: " + sauce + ", Topping: " + topping);
    }
}

public class BuilderPa {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                          .setDough("Thin Crust")
                          .setSauce("Tomato Basil")
                          .setTopping("Mushrooms")
                          .build();

        pizza.display();
    }
    
}
