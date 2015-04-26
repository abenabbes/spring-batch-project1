/**
 * 
 */
package aba.batch.web.perso.listener;

import java.util.Date;
import java.util.List;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @author ali.<br>
 * --------------------------------<br>
 * Listener pour afficher des logs.<br>
 *
 */
public class ProjectJobListener implements JobExecutionListener {

	/** Attributs.*/
	private Date startTime, stopTime;
	
	/**
	 * Resultats fficher après l'execution du JOB.
	 */
	@Override
	public void afterJob(JobExecution jobExecution) {
		stopTime = new Date();
        System.out.println("ExamResult Job stops at : " + stopTime.getTime());
        System.out.println("Total time take in millis : " + getTimeInMillis(startTime , stopTime));
 
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("ExamResult job completed successfully");
            //Here you can perform some other business logic like cleanup
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
            System.out.println("ExamResult job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                System.err.println("exception :" +th.getLocalizedMessage());
            }
        }
		
	}

	/**
	 * Resultats fficher avant l'execution du JOB.
	 */
	@Override
	public void beforeJob(JobExecution jobExecution) {
		startTime = new Date();
        System.out.println("ExamResult Job starts at :"+startTime.getTime());

	}

	
	private long getTimeInMillis(Date start, Date stop){
        return stop.getTime() - start.getTime();
    }
}
