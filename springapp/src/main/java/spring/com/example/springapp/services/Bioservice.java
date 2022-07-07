package spring.com.example.springapp.services;

import spring.com.example.springapp.entities.Biodata;

import java.util.List;

public interface Bioservice {

    public List<Biodata> getBiodata();

    public Biodata getBiodataById(int id);

    public void addBiodata(Biodata biodata);
}
