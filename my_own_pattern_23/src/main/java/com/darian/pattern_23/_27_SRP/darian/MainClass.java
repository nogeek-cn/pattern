package com.darian.pattern_23._27_SRP.darian;

public class MainClass {
    public static void main(String[] args) {
        Input input = new Input();
        input.shuru();
        Validator validator = new Validator();
        if (validator.validate(input.getUsername(), input.getUpassword())) {
            DBManager.getConnection();
            DAOImp dao = new DAOImp();
            dao.save(input.getUsername(), input.getUpassword());
        }
    }
}
