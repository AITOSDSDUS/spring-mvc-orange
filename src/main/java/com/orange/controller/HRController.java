package com.orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.orange.domain.Worker;
import com.orange.repository.WorkerRepository;

@Controller
public class HRController {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	@RequestMapping("/getWorkerList")
	private ModelAndView getWorkerList(){
		ModelAndView mav = new ModelAndView("workerList");
		mav.addObject("workers", workerRepository.getAllWorkers());
		return mav;
	}
	
	@RequestMapping("/addWorker")
	private ModelAndView addWorker(Worker worker){
		return new ModelAndView();
	}
	

}
