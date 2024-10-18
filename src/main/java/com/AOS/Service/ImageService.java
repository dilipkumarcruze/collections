package com.AOS.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.AOS.model.Image;
import com.AOS.repository.ImageRepository;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(MultipartFile file) throws IOException {
        // Convert MultipartFile to byte[] and store in the database
        Image image = new Image();
        image.setData(file.getBytes());  // Assuming 'data' is a byte[] field in the Image entity
        imageRepository.save(image);  // Save the image using JPA or any ORM
    }


    public List<Image> getAllImages() {
        return imageRepository.findAll();
    }
    
    public Image getImageById(Long id) {
        return imageRepository.findById(id).orElse(null);
    }

}


