package com.example.tmpSpringBoot.dao.generator;

import com.example.tmpSpringBoot.dto.generator.UserMst;

public interface UserMstMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mst
     *
     * @mbg.generated Fri Sep 09 00:49:13 JST 2022
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mst
     *
     * @mbg.generated Fri Sep 09 00:49:13 JST 2022
     */
    int insert(UserMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mst
     *
     * @mbg.generated Fri Sep 09 00:49:13 JST 2022
     */
    int insertSelective(UserMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mst
     *
     * @mbg.generated Fri Sep 09 00:49:13 JST 2022
     */
    UserMst selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mst
     *
     * @mbg.generated Fri Sep 09 00:49:13 JST 2022
     */
    int updateByPrimaryKeySelective(UserMst record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_mst
     *
     * @mbg.generated Fri Sep 09 00:49:13 JST 2022
     */
    int updateByPrimaryKey(UserMst record);
}