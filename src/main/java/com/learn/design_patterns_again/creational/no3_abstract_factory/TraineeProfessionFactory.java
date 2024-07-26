package com.learn.design_patterns_again.creational.no3_abstract_factory;

import com.learn.design_patterns_again.creational.no3_abstract_factory.trainee.TraineeDoctor;
import com.learn.design_patterns_again.creational.no3_abstract_factory.trainee.TraineeEngineer;
import com.learn.design_patterns_again.creational.no3_abstract_factory.trainee.TraineeTeacher;

public class TraineeProfessionFactory implements AbstractFactory {

    @Override
    public Profession getProfession(String type) {

        if (type == null) {
            return null;
        } else if ("Doctor".equalsIgnoreCase(type)) {
            return new TraineeDoctor();
        } else if ("Engineer".equalsIgnoreCase(type)) {
            return new TraineeEngineer();
        } else if ("Teacher".equalsIgnoreCase(type)) {
            return new TraineeTeacher();
        }
        return null;
    }
}
