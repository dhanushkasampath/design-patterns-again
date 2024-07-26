package com.learn.design_patterns_again.creational.no2_factory;

/**
 * note 2 :
 *
 * After writing implementation classes for Profession interface, we need to have a common class to return
 * the objects created using the Profession interface.
 * For that we need to define a constant for each object.
 */
public class ProfessionFactory {

    public Profession getProfession(String type) {

        if (type == null) {
            return null;
        } else if ("Doctor".equalsIgnoreCase(type)) {
            return new Doctor();
        }else if ("Engineer".equalsIgnoreCase(type)) {
            return new Engineer();
        }else if ("Teacher".equalsIgnoreCase(type)) {
            return new Teacher();
        }
        return null;
    }
}
