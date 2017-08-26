package com.jiayuan.mainframework.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;


public class RSAEncrypt {

    public static final String DEFAULT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDxGvtfIxwNp74qEXAkmp/86uYKcJgVQ3PZ+2i68yzIbC1PjUKTywdF4ko5tci6tgx7UVV7ZoQF6DiZiYSnBRhnGFLRlY/q7g1Xle3OqasRm0MTLemfY2QvJYuiVgZ8FicEEF08HSmoRyqTmeInAkRPG7/s2IAtAvaSNUWj54DfsQIDAQAB";

    public static final String DEFAULT_PRIVATE_KEY = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAPEa+18jHA2nvioRcCSan/zq5gpwmBVDc9n7aLrzLMhsLU+NQpPLB0XiSjm1yLq2DHtRVXtmhAXoOJmJhKcFGGcYUtGVj+ruDVeV7c6pqxGbQxMt6Z9jZC8li6JWBnwWJwQQXTwdKahHKpOZ4icCRE8bv+zYgC0C9pI1RaPngN+xAgMBAAECgYA3amMyR6iP/uj3VFC5KQzyna7H4X8jDADZri4xIek+G5cCfM47l+ORDWTQBNchCuytf1Etbq+Th/9SUsg5dzNXNIq6B8SNIC3UaRT0g2fY52DrOnQzp3Q3D9GSarzes//vJ6GkFTNBzLbMXwIJ8Rk1+aN0v+s9YNOmZJWPYGybbQJBAPs0Qp5H00Cj+ufJGY19QBF24aCcWWfyrhH4mH4d1ggBKnpmsJ7+LMw5out2fEeboj6c99+O3wZDV2zTfc0uoIMCQQD1tV1qkVgPY+Eo9kza18zTpSl9Z2kIRuwYX45D8WTLqx/Vro7GkGIkCLtr4IcAsaFpW3oFrBhDjZB4IIEP1eC7AkEA65G8j1Xnw4yDNG2fqtG0DSygtc8pAJPRrUSlLE+qcOM3BIXcR50wQWwjXhBEx5opcfIdeOYwO11XVNSX+pwpJQJBAO+y1MUnsV6iM3/Ad81uhPVbxJQAE+jtN1m3rpP9pDVEZbQRrFttczBwDFb7HPjCURL1GJ77+le8fNmT7BREtA0CQHL82Fssu84N+12Voi6BkzU8XlZ0Q99SHgYtOYYLJou4asoejDpwGvAuuyTRFA8nbxvtZviK6L9bhHDP2mJahJU=";

    /**
     * 私钥
     */
    private static RSAPrivateKey privateKey;

    /**
     * 公钥
     */
    private static RSAPublicKey publicKey;

