public class BusFunction implements BusInterface {

    @Override
    public void drive(Transport bus) {
        if ( bus.getJuYu() < 10 && bus.getJuYu() >=1) {
            System.out.println("주유가 필요합니다.");
            bus.setStatus("차고지행");
        } else if (bus.getJuYu() <= 0){
            System.out.println("운행을 종료합니다.");
            bus.setStatus("차고지행");
        } else {
            System.out.println("운행을 시작합니다.");
            bus.setStatus("운행");
        }
    }
    @Override
    public void passengerBoarding(Transport bus,int passenger) {
        if(!bus.getStatus().equals("운행")) {
            System.out.println("운행하지 않는 차량입니다.");
        } else {
            if (bus.getPassenger() + passenger >= bus.getMaxPassenger()) {
                System.out.println("인원 초과입니다. 최대 인원 : " + bus.getMaxPassenger());
            } else {
                bus.setPassenger(bus.getPassenger() + passenger);
                System.out.println("탑승을 완료했습니다. 현재 탑승인원 : " + bus.getPassenger());
            }
        }
    }

    @Override
    public void speedChange(Transport bus, double speed) {
        if ( bus.getJuYu() >= 10) {
            bus.setSpeed(bus.getSpeed() + speed);
            System.out.println("속도가 변경되었습니다.");
        } else {
            System.out.println("주유량을 확인해주세요.");
        }

    }
}
