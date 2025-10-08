package com.pluralsight;

public class Vehicle {
        private long vehicleId;
        private String makeModel;
        private String color;
        private int odometerReading;
        private float price;

        public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
            this.vehicleId = vehicleId;
            this.makeModel = makeModel;
            this.color = color;
            this.odometerReading = odometerReading;
            this.price = price;
        }
        public long getVehicleId() {
            return vehicleId;
        }

        public void setVehicleId(long vehicleId) {
            this.vehicleId = vehicleId;
        }

        public String getMakeModel() {
            return makeModel;
        }

        public void setMakeModel(String makeModel) {
            this.makeModel = makeModel;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getOdometerReading() {
            return odometerReading;
        }

        public void setOdometerReading(int odometerReading) {
            this.odometerReading = odometerReading;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("%10d %18s %10s %10d %10.2f", vehicleId, makeModel, color, odometerReading, price);
        }

        public static String getTableHeader(){
            return  String.format("%s %18s %10s %10s %10s\n------------------------------------------------------------------------", "Vehicle VIN", "Make / Model", "Color", "Mileage", "Price");
        }
    }

//what does it belong to? does app have vehicle id or does vehicle have vehicleId
//does vehicle have inventory or does app have vehicleinventory?

}
