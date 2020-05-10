package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.Flower;

public interface FlowerMapper {
	public List<Flower> selectAll();
	public int insert(Flower flower);
}
