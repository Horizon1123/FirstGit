package com.wym.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wym.entity.Favorite;
import com.wym.service.FavoriteService;

@Controller
@RequestMapping("/favorite")
public class FavoriteHandler {           
	@Autowired
	private FavoriteService favoriteService;
	
	@ResponseBody
	@RequestMapping("/add")
	public boolean insertAll(Favorite favorite){
		System.out.println(favorite);
		return favoriteService.insertAll(favorite);
	}
}
