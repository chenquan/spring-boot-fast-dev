package im.chenquan.dev.config.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: GlobalExceptionHandler.java
 * @Version: 1.0
 * @Date: 2020/2/1
 * @Description:
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = ExcException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultResponse ExcExceptionHandler(HttpServletRequest req, ExcException e) {
        logger.error("发生业务异常！原因是：{}", e.getErrorMsg());
        return ResultResponse.error(e.getErrorCode(), e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultResponse exceptionHandler(HttpServletRequest req, NullPointerException e) {
        logger.error("发生空指针异常！原因是:", e);
        return ResultResponse.error(CommonEnum.BODY_NOT_MATCH);
    }


    /**
     * 接口不存在
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResultResponse exceptionHandler(HttpServletRequest req, NoHandlerFoundException e) {
        logger.error("原因是:接口[{}]不存在！", req.getRequestURI());
        return ResultResponse.error(CommonEnum.API_NOT_FOUND, req.getRequestURI());
    }

    /**
     * GET,POST 等方法请求错误
     */
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
    public ResultResponse handleRRException(HttpRequestMethodNotSupportedException e) {
        return ResultResponse.error(CommonEnum.REQUEST_METHOD_ERROR);
    }

    /**
     * 参数绑定错误
     */

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResultResponse handleRRException(MissingServletRequestParameterException e) {
        return ResultResponse.error(CommonEnum.BODY_NOT_MATCH);
    }


    /**
     * 处理其他异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultResponse exceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("未知异常！原因是:", e);
        return ResultResponse.error(CommonEnum.INTERNAL_SERVER_ERROR);
    }
}
