package com.cdhy.test;

import org.junit.Assert;
import org.junit.Test;

import com.cdhy.api.IConstant;
import com.cdhy.util.HttpUtil;

import net.sf.json.JSONObject;

public class ApiTest {

//    @Test
//    public void testGetToken() {
//	JSONObject proxyParm = new JSONObject();
//	proxyParm.put("openid", "ceTSp96pAzxwTlmxy4c84CrooflGZsK3wHUOjMG2NzfX3SzWpvT1480038819783");
//	proxyParm.put("app_secret", "a8sm8zfFw9Wi9N392IOKCYISGRkaQMR5SlWSVRpasSfQShAA2G81499333176474");
//	JSONObject result = HttpUtil.doPostJSON2(IConstant.API_TOKEN_URL, proxyParm);
//	System.out.println(result);
//	Assert.assertNotNull(result);
//	Assert.assertEquals("SUCCESS", result.getString("result"));
//    }

    @Test
    public void testGetPdfUrl() {
		JSONObject proxyParm = new JSONObject();
		proxyParm.put("access_token", "mqCVqAJdBjB5KDVNxvqH0ldwAkcYe1ceZpY3Pzew2jZAZ9C2jxw1504252800051");
		proxyParm.put("serviceKey", "ep_pdf_getPdfUrl");
		JSONObject data = new JSONObject();
		data.put("fileKey", "pdf_BMKbQ2n1478500628215");
		proxyParm.put("data", data);
		System.out.println(proxyParm);
		JSONObject result = HttpUtil.doPostJSON2(IConstant.API_BUSS_URL, proxyParm);
		System.out.println(result);
		Assert.assertNotNull(result);
		Assert.assertEquals("SUCCESS", result.getString("result"));
    }
}
