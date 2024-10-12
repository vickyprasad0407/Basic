package com.enhancement.multi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		PrintJob [] jobs= {new PrintJob("Rajesh"),
				           new PrintJob("Ramesh"),
				           new PrintJob("Rakesh"),
				           new PrintJob("Rohit")
				           };
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}

}
