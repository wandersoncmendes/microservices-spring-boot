package com.microservices.imageservice.controller;

import java.util.Arrays;
import java.util.List;

import com.microservices.imageservice.model.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private Environment env;

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/images")
    public List<Image> getImages() {

        // ...
        LOGGER.info("Returning images ... ");
        List<Image> images = Arrays.asList(
                new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
        return images;
    }
}