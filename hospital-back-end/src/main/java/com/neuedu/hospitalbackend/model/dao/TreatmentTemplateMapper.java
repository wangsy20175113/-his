package com.neuedu.hospitalbackend.model.dao;

import com.neuedu.hospitalbackend.model.po.TreatmentTemplate;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface TreatmentTemplateMapper {

    List<HashMap> getByRIdAndName(@Param("roleId") Integer roleId, @Param("name") String name);

    int insertSelective(TreatmentTemplate treatmentTemplate);

}
