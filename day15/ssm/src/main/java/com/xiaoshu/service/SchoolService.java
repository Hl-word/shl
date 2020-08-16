package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.SchoolMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.School;
import com.xiaoshu.entity.SchoolVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class SchoolService {

	@Autowired
	SchoolMapper schoolMapper;
	
	public PageInfo<SchoolVo> findUserPage(SchoolVo schoolVo, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		List<SchoolVo> schoolList = schoolMapper.querySchool(schoolVo);
		PageInfo<SchoolVo> pageInfo = new PageInfo<SchoolVo>(schoolList);
		return pageInfo;
	}
	
	

	public School findByName(String name){
		School school = new School();
		school.setSchoolname(name);
		return schoolMapper.selectOne(school);
	}	

	
	//添加
	public void addSchool(School school){
		schoolMapper.insert(school);
	}
	
	//修改
	public void updateSchool(School school){
		schoolMapper.updateByPrimaryKey(school);
	}
	
	//删除
	public void deleteSchool(Integer id){
		schoolMapper.deleteByPrimaryKey(id);
	}
	
	//导出
	public List<SchoolVo> querySchool(SchoolVo schoolVo){
		return schoolMapper.querySchool(schoolVo);
	}

}
