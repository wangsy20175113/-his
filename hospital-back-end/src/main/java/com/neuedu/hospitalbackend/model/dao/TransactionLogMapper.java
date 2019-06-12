package com.neuedu.hospitalbackend.model.dao;

import com.neuedu.hospitalbackend.model.po.TransactionLog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public interface TransactionLogMapper {
    int insert(TransactionLog transactionLog);

    int insertSelective(TransactionLog transactionLog);

    int update(TransactionLog transactionLog);

    int selectStatusOfProject(@Param("collectionId") Integer collectionId, @Param("projectId") Integer projectId);

    //在退号时得到挂号的缴费记录
    TransactionLog getLogByRegistrationIdAndType(@Param("registrationId") Integer registrationId, @Param("type") String type);

    TransactionLog getSelective(TransactionLog transactionLog);

    //列出 指定病历号的 挂号缴费记录及挂号状态
    HashMap getRegistrationLog(Integer registrationId);

    //列出 指定病历号的所有医技项目(检查/检验/处置) 缴费记录
    List<HashMap> listLogsByTableName(@Param("tableName") String tableName, @Param("registrationId") Integer registrationId);

    //列出 指定病历号的药方 缴费记录
    List<HashMap> getRecipeLogs(Integer registrationId);

    //更改 退费的项目所在第一层级的 相关缴费记录状态 --已退费
    int updateSelectiveAsReturned(Integer collectionId, @Param("invoiceCode") String invoiceCode);

    //列出 退费的项目所在第一层级的 所有缴费记录
    List<TransactionLog> listCollectionProjectInfo(@Param("collectionId") Integer collectionId, @Param("invoiceCode") String invoiceCode);

    //列出指定用户的所有发票号、项目单号、缴费状态
    List<HashMap> getInvoiceCodeAndStatusByRegistrationId(Integer registrationId);

    //根据发票号查询缴费记录
    List<TransactionLog> listLogsByInvoiceCode(String invoiceCode);

    //根据病历号（必填）、起始日期查询指定患者的所有收费项目列表
    List<TransactionLog> listLogsByRegistrationIdAndDate(@Param("registrationId") Integer registrationId, @Param("beginDateStr") String beginDateStr, @Param("endDateStr") String endDateStr);

    //根据收费员id、起始日期查询指定收费员的所有发票信息
    List<HashMap> listLogsByCashierIdAndDate(@Param("cashierId") Integer cashierId, @Param("beginDateStr") String beginDateStr, @Param("endDateStr") String endDateStr);

    //冻结收费记录
    int updateTransactionLogsByInvoiceCode(String invoiceCode);
}
