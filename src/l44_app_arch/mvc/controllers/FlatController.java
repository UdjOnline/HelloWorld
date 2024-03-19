package l44_app_arch.mvc.controllers;

import l44_app_arch.mvc.models.Flat;
import l44_app_arch.mvc.models.FlatRepository;
import l44_app_arch.mvc.models.IRepository;

public class FlatController implements IFlatController{
    private IRepository<Flat> flatRepo;

    public FlatController() {
        flatRepo= new FlatRepository();
    }
    public void add(Flat flat) {
        flatRepo.put("1212", flat);
    }
}