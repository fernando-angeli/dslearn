package com.devsuperior.dslearnbds.dto;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliverRevisionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

}
