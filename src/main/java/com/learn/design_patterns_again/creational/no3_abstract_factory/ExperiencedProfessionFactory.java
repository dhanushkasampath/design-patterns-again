package com.learn.design_patterns_again.creational.no3_abstract_factory;

import com.learn.design_patterns_again.creational.no3_abstract_factory.experienced.Doctor;
import com.learn.design_patterns_again.creational.no3_abstract_factory.experienced.Engineer;
import com.learn.design_patterns_again.creational.no3_abstract_factory.experienced.Teacher;

public class ExperiencedProfessionFactory implements AbstractFactory {

    @Override
    public Profession getProfession(String type) {

        if (type == null) {
            return null;
        } else if ("Doctor".equalsIgnoreCase(type)) {
            return new Doctor();
        } else if ("Engineer".equalsIgnoreCase(type)) {
            return new Engineer();
        } else if ("Teacher".equalsIgnoreCase(type)) {
            return new Teacher();
        }
        return null;
    }
}
