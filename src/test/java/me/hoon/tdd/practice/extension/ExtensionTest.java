package me.hoon.tdd.practice.extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 * 확장팩 등록 방법
 *
 * 선언적인 등록 @ExtendWith
 * 프로그래밍 등록 @RegisterExtension
 * 자동 등록 자바 ServiceLoader 이용
 *
 *
 * 확장팩 만드는 방법
 *
 * 테스트 실행 조건
 * 테스트 인스턴스 팩토리
 * 테스트 인스턴스 후-처리기
 * 테스트 매개변수 리졸버
 * 테스트 라이프사이클 콜백
 * 예외 처리
 * ...
 */

//@ExtendWith(FindSlowTestExtension.class)
public class ExtensionTest {


    @RegisterExtension
    static FindSlowTestExtension findSlowTestExtension = new FindSlowTestExtension();


    @Test
    void test1() throws InterruptedException {
        Thread.sleep(1000L);
        System.out.println("test1");
    }

    @SlowTest
    @Test
    void test2() throws InterruptedException {
        Thread.sleep(2000L);
        System.out.println("test2");
    }

    @Test
    void test3() throws InterruptedException {
        Thread.sleep(3000L);
        System.out.println("test3");
    }

}
