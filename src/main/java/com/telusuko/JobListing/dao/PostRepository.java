package com.telusuko.JobListing.dao;

import com.telusuko.JobListing.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {
}
