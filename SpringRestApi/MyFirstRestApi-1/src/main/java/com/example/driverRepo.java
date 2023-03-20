package com.example;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface  driverRepo extends JpaRepository<driver,Integer> {}
