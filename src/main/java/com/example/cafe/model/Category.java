package com.example.cafe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Label cannot be null")
    private String label;

    @NotNull(message = "Slot_id cannot be null")
    private int slot_id;

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

    public int getSlot_id() {
        return slot_id;
    }

    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }
}
