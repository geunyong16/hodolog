package com.hodolog.api.repository;


import com.hodolog.api.domain.Post;
import com.hodolog.api.domain.QPost;
import com.hodolog.api.request.PostSearch;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.hodolog.api.domain.QPost.post;

@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<Post> getList(PostSearch postsearch) {
        return jpaQueryFactory.selectFrom(post)
                .limit(postsearch.getSize())
                .offset(postsearch.getOffset())
                .orderBy(post.id.desc())
                .fetch();
    }
}

