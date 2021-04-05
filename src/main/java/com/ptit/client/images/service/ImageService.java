package com.ptit.client.images.service;

import com.ptit.client.images.model.Image;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageService {
    List<Image> getImages();
}
