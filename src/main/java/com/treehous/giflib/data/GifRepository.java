package com.treehous.giflib.data;

import com.treehous.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> All_GIFS= Arrays.asList(
            new Gif("android-explosion",1, LocalDate.of(2015,2,13),  false,"Chris Ramacciotti"),
            new Gif("ben-and-mike", 2,LocalDate.of(2015,10,30), true, "Ben Jakuben"),
            new Gif("book-dominos",3, LocalDate.of(2015,9,15),  false,"Craig Dennis"),
            new Gif("compiler-bot",2, LocalDate.of(2015,2,13), true, "Ada Lovelace"),
            new Gif("cowboy-coder", 1,LocalDate.of(2015,2,13), false, "Grace Hopper"),
            new Gif("infinite-andrew",3, LocalDate.of(2015,8,23), true, "Marissa Mayer")
    );
    public Gif findByName(String name){
        for(Gif gif : All_GIFS){
           if(gif.getName().equals(name)){
               return gif;
           }
        }
        return null;
    }
    public List<Gif> getAllGifs(){
        return All_GIFS;
    }
    public List<Gif> findByCategoryId(int id){
        List<Gif> gifs = new ArrayList<>();
        for(Gif gif: All_GIFS){
                 if(gif.getCategoryId()==id){
                     gifs.add(gif);
                 }
        }
        return gifs;
    }
}

