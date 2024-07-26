package com.learn.design_patterns_again.creational.no5_prototype;

import com.learn.design_patterns_again.creational.no5_prototype.profession.Doctor;
import com.learn.design_patterns_again.creational.no5_prototype.profession.Engineer;
import com.learn.design_patterns_again.creational.no5_prototype.profession.Profession;
import com.learn.design_patterns_again.creational.no5_prototype.profession.Teacher;

import java.util.HashMap;
import java.util.Map;

public class ProfessionCache {

    private static final Map<Integer, Profession> professionMap = new HashMap<>();

    public static Profession getCloneNewProfession(int id){
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id = 1; // this id comes to Doctor class by the implemented abstract method
        professionMap.put(doctor.id, doctor);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionMap.put(engineer.id, engineer);

        Teacher teacher = new Teacher();
        teacher.id = 3;
        professionMap.put(teacher.id, teacher);

    }
}
