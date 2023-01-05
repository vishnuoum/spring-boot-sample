package com.example.cafe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class CategoryDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String label;


    @OneToOne(targetEntity = Slot.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "slot_id", referencedColumnName = "id")
    private Slot slot;

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

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
}
