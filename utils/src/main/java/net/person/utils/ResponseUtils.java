package net.person.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: DK_Li
 * @ClassName: ResponseUtils
 * @See: 响应处理
 * @Date: 2018/12/17
 */
public class ResponseUtils {
    /**
     * 返回json 串
     *
     * @param response
     * @param text
     */
    public static void renderJson(HttpServletResponse response, String text) {
        render(response, "text/plain;charset=UTF-8", text);
    }
    /**
     * 发送内容。使用UTF-8编码。
     *
     * @param response
     * @param contentType
     * @param text
     */
    public static void render(HttpServletResponse response, String contentType, String text) {
        response.setContentType(contentType);
        response.setCharacterEncoding("UTF-8");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "0");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("XDomainRequestAllowed","1");
        try {
            response.getWriter().write(text);
        } catch (IOException e) {
        }
    }
}