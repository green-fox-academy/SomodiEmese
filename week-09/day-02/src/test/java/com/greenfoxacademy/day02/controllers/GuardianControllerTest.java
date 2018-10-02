package com.greenfoxacademy.day02.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void imGrootTest_bad() throws Exception{
        mockMvc.perform(get("/groot?message="))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void imGrootTest_ok() throws Exception{
        mockMvc.perform(get("/groot?message=groot"))
                .andExpect(status().isOk());
    }

    @Test
    public void yonduTest_bad() throws Exception{
        mockMvc.perform(get("/yondu?distance=&time=0"))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void yonduTest_ok() throws Exception{
        mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.speed", is(10.0)));
    }

}