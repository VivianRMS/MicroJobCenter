package com.vivianrms.jobms.job;

import com.vivianrms.jobms.job.dto.JobDTO;

import java.util.List;

// loose coupling
public interface JobService {
    List<JobDTO> findAll();
    void createJob(Job job);
    JobDTO getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
