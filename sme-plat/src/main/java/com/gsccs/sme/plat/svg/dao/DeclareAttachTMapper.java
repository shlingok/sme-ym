package com.gsccs.sme.plat.svg.dao;

import com.gsccs.sme.plat.svg.model.DeclareAttachT;
import com.gsccs.sme.plat.svg.model.DeclareAttachTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeclareAttachTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int countByExample(DeclareAttachTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int deleteByExample(DeclareAttachTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int insert(DeclareAttachT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int insertSelective(DeclareAttachT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    List<DeclareAttachT> selectByExample(DeclareAttachTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    DeclareAttachT selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int updateByExampleSelective(@Param("record") DeclareAttachT record, @Param("example") DeclareAttachTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int updateByExample(@Param("record") DeclareAttachT record, @Param("example") DeclareAttachTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int updateByPrimaryKeySelective(DeclareAttachT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sme_declare_attach
     *
     * @mbggenerated Mon Mar 07 14:36:45 CST 2016
     */
    int updateByPrimaryKey(DeclareAttachT record);
}