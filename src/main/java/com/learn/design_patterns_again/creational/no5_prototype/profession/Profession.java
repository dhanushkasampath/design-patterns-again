package com.learn.design_patterns_again.creational.no5_prototype.profession;

/**
 * note 1:
 *
 * abstract class means that this class is not complete.
 * there can be incomplete members as well as complete members
 *
 */
public abstract class Profession implements Cloneable {
    public int id;
    public String name;

    abstract void print();

    /**
     * note 2:
     *
     * this is a concrete method
     * this methods says how to clone an object
     * we no need want to override this method in the implementation
     * classes of this abstract classes
     */
    public Object cloningMethod(){
        Object clone = null;
        try{
            clone = super.clone(); // this line makes a clone of the Profession.
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

/**
 * note 3:
 *
 * For an object to be cloned using super.clone(), the class of the object must implement the Cloneable interface.
 * If the class does not implement Cloneable, calling super.clone() will throw a CloneNotSupportedException.
 */
