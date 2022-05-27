package com.example.wineshop;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadData {

    private static final Logger log = LoggerFactory.getLogger(LoadData.class);

    @Bean
    CommandLineRunner initDatabase(WineRepository wineRepository, RegionRepository regionRepository,
                                   WineryRepository wineryRepository, TypeRepository typeRepository) {

        return args -> {

            wineRepository.save(new Wine(wineryRepository.save(new Winery("Alto turia")), 1999, 7,
                    regionRepository.save(new Region("Alto turia", "Valencia")), 25,
                    typeRepository.save(new Type("Verdejo")), 9, 3, 99, "Jose Pariente"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Bocopa")), 1985, 7,
                    regionRepository.save(new Region("Utiel", "Valencia")), 15.36,
                    typeRepository.save(new Type("Garnacha")), 6, 5, 85, "Pasión"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Carrion")), 1900, 7,
                    regionRepository.save(new Region("Rioja", "Extremadura")), 9.20,
                    typeRepository.save(new Type("Tempranillo")), 1, 8, 72, "San Vicente"));

            wineRepository.findAll().forEach(wine -> log.info("Preloaded " + wine));


        };
    }

}

