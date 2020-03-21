package com.raven.example.dp;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@Slf4j
@RunWith(JUnit4.class)
public class JUnitTest {

    @Before
    public void Before() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Test Begin <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    public void test() {
        log.info("JUnit Test!!!");
    }

    @After
    public void After() {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  Test End  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}
