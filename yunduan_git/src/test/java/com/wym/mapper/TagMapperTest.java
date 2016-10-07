package com.wym.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wym.entity.Tag;
import com.wym.service.TagService;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TagMapperTest extends TestCase {
	
	@Autowired
	private TagService tagService;
	
	@Test
	public void testFindAllMapper() {
		
		List<Tag> tags=tagService.findAllService();
		System.out.println(tags);
	}

}
