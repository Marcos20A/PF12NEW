package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import model.Photo;

@Named
@ApplicationScoped
public class PhotoService {

    private List<Photo> photos;

    @PostConstruct
    public void init() {
        photos = new ArrayList<>();

        photos.add(new Photo("src/main/webapp/pages/meme.png", "src/main/webapp/pages/meme.png",
                "Description for Image 1", "Title 1"));
        photos.add(new Photo("src/main/webapp/pages/scafisjaja.png", "src/main/webapp/pages/scafisjaja.png",
                "Description for Image 2", "Title 2"));
    }

    public List<Photo> getPhotos() {
        return photos;
    }
}