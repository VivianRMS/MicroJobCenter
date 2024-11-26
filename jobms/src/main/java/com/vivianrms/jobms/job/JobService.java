package com.vivianrms.jobms.job;

import com.vivianrms.jobms.job.dto.JobWithCompanyDTO;

import java.util.List;

// loose coupling
public interface JobService {
    List<JobWithCompanyDTO> findAll();
    void createJob(Job job);
    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
