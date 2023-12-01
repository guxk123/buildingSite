package com.building.dao.plugin;

/**
 */

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

/**
 * mybatis generator生成注释插件
 * <p>
 */
public class MyCommentGenerator extends DefaultCommentGenerator {
    private Properties properties;
    private Properties systemPro;
    private boolean suppressDate;
    private boolean suppressAllComments;
    private String currentDateStr;

    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }

    /**
     *  Java文件加注释
     * @param compilationUnit
     */
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        // 默认情况下不添加文件级别注释

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        compilationUnit.addFileCommentLine("/*");
        compilationUnit.addFileCommentLine("* "+compilationUnit.getType().getShortName()+".java");
        compilationUnit.addFileCommentLine("* Copyright(C) 2017-2025 上海凌边信息科技");
        compilationUnit.addFileCommentLine("* @date "+sdf.format(new Date())+"");
        compilationUnit.addFileCommentLine("*/");
    }

    /**
     * Mybatis的Mapper.xml文件里面的注释
     */
    public void addComment(XmlElement xmlElement) {
        return;
    }

    /**
     *  为根元素的第一个子节点添加注释
     * @param rootElement
     */
    public void addRootComment(XmlElement rootElement) {
        // 默认情况下不添加文档级别注释
        return;
    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
        suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
    }

    /*
     * 实体类注释
     */
    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments ) {
            return;
        }
        //swagger包引入
        String remark = introspectedTable.getRemarks();
        topLevelClass.addJavaDocLine("import io.swagger.annotations.ApiModel;");
        topLevelClass.addJavaDocLine("import io.swagger.annotations.ApiModelProperty;");
        topLevelClass.addJavaDocLine("import com.fasterxml.jackson.annotation.JsonFormat;");
        topLevelClass.addJavaDocLine("");
        topLevelClass.addJavaDocLine("");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * @Title "+introspectedTable.getFullyQualifiedTable()+"表的实体类");
        topLevelClass.addJavaDocLine(" * @Description "+ remark);
        topLevelClass.addJavaDocLine(" * @version 1.0");
        topLevelClass.addJavaDocLine(" * @Date " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        topLevelClass.addJavaDocLine(" */");
        topLevelClass.addJavaDocLine( "@ApiModel(value = \""+remark+"\")");
    }

    /**
     * 添加自定义javadoc标签
     * 此方法为其添加自定义javadoc标记。 如果您不希望包含Javadoc标记，则可能无效 - 但是，如果您不包含Javadoc标记，那么eclipse插件的Java合并功能将会中断。
     * @param javaElement
     *            the java element
     */
    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        javaElement.addJavaDocLine(" *");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }
        String s = getDateString();
        if (s != null) {
            sb.append(' ');
            sb.append(s);
        }
        javaElement.addJavaDocLine(sb.toString());
    }

    /**
     * 此方法返回格式化的日期字符串，以包含在Javadoc标记和XML注释中。 如果您不希望这些文档元素中的日期，则可以返回null。
     *
     * @return 表示当前时间戳的字符串，或null
     */
    protected String getDateString() {
        String result = null;
        if (!suppressDate) {
            result = currentDateStr;
        }
        return result;
    }

    /**
     * 内部类注释
     * @param innerClass
     * @param introspectedTable
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

    }

    /**
     * * 内部类注释
     * @param innerClass
     * @param introspectedTable
     * @param markAsDoNotDelete
     */
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        if (suppressAllComments) {
            return;
        }
    }

    /**
     * 枚举注释
     * @param innerEnum
     * @param introspectedTable
     */
    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
    }

    /**
     * 字段注释
     * 生成属性注释
     * @param field
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        //生成 swagger2 规范的注释
        String jdbcTypeName = introspectedColumn.getJdbcTypeName();
        String remarks = introspectedColumn.getRemarks();
        String s = "@ApiModelProperty(value = \"" + remarks + "\")";
        field.addJavaDocLine(s);
        if(jdbcTypeName.equals("TIMESTAMP") || jdbcTypeName.equals("DATETIME") ){
            String date = "@JsonFormat(pattern = \"yyyy-MM-dd HH:mm:ss\", timezone = \"GMT+8\")";
            field.addJavaDocLine(date);
        }else if(jdbcTypeName.equals("DATE") ){
            String date = "@JsonFormat(pattern = \"yyyy-MM-dd\", timezone = \"GMT+8\")";
            field.addJavaDocLine(date);
        }
    }

    /**
     * 字段注释
     * @param field
     * @param introspectedTable
     */
    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }

    }

    /**
     * 普通方法注释,mapper接口中方法
     * @param method
     * @param introspectedTable
     */
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
//        method.addJavaDocLine("/**");
//        addJavadocTag(method, false);
//        method.addJavaDocLine(" */");
    }

    /**
     * 生成get方法注释
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        sb.append(" * @return ");
        sb.append(introspectedColumn.getActualColumnName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        method.addJavaDocLine(" */");
    }

    /**
     * 生成set方法注释
     * @param method
     * @param introspectedTable
     * @param introspectedColumn
     */
    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (suppressAllComments) {
            return;
        }
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        method.addJavaDocLine(" */");
    }

}