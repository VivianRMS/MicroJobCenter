package com.vivianrms.jobms.job;

import org.springframework.data.jpa.repository.JpaRepository;
// JpaRepository is an extended CrudRepository


public interface JobRepository extends JpaRepository<Job, Long> { // <Entity Type, PK Type>

}
