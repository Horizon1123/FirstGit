package com.wym.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wym.entity.Tag;
import com.wym.mapper.TagMapper;
import com.wym.service.TagService;

@Service("tagService")
public class TagServiceImpl implements TagService{

	@Autowired
	private TagMapper tagMapper;
	
	
	
	@Override
	public List<Tag> findAllService() {
		return tagMapper.findAllMapper();
	}

}
