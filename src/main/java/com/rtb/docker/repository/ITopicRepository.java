package com.rtb.docker.repository;

import org.springframework.data.repository.CrudRepository;

import com.rtb.docker.model.Topic;



public interface ITopicRepository extends CrudRepository<Topic, Integer>
{



}
