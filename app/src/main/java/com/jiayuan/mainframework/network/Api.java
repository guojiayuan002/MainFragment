package com.jiayuan.mainframework.network;


import com.jiayuan.mainframework.bean.BannerBean;
import com.jiayuan.mainframework.bean.LoginBean;
import com.jiayuan.mainframework.bean.PersonInfo;
import com.jiayuan.mainframework.bean.RegistBean;
import com.jiayuan.mainframework.bean.ResponseInfo;
import com.jiayuan.mainframework.bean.ValidationBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2017/5/31.
 */

public interface Api {

    //1.获取4位验证码
    @FormUrlEncoded
    @POST("appApi/v1.0/common/sendPhoneCode")
    Call<ValidationBean> getValidation(@Field("mobilePhone") String mobilePhone);

    //2.会员注册
    @FormUrlEncoded
    @POST("appApi/v1.0/member/register")
    Call<RegistBean> regist(@Field("memberName") String memberName, @Field("pwd") String pwd, @Field("phoneVerifyCode") String phoneVerifyCode);

    //3.会员登录
    @FormUrlEncoded
    @POST("appApi/v1.0/member/login")
    Call<LoginBean> login(@Field("memberName") String memberName, @Field("pwd") String pwd);
    //4.找回密码

    @FormUrlEncoded
    @POST("appApi/v1.0/member/changePwd")
    Call<ResponseInfo> changePwd(@Field("mobilePhone") String mobilePhone,
                                 @Field("phoneVerifyCode") String phoneVerifyCode,
                                 @Field("newPwd") String newPwd);

