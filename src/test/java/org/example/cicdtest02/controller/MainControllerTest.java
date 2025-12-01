package org.example.cicdtest02.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MainControllerTest {
    @Test
    void main(){
        org.assertj.core.api.Assertions.assertThat(1).isEqualTo(1);
    }

}