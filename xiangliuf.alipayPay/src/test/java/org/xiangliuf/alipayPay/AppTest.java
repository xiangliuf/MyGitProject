package org.xiangliuf.alipayPay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayOpenPublicTemplateMessageIndustryModifyRequest;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayOpenPublicTemplateMessageIndustryModifyResponse;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest  extends TestCase {

    //应用id
    private static final String APP_ID = "2016101200667205";
    //应用私钥
    private static final String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCYmx0o1WgQLASWNRGXFXDFPzgsSPL7TpOAUWpJvMCkpMnqKC9qJsLGK9+QPDzsvAmOrvWbUghADHNSOWqb2/ktqDu/QI1b9q+/Mcgy5uws/nnuEgiz0o0REN+0wP3KZOi8r97LIpaeh7GIiLERLThQl/7997Ovl2uHdmiq5KQKz2oRQlCFyR2xB3FKv0pkrJd3rwErcHziy1RRYjHyP/RcRYeCwnjjaYoan5XsvrKaVnES8KmBjeI7R5J/fLjUrOu4FRBlAwqMf+8rLmzqdRpp/HTTm4yap1eh6Sth7vtA//fQWel4xBYVd5y3i35FsUNbkGtJB3UURzpEuEbULUs5AgMBAAECggEBAIp7uGplvpluWHs2jU/dVQip5f/J8zW6iH/ZYeqoLuk54UFsVhquMfJDvgzVnTP3L3UbsCXSu0nkAoKLOANYCzczg4R6v8zEf5exRUtr4sax51PzaZJFb14dQeR1fdk82TbhIfyU1rnlyWVtJcHAl2oLhIpTTev6LMow2aq68WIckAI0/xjK+Y7OHEVhTyuMfKxRPcGoiP5o+qcbZqRSptJCEIBGEN0tszLwaHiDwlEzSeW72A2rC7vYjNam4m09aty8Uz5vaj4Ixt5EId9MapyUm/Pcg+i59xspgmXB8SjB0g8EAEIVPdyNtUU3VhraWvSz067UvNz8gLExWLJOAAECgYEAyiEGfYI4OChvDGF6F0Ke6DTuQiPz13x41eMShpCErSIjvoScZHsIqhhe0J+D3u+xMb7nRBsMIPDc/9zM6h5b/6N5d5iS6UcgATAXmAH5dpmgbVWedCzyUJQiXgm6MdXnTf4TRf2yvNdGgJouMDfRnPH6C/BSRhPbZsCNyWI2CgECgYEAwUcyy9xVhKgJgSJOr0FXIu3Xf+3odHhbwK+lOBcIkwjrKDvUmS4v56ajAMTyZRq/BuH1brnl/khDRyeGuGEwp6Vqjz9xrTs8yI13HXw47az2Vhu9WsyfeJpX28+c5IIWRm81+XoC0RLj06XihmH3HFOfSjDukrjSdOUhSZF7ETkCgYAftvzYtpTxos6Bx82rVqWuU5fKwu9gsUQYc0+V05ktvTyUiSQs0+0xGy/NVioP0dYgsw6AbioCBSj38IIqfeb7fn/xlvv+JE3OQeiBzlWBGWvFm/iHzAGdSRD3ZllTtndbknEdu0fPP4vtY8O5hxiZopIUS3ntSvJS9gWJQqKuAQKBgQCTvMegOpCH8SYqtj2tCuX/Rgx2tjT8ak/ALsK86CZete+CdpFgcYSerqpkWSbrj5E7QpcnhyO9xiDfD+CTqX7WdsPIMXfEMcaZikDloeGmE5LMaTHJaSXwuxGzbLQBm0pJlpKMWu4yQB0z19YaYGHSHj1hKZwDPRFp1wclw/VtSQKBgBC5Emazys7fEnvDztNfjN1BXwmKZ3l7nmQFoxXnOheMJDWoFcmO9S3LAh/jv+R38nRJc+d1g3iToBxQzcxyOtfe1jlfzaFi0qH6ZJnf2b0MqR328FOod/47FfcBD8IoSQbWf60adkyKoHjUE4z5jI1nxS+A/OwcTcsoHNK9prWS";
    //字符集
    private static final String CHARSET = "UTF-8";
    //支付宝公钥
    private static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtM9e54TJ3iW8QabHNHkAErgda2df2mmkggC5iRErs41meQXojwj1gNtx8jCgwmtfnCbr7uGpFyp";


    /**
     * 支付接口調用
     * @throws AlipayApiException
     */
    public void testPay() throws AlipayApiException {

        // 实例化客户端
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.ALIPAY_URL, AlipayConfig.APP_ID,
                AlipayConfig.PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY,
                AlipayConfig.SIGN_TYPE);
        // 实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
        AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
        // SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
        AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
        model.setBody("用户充值");
        model.setSubject("XX平台APP");
        // 唯一订单号 根据项目中实际需要获取相应的
        model.setOutTradeNo("201909270001");// outtradeno 生存订单
        // 支付超时时间（根据项目需要填写）
        model.setTimeoutExpress("60m");
        // 支付金额（项目中实际订单的需要支付的金额，金额的获取与操作请放在服务端完成，相对安全）
        model.setTotalAmount("11");
        model.setProductCode("QUICK_MSECURITY_PAY");
        request.setBizModel(model);
        // 支付成功后支付宝异步通知的接收地址url
        request.setNotifyUrl(AlipayConfig.CALLBACK_URL);//异步回调url

        // 这里和普通的接口调用不同，使用的是sdkExecute
        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
        System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
        //调用成功，则处理业务逻辑
        if(response.isSuccess()){
            //.....
        }
    }

}
