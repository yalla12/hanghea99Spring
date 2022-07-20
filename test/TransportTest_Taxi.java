import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransportTest_Taxi {

    TaxiFunction taxiFunction = new TaxiFunction();


    // 택시 생성자 확인
    @Test
    public void test1() {
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        // Bus 2대 생성 했을 때, 버스 번호가 다른지 확인
        assertEquals(taxi1.getTransportNum(), 1);
        assertEquals(taxi2.getTransportNum(), 2);

        // 각 택시 주유량 확인
        assertEquals(taxi1.getJuYu(), 100.0);
        assertEquals(taxi2.getJuYu(), 100.0);

        // 각 택시 상태 확인
        assertEquals(taxi1.getStatus(), "일반");
        assertEquals(taxi2.getStatus(), "일반");

    }

    // 테스트 시나리오
    @Test
    public void test2() {
        Taxi taxi1 = new Taxi();
        // 승객 2명 탑승
        taxiFunction.passengerBoarding(taxi1, 2);
        // 목적지 서울역 설정
        taxi1.setDestination("서울역");

        // 요금 계산
        taxiFunction.distancePrice(taxi1, 2);

        // 승객 2명 탑승 확인
        assertEquals(taxi1.getPassenger(), 2);

        // 잔여 승객 수 확인
        assertEquals((taxi1.getMaxPassenger() - taxi1.getPassenger()), 2);

        // 기본요금 확인
        assertEquals(taxi1.getBasicPrice(), 3000);

        // 목적지 확인
        assertEquals(taxi1.getDestination(), "서울역");

        // 목적지까지 거리 확인
        assertEquals(taxi1.getDtd(), 2.0);

        // 지불할 요금 확인
        assertEquals(taxi1.getTotalPrice(), 4000);

        // 상태 확인
        assertEquals(taxi1.getStatus(), "운행");
        System.out.println(taxi1.toString());

        // 주유량 -80
        taxi1.setJuYu(taxi1.getJuYu() - 80);

        taxiFunction.passengerBoarding(taxi1, 2);
        // 목적지 서울역 설정
        taxi1.setDestination("서울역");

        // 요금 계산
        taxiFunction.distancePrice(taxi1, 2);

        // 요금결제
        taxiFunction.payment(taxi1);

        // 결제 요금 확인
        assertEquals(taxi1.getTotalPrice(), 4000);

        // 주유량 확인
        assertEquals(taxi1.getJuYu(), 20);

        // 누적요금 확인
        assertEquals(taxi1.income, 4000);

        taxiFunction.passengerBoarding(taxi1, 5);

        // 탑승객 확인
        assertEquals(taxi1.getPassenger(), 0);

        taxiFunction.passengerBoarding(taxi1, 3);
        //목적지
        taxi1.setDestination("구로디지털단지역");

        // 요금 계산
        taxiFunction.distancePrice(taxi1, 12);

        // 승객 2명 탑승 확인
        assertEquals(taxi1.getPassenger(), 3);

        // 잔여 승객 수 확인
        assertEquals((taxi1.getMaxPassenger() - taxi1.getPassenger()), 1);

        // 기본요금 확인
        assertEquals(taxi1.getBasicPrice(), 3000);

        // 목적지 확인
        assertEquals(taxi1.getDestination(), "구로디지털단지역");

        // 목적지까지 거리 확인
        assertEquals(taxi1.getDtd(), 12.0);

        // 지불할 요금 확인
        assertEquals(taxi1.getTotalPrice(), 14000);

        // 요금결제
        taxiFunction.payment(taxi1);

        // 주유량 -20
        taxi1.setJuYu(taxi1.getJuYu() - 20);

        taxiFunction.drive(taxi1);

        // 주유량 확인
        assertEquals(taxi1.getJuYu(), 0);

        // 상태 확인
        assertEquals(taxi1.getStatus(), "운행불가");

        // 누적요금 확인
        assertEquals(taxi1.getIncome(), 18000);


    }









}