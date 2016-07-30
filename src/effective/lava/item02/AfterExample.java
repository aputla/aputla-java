package effective.lava.item02;

public class AfterExample {
    private static class NutritionFacts {
        private final int servingSize;  // mandatory
        private final int servings;     // mandatory
        private final int calories;     // optional
        private final int fat;          // optional
        private final int sodium;       // optional
        private final int carbohydrate; // optional
        
        public static class Builder {
            // Required parameters
            private final int servingSize;
            private final int servings;
            
            // Optional parameters
            private int calories = 0;
            private int fat = 0;
            private int sodium = 0;
            private int carbohydrate = 0;
            
            public Builder(int servingSize, int servings) {
                this.servingSize = servingSize;
                this.servings = servings;
            }
            public Builder calories(int calories) {
                this.calories = calories;
                return this;
            }
            public Builder fat(int fat) {
                this.fat = fat;
                return this;
            }
            public Builder sodium(int sodium) {
                this.sodium = sodium;
                return this;
            }
            public Builder carbohydrate(int carbohydrate) {
                this.carbohydrate = carbohydrate;
                return this;
            }
            public NutritionFacts build() {
                return new NutritionFacts(this);
            }
        }
        
        private NutritionFacts(Builder builder) {
            this.servingSize = builder.servingSize;
            this.servings = builder.servings;
            this.calories = builder.calories;
            this.fat = builder.fat;
            this.sodium = builder.sodium;
            this.carbohydrate = builder.carbohydrate;
            
            // check for invariants here as opposed to the build method
            // If any invariant fails then throw IllegalStateException
            // The exception message should indicate which invariant is
            // violated.
        }
    }
    
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
