package com.usa.doctorsapp.repository.crudrepository;

import com.sun.jdi.connect.Connector;
import com.usa.doctorsapp.model.Doctor;
import org.springframework.data.repository.CrudRepository;

import javax.print.Doc;

public interface DoctorCrudRepository extends CrudRepository<Doctor, Integer> {
}