    //3.5.首页轮播图
    @GET("appApi/v1.0/commodity/banner")
    Call<BannerBean> getBanner();
//
//    //3.6.首页商品查询（水平和垂直都是这个接口） 参数可选，（currentPage，pageSize，recommendType）String类型
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/query")
//    Call<HostGodsBean> godsQuery(@Field("currentPage") String currentPage,
//                                 @Field("pageSize") String pageSize,
//                                 @Field("recommendType") String recommendType,
//                                 @Field("sellerId") String sellerId,
//                                 @Field("searchKey") String searchKey,
//                                 @Field("sortIndex") String sortIndex);//排序指数
//
//    //3.7.公告消息查询（字体上下轮播） 参数可选，（currentPage，pageSize）String类型
//    @FormUrlEncoded
//    @POST("appApi/v1.0/message/notice/query")
//    Call<NoticeBean> noticeQuery(@Field("currentPage") String currentPage, @Field("pageSize") String pageSize);
//
//
//    // 3.8. 查询用户收货地址
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/queryAddress")
//    Call<QueryGodsAddress> queryGodsAddress(@Field("memberId") String memberId);
//
//    //3.9.新增收货地址
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/addAddress")
//    Call<AddGodsAddress> addGodsAddress(@Field("memberId") String memberId,//会员ID
//                                        @Field("receiverName") String receiverName,//收货人姓名
//                                        @Field("area") String area,//地区 广东深圳
//                                        @Field("addressDetail") String addressDetail,//详细地址
//                                        @Field("receiverMobilePhone") String receiverMobilePhone);//收货人手机号
//
//    //                                        @Field("tel") String tel,//固话  -----一下不是必填
////                                        @Field("email") String email,//邮箱
////                                        @Field("zipCode") String zipCode,//邮编
////                                        @Field("isDefault") String isDefault);//是否默认地址
//    //4.0.修改收货地址
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/modifyAddress")
//    //用可变参数传参
//    Call<UpdateGodsAddressBean> updateGodsAddress(@Field("addressId") String addressId,//收货地址ID
//                                                  @Field("receiverName") String receiverName, //收货人姓名
//                                                  @Field("area") String area,//地区 广东深圳
//                                                  @Field("addressDetail") String addressDetail,//详细地址
//                                                  @Field("receiverMobilePhone") String receiverMobilePhone);//收货人手机号
////                                                  @Field("tel") String tel,//固话  -----一下不是必填
////                                                  @Field("email") String email,//邮箱
////                                                  @Field("zipCode") String zipCode,//邮编
////                                                  @Field("isDefault") String isDefault);//是否默认地址
//
//    //4.1 删除收货地址
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/delAddress")
//    Call<DeleteAddressBean> deleteAddress(@Field("addressId") String addressId);
//
//
//    //    4.2.设置默认收货地址
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/setDefaultAddress")
//    Call<DefaultAddressBean> setDefaultAddress(@Field("addressId") String addressId);
//
//    //  4.3  修改会员名称
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/modifyName")
//    Call<ReNmeBean> reName(@Field("memberId") String memberId,//会员ID
//                           @Field("memberName") String memberName);//会员名称
//
//    //    @Multipart
////    @POST("/appApi/v1.0/member/changeHeadImg")
////    Call<HeadIcon> updateAvatar (@Query("memberId") String memberId,//会员名
////                                 @Part("uploadFile\"; filename=\"test.jpg\"") RequestBody imgs );
//
//    //4.4 修改会员地区
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/modifyArea")
//    Call<UpdateArea> updataArea(@Field("memberId") String memberId,//会员ID
//                                @Field("area") String area);//会员地区
//
//    //4.5 会员推荐下载 （网页专用）不用做
//    @GET("appApi/v1.0/member/recommend")
//    Call<UpdateArea> recommendCode(@Field("memberPhone") String memberPhone);//会员电话
//
//
//    //4.6 TODO Multipart 特殊   修改会员图像
//    @Multipart
//    @POST("appApi/v1.0/member/changeHeadImg")
//    Call<String> uploadImage(@Part("memberId") String memberId,//会员id
//                             @Part MultipartBody.Part file);//连接不上服务器
////    @Part("\"file\"; filename=\"image.jpg\"")RequestBody imgs);//
//
////    @Multipart
////    @POST("appApi/v1.0/member/changeHeadImg")
////    Call<HeadIcon> uploadImage(@Part("memberId") String memberId,//会员名
////                               @Part("uploadFile") TypeF imgs);
//
//    //TODO   4.7 积分管理首页
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/integralView")
//    Call<IntegralManageHost> integralManageHost(@Field("memberId") String memberId);
//
////    @FormUrlEncoded
////    @POST("appApi/v1.0/member/queryAddress")
////    Call<QueryGodsAddress> queryGodsAddress(@Field("memberId") String memberId);
//
//    //TODO  4.8 账户资金明细
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/accountDetail")
//    Call<AccountDetail> queryAccountDetail(@Field("memberId") String memberId,
//                                           @Field("currentPage") String currentPage,
//                                           @Field("pageSize") String pageSize,
//                                           @Field("startTime") String startTime,
//                                           @Field("endTime") String endTime);
//
//    //    4.9 积分明细  红白积分一样   TODO 注意 可变参数不行
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/integralDetail")
////@Field("memberId") String... memberId);
//    Call<IntegralDetail> queryIntegralDetail(@Field("memberId") String memberId,
//                                             @Field("integralType") String integralType,//积分类型
//                                             @Field("currentPage") String currentPage,
//                                             @Field("pageSize") String pageSize,
//                                             @Field("startTime") String startTime,
//                                             @Field("endTime") String endTime);
//
//    //5.0 TODO    认证图片（个人、公司）上传
//    @Multipart
//    @POST("appApi/v1.0/common/fileUpload")
//    Call<AuthPictureBean> authPicture(@Part("memberId") String memberId,//会员名
//                                      @Part("use") String use,//图片用途
//                                      @Part("type") String type,//图片类别,正反面
////                                      @Part MultipartBody.Part file);
//                                      @Part MultipartBody.Part file);
//
//    //    @Part("\"file\"; filename=\"image.png\"") RequestBody imgs);
//    //5.1 会员个人认证
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/authenticate/personal")
//    Call<ResponseInfo> personAuth(@Field("memberId") String memberId,
//                                  @Field("realName") String realName,//真实姓名
//                                  @Field("idCardNo") String idCardNo);//身份证号
//
//    //5.2  企业认证
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/authenticate/enterprise")
//    Call<ResponseInfo> companyAuth(@Field("memberId") String memberId,
//                                   @Field("companyName") String companyName,//公司名
//                                   @Field("licenceNo") String licenceNo,//营业执照号
//                                   @Field("corporateRep") String corporateRep,//法人代表
//                                   @Field("scopeOfBusiness") String scopeOfBusiness);//经营范围
//
//    //5.3 会员等级列表
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/getMemberLevelList")
//    Call<MemberLevel> getMemberLevel(@Field("memberId") String memberId);
//
    //5.4 个人基本信息
    @FormUrlEncoded
    @POST("appApi/v1.0/member/personBaseInfo")
    Call<PersonInfo> getPersonInfo(@Field("memberId") String memberId);
//
//    //5.5 账户支付
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/accountPay")
//    Call<ResponseInfoObject> accountPay(@Field("memberId") String memberId,
//                                        @Field("safePwd") String safePwd,//安全密码
//                                        @Field("paySum") String paySum,//支付金额
//                                        @Field("payCause") String payCause,//支付缘由
//                                        @Field("attachParams") String attachParams);//其他参数
//
//    //5.6 获取所有银行
//    @GET("appApi/v1.0/member/bank/listAllBank")
//    Call<AllBank> getAllBank();
//
//    //5.7 查询我的银行卡
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/bank/getMyBanks")
//    Call<MyBankCard> getMyBanks(@Field("memberId") String memberId);
//
//    //5.8  绑定银行卡
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/bank/addBank")
//    Call<ResponseInfoObject> bindBankCard(@Field("memberId") String memberId,
//                                          @Field("realName") String realName,//持卡人
//                                          @Field("bankId") String bankId,//银行ID
//                                          @Field("subBankName") String subBankName,//分行名称
//                                          @Field("bankArea") String bankArea,//开户地区
//                                          @Field("bankNo") String bankNo);//银行卡号
//
//    //5.9 删除银行卡
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/bank/delBank")
//    Call<ResponseInfoObject> deletebankCard(@Field("id") String id);//银行卡唯一标识ID
//
//    // 6.0 设置安全密码
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/setSafePwd")
//    Call<ResponseInfoObject> setSafePwd(@Field("memberId") String memberId,
//                                        @Field("safePwd") String safePwd);//安全密码，加密
//
//    //6.1 修改安全密码
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/modifySafePwd")
//    Call<ResponseInfoObject> modifySafePwd(@Field("memberId") String memberId,
//                                           @Field("oldSafePwd") String oldSafePwd,//加密
//                                           @Field("newSafePwd") String newSafePwd);//安全密码，加密
//
//    //6.2 修改登陆密码
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/modifyLoginPwd")
//    Call<ResponseInfoObject> modifyLoginPwd(@Field("memberId") String memberId,
//                                            @Field("oldLoginPwd") String oldLoginPwd,//加密
//                                            @Field("newLoginPwd") String newLoginPwd);//安全密码，加密
//
//    //6.3 获取个人站内信
//    @FormUrlEncoded
//    @POST("appApi/v1.0/message/getPrivateMsg")
//    Call<getPrivateMsgBean> getPrivateMsg(@Field("memberId") String memberId,
//                                          @Field("readState") String readState,//阅读状态
//                                          @Field("currentPage") String currentPage,//页码
//                                          @Field("pageSize") String pageSize);//每条页数
//
//    //6.4 阅读个人站内信
//    @FormUrlEncoded
//    @POST("appApi/v1.0/message/readPrivateMsg")
//    Call<ResponseInfoObject> readPrivateMsg(@Field("id") String id);//银行卡唯一标识ID
//
//    //    6.5 购物车列表
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/cart")
//    Call<ShoppingCartBean> getShoppingCart(@Field("memberId") String memberId,
//                                           @Field("currentPage") String currentPage,
//                                           @Field("pageSize") String pageSize);
//
//    //6.6 添加购物车
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/addShopCart")
//    Call<ResponseInfoObject> addGodsToCart(@Field("memberId") String memberId,
//                                           @Field("commodityId") String commodityId,//商品ID
//                                           @Field("inventoryId") String inventoryId,//库存ID
//                                           @Field("shopId") String shopId,//店铺ID
//                                           @Field("commodityCount") String commodityCount);//商品数量
//
//    //6.7 删除购物车
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/removeShopCart")
//    Call<ResponseInfoObject> removeGodsFromCar(@Field("shopCartId") String shopCartId);//购物车记录ID
//
//    //6.8 预支付记录
//    //TODO  bean对象有点特殊，第三房支付需要回传
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/createPayRecord")
//    Call<PrepaymentRecordBean> prepaymentRecord(@Field("memberId") String memberId,
//                                                @Field("paySum") String paySum,//支付金额
//                                                @Field("payWay") String payWay,//支付方式，1-支付宝;2-微信;3-现金账户;4-银行卡
//                                                @Field("payCause") String payCause,//支付缘由，3-商城购物; 4-会员升级;5-账户充值
//                                                @Field("remark") String remark);//备注
//
//    //6.9 账户充值记录
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/rechargeRecords")
//    Call<RechargeRecordBean> rechargeRecords(@Field("memberId") String memberId,
//                                             @Field("payWay") String payWay,//支付方式，1-支付宝;2-微信;3-现金账户;4-银行卡
//                                             @Field("payState") String payState,//支付状态，“成功” 或 “失败”
//                                             @Field("currentPage") String currentPage,//当前页
//                                             @Field("pageSize") String pageSize);//每页大小
//
//    //7.0 账户提现
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/withdrawApply")
//    Call<ResponseInfoList> AccountwithDrawal(@Field("memberId") String memberId,
//                                             @Field("bankBindId") String bankBindId,//银行卡标识
//                                             @Field("withdrawSum") String withdrawSum,//提现金额
//                                             @Field("safePwd") String safePwd);//安全密码
//
//    //7.1 商品详情
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/detail")
//    Call<GodsDetailBean> getGodsDetail(@Field("commodityId") String commodityId,
//                                       @Field("memberId") String memberId);//会员ID
//
//    //7.2 收益统计概览
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/gainsSummary")
//    Call<IncomeStatusBean> incomeStatistics(@Field("memberId") String memberId);//会员ID
//
//    //7.3 收益详情查询
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/gainsList")
//    Call<IncomeDetailBean> incomeDetails(@Field("memberId") String memberId,//会员ID
//                                         @Field("currentPage") String currentPage,//当前页
//                                         @Field("pageSize") String pageSize);//每页多少
//
//    //7.4 红积分兑换
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/redIntegralExchange")
//    Call<ResponseInfoObject> redIntegralExchange(@Field("memberId") String memberId,
//                                                 @Field("safePwd") String safePwd,//安全密码，RSA加密
//                                                 @Field("redIntegralSum") String redIntegralSum);//商品ID
//
//    //7.5 添加商品收藏
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/addFavorite")
//    Call<ResponseInfoObject> addFavorite(@Field("memberId") String memberId,
//                                         @Field("commodityId") String commodityId);//商品ID
//
//    //7.6 商品收藏夹列表
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/commodityFavorites")
//    Call<GodsCollectionBean> godsCollectionList(@Field("memberId") String memberId,//会员ID
//                                                @Field("currentPage") String currentPage,//当前页
//                                                @Field("pageSize") String pageSize);//每页多少
//
//    //7.7 取消商品收藏
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/cancelFavorite")
//    Call<ResponseInfoObject> cancelCollect(@Field("memberId") String memberId,
//                                           @Field("commodityIds") String commodityIds);//收藏夹ID取消多个id拼接一起，以|隔开，需要转译？
//
//    //7.8 商品浏览记录列表
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/browseRecords")
//    Call<BrowseRecordsBean> browseRecords(@Field("memberId") String memberId,//会员ID
//                                          @Field("currentPage") String currentPage,//当前页
//                                          @Field("pageSize") String pageSize);//每页多少
//
//    //7.9 删除浏览记录
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/delBrowseRecords")
//    Call<ResponseInfoObject> delBrowseRecords(@Field("browseIds") String browseIds);//会员ID
//
//    //8.0 商家详情,商家信息，店铺详情
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/getSellerInfo")
//    Call<BusinessDetailBean> getSellerInfo(@Field("memberId") String memberId,//商家会员ID
//                                           @Field("shopId") String shopId);//店铺ID
//
//    //8.1 我的推荐
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/queryMyReferees")
//    Call<MyRecommendBean> myRecommend(@Field("memberId") String memberId,//会员ID
//                                      @Field("currentPage") String currentPage,//当前页
//                                      @Field("pageSize") String pageSize);//每页多少
//
//    //8.2 附近商家
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/queryNearbyShops")
//    Call<NearbyShopBean> queryNearbyShops(@Field("coordinate") String coordinate);//经纬度
//
//    //8.3 获取订单收货地址
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/getOneAddress")
//    Call<OneAddressBean> getOneAddress(@Field("memberId") String memberId);
//
//    //8.4 购物车结算
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/balanceCart")
//    Call<SettlementBean> balanceCart(@Field("memberId") String memberId,//会员ID
//                                     @Field("shopCartId") String shopCartId,//购物车ID
//                                     @Field("addressId") String addressId);//收货地址ID
//
//    //8.5 查询个人认证信息
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/queryPersonalAuth")
//    Call<QueryPersonAuth> queryPersonalAuth(@Field("memberId") String memberId);
//
//    //8.6 查询企业认证信息
//    @FormUrlEncoded
//    @POST("appApi/v1.0/member/queryEnterpriseAuth")
//    Call<QueryCompanyAuth> queryCompanyAuth(@Field("memberId") String memberId);
//
//    //8.7 提现记录
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/queryWithdrawRecord")
//    Call<WithDrawRecordBean> queryWithdrawRecord(@Field("memberId") String memberId,//会员ID
//                                                 @Field("state") String state,//审核状态
//                                                 @Field("currentPage") String currentPage,
//                                                 @Field("pageSize") String pageSize);//收货地址ID
//
//    //8.8  订单提交
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/submitOrder")
//    Call<SubmitOrderBean> submitOrder(@Field("memberId") String memberId,//会员ID
//                                      @Field("shopCartId") String shopCartId,//店铺ID
//                                      @Field("addressId") String addressId,//收货地址ID
//                                      @Field("isReceipt") String isReceipt,//是否需要发票
//                                      @Field("receiptType") String receiptType,//发票类型
//                                      @Field("receiptHeader") String receiptHeader,//发票抬头
//                                      @Field("receiptContent") String receiptContent,//发票内容
//                                      @Field("receiptMobilePhone") String receiptMobilePhone,//电子发票手机号
//                                      @Field("unitName") String unitName,//发票单位名称
//                                      @Field("taxCode") String taxCode,//纳税人识别码
//                                      @Field("resAddress") String resAddress,//注册地址
//                                      @Field("resTel") String resTel,//注册电话
//                                      @Field("bankName") String bankName);//开户银行
//
//    //    8.9 订单列表
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/queryOrderList")
//    Call<OrderListBean> queryOrderList(@Field("memberId") String memberId,//会员ID
//                                       @Field("orderState") String orderState,//订单状态
//                                       @Field("currentPage") String currentPage,//当前页数
//                                       @Field("pageSize") String pageSize);//每页大小
//
//    //    9.0 订单详情
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/orderDetail")
//    Call<OrderDedailBean> orderDetail(@Field("memberId") String memberId,//会员ID
//                                      @Field("orderNo") String orderNo);//订单流水号
//
//    //    9.1 编辑购物车数量
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/editShopCart")
//    Call<ResponseInfoObject> editShopCart(@Field("editInfo") String editInfo);//例如：购物车ID1:购物车数量1 112:3|113:4
//
//    //9.2 数量统计接口
//    @FormUrlEncoded
//    @POST("appApi/v1.0/common/statistics")
//    Call<NumberStatisticsBean> numberStatistics(@Field("memberId") String memberId);
//
//    //    9.3 确认收货
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/confirmReceipt")
//    Call<ResponseInfoObject> confirmReceipt(@Field("memberId") String memberId,//会员ID
//                                            @Field("orderNo") String orderNo,//订单号
//                                            @Field("safePwd") String safePwd);//安全密码，RSA加密
//
//    //    9.4 取消订单
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/cancelOrder")
//    Call<ResponseInfoObject> cancelOrder(@Field("memberId") String memberId,//会员ID
//                                         @Field("orderNo") String orderNo);//订单号
//
//    //    9.5 删除订单
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/deleteOrder")
//    Call<ResponseInfoObject> deleteOrder(@Field("memberId") String memberId,//会员ID
//                                         @Field("orderNo") String orderNo);//订单号
//
//    //    9.6 子订单付款
//    @FormUrlEncoded
//    @POST("appApi/v1.0/pay/payForSubOrder")
//    Call<ResponseInfoObject> payForSubOrder(@Field("orderNo") String orderNo);//订单号
//
//    //9.7 订单商品评价上传图像,ohHttpUtils上传
//
//    //9.8 订单商品评价
//    @FormUrlEncoded
//    @POST("appApi/v1.0/order/evaluateOrder")
//    Call<ResponseInfoObject> commitOrderEvaluate(@Field("orderNo") String orderNo,//订单ID
//                                                 @Field("commodityId") String commodityId,//商品ID
//                                                 @Field("commodityScore") String commodityScore,//商品打分
//                                                 @Field("commodityImpress") String commodityImpress,//商品印象
//                                                 @Field("commodityEvaluate") String commodityEvaluate,//商品评价
//                                                 @Field("commodityDescription") String commodityDescription,//商品描述相符程度
//                                                 @Field("sellerScore") String sellerScore,//商家服务
//                                                 @Field("logisticsScore") String logisticsScore,//物流质量
//                                                 @Field("anonymous") String anonymous,//是否匿名Y/N
//                                                 @Field("evaluateImg") String evaluateImg);//评价图片
//
//    //9.9 获取商品评价信息
//    @FormUrlEncoded
//    @POST("appApi/v1.0/commodity/getEvaluate")
//    Call<GodsEvaluateBean> getEvaluate(@Field("commodityId") String commodityId,//订单ID
//                                       @Field("currentPage") String currentPage,//当前页数
//                                       @Field("pageSize") String pageSize);//每页大小

}

