package com.myplantdiary.enterprise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EnterpriseApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void thisTestWillFail() {
        assertEquals(11, 10);
    }

}
