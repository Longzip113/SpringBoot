package com.longnguyen.service;

import com.longnguyen.dto.NewDTO;

public interface INewService {

	NewDTO save(NewDTO newDTO);
	void delete(Long[] ids);
}
