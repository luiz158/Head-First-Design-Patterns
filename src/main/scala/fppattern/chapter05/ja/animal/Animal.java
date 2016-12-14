package fppattern.chapter05.ja.animal;

import fppattern.chapter05.ja.animal.features.Doctor;

public abstract class Animal {
    private Doctor doctor;

    public void getInoculated() {
        doctor.innoculate(this);
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
