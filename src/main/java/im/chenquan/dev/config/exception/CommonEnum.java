package im.chenquan.dev.config.exception;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: CommonEnum.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */

public enum CommonEnum implements BaseErrorInfoInterface {
    SUCCESS("200", "成功!"),
    BODY_NOT_MATCH("400", "请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("401", "请求的数字签名不匹配!"),
    NOT_FOUND("404", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误!"),
    SERVER_BUSY("503", "服务器正忙，请稍后再试!"),
    REQUEST_METHOD_ERROR("405", "请求方法错误"),
    API_NOT_FOUND("404", "接口不存在！");
    /**
     * 错误码
     */
    private String resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    CommonEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    /**
     * 错误码
     *
     * @return: 错误代码
     */
    @Override
    public String getResultCode() {
        return resultCode;
    }

    /**
     * 错误描述
     *
     * @return: 错误描述
     */
    @Override
    public String getResultMsg() {
        return resultMsg;
    }
}
