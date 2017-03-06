package jp.co.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.example.dao.SampleDao;
import jp.co.example.entity.Sample;

@RestController
public class SampleController {

    @Autowired
    private SampleDao sampleDao;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Sample> get() {
        return sampleDao.findAll();
    }
}
