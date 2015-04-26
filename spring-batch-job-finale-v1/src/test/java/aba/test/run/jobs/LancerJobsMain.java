/**
 * 
 */
package aba.test.run.jobs;


import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ali
 *
 */
public class LancerJobsMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	 
		String config = "spring/jobs.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
	 
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("reportJob");
	 
		try {
	 
//			jobLauncher.run(job, new JobParametersBuilder().addDate("start", new  Date()).toJobParameters());  
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.getStatus());
	 
		} catch (Exception e) {
			e.printStackTrace();
		}
	 
		System.out.println("Done");
	 
	  }
}
