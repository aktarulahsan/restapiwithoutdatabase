package com.aktarulahsan.demo.repository;

import com.aktarulahsan.demo.common.CommonFunction;
import com.aktarulahsan.demo.model.User;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
@Repository

public class UserRepository implements CommonFunction {
     User userData= new User();

    public User save(String reqObj) {

        this.userData = objectMapperReadValue(reqObj, User.class);

        return this.userData ;
    }

    public User findById(String fname, String lname) {
    this.userData.setFname(fname);
    this.userData.setLname(lname);

        return this.userData;
    }

}
