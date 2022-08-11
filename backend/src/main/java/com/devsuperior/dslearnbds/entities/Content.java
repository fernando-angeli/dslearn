package com.devsuperior.dslearnbds.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_content")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Content extends Lesson {
    private static final long serialVersionUID = 1L;

    private String textContent;
    private String videoUri;

}
