package com.eolinker.service;

import java.util.List;
import java.util.Map;

import com.eolinker.pojo.AutomatedTestCaseSingle;
/**
 * 自动化测试用例单例
 * @name eolinker ams open source，eolinker开源版本
 * @link https://www.eolinker.com/
 * @package eolinker
 * @author www.eolinker.com 广州银云信息科技有限公司 2015-2018
 * eoLinker是目前全球领先、国内最大的在线API接口管理平台，提供自动生成API文档、API自动化测试、Mock测试、团队协作等功能，旨在解决由于前后端分离导致的开发效率低下问题。
 * 如在使用的过程中有任何问题，欢迎加入用户讨论群进行反馈，我们将会以最快的速度，最好的服务态度为您解决问题。
 *
 * eoLinker AMS开源版的开源协议遵循Apache License2.0，如需获取最新的eolinker开源版以及相关资讯，请访问:https://www.eolinker.com/#/os/download
 *
 * 官方网站：https://www.eolinker.com/ 官方博客以及社区：http://blog.eolinker.com/
 * 使用教程以及帮助：http://help.eolinker.com/ 商务合作邮箱：market@eolinker.com
 * 用户讨论QQ群：707530721
 */
public interface AutomatedTestCaseSingleService
{

	//添加测试单例
	public Integer addSingleTestCase(AutomatedTestCaseSingle automatedTestCaseSingle, Integer projectID, Integer userID);

	//修改测试单例
	public boolean editSingleTestCase(AutomatedTestCaseSingle automatedTestCaseSingle, Integer projectID,
			Integer userID);

	//获取测试单例列表
	public List<Map<String, Object>> getSingleTestCaseList(Integer projectID, Integer caseID);

	//获取单例详情
	public Map<String, Object> getSingleTestCaseInfo(Integer projectID, Integer connID);

	//删除单例
	public boolean deleteSingleTestCase(Integer projectID, String connID, Integer userID);

	//获取接口列表
	public List<Map<String, Object>> getApiList(Integer projectID);

}
