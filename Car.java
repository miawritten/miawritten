public class Car extends Vehicle {
        @Override
        void go(){
                System.out.println("You drive the car");
        }
        private String make = "Chevrolet";
        private String model = "Nissan";
        int year = 2025;
        String color = "red";
        private double price = 50000.00;

        Car(String model, String color, double price, String make, int year) {
                this.model = model;
                this.color = color;
                this.price = price;
                this.make = make;
                this.year = year;
        }
        void drive() {
                System.out.println("Driving " + make + " " + model + " " + color);
        }
        @Override
        public String toString(){
                return "Make " + make + " " + model + " " + color + " " + price;

        }
        String getModel(){
                return this.model;
        }
        String getColor(){
                return this.color;
        }
        double getPrice(){
                return this.price;
        }
        void setColor(String color){
                this.color = color;
        }
        void setPrice(double price){
        if (price < 0){
                System.out.println("Invalid price");
        }
        else { this.price = price; }
        }

        void setModel(String model){
                this.model = model;
        }



}
