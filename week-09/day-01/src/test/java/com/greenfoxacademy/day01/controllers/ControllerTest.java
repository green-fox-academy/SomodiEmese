package com.greenfoxacademy.day01.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void doUntil_sum()throws Exception{
        mockMvc.perform(post("/dountil/sum")
                .content("{\"until\": 5}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(15)));

    }

    @Test
    public void doUntil_factor()throws Exception{
        mockMvc.perform(post("/dountil/factor")
                .content("{\"until\": 5}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(120)));

    }

    @Test
    public void arrayResult_sum()throws Exception{
        mockMvc.perform(post("/arrays")
                .content("{\"what\": \"sum\", \"numbers\": {1, 2, 5, 10}}")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(18)));

    }

    @Test
    public void arrayResult_sum1() throws Exception{
        mockMvc.perform(post("/arrays")
                .param("what", "sum")
                .param("numbers" , String[])
    }

}
