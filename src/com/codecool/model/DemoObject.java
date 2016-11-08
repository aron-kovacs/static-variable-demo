package com.codecool.model;

public class DemoObject {

    private Integer id;

    private static Integer counter = 0;

    /**
     * static counter demo.
     */
    public DemoObject(){
        ++counter;
        id = counter;
    }

    public DemoObject(int id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public String printCount(){
        return counter.toString();
    }

    public void setCounter(int number){
        counter = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DemoObject demoObject = (DemoObject) o;

        return id != null ? id.equals(demoObject.id) : demoObject.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "DemoObject{" +
                "id=" + id +
                '}';
    }
}
