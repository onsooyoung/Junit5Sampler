package me.sampler.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    @DisplayName("책값 계산하기")
    void calculatorBooks() {

        assertEquals(10000, 10000, "equals true");
    }

    //NullPointException이 정상적으로 체크되는가?
    @DisplayName("책이름 체크하기")
    @Test
    void booknameCheck() {
        assertThrows(NullPointerException.class, () -> genNullPoint());
    }

    private void genNullPoint(){
        String nullStr = null;
        if(nullStr.equals("bookname"))
            System.out.println("null is null");
    }

    //테스트 class가 시작될때 1회 실행
    @BeforeAll
    static void introFirstOne() {
        System.out.println("introFirstOne");

    }

    //테스트코드 함수가 시작될때 매번 실행
    @BeforeEach
    void introFirstEach() {
        System.out.println("introFirstEach");
    }

    //테스트코드 함수가 종료될때 매번 실행
    @AfterEach
    void outroLastEach() {
        System.out.println("outroLastEach");
    }

    //테스트 class가 종료될때 1회 실행
    @AfterAll
    static void outroLastOne() {
        System.out.println("outroLastOne");
    }

}