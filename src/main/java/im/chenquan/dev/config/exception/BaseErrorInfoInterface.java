package im.chenquan.dev.config.exception;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: BaseErrorInfoInterface.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description: 错误信息基础接口
 */

public interface BaseErrorInfoInterface {
    /**
     * 错误码
     *
     * @return: 错误代码
     */
    String getResultCode();

    /**
     * 错误描述
     *
     * @return: 错误描述
     */
    String getResultMsg();
}
