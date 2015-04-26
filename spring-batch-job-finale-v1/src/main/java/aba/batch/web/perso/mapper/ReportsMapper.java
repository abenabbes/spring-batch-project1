/**
 * 
 */
package aba.batch.web.perso.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import aba.batch.web.perso.vo.Report;

/**
 * @author ali
 *
 */
public class ReportsMapper implements FieldSetMapper<Report>{

	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		Report report = new Report();
		report.setClicks(fieldSet.readString("CLICKS"));
		report.setDate(fieldSet.readString("DATE"));
		report.setEarning(fieldSet.readString("EARNING"));
		report.setImpressions(fieldSet.readString("IMPRESSIONS"));
		
		return report;
	}

}
