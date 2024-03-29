package dev.apipulse.brbhr.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RecruitmentStage {
    @Id
    private String id;
    private String name;
    private String description;
    private Integer roundNumber;
    RecruitmentStageType recruitmentStageType;
    RecruitmentNotes recruitmentNotes;
    private String Manager;
}