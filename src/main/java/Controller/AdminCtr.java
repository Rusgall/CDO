package Controller;

import Model.Logic;

/**
 * Created by Руслан on 27.06.2016.
 */
public class AdminCtr {
    Logic logic;
    FormManager manager;

    public AdminCtr(Logic logic, FormManager manager){
        this.logic = logic;
        this.manager = manager;
    }
}
