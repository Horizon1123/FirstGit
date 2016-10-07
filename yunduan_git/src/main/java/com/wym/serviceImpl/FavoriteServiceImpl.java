package com.wym.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wym.entity.Favorite;
import com.wym.mapper.FavoriteMapper;
import com.wym.service.FavoriteService;

@Service("FavoriteService")
public class FavoriteServiceImpl implements FavoriteService{

	@Autowired
	private FavoriteMapper favoriteMapper;
	
	@Override
	public boolean insertAll(Favorite favorite) {
		String[] tags = favorite.getF_tags().split(",");
		for(String str:tags){
			int count  =  favoriteMapper.selectTags(str);
			if(count>0){
				favoriteMapper.updatecount(str);
			}else{
				favoriteMapper.insertOne(str);
			}
		}
		return true;
	}
}
