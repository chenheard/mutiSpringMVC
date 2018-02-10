package com.oasystem.circurt;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

import com.oasystem.pojo.TUser;

/**
 * 流程变量测试
 * 
 * @author zhaoqx
 * 
 */
public class circurt {
	ProcessEngine pe = ProcessEngines.getDefaultProcessEngine();

	/**
	 * 部署流程定义
	 */
	@Test
	public void test1() {
		DeploymentBuilder deploymentBuilder = pe.getRepositoryService()
				.createDeployment();
		deploymentBuilder
				.addClasspathResource("com/oasystem/liucheng/FileApply.bpmn");
		deploymentBuilder
				.addClasspathResource("com/oasystem/liucheng/FileApply.png");
		Deployment deployment = deploymentBuilder.deploy();
		System.out.println(deployment.getId());
	}

	/**
	 * 设置流程变量：启动流程实例时设置
	 */
	@Test
	public void test2() {
		String processDefinitionKey = "qjlc";// 流程定义key
		Map<String, Object> variables = new HashMap<>();
		variables.put("key1", "value1");
		variables.put("k2", "v2");
		ProcessInstance pi = pe.getRuntimeService().startProcessInstanceByKey(
				processDefinitionKey, variables);
		System.out.println(pi.getId());
	}
	
	/**
	 * 设置流程变量：办理任务时设置 
	 */
	@Test
	public void test3() {
		String taskId = "802";
		Map<String, Object> variables = new HashMap<>();
		variables.put("qjts", 3);
		variables.put("qjyy", "事假");
		pe.getTaskService().complete(taskId , variables);
	}
	
	/**
	 * 设置流程变量：使用RuntimeService的方法设置
	 */
	@Test
	public void test4() {
		String executionId = "201";//流程实例ID
		String variableName = "k3";
		Object value = "v3";
		//设置一个流程变量
		pe.getRuntimeService().setVariable(executionId, variableName, value);
		
		Map<String, Object> variables = new HashMap<>();
		variables.put("k4", "v4");
		variables.put("k5", "v5");
		
		TUser user = new TUser();
		user.setId(20);
		user.setcUsername("abc");
		variables.put("user", user);
		//设置多个流程变量
		pe.getRuntimeService().setVariables(executionId, variables );
	}
	
	/**
	 * 设置流程变量：使用TaskService的方法设置
	 */
	@Test
	public void test5() {
		String taskId = "304";//任务ID
		String variableName = "k6";
		Object value = "v6";
		//设置一个流程变量 
		pe.getTaskService().setVariable(taskId, variableName, value);
		
		//设置多个流程变量 
		//pe.getTaskService().setVariables(taskId, variables);
	}
	
	/**
	 * 获取流程变量：使用RuntimeService的方法
	 */
	@Test
	public void test6() {
		String executionId = "201";//流程实例ID
		String variableName = "key1";
		//获取一个流程变量
		Object value = pe.getRuntimeService().getVariable(executionId , variableName );
		//System.out.println(value);
		
		//获取多个流程变量
		Map<String, Object> variables = pe.getRuntimeService().getVariables(executionId);
		System.out.println(variables);
	}
	
	/**
	 * 获取流程变量：使用TaskService的方法
	 */
	@Test
	public void test7() {
		String taskId = "304";//任务ID
		String variableName = "key1";//流程变量的key
		//获取一个流程变量
		Object value = pe.getTaskService().getVariable(taskId, variableName);
		//System.out.println(value);
		
		//获取当前任务所在流程实例范围内所有的流程变量
		Map<String, Object> variables = pe.getTaskService().getVariables(taskId);
		System.out.println(variables);
		
	}
}
