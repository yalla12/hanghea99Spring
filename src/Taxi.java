public class Taxi extends Transport {
    String destination = ""; // 목적지
    double dtd = 0; // 목적지까지의 거리
    double basicDistance = 0; // 기본 거리
    int basicPrice = 0; // 기본 요금
    int distancePrice = 0; // 추가거리 당요금
    double Adddistance = 0; // 추가 거리
    int totalPrice = 0; // 총 요금
    int income = 0; // 총 수입

    public Taxi() {
        this.maxPassenger = 4;
        this.basicPrice = 3000;
        this.distancePrice = 1000;
        this.basicDistance = 1;
        this.status = "일반";

    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getAdddistance() {
        return Adddistance;
    }

    public void setAdddistance(double adddistance) {
        Adddistance = adddistance;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDtd() {
        return dtd;
    }

    public void setDtd(double dtd) {
        this.dtd = dtd;
    }

    public double getBasicDistance() {
        return basicDistance;
    }

    public void setBasicDistance(double basicDistance) {
        this.basicDistance = basicDistance;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    public int getDistancePrice() {
        return distancePrice;
    }

    public void setDistancePrice(int distancePrice) {
        this.distancePrice = distancePrice;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "destination='" + destination + '\'' +
                ", dtd=" + dtd +
                ", basicDistance=" + basicDistance +
                ", basicPrice=" + basicPrice +
                ", distancePrice=" + distancePrice +
                ", Adddistance=" + Adddistance +
                ", totalPrice=" + totalPrice +
                ", income=" + income +
                ", transportNum=" + transportNum +
                ", juYu=" + juYu +
                ", speed=" + speed +
                ", speedChange=" + speedChange +
                ", passenger=" + passenger +
                ", maxPassenger=" + maxPassenger +
                ", status='" + status + '\'' +
                '}';
    }
}
