/*대중교통*/
public class Transport {
    static int iden = 1; // 고유 번호를 만들어줄 변수
    int transportNum = 0; // 차 번호
    double juYu = 0; // 주유량
    double speed = 0; // 현재 속도
    double speedChange = 0; // 속도 변경
    int passenger = 0; // 탑승 승객
    int maxPassenger = 0; // 최대 승객수
    String status = ""; // 상태

    public Transport(){
        this.transportNum += iden++;
        this.juYu = 100;
        this.speed = 0;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public int getTransportNum() {
        return transportNum;
    }

    public void setTransportNum(int transportNum) {
        this.transportNum = transportNum;
    }

    public double getJuYu() {
        return juYu;
    }

    public void setJuYu(double juYu) {
        this.juYu = juYu;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeedChange() {
        return speedChange;
    }

    public void setSpeedChange(double speedChange) {
        this.speedChange = speedChange;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transportNum=" + transportNum +
                ", juYu=" + juYu +
                ", speed=" + speed +
                ", speedChange=" + speedChange +
                ", passenger=" + passenger +
                ", maxPassenger=" + maxPassenger +
                ", status='" + status + '\'' +
                '}';
    }
}
