//package org.jimyth.business.app.util;
//
//import com.google.gson.Gson;
//import org.jimyth.messageService.entity.WSDesc;
//import org.springframework.web.socket.BinaryMessage;
//
//import java.lang.reflect.Type;
//import java.nio.ByteBuffer;
//import java.nio.CharBuffer;
//import java.nio.charset.Charset;
//import java.nio.charset.CharsetDecoder;
//
///**
// * Created by jimyt on 2016-10-18.
// */
//public class Ws2MqUtils {
//    public static WSDesc decodeFromWsToJson(String message) {
//        WSDesc  wsDesc = fromJson(message,  WSDesc.class );
//        return wsDesc;
//    }
//
//    /**
//     * json�ַ���ת�ɶ���
//     * @param str
//     * @param type
//     * @return
//     */
//    public static <T> T fromJson(String str, Type type) {
//        Gson gson = new Gson();
//        return gson.fromJson(str, type);
//    }
//
//    public static WSDesc decodeFromWsToJson(BinaryMessage message) {
//        String msgString = getString(message.getPayload());
//        WSDesc  wsDesc = fromJson(msgString,  WSDesc.class );
//        return wsDesc;
//    }
//
//    public static String getString(ByteBuffer buffer) {
//        Charset charset = null;
//        CharsetDecoder decoder = null;
//        CharBuffer charBuffer = null;
//        try {
//            charset = Charset.forName("UTF-8");
//            decoder = charset.newDecoder();
//            //������Ļ���ֻ�������һ�ν�����ڶ�����ʾΪ��
//// charBuffer = decoder.decode(buffer);
//            charBuffer = decoder.decode(buffer.asReadOnlyBuffer());
//            return charBuffer.toString();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            return "error";
//        }
//    }
//}
