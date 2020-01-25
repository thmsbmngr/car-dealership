package at.htl.cardealer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_manufacturer")
public class CarManufacturer {
    @Id
    private String short_name;

    public CarManufacturer() {
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }
}
