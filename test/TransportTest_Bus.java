import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransportTest_Bus {

    BusFunction busFunction = new BusFunction();



    // 1번
    @Test
    public void test1() {
        Transport bus1 = new Bus();
        Transport bus2 = new Bus();
        // Bus 2대 생성 했을 때, 버스 번호가 다른지 확인
        assertEquals(bus1.getTransportNum(), 1);
        assertEquals(bus2.getTransportNum(), 2);

        System.out.println("확인 완료");
    }

    // 2번, 3번
    @Test
    public void test2() {
        Bus bus = new Bus();
        // Bus 2번 탑승
        busFunction.passengerBoarding(bus, 2);
        // 승객수 확인
        assertEquals(bus.getPassenger(), 2);

        // 출력 Bus ( 현재 탑승 승객수, 잔여 승객수, 요금 출력)
        System.out.println("탑승 승객 수 = " + bus.getPassenger());
        System.out.println("잔여 승객 수 = " + (bus.getMaxPassenger() - bus.getPassenger()));
        System.out.println("요금 확인 = " + bus.getPrice() * bus.getPassenger());

    }

    // 3번 , 4번
    @Test
    public void test3() {
        Bus bus = new Bus();

        // Bus 주유량 -50
        bus.setJuYu(bus.getJuYu() - 50);

        // 출력 Bus( 주유량 출력)
        // 주유량 확인
        assertEquals(bus.getJuYu(), 50);
        System.out.println("주유량 = " + (int)bus.getJuYu());

    }

    // 5번 ,6번 ,7번 ,8번
    @Test
    public void test4() {
        Bus bus = new Bus();

        // Bus 주유량 50
        bus.setJuYu(50);

        // 상태 차고지행 변경
        bus.setStatus("차고지행");
        // 상태 확인
        assertEquals(bus.getStatus(), "차고지행");

        // Bus 주유량 +10
        bus.setJuYu(bus.getJuYu() + 10);
        assertEquals(bus.getJuYu(), 60);

    }

    // 9번, 10번
    @Test
    public void test5() {
        Bus bus = new Bus();
        busFunction.passengerBoarding(bus, 45);

        // bus 탑승객 확인
        assertEquals(bus.getPassenger(), 0);

        // bus 최대 탑승객 확인
        assertEquals(bus.getMaxPassenger(), 0);
    }

    // 11 ,12 번
    @Test
    public void test6() {
        Bus bus = new Bus();
        busFunction.passengerBoarding(bus, 5);

        // bus 탑승객 확인
        assertEquals(bus.getPassenger(), 5);

        // 잔여 탑승객 확인
        assertEquals(bus.getMaxPassenger() - bus.getPassenger(), 25);

        // 요금확인
        assertEquals(bus.getPrice() * bus.getPassenger(), 5000);

    }
    // 13, 14, 15번
    @Test
    public void test7() {
        Bus bus = new Bus();
        bus.setJuYu(60);

        // bus 주유량 -55
        bus.setJuYu(bus.getJuYu() - 55);
        busFunction.drive(bus);

        // 주유량 확인
        assertEquals(bus.getJuYu(), 5);

        // 버스 상태 확인
        assertEquals(bus.getStatus(), "차고지행");

    }


}