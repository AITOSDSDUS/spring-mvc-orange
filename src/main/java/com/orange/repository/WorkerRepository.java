package com.orange.repository;

import java.util.List;

import com.orange.domain.Worker;

public interface WorkerRepository {
	
	List<Worker> getAllWorkers();
	void addWorker(Worker worker);
	
}
