package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Document;

public interface ServiceI {

	public List<Document> savedoc(Document d);

	public List<Document> getDoc();
}
