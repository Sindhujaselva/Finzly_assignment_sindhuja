package com.keerthi.sample;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
	
	@Autowired
	SessionFactory factory;
	
	@RequestMapping("name")
	public String getName()
	{
		return "Keerthi";
	}
	
	@PostMapping("save")
	public String saveData(@RequestBody User user)
	{
		Session session=factory.openSession();
		session.save(user);
		session.beginTransaction().commit();
		
		return "Data Saved";
	}
	
	@GetMapping("read")
	public User getData()
	{
		Session session=factory.openSession();
//		Criteria criteria=session.createCriteria(User.class);
//		return criteria.list();
		return session.get(User.class,1);
	}
	
	@PutMapping("update")
	public String putData(@RequestBody User user)
	{
		Session session=factory.openSession();
		session.update(user);
		session.beginTransaction().commit();
		return "Data updated";
	}
	
	@DeleteMapping("delete")
	public String deleteData(@RequestBody User user)
	{
		Session session=factory.openSession();
		session.delete(user);
		session.beginTransaction().commit();
		return "Data Deleted";
		
	}

}
