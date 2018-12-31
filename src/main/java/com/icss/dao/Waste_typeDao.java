package com.icss.dao;

import java.util.List;

import com.icss.entity.Waste_type;

public interface Waste_typeDao {
	public List<Waste_type> find();
	public int add(Waste_type type);
	public int delete(int id);
}
