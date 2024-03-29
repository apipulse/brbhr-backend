package dev.apipulse.brbhr.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JobPosting {
    @Id
    private String id;
    private String title;
    private String description;
    private Date postingDate;
    private Date closingDate;
    private String jobPosition;
    private String recruitingManager;
    private Integer vacancy;
    private List<String> requiredSkills;
    private List<RecruitmentStage> recruitmentStages;
    private Integer experienceRequired;
    private Boolean isOpen = Boolean.TRUE;

}
