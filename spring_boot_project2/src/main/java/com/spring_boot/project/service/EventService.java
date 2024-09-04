package com.spring_boot.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot.project.dao.IEventDAO;
import com.spring_boot.project.model.EventVO;

@Service
public class EventService implements IEventService {
	@Autowired
	@Qualifier("IEventDAO")
	IEventDAO dao;

	@Override
	public void insertEvent(EventVO vo) {
		dao.insertEvent(vo);
	}

	@Override
	public ArrayList<EventVO> eventCtgListProduct(String eventCtgId) {
		return dao.eventCtgListProduct(eventCtgId);
	}

	@Override
	public ArrayList<EventVO> listAllEventProduct() {
		return dao.listAllEventProduct();
	}

}
