package peaksoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.TeacherDao;
import peaksoft.model.Teacher;
import peaksoft.service.interfase.TeacherService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    private final TeacherDao dao;

    @Autowired
    public TeacherServiceImpl(TeacherDao dao) {
        this.dao = dao;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return dao.saveTeacher(teacher);
    }

    @Override
    public void removeTeacherById(long id) {
        dao.removeTeacherById(id);
    }

    @Override
    public Teacher getById(long id) {
        return dao.getById(id);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return dao.getAllTeacher();
    }

    @Override
    public void cleanTeacherTable() {
        dao.cleanTeacherTable();
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        dao.updateTeacher(teacher);
    }
}