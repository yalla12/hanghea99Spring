public class Bus extends Transport{
    int price = 0; // 요금
    public Bus(){
       // super();
        this.maxPassenger = 30;
        this.status = "운행";
        this.price = 1000;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "price=" + price +
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
