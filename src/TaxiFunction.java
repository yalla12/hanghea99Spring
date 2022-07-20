public class TaxiFunction implements BusInterface, TaxiInterface{

    @Override
    public void drive(Transport taxi) {
        if ( taxi.getJuYu() < 10 && taxi.getJuYu() >=1) {
            System.out.println("주유가 필요합니다.");
            taxi.setStatus("운행");
        } else if (taxi.getJuYu() == 0){
            System.out.println("주유량이 0 입니다. 기름을 넣어주세요!");
            taxi.setStatus("운행불가");
        } else {
            System.out.println("운행을 시작합니다.");
            taxi.setStatus("운행");
        }
    }

    @Override
    public void passengerBoarding(Transport taxi, int passenger) {
        if(!taxi.getStatus().equals("일반")) {
            System.out.println("탑승 불가");
        } else {
            if (taxi.getPassenger() + passenger >= taxi.getMaxPassenger()) {
                System.out.println("인원 초과입니다. 최대 인원 : " + taxi.getMaxPassenger());
            } else {
                taxi.setPassenger(taxi.getPassenger() + passenger);
                drive(taxi);
                System.out.println("탑승을 완료했습니다. 현재 탑승인원 : " + taxi.getPassenger());
            }
        }

    }

    @Override
    public void speedChange(Transport taxi, double speed) {
        if ( taxi.getJuYu() >= 10) {
            taxi.setSpeed(taxi.getSpeed() + speed);
            System.out.println("속도가 변경되었습니다.");
        } else {
            System.out.println("주유량을 확인해주세요.");
        }
    }

    @Override
    public void distancePrice(Taxi taxi, double dtd) {
        int price = 0;
        taxi.setDtd(dtd);

        if (dtd <= taxi.basicDistance) {
            taxi.setTotalPrice(taxi.basicPrice);
        } else {
            price = (int)(dtd - taxi.basicDistance ) ;
            price = price * taxi.distancePrice + taxi.basicPrice;
            taxi.setTotalPrice(price);
        }

    }

    @Override
    public String payment(Taxi taxi) {
        int lastPrice = taxi.getTotalPrice();

        taxi.setDestination("");
        taxi.setPassenger(0);
        taxi.setStatus("일반");
        taxi.setDtd(0);
        taxi.setIncome(taxi.getIncome() + lastPrice);

        return "결제 요금은 : " + lastPrice + "원 입니다.";
    }
}
