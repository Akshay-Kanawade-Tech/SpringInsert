package org.mahagan.software.service.test;

import org.mahagan.software.service.dao.ProjectDao;
import org.mahagan.software.service.domain.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
            public static void main(String[] args) {
                ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
                ProjectDao projectDao= applicationContext.getBean("projectDao", ProjectDao.class);
                Project project=new Project();
                project.setProjectNo(6);
                project.setTitle("Road Management System");
                project.setDescription("Saftey service");
                project.setDuration(35);
                project.setStatus("Test");
                System.out.println(projectDao.insertProjects(project));

            }
    }
