package com.mondee;

 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic>topicList=new ArrayList<>(Arrays.asList(new Topic("101","java","oops concepts"),
			new Topic("102","hibernate","configuration"),
			new Topic("103","spring","dependency injection")));
	public Topic getTopic(String id)
	{
		Topic x=null;
		for(Topic i:topicList)
		{
			if(i.getTid().equals(id))
				x=i;
		}
		return x;
	}
	public List<Topic>getAllTopics()
	{
		return topicList;
	}
	public void addTopic(Topic topic)
	{
		topicList.add(topic);
	}

}
