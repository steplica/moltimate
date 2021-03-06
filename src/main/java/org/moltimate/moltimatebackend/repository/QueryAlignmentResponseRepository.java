package org.moltimate.moltimatebackend.repository;

import org.moltimate.moltimatebackend.dto.response.QueryAlignmentResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryAlignmentResponseRepository extends JpaRepository<QueryAlignmentResponse, String> {
    QueryAlignmentResponse findByCacheKey(String cacheKey);
}