    /**
     * 字节数据转字符串专用集合
     */
    private static final char[] HEX_CHAR = {'0', '1', '2', '3', '4', '5', '6',
            '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * 获取私钥
     *
     * @return 当前的私钥对象
     */
    public RSAPrivateKey getPrivateKey() {
        return privateKey;
    }

    /**
     * 获取公钥
     *
     * @return 当前的公钥对象
     */
    public RSAPublicKey getPublicKey() {
        return publicKey;
    }

    /**
     * 随机生成密钥对
     */
    public void genKeyPair() {
        KeyPairGenerator keyPairGen = null;
        try {
            keyPairGen = KeyPairGenerator.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        keyPairGen.initialize(1024, new SecureRandom());
        KeyPair keyPair = keyPairGen.generateKeyPair();
        this.privateKey = (RSAPrivateKey) keyPair.getPrivate();
        this.publicKey = (RSAPublicKey) keyPair.getPublic();
    }

    /**
     * 从文件中输入流中加载公钥
     *
     * @param in 公钥输入流
     * @throws Exception 加载公钥时产生的异常
     */
    public void loadPublicKey(InputStream in) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String readLine = null;
            StringBuilder sb = new StringBuilder();
            while ((readLine = br.readLine()) != null) {
                if (readLine.charAt(0) == '-') {
                    continue;
                } else {
                    sb.append(readLine);
                    sb.append('\r');
                }
            }
            loadPublicKey(sb.toString());
        } catch (IOException e) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException e) {
            throw new Exception("公钥输入流为空");
        }
    }

    /**
     * 从字符串中加载公钥
     *
     * @param publicKeyStr 公钥数据字符串
     * @throws Exception 加载公钥时产生的异常
     */
    public void loadPublicKey(String publicKeyStr) throws Exception {
        try {
            BASE64Decoder base64Decoder = new BASE64Decoder();
            byte[] buffer = base64Decoder.decodeBuffer(publicKeyStr);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
            this.publicKey = (RSAPublicKey) keyFactory.generatePublic(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException e) {
            throw new Exception("公钥非法");
        } catch (IOException e) {
            throw new Exception("公钥数据内容读取错误");
        } catch (NullPointerException e) {
            throw new Exception("公钥数据为空");
        }
    }

    /**
     * 从文件中加载私钥
     *
     * @return 是否成功
     * @throws Exception
     */
    public void loadPrivateKey(InputStream in) throws Exception {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String readLine = null;
            StringBuilder sb = new StringBuilder();
            while ((readLine = br.readLine()) != null) {
                if (readLine.charAt(0) == '-') {
                    continue;
                } else {
                    sb.append(readLine);
                    sb.append('\r');
                }
            }
            loadPrivateKey(sb.toString());
        } catch (IOException e) {
            throw new Exception("私钥数据读取错误");
        } catch (NullPointerException e) {
            throw new Exception("私钥输入流为空");
        }
    }

    public void loadPrivateKey(String privateKeyStr) throws Exception {
        try {
            BASE64Decoder base64Decoder = new BASE64Decoder();
            byte[] buffer = base64Decoder.decodeBuffer(privateKeyStr);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            this.privateKey = (RSAPrivateKey) keyFactory
                    .generatePrivate(keySpec);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此算法");
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
            throw new Exception("私钥非法");
        } catch (IOException e) {
            throw new Exception("私钥数据内容读取错误");
        } catch (NullPointerException e) {
            throw new Exception("私钥数据为空");
        }
    }

    /**
     * 加密过程
     *
     * @param publicKeyStr  公钥
     * @param plainTextData 明文数据
     * @return
     * @throws Exception 加密过程中的异常信息
     */
    public static String encrypt(String publicKeyStr, String plainTextData)
            throws Exception {
        /*if (publicKey == null) {
			throw new Exception("加密公钥为空, 请设置");
		}*/
        Cipher cipher = null;
        try {
            BASE64Decoder base64Decoder = new BASE64Decoder();
            byte[] buffer = base64Decoder.decodeBuffer(publicKeyStr);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
            publicKey = (RSAPublicKey) keyFactory.generatePublic(keySpec);

            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");// , new BouncyCastleProvider());
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] output = cipher.doFinal(plainTextData.getBytes());
            String str = b64encode(output);
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此加密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("加密公钥非法,请检查");
        } catch (IllegalBlockSizeException e) {
            throw new Exception("明文长度非法");
        } catch (BadPaddingException e) {
            throw new Exception("明文数据已损坏");
        }
    }

    /**
     * 解密过程
     *
     * @param privateKeyStr 私钥
     * @param cipherData    密文数据
     * @return 明文
     * @throws Exception 解密过程中的异常信息
     */
    public static String decrypt(String privateKeyStr, String cipherData)
            throws Exception {
		/*if (privateKey == null) {
			throw new Exception("解密私钥为空, 请设置");
		}*/
        Cipher cipher = null;
        try {
            BASE64Decoder base64Decoder = new BASE64Decoder();
            byte[] buffer = base64Decoder.decodeBuffer(privateKeyStr);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            privateKey = (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
            cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");// , new BouncyCastleProvider());
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] output = cipher.doFinal(b64decode(cipherData));
            String str = new String(output);
            return str;
        } catch (NoSuchAlgorithmException e) {
            throw new Exception("无此解密算法");
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            throw new Exception("解密私钥非法,请检查");
        }
    }

    /**
     * 字节数据转十六进制字符串
     *
     * @param data 输入数据
     * @return 十六进制内容
     */
    public static String byteArrayToString(byte[] data) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            // 取出字节的高四位 作为索引得到相应的十六进制标识符 注意无符号右移
            stringBuilder.append(HEX_CHAR[(data[i] & 0xf0) >>> 4]);
            // 取出字节的低四位 作为索引得到相应的十六进制标识符
            stringBuilder.append(HEX_CHAR[(data[i] & 0x0f)]);
            if (i < data.length - 1) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }


    /**
     * base64解码
     *
     * @param data
     * @return
     */
    public static byte[] b64decode(String data) {
        try {
            return new BASE64Decoder().decodeBuffer(data);
        } catch (Exception ex) {
        }
        return null;
    }


    /**
     * base64编码
     *
     * @param data
     * @return
     */
    public static String b64encode(byte[] data) {
        try {
            return (new BASE64Encoder()).encode(data);
        } catch (Exception ex) {
        }
        return null;
    }


    public static void main(String[] args) {

        // 测试字符串
        String encryptStr = "18463136076";
        try {
            //加密
            //String s = RSAEncrypt.encrypt(PropertiesUtils.pubkey, encryptStr);
            String s = RSAEncrypt.encrypt(DEFAULT_PUBLIC_KEY, encryptStr);
            //解密
            //String ss = RSAEncrypt.decrypt(PropertiesUtils.prikey, s);
            //String ss = RSAEncrypt.decrypt(DEFAULT_PRIVATE_KEY, "");
            System.out.println(s);
            //System.out.println(ss);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
