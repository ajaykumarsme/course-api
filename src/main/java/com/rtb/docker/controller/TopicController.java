package com.rtb.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rtb.docker.model.Topic;
import com.rtb.docker.service.TopicService;




@RestController
@RequestMapping("topics")
public class TopicController {

	@Autowired
	private TopicService  topicService; 
	
	//Save multiple Topic
		@PostMapping("/save")
		public Topic saveTopic(@RequestBody Topic topic)
		{
				return topicService.saveTopic(topic);
				
		}
}
