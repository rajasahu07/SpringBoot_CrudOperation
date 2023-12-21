package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.SubjectService;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
	private SubjectService subjectService;
	 
	public List<Subject> getAllSubjects()
	{
		return subjectService.getAllSubjects();
	}
    
     @PostMapping("/post")
    public void addSubject(@RequestBody Subject subject)
    {
    	subjectService.addSubject(subject);
    }
    
     @PutMapping("/{id}")
     public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
    {
    	subjectService.updateSubject(id, subject);
    }
    
     @DeleteMapping("/{id}")
    public void DeleteSubject(@PathVariable String id)
    {
    	subjectService.deleteSubject(id);
    }
    
    
    
    
    
    
    
}
