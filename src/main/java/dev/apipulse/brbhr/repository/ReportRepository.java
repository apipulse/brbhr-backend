package dev.apipulse.brbhr.repository;

import dev.apipulse.brbhr.model.Report;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReportRepository extends MongoRepository<Report, String> {
    // Custom methods for report generation and retrieval
}
