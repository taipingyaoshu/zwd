package com.example.demo;

import com.example.demo.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
        System.out.println(sysUserMapper.selectById(1));
        System.out.println("hello world");

        /*
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/boge?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai",
                        "root",
                        "123456")
                .globalConfig(builder -> {
                    builder.author("zwd") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            //.finalize() // 覆盖已生成文件
                            .outputDir("E://zwd//com.example.demo"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .moduleName("demo") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E://zwd//com.example.demo")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("sys_user","sys_role") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

            */
    }

}
