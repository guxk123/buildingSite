package com.building.common.util;

import org.apache.commons.lang.StringUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串操作类
 *
 * 2014年11月24日 上午11:17:51
 */
public class StringUtil extends StringUtils{
	
	private static final String SEP1 = "#";  
    private static final String SEP2 = "|";

    private static final int MAX_VALUE = 999999;
    private static final String FORMAT = "yyyyMMdd";

    private static final SimpleDateFormat SDF = new SimpleDateFormat(FORMAT);
	
    /**
	 * 随机生成指定位数且不重复的字符串.去除了部分容易混淆的字符，如1和l，o和0等，
	 * 随机范围1-9 a-z A-Z
	 * @param length 指定字符串长度
	 * @return 返回指定位数且不重复的字符串
	 */
	public static String getRandomString(int length) {
		StringBuffer bu = new StringBuffer();
		String[] arr = { "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c",
				"d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		Random random = new Random();
		while (bu.length() < length) {
			String temp = arr[random.nextInt(57)];
			if (bu.indexOf(temp) == -1) {
				bu.append(temp);
			}
		}
		return bu.toString();
	}
	
	/** 
     * 产生随机的六位数 
     * @return 
     */  
    public static String getSixCode(){  
        Random rad=new Random();  
          
        String result  = rad.nextInt(1000000) +"";  
        if(result.length()!=6){  
            return getSixCode();  
        } 
        return result;  
    }  
	
	/**
	 * String类型转换为long数组
	 * @param str 带转换的字符串
	 * @param spt 分隔符
	 * @return
	 */
	public static Long[] getLong(String str,String spt){
		String[] strs = str.split(spt);
		Long[] ls = new Long[strs.length];
		for (int i = 0,length = strs.length; i < length; i++) {
			ls[i] = Long.parseLong(strs[i]);
		}
		return ls;
	}
	
	/**
	 * 转义 特殊符
	 */
	public static String escapeSpecialSign(String condition){
		String bb = StringUtils.replace(condition, "/", "//");
		bb = StringUtils.replace(bb, "%", "/%");
		bb = StringUtils.replace(bb, "_", "/_");
		return bb;
	}
	
	/**
	 * 转换字符串为指定编码格式
	 * 
	 * @param s
	 * @param encod 字符的格式：iso-8859-1
	 * @param encoding 要转换成的字符格式，如：utf-8
	 * @return
	 */
	public static String stringFormat(String s, String encod, String encoding) {
		try {
			return new String(s.getBytes(encod), encoding);
		} catch (Exception e) {
			return s;
		}
	}
	
	/** 
     * List转换String 
     *  
     * @param list 
     *            :需要转换的List 
     * @return String转换后的字符串 
     */  
    public static String ListToString(List<?> list) {  
        StringBuffer sb = new StringBuffer();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                if (list.get(i) == null || list.get(i) == "") {  
                    continue;  
                }  
                // 如果值是list类型则调用自己  
                if (list.get(i) instanceof List) {  
                    sb.append(ListToString((List<?>) list.get(i)));  
                    sb.append(SEP1);
                    sb.append(SEP1);
                } else if (list.get(i) instanceof Map) {  
                    sb.append(MapToString((Map<?, ?>) list.get(i)));  
                    sb.append(SEP1);
                    sb.append(SEP1);
                } else {  
                    sb.append(list.get(i));  
                    sb.append(SEP1);
                    sb.append(SEP1);
                }  
            }  
        }  
        return 'L'+sb.toString();  
    }  
  
    /** 
     * Map转换String 
     *  
     * @param map 
     *            :需要转换的Map 
     * @return String转换后的字符串 
     */  
    public static String MapToString(Map<?, ?> map) {  
        StringBuffer sb = new StringBuffer();  
        // 遍历map  
        for (Object obj : map.keySet()) {  
            if (obj == null) {  
                continue;  
            }  
            Object key = obj;  
            Object value = map.get(key);  
            if (value instanceof List<?>) {  
                sb.append(key.toString() + SEP1 + ListToString((List<?>) value));  
                sb.append(SEP2);  
            } else if (value instanceof Map<?, ?>) {  
                sb.append(key.toString() + SEP1  
                        + MapToString((Map<?, ?>) value));  
                sb.append(SEP2);  
            } else {  
                sb.append(key.toString() + SEP1 + value);  
                sb.append(SEP2);  
            }  
        }  
        return 'M'+sb.toString();  
    }  
  
    /** 
     * String转换Map
     * @param mapText
     */
    public static Map<String, Object> StringToMap(String mapText) {  
  
        if (mapText == null || mapText.equals("")) {  
            return null;  
        }  
        mapText = mapText.substring(1);  
  
        Map<String, Object> map = new HashMap<String, Object>();  
        String[] text = mapText.split("\\" + SEP2); // 转换为数组  
        for (String str : text) {  
            String[] keyText = str.split(SEP1); // 转换key与value的数组  
            if (keyText.length < 1) {  
                continue;  
            }  
            String key = keyText[0]; // key  
            String value = keyText[1]; // value  
            if (value.charAt(0) == 'M') {  
                Map<?, ?> map1 = StringToMap(value);  
                map.put(key, map1);  
            } else if (value.charAt(0) == 'L') {  
                List<?> list = StringToList(value);  
                map.put(key, list);  
            } else {  
                map.put(key, value);  
            }  
        }  
        return map;  
    }  
  
    /** 
     * String转换List 
     *  
     * @param listText 
     *            :需要转换的文本 
     * @return List<?> 
     */  
    public static List<Object> StringToList(String listText) {  
        if (listText == null || listText.equals("")) {  
            return null;  
        }  
        listText = listText.substring(1);  
  
        List<Object> list = new ArrayList<Object>();  
        String[] text = listText.split(SEP1+SEP1);  
        for (String str : text) {  
            if (str.charAt(0) == 'M') {  
                Map<?, ?> map = StringToMap(str);  
                list.add(map);  
            } else if (str.charAt(0) == 'L') {  
                List<?> lists = StringToList(str);  
                list.add(lists);  
            } else {  
                list.add(str);  
            }  
        }  
        return list;  
    }
    
    /**
	 * 将传入的对象转换为字符串，当传入的对象为null时返回默认值
	 * 
	 * @param o
	 * @param dv
	 * @return
	 */
	public static String safeToString(Object o, String dv) {
		String r = dv;
		if (o != null) {
			r = String.valueOf(o);
			if("null".equals(r) || "".equals(r)){
				r = dv;
			}
			
		}

		return r;
	}

    
    /**
     * 验证
     * @param reg 正则表达式
     * @param str 字符串
     * @return 
     */
    public static boolean validate(String reg,String str){
    	 Pattern p = Pattern.compile(reg);     
         Matcher m = p.matcher(str);     
         return m.matches();     
    }
    
    /**
     * object类型转String类型
     * @param obj
     * @return
     */
    public static String objectToString(Object obj){
    	if(null == obj)
    		return "";
    	else
    		return String.valueOf(obj);
    }
    
    /**
     * md5加密
     * @param str
     * @return
     */
    public static String md5(String str) {
		 try {
	        // 生成一个MD5加密计算摘要
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        // 计算md5函数
	        md.update(str.getBytes());
	        // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
	        // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
	        return new BigInteger(1, md.digest()).toString(16);
	    } catch (Exception e) {
	    	e.printStackTrace();
	        return null;
	    }
	}
    
    /**
     * 生成流水号
     * @param code
     * @return
     */
    public static String serialNumber(String code) {
		String date = DateUtil.dateFormat(DateUtil.now(), "yyyyMMdd");
		int hashCodeV = uuidHashCode();
		return code+date+String.format("%011d", hashCodeV);
	}
    
    /**
     * 获取uui hashCode
     * @return
     */
    public static int uuidHashCode(){
    	int hashCodeV = UUID.randomUUID().toString().hashCode();
		if (hashCodeV < 0) {// 有可能是负数
			hashCodeV = -hashCodeV;
		}
		return hashCodeV;
    }
    
    /**
     * 判断obj对象是否为空
     * @param obj
     * @return
     */
    public static String isObjectEmpty(Object obj){
    	return obj == null?"":String.valueOf(obj);
    }



    public static int getExpiretime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, MAX_VALUE);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        return ((int) calendar.getTimeInMillis() - (int) calendar1.getTimeInMillis()) / 1000;
    }

    /**
     * 将单号存入redis中，存在则加1 最大值为9999 不存在则赋值为1 保存时间到当天23 59 59秒
     */
    public static void setNumberKey(String code) {
        boolean exists = RedisUtil.exists(code);
        if (exists) {
            String data = RedisUtil.get(code);
            int number = Integer.parseInt(data.substring(data.length() - 6, data.length()));
            if (number < MAX_VALUE) {
                number++;
            }
            RedisUtil.delByKey(code);
            String str = "";
            if (number < 10) {
                str = "00000" + number;
            } else if (number < 100) {
                str = "0000" + number;
            } else if (number < 1000) {
                str = "000" + number;
            } else if (number < 10000) {
                str = "00" + number;
            } else if (number < 100000) {
                str = "0" + number;
            } else {
                str = "" + number;
            }
            RedisUtil.setex(code, SDF.format(new Date()) + str, getExpiretime());
        } else {
            RedisUtil.setex(code, SDF.format(new Date()) + "000001", getExpiretime());
        }
    }

    public static String getNumberKey(String code) {
        setNumberKey(code);
        boolean exists = RedisUtil.exists(code);
        if (exists) {
            return code + RedisUtil.get(code);
        }
        return null;
    }
}
