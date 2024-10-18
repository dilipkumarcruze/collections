package com.AOS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AOS.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
