package com.example.cafe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;

@Entity
@Table(name = "slot")
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Label cannot be null")
    private String label;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private Time start;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private Time end;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }
}
