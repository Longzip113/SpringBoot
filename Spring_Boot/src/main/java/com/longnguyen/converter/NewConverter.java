package com.longnguyen.converter;

import org.springframework.stereotype.Component;

import com.longnguyen.dto.NewDTO;
import com.longnguyen.entity.NewEntity;

@Component
public class NewConverter {

	public NewEntity toEntity(NewDTO dto) {
		NewEntity entity = new NewEntity();
		
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescripTion(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		
		return entity;
	}
	
	public NewDTO toDto(NewEntity entity) {
		NewDTO dto = new NewDTO();
		if(entity.getId() != null) {
			dto.setId(entity.getId());
		}
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescripTion());
		dto.setThumbnail(entity.getThumbnail());
		
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedData(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedData(entity.getModifiedDate());
		return dto;
	}
	
	public NewEntity toEntity(NewEntity entity, NewDTO dto) {
		
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescripTion(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		
		return entity;
	}
}
