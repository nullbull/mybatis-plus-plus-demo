package com.github.mybatisplusplus.demo.mybatis;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
/*
*
 * @date 2019/2/22 10:45
 * @desc
 */

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        final String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/service/src/main/java");
        gc.setAuthor("System");
        gc.setOpen(false);
        gc.setFileOverride(true); //是否覆盖
        mpg.setGlobalConfig(gc);


        // 数据源配置 美事-orgination
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8");
        dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);





        // 包配置
        final PackageConfig pc = new PackageConfig();
        pc.setParent("com.github.mybatisplusplus.demo");
//        pc.setController("");
        pc.setServiceImpl("manager.impl");
        pc.setXml("dao.xml");
        pc.setEntity("entity");
        pc.setMapper("dao");
        pc.setService("manager");
        gc.setServiceName("%sManager");
        gc.setServiceImplName("%sManagerImpl");

        mpg.setPackageInfo(pc);



        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(false);
        strategy.setInclude("meeting");

        //*设置生成类的前缀*
//        strategy.setTablePrefix( "");

        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController(null);
//        templateConfig.setService("Manager");
        mpg.setTemplate(templateConfig);
        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new VelocityTemplateEngine());
        mpg.execute();
    }


}


