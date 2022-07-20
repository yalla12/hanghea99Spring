public interface TaxiInterface {

    // 거리당 요금
    public void distancePrice(Taxi taxi, double dtd);

    // 요금 결제
    public String payment(Taxi taxi);

}
