package com.adore96.BootJPA.controller;

import com.adore96.BootJPA.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EditStudentController {
    @Autowired
    StudentRepo studentRepo;

}
