package com.example.wineshop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class WineMockControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WineRepository wineRepository;
    @MockBean
    private RegionRepository regionRepository;
    @MockBean
    private WineryRepository wineryRepository;
    @MockBean
    private TypeRepository typeRepository;


    @Test
    void all() throws Exception {
        List<Wine> all = new ArrayList<>();
        all.add(new Wine((new Winery("Alto turia")), 1999, 7,
                (new Region("Alto turia", "Valencia")), 25,
                (new Type("Verdejo")), 9, 3, 99, "Jose Pariente"));
        when(wineRepository.findAll()).thenReturn(all);

        mockMvc.perform(
                        get("/wine"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void one() throws Exception {
        mockMvc.perform(
                 get("/wine/{id}", 20)).andDo(print()).andExpect(status().isOk());
    }


}
