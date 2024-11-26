package com.vivianrms.reviewms.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // JPA will automatically generate an implementation at runtime based on the function name
    List<Review> findByCompanyId(Long companyId);
}
