package com.wym.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wym.entity.Tag;
import com.wym.service.TagService;

@Controller
@RequestMapping("/tag")
public class TagHandler {
	
	@Autowired
	private TagService tagService;
	
	@ResponseBody
	@RequestMapping("/findAll")
	public List<Tag> findAllTag(){
		return  tagService.findAllService();
	}
	
}
