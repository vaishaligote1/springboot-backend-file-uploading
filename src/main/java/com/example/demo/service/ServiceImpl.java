package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	DocumentRepository dr;

	public List<Document> savedoc(Document d) {
		
		System.out.println("service data:-"+d);
		dr.save(d);
		List<Document> l1=dr.findAll();
		return l1;
	}

	public List<Document> getDoc() {
		List<Document> l1=dr.findAll();
		return l1;
	}
	
}
