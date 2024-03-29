package dev.apipulse.brbhr.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LeaveDetails {
    private String empId;
    private String type;
    private Integer availableLeaves;
    private Integer carryForwardLeaves;
    private Integer totalLeaves;
    private Integer leavesTaken;
}