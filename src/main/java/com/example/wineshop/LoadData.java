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
            /*
            wineRepository.save(new Wine(wineryRepository.save(new Winery("Alto turia")), 1990, 3.5,
                    regionRepository.save(new Region("Alto turia", "Valencia")), 250,
                    typeRepository.save(new Type("Verdejo")), 5, 3, 4, "Jose Pariente"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Teso La Monja")), 2004, 7,
                    regionRepository.save(new Region("Utiel", "Valencia")), 15.36,
                    typeRepository.save(new Type("Garnacha")), 2, 4, 3.4, "Pasión"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Artadi")), 2005, 6.4,
                    regionRepository.save(new Region("Rioja", "Extremadura")), 9.20,
                    typeRepository.save(new Type("Tempranillo")), 2, 1, 5, "San Vicente"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Vega Sicilia")), 2021, 2.4,
                    regionRepository.save(new Region("Alto turia", "Valencia")), 15.3,
                    typeRepository.save(new Type("Verdejo")), 5, 5, 4, "Jose Pariente"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Toro Albala")), 2015, 5,
                    regionRepository.save(new Region("Rioja", "Espana")), 20.10,
                    typeRepository.save(new Type("Rioja Red")), 3, 1, 1.2, "Gran Reserva"));

                */
            /*
            wineRepository.save(new Wine(wineryRepository.save(new Winery("Valdespino")), 2003, 2.3,
                    regionRepository.save(new Region("Jerez Amontillado", "Espana")), 11.4,
                    typeRepository.save(new Type("Sherry")), 1, 4, 5, "Coliseo Amontillado VORS"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Ordonez")), 2013, 6.3,
                    regionRepository.save(new Region("Toro", "Espana")), 12.4,
                    typeRepository.save(new Type("Toro Red")), 5, 2, 4.1, "Vatan Arena Tinta de Toro"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Dominio de pinguis")), 1950, 7.8,
                    regionRepository.save(new Region("Ribera del Duero", "Espana")), 110,
                    typeRepository.save(new Type("Ribera Del Duero Red")), 4, 5, 5, "Pingus"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Descendientes de J. Palacios")), 1999, 3.2,
                    regionRepository.save(new Region("Bierzo", "Espana")), 79,
                    typeRepository.save(new Type("Red")), 2, 2, 3, "La Faraona Bierzo"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Bodegas El Nido")), 2010, 9,
                    regionRepository.save(new Region("Jumilla", "Espana")), 13.9,
                    typeRepository.save(new Type("Red")), 4, 5, 3.5, "El Nido"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Emilio Moro")), 2016, 5.1,
                    regionRepository.save(new Region("Ribera del Duero", "Espana")), 14.36,
                    typeRepository.save(new Type("Ribera Del Duero Red")), 5, 1, 1.4, "Malleolus de Sanchomartin"));



            wineRepository.save(new Wine(wineryRepository.save(new Winery("Ramirez de la Ganuza")), 2006, 4.7,
                    regionRepository.save(new Region("Rioja", "Espana")), 30.6,
                    typeRepository.save(new Type("Rioja Red")), 3, 3, 4.7, "Maria Remirez de Ganuza"));


            wineRepository.findAll().forEach(wine -> log.info("Preloaded " + wine));
            */

        };
    }

}

