package com.yt.backendbeta.ServiceImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.yt.backendbeta.Entity.Course;
import com.yt.backendbeta.Service.CourseInterface;
import com.yt.backendbeta.Utility.ConnectorClass;

public class CourseImpl implements CourseInterface{

	public void addCourse(Course course) {
		SessionFactory connection = ConnectorClass.getConnection();
		Session session = connection.openSession();
		session.beginTransaction();
		session.save(course);
	    session.getTransaction().commit();
	    session.close();		
	}

}
