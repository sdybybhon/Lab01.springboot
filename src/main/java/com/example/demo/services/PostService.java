package com.example.demo.services;
import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> ListAllPosts() {
        List<Post> list = new ArrayList<>();
        list.add(new Post("Нас 25000", new Date()));
        list.add(new Post("И мы идём",new Date()));
        list.add(new Post("Сдавать джаву", new Date()));
        return list;
    }
}
