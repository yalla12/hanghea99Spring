public class main {

    public static void main(String[] args) {
        main m = new main();
     //   m.busScenario();
        m.taxiScenario();

    }

    // 버스 시나리오
    public void busScenario() {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        BusFunction busFunction = new BusFunction();

        System.out.println("1번 버스 번호 = " + bus1.getTransportNum());
        System.out.println("2번 버스 번호 = " + bus2.getTransportNum());
        System.out.println("************************************************");

        busFunction.passengerBoarding(bus1, 2);

        // 출력 Bus ( 현재 탑승 승객수, 잔여 승객수, 요금 출력)
        System.out.println("탑승 승객 수 = " + bus1.getPassenger());
        System.out.println("잔여 승객 수 = " + (bus1.getMaxPassenger() - bus1.getPassenger()));
        System.out.println("요금 확인 = " + bus1.getPrice() * bus1.getPassenger());
        System.out.println("************************************************");

        // Bus 주유량 -50
        bus1.setJuYu(bus1.getJuYu() - 50);

        // 출력 Bus( 주유량 출력)
        System.out.println("주유량 = " + (int)bus1.getJuYu());
        System.out.println("************************************************");

        // Bus 상태 변경
        bus1.setStatus("차고지행");

        // Bus 주유량 +10
        bus1.setJuYu(bus1.getJuYu() + 10);

        System.out.println("상태 = " + bus1.getStatus());
        System.out.println("주유량 = " + (int)bus1.getJuYu() );
        System.out.println("************************************************");

        // Bus 상태 변경
        bus1.setStatus("운행");

        // Bus 승객 45명 추가
        busFunction.passengerBoarding(bus1, 45);

        // Bus 승객 5명 추가
        busFunction.passengerBoarding(bus1, 5);

        // 출력 Bus 탑승객 상황 ( 위에 테스트 케이스에서 이미 2명의 승객을 태웠음)
        System.out.println("탑승 승객 수 = " + bus1.getPassenger());
        System.out.println("잔여 승객 수 = " + (bus1.getMaxPassenger() - bus1.getPassenger()));
        System.out.println("요금 확인 = " + bus1.getPrice() * bus1.getPassenger());
        System.out.println("************************************************");

        // Bus 주유량 -55
        bus1.setJuYu(bus1.getJuYu() - 55);

        busFunction.drive(bus1);

        System.out.println("주유량 = " + (int)bus1.getJuYu() );
        System.out.println("상태 = " + bus1.getStatus());
        System.out.println("************************************************");

    }

    public void taxiScenario() {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        TaxiFunction taxiFunction = new TaxiFunction();

        System.out.println("1번 택시 번호 = " + taxi1.getTransportNum());
        System.out.println("1번 택시 주유량 = " + (int)taxi1.getJuYu());
        System.out.println("1번 택시 상태 = " + taxi1.getStatus());
        System.out.println("2번 택시 번호 = " + taxi2.getTransportNum());
        System.out.println("2번 택시 주유량 = " + (int)taxi2.getJuYu());
        System.out.println("2번 택시 상태 = " + taxi2.getStatus());
        System.out.println("************************************************");

        // 승객 2명 탑승
        taxiFunction.passengerBoarding(taxi1, 2);
        // 목적지 서울역 설정
        taxi1.setDestination("서울역");

        // 요금 계산
        taxiFunction.distancePrice(taxi1, 2);

        System.out.println("탑승 승객 수 = " + taxi1.getPassenger());
        System.out.println("잔여 승객 수 = " + (taxi1.getMaxPassenger() - taxi1.getPassenger()));
        System.out.println("기본 요금 확인 = " + taxi1.getBasicPrice());
        System.out.println("목적지 = " + taxi1.getDestination());
        System.out.println("목적지까지 거리 = " + taxi1.getDtd() + "km");
        System.out.println("지불요금 = " + taxi1.getTotalPrice());
        System.out.println("상태 = " + taxi1.getStatus());
        System.out.println("************************************************");

        // 주유량 -80
        taxi1.setJuYu(taxi1.getJuYu() - 80);

        // 요금결제
        String s = taxiFunction.payment(taxi1);
        System.out.println(s);
        System.out.println("************************************************");

        // 주유량 누적요금 출력
        System.out.println("주유량 = " + (int)taxi1.getJuYu());
        System.out.println("누적 요금= " + taxi1.getIncome());
        System.out.println("************************************************");

        // 택시 승객 5명 탑승
        taxiFunction.passengerBoarding(taxi1, 5);
        System.out.println("************************************************");

        // 택시 승객 3명 탑승
        taxiFunction.passengerBoarding(taxi1,3);
        taxi1.setDestination("구로디지털단지역");
        // 목적지까지 거리 12KM 설정 후 요금 계산
        taxiFunction.distancePrice(taxi1, 12);
        System.out.println("탑승 승객 수 = " + taxi1.getPassenger());
        System.out.println("잔여 승객 수 = " + (taxi1.getMaxPassenger() - taxi1.getPassenger()));
        System.out.println("기본 요금 확인 = " + taxi1.getBasicPrice());
        System.out.println("목적지 = " + taxi1.getDestination());
        System.out.println("목적지까지 거리 = " + taxi1.getDtd() + "km");
        System.out.println("지불요금 = " + taxi1.getTotalPrice());
        System.out.println("************************************************");

        // 주유량 -20
        taxi1.setJuYu(taxi1.getJuYu() - 20);

        if (taxi1.getJuYu() == 0) taxi1.setStatus("운행불가");

        // 요금결제
        s = taxiFunction.payment(taxi1);
        System.out.println(s);
        System.out.println("************************************************");


        // 주유량, 상태, 누적요금 출력
        System.out.println("주유량 = " + (int)taxi1.getJuYu());
        System.out.println("상태 = " + taxi1.getStatus());
        System.out.println("누적 요금(총 수입)= " + taxi1.getIncome() + "원");
        System.out.println("************************************************");

        // 운행시작
        taxiFunction.drive(taxi1);


    }

}

