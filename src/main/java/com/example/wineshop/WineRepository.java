package com.example.wineshop;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

interface WineRepository extends JpaRepository<Wine, Long> {
    @Query(value = "SELECT * FROM wine ORDER BY rating DESC LIMIT ?1", nativeQuery = true)
    List<Wine> findTop(Integer top);

    @Query(value = "SELECT * FROM wine ORDER BY price DESC LIMIT ?1", nativeQuery = true)
    List<Wine> findPricesWines(Integer top);

    @Query(value="SELECT * FROM wine ORDER BY rating/price DESC LIMIT ?1 ", nativeQuery = true)
    List<Wine> findRatingWines(Integer top);

    @Query(value="SELECT * FROM wine GROUP BY YEAR ORDER BY AVG(rating) DESC, YEAR LIMIT ?1 ", nativeQuery = true)
    List<Wine> findOldWines(Integer top);
}
