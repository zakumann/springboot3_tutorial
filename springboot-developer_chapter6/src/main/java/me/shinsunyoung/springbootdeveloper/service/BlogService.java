package me.shinsunyoung.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.shinsunyoung.springbootdeveloper.domain.Article;
import me.shinsunyoung.springbootdeveloper.dto.AddArticleRequest;
import me.shinsunyoung.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor // Add field generator - final or @NotNull
@Service // registry as Bean
public class BlogService {

    private final BlogRepository blogRepository;

    //Method - Add blog post
    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
