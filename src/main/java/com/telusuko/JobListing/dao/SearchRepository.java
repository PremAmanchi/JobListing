package com.telusuko.JobListing.dao;

import com.telusuko.JobListing.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);

}
