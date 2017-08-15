package com.gb.health.service;

import com.gb.health.dao.ReportDepartmentMapper;
import com.gb.health.dao.ReportGeneralMapper;
import com.gb.health.dao.ReportPersonnelMapper;
import com.gb.health.dao.ReportPooledMapper;
import com.gb.health.domain.ReportDepartment;
import com.gb.health.domain.ReportGeneral;
import com.gb.health.domain.ReportPersonnel;
import com.gb.health.domain.ReportPooled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
@Service
public class ReportService {

    @Autowired
    private ReportPersonnelMapper personnelMapper;

    @Autowired
    private ReportPooledMapper pooledMapper;

    @Autowired
    private ReportGeneralMapper generalMapper;

    @Autowired
    private ReportDepartmentMapper departmentMapper;

    @Transactional
    public void saveReport(ReportPersonnel personnel,
                           ReportPooled pooled,
                           List<ReportGeneral> generals,
                           List<ReportDepartment> departments){

        if (personnel ==null || generals==null || departments==null)
            return;

        personnelMapper.insert(personnel);

//        pooled.setpId(personnel.getId());
//
//        pooledMapper.insert(pooled);

        for (ReportGeneral general:
             generals) {

            general.setpId(personnel.getId());
            generalMapper.insert(general);

        }

//        if(true){
//
//            System.out.println("——————————————事务测试异常——————————————");
//
//            throw new RuntimeException("——————————————事务测试异常——————————————");
//        }

        for (ReportDepartment department:
             departments) {

            department.setpId(personnel.getId());
            departmentMapper.insert(department);

        }


    }
}
