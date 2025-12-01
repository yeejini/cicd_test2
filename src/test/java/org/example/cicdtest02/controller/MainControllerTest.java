package org.example.cicdtest02.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MainControllerTest {
    @Test
    void main(){
        int a = 1;
        org.assertj.core.api.Assertions.assertThat(a).isEqualTo(0);
    }

}