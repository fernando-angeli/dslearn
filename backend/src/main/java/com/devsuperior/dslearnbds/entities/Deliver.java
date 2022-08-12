package com.devsuperior.dslearnbds.entities;

import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_deliver")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Deliver implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "user_id"),
            @JoinColumn(name = "offer_id")
    })
    private Enrollment enrollment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

}
