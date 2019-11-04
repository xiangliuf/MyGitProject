package org.xiangliuf.alipayPay;

public class AlipayConfig {

    /**
     * 正式环境请求地址
     */
    public static String ALIPAY_URL = "https://openapi.alipay.com/gateway.do";
    /**
     * 支付宝分配给开发者的应用ID
     *
     */
    public static String APP_ID = "2016101200667205";
    //public static String APP_ID = "2019092367716873";

    /**
     * 支付接口名称
     */
    public static String PAY_METHOD = "alipay.trade.app.pay";
    /**
     * 提现接口名称
     */
    public static String TRANSFER_METHOD = "alipay.fund.trans.toaccount.transfer";
    /**
     * 仅支持JSON
     */
    public static String FORMAT = "JSON";
    /**
     * 请求使用的编码格式
     */
    public static String CHARSET = "utf-8";
    /**
     * 商户生成签名字符串所使用的签名算法类型
     */
    public static String SIGN_TYPE = "RSA2";
    /**
     * 支付宝公钥
     */
    public static String ALIPAY_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDIgHnOn7LLILlKETd6BFRJ0GqgS2Y3mn1wMQmyh9zEyWlz5p1zrahRahbXAfCfSqshSNfqOmAQzSHRVjCqjsAw1jyqrXaPdKBmr90DIpIxmIyKXv4GGAkPyJ/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
    //public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtM9e54TJ3iW8QabHNHkAErgda2df2mmkggC5iRErs41meQXojwj1gNtx8jCgwmtfnCbr7uGpFyp/u9I2C9SDVDa6381/gunPEchJnFpTFho8A2T5ZJeS1qdGP71usZpsC0w9QfXHk/pAwdecTyrTVqYRes1wdHyBDxM1t9IZNjLt3XDbdett5+eV5WU13dap2MF9IwtdXcfx8nNNrfFYfwrKVW2AUJqu13XVIJtpsEJTn40QZNXTVDjUv6vf8OJX1qCcdBRCxVmMRPmc4nopv6QRlPEFXGtUL4as01DKcOedWibO6gxRzRLeR1AQOEI7UHE0KsLDo3+KtIzhQwnEwQIDAQAB/u9I2C9SDVDa6381/gunPEchJnFpTFho8A2T5ZJeS1qdGP71usZpsC0w9QfXHk/pAwdecTyrTVqYRes1wdHyBDxM1t9IZNjLt3XDbdett5+eV5WU13dap2MF9IwtdXcfx8nNNrfFYfwrKVW2AUJqu13XVIJtpsEJTn40QZNXTVDjUv6vf8OJX1qCcdBRCxVmMRPmc4nopv6QRlPEFXGtUL4as01DKcOedWibO6gxRzRLeR1AQOEI7UHE0KsLDo3+KtIzhQwnEwQIDAQAB/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";
    /**
     * 商户私钥
     */
    public static String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCYmx0o1WgQLASWNRGXFXDFPzgsSPL7TpOAUWpJvMCkpMnqKC9qJsLGK9+QPDzsvAmOrvWbUghADHNSOWqb2/ktqDu/QI1b9q+/Mcgy5uws/nnuEgiz0o0REN+0wP3KZOi8r97LIpaeh7GIiLERLThQl/7997Ovl2uHdmiq5KQKz2oRQlCFyR2xB3FKv0pkrJd3rwErcHziy1RRYjHyP/RcRYeCwnjjaYoan5XsvrKaVnES8KmBjeI7R5J/fLjUrOu4FRBlAwqMf+8rLmzqdRpp/HTTm4yap1eh6Sth7vtA//fQWel4xBYVd5y3i35FsUNbkGtJB3UURzpEuEbULUs5AgMBAAECggEBAIp7uGplvpluWHs2jU/dVQip5f/J8zW6iH/ZYeqoLuk54UFsVhquMfJDvgzVnTP3L3UbsCXSu0nkAoKLOANYCzczg4R6v8zEf5exRUtr4sax51PzaZJFb14dQeR1fdk82TbhIfyU1rnlyWVtJcHAl2oLhIpTTev6LMow2aq68WIckAI0/xjK+Y7OHEVhTyuMfKxRPcGoiP5o+qcbZqRSptJCEIBGEN0tszLwaHiDwlEzSeW72A2rC7vYjNam4m09aty8Uz5vaj4Ixt5EId9MapyUm/Pcg+i59xspgmXB8SjB0g8EAEIVPdyNtUU3VhraWvSz067UvNz8gLExWLJOAAECgYEAyiEGfYI4OChvDGF6F0Ke6DTuQiPz13x41eMShpCErSIjvoScZHsIqhhe0J+D3u+xMb7nRBsMIPDc/9zM6h5b/6N5d5iS6UcgATAXmAH5dpmgbVWedCzyUJQiXgm6MdXnTf4TRf2yvNdGgJouMDfRnPH6C/BSRhPbZsCNyWI2CgECgYEAwUcyy9xVhKgJgSJOr0FXIu3Xf+3odHhbwK+lOBcIkwjrKDvUmS4v56ajAMTyZRq/BuH1brnl/khDRyeGuGEwp6Vqjz9xrTs8yI13HXw47az2Vhu9WsyfeJpX28+c5IIWRm81+XoC0RLj06XihmH3HFOfSjDukrjSdOUhSZF7ETkCgYAftvzYtpTxos6Bx82rVqWuU5fKwu9gsUQYc0+V05ktvTyUiSQs0+0xGy/NVioP0dYgsw6AbioCBSj38IIqfeb7fn/xlvv+JE3OQeiBzlWBGWvFm/iHzAGdSRD3ZllTtndbknEdu0fPP4vtY8O5hxiZopIUS3ntSvJS9gWJQqKuAQKBgQCTvMegOpCH8SYqtj2tCuX/Rgx2tjT8ak/ALsK86CZete+CdpFgcYSerqpkWSbrj5E7QpcnhyO9xiDfD+CTqX7WdsPIMXfEMcaZikDloeGmE5LMaTHJaSXwuxGzbLQBm0pJlpKMWu4yQB0z19YaYGHSHj1hKZwDPRFp1wclw/VtSQKBgBC5Emazys7fEnvDztNfjN1BXwmKZ3l7nmQFoxXnOheMJDWoFcmO9S3LAh/jv+R38nRJc+d1g3iToBxQzcxyOtfe1jlfzaFi0qH6ZJnf2b0MqR328FOod/47FfcBD8IoSQbWf60adkyKoHjUE4z5jI1nxS+A/OwcTcsoHNK9prWS";
    //public static String PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCYmx0o1WgQLASWNRGXFXDFPzgsSPL7TpOAUWpJvMCkpMnqKC9qJsLGK9+QPDzsvAmOrvWbUghADHNSOWqb2/ktqDu/QI1b9q+/Mcgy5uws/nnuEgiz0o0REN+0wP3KZOi8r97LIpaeh7GIiLERLThQl/7997Ovl2uHdmiq5KQKz2oRQlCFyR2xB3FKv0pkrJd3rwErcHziy1RRYjHyP/RcRYeCwnjjaYoan5XsvrKaVnES8KmBjeI7R5J/fLjUrOu4FRBlAwqMf+8rLmzqdRpp/HTTm4yap1eh6Sth7vtA//fQWel4xBYVd5y3i35FsUNbkGtJB3UURzpEuEbULUs5AgMBAAECggEBAIp7uGplvpluWHs2jU/dVQip5f/J8zW6iH/ZYeqoLuk54UFsVhquMfJDvgzVnTP3L3UbsCXSu0nkAoKLOANYCzczg4R6v8zEf5exRUtr4sax51PzaZJFb14dQeR1fdk82TbhIfyU1rnlyWVtJcHAl2oLhIpTTev6LMow2aq68WIckAI0/xjK+Y7OHEVhTyuMfKxRPcGoiP5o+qcbZqRSptJCEIBGEN0tszLwaHiDwlEzSeW72A2rC7vYjNam4m09aty8Uz5vaj4Ixt5EId9MapyUm/Pcg+i59xspgmXB8SjB0g8EAEIVPdyNtUU3VhraWvSz067UvNz8gLExWLJOAAECgYEAyiEGfYI4OChvDGF6F0Ke6DTuQiPz13x41eMShpCErSIjvoScZHsIqhhe0J+D3u+xMb7nRBsMIPDc/9zM6h5b/6N5d5iS6UcgATAXmAH5dpmgbVWedCzyUJQiXgm6MdXnTf4TRf2yvNdGgJouMDfRnPH6C/BSRhPbZsCNyWI2CgECgYEAwUcyy9xVhKgJgSJOr0FXIu3Xf+3odHhbwK+lOBcIkwjrKDvUmS4v56ajAMTyZRq/BuH1brnl/khDRyeGuGEwp6Vqjz9xrTs8yI13HXw47az2Vhu9WsyfeJpX28+c5IIWRm81+XoC0RLj06XihmH3HFOfSjDukrjSdOUhSZF7ETkCgYAftvzYtpTxos6Bx82rVqWuU5fKwu9gsUQYc0+V05ktvTyUiSQs0+0xGy/NVioP0dYgsw6AbioCBSj38IIqfeb7fn/xlvv+JE3OQeiBzlWBGWvFm/iHzAGdSRD3ZllTtndbknEdu0fPP4vtY8O5hxiZopIUS3ntSvJS9gWJQqKuAQKBgQCTvMegOpCH8SYqtj2tCuX/Rgx2tjT8ak/ALsK86CZete+CdpFgcYSerqpkWSbrj5E7QpcnhyO9xiDfD+CTqX7WdsPIMXfEMcaZikDloeGmE5LMaTHJaSXwuxGzbLQBm0pJlpKMWu4yQB0z19YaYGHSHj1hKZwDPRFp1wclw/VtSQKBgBC5Emazys7fEnvDztNfjN1BXwmKZ3l7nmQFoxXnOheMJDWoFcmO9S3LAh/jv+R38nRJc+d1g3iToBxQzcxyOtfe1jlfzaFi0qH6ZJnf2b0MqR328FOod/47FfcBD8IoSQbWf60adkyKoHjUE4z5jI1nxS+A/OwcTcsoHNK9prWS";

    /**
     * 回调地址
     */
    public static String CALLBACK_URL = "http://10.242.129.65/uomp-uc/app/login.html";

}
