package com.example.engine.mybatis.runner;

import org.mybatis.generator.api.ShellRunner;

/**
 * @Type RunGenerator.java
 * @Desc 
 * @author xc
 * @date 2017年1月6日 下午2:13:15
 * @version 
 */
public class RunGenerator {

	public static void main(String[] args) {

		String config = RunGenerator.class.getClassLoader()
				.getResource("generatorConfig.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}
}
