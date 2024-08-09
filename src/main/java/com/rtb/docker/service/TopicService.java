package com.rtb.docker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtb.docker.model.Topic;
import com.rtb.docker.repository.ITopicRepository;






@Service
public class TopicService {
	@Autowired
	private ITopicRepository iTopicRepository;
	
	@Transactional
	public Topic saveTopic(Topic topic) {
		Topic obj = null ;
		try {

			 obj = iTopicRepository.save(topic);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;

	}
}
