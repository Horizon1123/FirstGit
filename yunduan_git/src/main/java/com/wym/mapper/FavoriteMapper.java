package com.wym.mapper;

public interface FavoriteMapper {

	int selectTags(String str);

	void updatecount(String str);

	void insertOne(String str);
}
