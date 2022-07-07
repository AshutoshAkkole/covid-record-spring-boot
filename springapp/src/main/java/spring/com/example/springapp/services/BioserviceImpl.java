package spring.com.example.springapp.services;

import org.springframework.stereotype.Service;
import spring.com.example.springapp.entities.Biodata;

import java.util.ArrayList;
import java.util.List;

@Service
public class BioserviceImpl implements Bioservice {
    List<Biodata> list;

    public BioserviceImpl() {
        list = new ArrayList<>();
        list.add(new Biodata(01,"Ashu","Akkole",20));
        list.add(new Biodata(02,"Borica","Akkole",22));
    }

    @Override
    public List<Biodata> getBiodata() {
        return list;
    }

    @Override
    public Biodata getBiodataById(int id) {
        Biodata biodata = null;

        for(Biodata data : list)
        {
            if(data.getId() == id)
            {
                biodata = data;
            }
        }

        return  biodata;
    }

    @Override
    public void addBiodata(Biodata biodata) {
        list.add(biodata);
    }
}
