public interface BusInterface {

    // 운행
    public void drive(Transport transport);

    // 승객 탑승
    public void passengerBoarding(Transport Transport, int passenger);

    // 속도 변경
    public void speedChange(Transport Transport, double speed);

}
