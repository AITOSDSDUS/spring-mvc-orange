package com.orange.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.orange.domain.Worker;

@Repository
public class InMemoryWorkerRepository implements WorkerRepository {
	
	private List<Worker> workers;
	
	public InMemoryWorkerRepository() {
		Worker worker1 = new Worker(1, "Jan", "Kowalski", 30000f, 101, 1001);
		Worker worker2 = new Worker(2, "Marian", "Kowalski", 3000, 101, 1001);
		Worker worker3 = new Worker(3, "Krzysztof", "Kowalski", 40.0f, 101, 1001);
		Worker worker4 = new Worker(4, "Ala", "Kowalska", 300.45f, 101, 1001);
		this.workers = new ArrayList<Worker>();
		workers.add(worker1);
		workers.add(worker2);
		workers.add(worker3);
		workers.add(worker4);
	}

	@Override
	public List<Worker> getAllWorkers() {
		return workers;
	}

	@Override
	public void addWorker(Worker worker) {
		workers.add(worker);
	}
	

}
