package com.neuedu.hospitalbackend.service.serviceinterface.doctorstationservice;


import com.alibaba.fastjson.JSONObject;
import com.neuedu.hospitalbackend.model.bo.Project;
import com.neuedu.hospitalbackend.model.vo.CollectionParam;
import com.neuedu.hospitalbackend.util.CommonResult;

import java.util.List;

/**
 * 包含了医生开 检查/检验 需要用到的service方法
 *
 * @author Steve
 */
public interface ProjectCollectionManagementService {

    /**
     * 根据当前病历号，找到目前所有的检验申请单
     * @param caseId
     */
    CommonResult listCollections(Integer caseId, Integer type);

    /**
     * 申请新的申请清单
     * @param collectionType
     */
    CommonResult applyNewCollection(Integer collectionType);

    /**
     * 暂存申请清单
     * @param collectionParam
     */
    CommonResult savePresentCollection(CollectionParam collectionParam);

    /**
     * 提交申请清单
     * @param collectionParam
     */
    CommonResult submitPresentCollection(CollectionParam collectionParam);





    /**
     * 得到所有的检查/检验项目
     * @param obj 包含了一个字段，可以告诉方法内逻辑：操作的是检查还是检验，
     *            后面的方法默认有这个字段
     * @return 所有的检查/检验项目
     */
    List<Project> listAllProject(JSONObject obj);

    /**
     * 更新 检查/检验 组
     * @param obj 当前检查/检验组的信息
     */
    void updateProjectCollection(JSONObject obj);


    /**
     * 删除 检查/检验组
     * @param projectCollectionId 检查/检验组 id
     */
    void deleteProjectCollection(Integer projectCollectionId);

}
