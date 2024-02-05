package com.close.hook.ads.util

import com.close.hook.ads.data.dao.UrlDao
import com.close.hook.ads.data.model.Url
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object DataUtil {

    fun setData(urlDao: UrlDao) {
        CoroutineScope(Dispatchers.IO).launch {
            urlDao.apply {
                insert(Url("url", "https://example.com/123"))
                insert(Url("host", "1010pic.com"))
                insert(Url("host", "8le8le.com"))
                insert(Url("host", "a0.app.xiaomi.com"))
                insert(Url("host", "aaid.umeng.com"))
                insert(Url("host", "ad-scope.com"))
                insert(Url("host", "ad-scope.com.cn"))
                insert(Url("host", "ad-sdk.huxiu.com"))
                insert(Url("host", "ad.12306.cn"))
                insert(Url("host", "ad.51wnl.com"))
                insert(Url("host", "ad.bwton.com"))
                insert(Url("host", "ad.cyapi.cn"))
                insert(Url("host", "ad.flurry.com"))
                insert(Url("host", "ad.partner.gifshow.com"))
                insert(Url("host", "ad.qingting.fm"))
                insert(Url("host", "ad.qq.com"))
                insert(Url("host", "ad.tencentmusic.com"))
                insert(Url("host", "ad.toutiao.com"))
                insert(Url("host", "ad.winrar.com.cn"))
                insert(Url("host", "ad.xelements.cn"))
                insert(Url("host", "ad.xiaomi.com"))
                insert(Url("host", "ad.ximalaya.com"))
                insert(Url("host", "ad.zijieapi.com"))
                insert(Url("host", "adapi.izuiyou.com"))
                insert(Url("host", "adapi.yynetwk.com"))
                insert(Url("host", "adashbc.ut.taobao.com"))
                insert(Url("host", "adc.hpplay.cn"))
                insert(Url("host", "adcdn.hpplay.cn"))
                insert(Url("host", "adcdn.tencentmusic.com"))
                insert(Url("host", "adclick.tencentmusic.com"))
                insert(Url("host", "adcolony.com"))
                insert(Url("host", "adeng.hpplay.cn"))
                insert(Url("host", "adexpo.tencentmusic.com"))
                insert(Url("host", "adfilter.imtt.qq.com"))
                insert(Url("host", "adjust.cn"))
                insert(Url("host", "adkwai.com"))
                insert(Url("host", "adlog.flurry.com"))
                insert(Url("host", "ads-api-o.api.leiniao.com"))
                insert(Url("host", "ads-api.tiktok.com"))
                insert(Url("host", "ads-api.twitter.com"))
                insert(Url("host", "ads-img-qc.xhscdn.com"))
                insert(Url("host", "ads-video-al.xhscdn.com"))
                insert(Url("host", "ads-video-qc.xhscdn.com"))
                insert(Url("host", "ads.95516.com"))
                insert(Url("host", "ads.flurry.com"))
                insert(Url("host", "ads.google.cn"))
                insert(Url("host", "ads.heytapmobi.com"))
                insert(Url("host", "ads.huan.tv"))
                insert(Url("host", "ads.icloseli.cn"))
                insert(Url("host", "ads.music.126.net"))
                insert(Url("host", "ads.oppomobile.com"))
                insert(Url("host", "ads.service.kugou.com"))
                insert(Url("host", "ads.service.kugou.com"))
                insert(Url("host", "adsense.google.cn"))
                insert(Url("host", "adservice.google.cn"))
                insert(Url("host", "adservice.google.com"))
                insert(Url("host", "adservice.sigmob.cn"))
                insert(Url("host", "adserviceretry.kugou.com"))
                insert(Url("host", "adsfile.bssdlbig.kugou.com"))
                insert(Url("host", "adsfile.bssdlbig.kugou.com"))
                insert(Url("host", "adsfilebssdlbig.ali.kugou.com"))
                insert(Url("host", "adsfileretry.service.kugou.com"))
                insert(Url("host", "adsfs-sdkconfig.heytapimage.com"))
                insert(Url("host", "adsfs.oppomobile.com"))
                insert(Url("host", "adsmind.gdtimg.com"))
                insert(Url("host", "adsmind.ugdtimg.com"))
                insert(Url("host", "adsp.xunlei.com"))
                insert(Url("host", "adstats.tencentmusic.com"))
                insert(Url("host", "adtago.s3.amazonaws.com"))
                insert(Url("host", "adtech.yahooinc.com"))
                insert(Url("host", "adtrack.quark.cn"))
                insert(Url("host", "adukwai.com"))
                insert(Url("host", "adv.sec.intl.miui.com"))
                insert(Url("host", "adv.sec.miui.com"))
                insert(Url("host", "advertiseonbing.azureedge.net"))
                insert(Url("host", "advertising-api-eu.amazon.com"))
                insert(Url("host", "advertising.apple.com"))
                insert(Url("host", "advertising.yahoo.com"))
                insert(Url("host", "advertising.yandex.ru"))
                insert(Url("host", "advice-ads.s3.amazonaws.com"))
                insert(Url("host", "adview.cn"))
                insert(Url("host", "adx-cn.anythinktech.com"))
                insert(Url("host", "adx-drcn.op.dbankcloud.cn"))
                insert(Url("host", "adx.ads.heytapmobi.com"))
                insert(Url("host", "adx.ads.oppomobile.com"))
                insert(Url("host", "adxlog-adnet.vivo.com.cn"))
                insert(Url("host", "adxlog-adnet.vivo.com.cn.dsa.dnsv1.com.cn"))
                insert(Url("host", "afs.googlesyndication.com"))
                insert(Url("host", "ali-ad.a.yximgs.com"))
                insert(Url("host", "amdcopen.m.taobao.com"))
                insert(Url("host", "an.facebook.com"))
                insert(Url("host", "analysis.yozocloud.cn"))
                insert(Url("host", "analytics-api.samsunghealthcn.com"))
                insert(Url("host", "analytics.126.net"))
                insert(Url("host", "analytics.95516.com"))
                insert(Url("host", "analytics.google.com"))
                insert(Url("host", "analytics.pinterest.com"))
                insert(Url("host", "analytics.rayjump.com"))
                insert(Url("host", "analytics.tiktok.com"))
                insert(Url("host", "analytics.woozooo.com"))
                insert(Url("host", "analyze.lemurbrowser.com"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao.com"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao.com3"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao1.com"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao2.com"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao3.com"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao4.com"))
                insert(Url("host", "api-access.pangolin-sdk-toutiao5.com"))
                insert(Url("host", "api-ad-product.huxiu.com"))
                insert(Url("host", "api-adservices.apple.com"))
                insert(Url("host", "api-htp.beizi.biz"))
                insert(Url("host", "api.ad.xiaomi.com"))
                insert(Url("host", "api.htp.hubcloud.com.cn"))
                insert(Url("host", "api.hzsanjiaomao.com"))
                insert(Url("host", "api.installer.xiaomi.com"))
                insert(Url("host", "api.kingdata.ksyun.com"))
                insert(Url("host", "api.statsig.com"))
                insert(Url("host", "api5-normal-quic-lf.ixigua.com"))
                insert(Url("host", "apiyd.my91app.com"))
                insert(Url("host", "app-measurement.com"))
                insert(Url("host", "applog.lc.quark.cn"))
                insert(Url("host", "applog.uc.cn"))
                insert(Url("host", "ata-sdk-uuid-report.dreport.meituan.net"))
                insert(Url("host", "audid-api.taobao.com"))
                insert(Url("host", "audid.umeng.com"))
                insert(Url("host", "azr.footprintdns.com"))
                insert(Url("host", "b1-data.ads.heytapmobi.com"))
                insert(Url("host", "bdapi-ads.realmemobile.com"))
                insert(Url("host", "bdapi-in-ads.realmemobile.com"))
                insert(Url("host", "bdapi.ads.oppomobile.com"))
                insert(Url("host", "beacon-api.aliyuncs.com"))
                insert(Url("host", "beacon.qq.com"))
                insert(Url("host", "beacons.gvt2.com"))
                insert(Url("host", "beizi.biz"))
                insert(Url("host", "bingads.microsoft.com"))
                insert(Url("host", "books-analytics-events.apple.com"))
                insert(Url("host", "bugly.qq.com"))
                insert(Url("host", "business-api.tiktok.com"))
                insert(Url("host", "c.evidon.com"))
                insert(Url("host", "c.gj.qq.com"))
                insert(Url("host", "c.kuaiduizuoye.com"))
                insert(Url("host", "c.sayhi.360.cn"))
                insert(Url("host", "c2.gdt.qq.com"))
                insert(Url("host", "catalog.fjwhcbsh.com"))
                insert(Url("host", "ccs.umeng.com"))
                insert(Url("host", "cdn-ads.oss-cn-shanghai.aliyuncs.com"))
                insert(Url("host", "cdn.ad.xiaomi.com"))
                insert(Url("host", "cdn.ynuf.aliapp.org"))
                insert(Url("host", "cfg.imtt.qq.com"))
                insert(Url("host", "chat1.jd.com"))
                insert(Url("host", "chc.ads.huan.tv"))
                insert(Url("host", "ck.ads.oppomobile.com"))
                insert(Url("host", "clog.miguvideo.com"))
                insert(Url("host", "cm.bilibili.com"))
                insert(Url("host", "cn-acs.m.cainiao.com"))
                insert(Url("host", "cnzz.com"))
                insert(Url("host", "collect.kugou.com"))
                insert(Url("host", "contentcenter-drcn.dbankcdn.cn"))
                insert(Url("host", "crashlytics.com"))
                insert(Url("host", "crashlyticsreports-pa.googleapis.com"))
                insert(Url("host", "csjplatform.com"))
                insert(Url("host", "data.ads.oppomobile.com"))
                insert(Url("host", "data.mistat.india.xiaomi.com"))
                insert(Url("host", "data.mistat.rus.xiaomi.com"))
                insert(Url("host", "data.mistat.xiaomi.com"))
                insert(Url("host", "dataflow.biliapi.com"))
                insert(Url("host", "dc.sigmob.cn"))
                insert(Url("host", "diagnosis.ad.xiaomi.com"))
                insert(Url("host", "dig.bdurl.net"))
                insert(Url("host", "dl.zuimeitianqi.com"))
                insert(Url("host", "dlogs.bwton.com"))
                insert(Url("host", "dm.toutiao.com"))
                insert(Url("host", "doubleclick-cn.net"))
                insert(Url("host", "doubleclick.net"))
                insert(Url("host", "download.changhong.upgrade2.huan.tv"))
                insert(Url("host", "downloadxml.changhong.upgrade2.huan.tv"))
                insert(Url("host", "drcn-weather.cloud.huawei.com"))
                insert(Url("host", "dsp.fcbox.com"))
                insert(Url("host", "dualstack-logs.amap.com"))
                insert(Url("host", "dutils.com"))
                insert(Url("host", "dxp.baidu.com"))
                insert(Url("host", "e.ad.xiaomi.com"))
                insert(Url("host", "eclick.baidu.com"))
                insert(Url("host", "ef-dongfeng.tanx.com"))
                insert(Url("host", "entry.baidu.com"))
                insert(Url("host", "errlog.umeng.com"))
                insert(Url("host", "errnewlog.umeng.com"))
                insert(Url("host", "events-drcn.op.dbankcloud.cn"))
                insert(Url("host", "firebaselogging-pa.googleapis.com"))
                insert(Url("host", "flurry.com"))
                insert(Url("host", "g-staic.ganjingworld.com"))
                insert(Url("host", "g-staic.ganjingworld.com"))
                insert(Url("host", "g2.ganjing.world"))
                insert(Url("host", "game.loveota.com"))
                insert(Url("host", "gdfp.gifshow.com"))
                insert(Url("host", "gemini.yahoo.com"))
                insert(Url("host", "globalapi.ad.xiaomi.com"))
                insert(Url("host", "google-analytics.com"))
                insert(Url("host", "googleadservices-cn.com"))
                insert(Url("host", "googleadservices.com"))
                insert(Url("host", "googletagservices-cn.com"))
                insert(Url("host", "googletagservices.com"))
                insert(Url("host", "gromore.pangolin-sdk-toutiao.com"))
                insert(Url("host", "grs.dbankcloud.com"))
                insert(Url("host", "grs.hicloud.com"))
                insert(Url("host", "h-adashx.ut.taobao.com"))
                insert(Url("host", "h.trace.qq.com"))
                insert(Url("host", "h5hosting.dbankcdn.com"))
                insert(Url("host", "henzanapp.com"))
                insert(Url("host", "hexagon-analytics.com"))
                insert(Url("host", "hiboard-drcn.ai.dbankcloud.cn"))
                insert(Url("host", "hm.baidu.com"))
                insert(Url("host", "hmma.baidu.com"))
                insert(Url("host", "httpdns.bcelive.com"))
                insert(Url("host", "httpdns.huaweicloud.com"))
                insert(Url("host", "httpdns.ocloud.oppomobile.com"))
                insert(Url("host", "httpdns.push.oppomobile.com"))
                insert(Url("host", "hugelog.fcbox.com"))
                insert(Url("host", "hw-ot-ad.a.yximgs.com"))
                insert(Url("host", "hw.zuimeitianqi.com"))
                insert(Url("host", "hwpub-s01-drcn.cloud.dbankcloud.cn"))
                insert(Url("host", "hya.comp.360os.com"))
                insert(Url("host", "hye.comp.360os.com"))
                insert(Url("host", "hyt.comp.360os.com"))
                insert(Url("host", "i.snssdk.com"))
                insert(Url("host", "iad.apple.com"))
                insert(Url("host", "iadctest.qwapi.com"))
                insert(Url("host", "iadsdk.apple.com"))
                insert(Url("host", "iadworkbench.apple.com"))
                insert(Url("host", "ib.snssdk.com"))
                insert(Url("host", "ifs.tanx.com"))
                insert(Url("host", "image-ad.sm.cn"))
                insert(Url("host", "imageplus.baidu.com"))
                insert(Url("host", "images.pinduoduo.com"))
                insert(Url("host", "img-c.heytapimage.com"))
                insert(Url("host", "img.adnyg.com"))
                insert(Url("host", "img.adnyg.com.w.kunlungr.com"))
                insert(Url("host", "imtmp.net"))
                insert(Url("host", "irc.qubiankeji.com"))
                insert(Url("host", "is.snssdk.com"))
                insert(Url("host", "ixav-cse.avlyun.com"))
                insert(Url("host", "iyfbodn.com"))
                insert(Url("host", "janapi.jd.com"))
                insert(Url("host", "jfapi.chiq-cloud.com"))
                insert(Url("host", "jiguang.cn"))
                insert(Url("host", "jpush.cn"))
                insert(Url("host", "jpush.html5.qq.com"))
                insert(Url("host", "jpush.io"))
                insert(Url("host", "jswebcollects.kugou.com"))
                insert(Url("host", "ks.pull.yximgs.com"))
                insert(Url("host", "lf1-cdn-tos.bytegoofy.com"))
                insert(Url("host", "lf3-ad-union-sdk.pglstatp-toutiao.com"))
                insert(Url("host", "liveats-vod.video.ptqy.gitv.tv"))
                insert(Url("host", "lm10111.jtrincc.cn"))
                insert(Url("host", "log-api-mn.huxiu.com"))
                insert(Url("host", "log-api.huxiu.com"))
                insert(Url("host", "log-api.pangolin-sdk-toutiao-b.com"))
                insert(Url("host", "log-api.pangolin-sdk-toutiao.com"))
                insert(Url("host", "log-sdk.gifshow.com"))
                insert(Url("host", "log-upload-os.hoyoverse.com"))
                insert(Url("host", "log-upload.mihoyo.com"))
                insert(Url("host", "log.ad.xiaomi.com"))
                insert(Url("host", "log.aispeech.com"))
                insert(Url("host", "log.avlyun.com"))
                insert(Url("host", "log.avlyun.sec.intl.miui.com"))
                insert(Url("host", "log.byteoversea.com"))
                insert(Url("host", "log.fc.yahoo.com"))
                insert(Url("host", "log.kuwo.cn"))
                insert(Url("host", "log.stat.kugou.com"))
                insert(Url("host", "log.stat.kugou.com"))
                insert(Url("host", "log.tagtic.cn"))
                insert(Url("host", "log.tbs.qq.com"))
                insert(Url("host", "log.vcgame.cn"))
                insert(Url("host", "log.web.kugou.com"))
                insert(Url("host", "log.web.kugou.com"))
                insert(Url("host", "log1.cmpassport.com"))
                insert(Url("host", "logbak.hicloud.com"))
                insert(Url("host", "logs.amap.com"))
                insert(Url("host", "logservice.hicloud.com"))
                insert(Url("host", "logservice1.hicloud.com"))
                insert(Url("host", "logtj.kugou.com"))
                insert(Url("host", "logupdate.avlyun.sec.miui.com"))
                insert(Url("host", "m.kubiqq.com"))
                insert(Url("host", "m1.ad.10010.com"))
                insert(Url("host", "masdkv6.3g.qq.com"))
                insert(Url("host", "mdp-usertrace-cn.heytapmobi.com"))
                insert(Url("host", "metok.sys.miui.com"))
                insert(Url("host", "metrics.apple.com"))
                insert(Url("host", "metrics.data.hicloud.com"))
                insert(Url("host", "metrics.icloud.com"))
                insert(Url("host", "metrics.mzstatic.com"))
                insert(Url("host", "metrics2.data.hicloud.com"))
                insert(Url("host", "mi.gdt.qq.com"))
                insert(Url("host", "miav-cse.avlyun.com"))
                insert(Url("host", "miui-fxcse.avlyun.com"))
                insert(Url("host", "mnqlog.ldmnq.com"))
                insert(Url("host", "mobads-logs.baidu.com"))
                insert(Url("host", "mobads-pre-config.cdn.bcebos.com"))
                insert(Url("host", "mobads.baidu.com"))
                insert(Url("host", "mobilelog.upqzfile.com"))
                insert(Url("host", "mobileservice.cn"))
                insert(Url("host", "mon.zijieapi.com"))
                insert(Url("host", "monitor.music.qq.com"))
                insert(Url("host", "monitor.uu.qq.com"))
                insert(Url("host", "monsetting.toutiao.com"))
                insert(Url("host", "mtj.baidu.com"))
                insert(Url("host", "nmetrics.samsung.com"))
                insert(Url("host", "notes-analytics-events.apple.com"))
                insert(Url("host", "nsclick.baidu.com"))
                insert(Url("host", "o2o.api.xiaomi.com"))
                insert(Url("host", "oauth-login-drcn.platform.dbankcloud.com"))
                insert(Url("host", "offerwall.yandex.net"))
                insert(Url("host", "open.e.kuaishou.cn"))
                insert(Url("host", "open.e.kuaishou.com"))
                insert(Url("host", "open.kuaishouzt.com"))
                insert(Url("host", "open.kwaishouzt.com"))
                insert(Url("host", "open.kwaizt.com"))
                insert(Url("host", "optimus-ads.amap.com"))
                insert(Url("host", "oth.eve.mdt.qq.com"))
                insert(Url("host", "oth.str.mdt.qq.com"))
                insert(Url("host", "p.l.qq.com"))
                insert(Url("host", "p.s.360.cn"))
                insert(Url("host", "p1-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("host", "p1-lm.adkwai.com"))
                insert(Url("host", "p2-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("host", "p2-lm.adkwai.com"))
                insert(Url("host", "p3-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("host", "p3-lm.adkwai.com"))
                insert(Url("host", "p3-tt.byteimg.com"))
                insert(Url("host", "p4-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("host", "p5-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("host", "p6-be-pack-sign.pglstatp-toutiao.com"))
                insert(Url("host", "pagead2.googleadservices.com"))
                insert(Url("host", "pagead2.googlesyndication.com"))
                insert(Url("host", "pangolin-sdk-toutiao-b.com"))
                insert(Url("host", "pgdt.ugdtimg.com"))
                insert(Url("host", "pglstatp-toutiao.com"))
                insert(Url("host", "pig.pupuapi.com"))
                insert(Url("host", "policy.video.ptqy.gitv.tv"))
                insert(Url("host", "public.gdtimg.com"))
                insert(Url("host", "q.i.gdt.qq.com"))
                insert(Url("host", "qqdata.ab.qq.com"))
                insert(Url("host", "qwapi.apple.com"))
                insert(Url("host", "qzs.gdtimg.com"))
                insert(Url("host", "recommend-drcn.hms.dbankcloud.cn"))
                insert(Url("host", "res.hubcloud.com.cn"))
                insert(Url("host", "res1.hubcloud.com.cn"))
                insert(Url("host", "res2.hubcloud.com.cn"))
                insert(Url("host", "res3.hubcloud.com.cn"))
                insert(Url("host", "review.gdtimg.com"))
                insert(Url("host", "rms-drcn.platform.dbankcloud.cn"))
                insert(Url("host", "roi.soulapp.cn"))
                insert(Url("host", "rpt.gdt.qq.com"))
                insert(Url("host", "s1.qq.com"))
                insert(Url("host", "s2.qq.com"))
                insert(Url("host", "s3.qq.com"))
                insert(Url("host", "samsung-com.112.2o7.net"))
                insert(Url("host", "samsungads.com"))
                insert(Url("host", "scdown.qq.com"))
                insert(Url("host", "sdk-cache.video.ptqy.gitv.tv"))
                insert(Url("host", "sdk.beizi.biz"))
                insert(Url("host", "sdk.e.qq.com"))
                insert(Url("host", "sdkconf.avlyun.com"))
                insert(Url("host", "sdkconfig.ad.intl.xiaomi.com"))
                insert(Url("host", "sdkconfig.ad.xiaomi.com"))
                insert(Url("host", "sdkconfig.video.qq.com"))
                insert(Url("host", "sdkoptedge.chinanetcenter.com"))
                insert(Url("host", "sdktmp.hubcloud.com.cn"))
                insert(Url("host", "sdownload.stargame.com"))
                insert(Url("host", "search.ixigua.com"))
                insert(Url("host", "search3-search.ixigua.com"))
                insert(Url("host", "search5-search-hl.ixigua.com"))
                insert(Url("host", "search5-search.ixigua.com"))
                insert(Url("host", "sensors-log.dongqiudi.com"))
                insert(Url("host", "service.changhong.upgrade2.huan.tv"))
                insert(Url("host", "service.vmos.cn/vmospro/api/ad"))
                insert(Url("host", "sf16-static.i18n-pglstatp.com"))
                insert(Url("host", "skdisplay.jd.com"))
                insert(Url("host", "slb-p2p.vcloud.ks-live.com"))
                insert(Url("host", "smartad.10010.com"))
                insert(Url("host", "smetrics.samsung.com"))
                insert(Url("host", "sms.ads.oppomobile.com"))
                insert(Url("host", "sngmta.qq.com"))
                insert(Url("host", "stat.y.qq.com"))
                insert(Url("host", "static.ads-twitter.com"))
                insert(Url("host", "staticsns.cdn.bcebos.com"))
                insert(Url("host", "stats.qiumibao.com"))
                insert(Url("host", "statsigapi.net"))
                insert(Url("host", "stg-data.ads.heytapmobi.com"))
                insert(Url("host", "storage.moegirl.org.cn"))
                insert(Url("host", "success.ctobsnssdk.com"))
                insert(Url("host", "syh-imp.cdnjtzy.com"))
                insert(Url("host", "t-dsp.pinduoduo.com"))
                insert(Url("host", "t.l.qq.com"))
                insert(Url("host", "t.track.ad.xiaomi.com"))
                insert(Url("host", "t1.a.market.xiaomi.com"))
                insert(Url("host", "t2.a.market.xiaomi.com"))
                insert(Url("host", "t3.a.market.xiaomi.com"))
                insert(Url("host", "tangram.e.qq.com"))
                insert(Url("host", "tdc.qq.com"))
                insert(Url("host", "tdid.m.qq.com"))
                insert(Url("host", "terms-drcn.platform.dbankcloud.cn"))
                insert(Url("host", "test.ad.xiaomi.com"))
                insert(Url("host", "test.e.ad.xiaomi.com"))
                insert(Url("host", "tj.b.qq.com"))
                insert(Url("host", "tj.video.qq.com"))
                insert(Url("host", "tmead.y.qq.com"))
                insert(Url("host", "tmfsdk.m.qq.com"))
                insert(Url("host", "toblog.ctobsnssdk.com"))
                insert(Url("host", "trace.qq.com"))
                insert(Url("host", "track.lc.quark.cn"))
                insert(Url("host", "track.uc.cn"))
                insert(Url("host", "tracker.ai.xiaomi.com"))
                insert(Url("host", "tracker.gitee.com"))
                insert(Url("host", "tracking.miui.com"))
                insert(Url("host", "tracking.rus.miui.com"))
                insert(Url("host", "tvuser-ch.cedock.com"))
                insert(Url("host", "tx-ad.a.yximgs.com"))
                insert(Url("host", "tx-kmpaudio.pull.yximgs.com"))
                insert(Url("host", "uapi.ads.heytapmobi.com"))
                insert(Url("host", "uapi.chiq-cloud.com"))
                insert(Url("host", "ucstat.baidu.com"))
                insert(Url("host", "ulog-sdk.gifshow.com"))
                insert(Url("host", "ulogjs.gifshow.com"))
                insert(Url("host", "ulogs.umeng.com"))
                insert(Url("host", "ulogs.umengcloud.com"))
                insert(Url("host", "umengacs.m.taobao.com"))
                insert(Url("host", "umengjmacs.m.taobao.com"))
                insert(Url("host", "umsns.com"))
                insert(Url("host", "union.baidu.com"))
                insert(Url("host", "update.avlyun.sec.miui.com"))
                insert(Url("host", "us.l.qq.com"))
                insert(Url("host", "v.adintl.cn"))
                insert(Url("host", "v.adx.hubcloud.com.cn"))
                insert(Url("host", "v1-ad.video.yximgs.com"))
                insert(Url("host", "v2-ad.video.yximgs.com"))
                insert(Url("host", "v2.gdt.qq.com"))
                insert(Url("host", "v3-ad.video.yximgs.com"))
                insert(Url("host", "video-dsp.pddpic.com"))
                insert(Url("host", "vlive.qqvideo.tc.qq.com"))
                insert(Url("host", "vungle.com"))
                insert(Url("host", "w.l.qq.com"))
                insert(Url("host", "w1.askwai.com"))
                insert(Url("host", "w1.bskwai.com"))
                insert(Url("host", "w1.cskwai.com"))
                insert(Url("host", "w1.dskwai.com"))
                insert(Url("host", "w1.eskwai.com"))
                insert(Url("host", "w1.fskwai.com"))
                insert(Url("host", "w1.gskwai.com"))
                insert(Url("host", "w1.hskwai.com"))
                insert(Url("host", "w1.iskwai.com"))
                insert(Url("host", "w1.jskwai.com"))
                insert(Url("host", "w1.kskwai.com"))
                insert(Url("host", "w1.lskwai.com"))
                insert(Url("host", "w1.mskwai.com"))
                insert(Url("host", "w1.nskwai.com"))
                insert(Url("host", "w1.oskwai.com"))
                insert(Url("host", "w1.pskwai.com"))
                insert(Url("host", "w1.qskwai.com"))
                insert(Url("host", "w1.rskwai.com"))
                insert(Url("host", "w1.sskwai.com"))
                insert(Url("host", "w1.tskwai.com"))
                insert(Url("host", "w1.uskwai.com"))
                insert(Url("host", "w1.vskwai.com"))
                insert(Url("host", "w1.wskwai.com"))
                insert(Url("host", "w1.xskwai.com"))
                insert(Url("host", "w1.yskwai.com"))
                insert(Url("host", "w1.zskwai.com"))
                insert(Url("host", "weather-analytics-events.apple.com"))
                insert(Url("host", "weather-community-drcn.weather.dbankcloud.cn"))
                insert(Url("host", "weather-drcn.music.dbankcloud.cn"))
                insert(Url("host", "webstat.qiumibao.com"))
                insert(Url("host", "win.gdt.qq.com"))
                insert(Url("host", "wn.x.jd.com"))
                insert(Url("host", "ws-keyboard.shouji.sogou.com"))
                insert(Url("host", "ws.sj.qq.com"))
                insert(Url("host", "www42.zskwai.com"))
                insert(Url("host", "wxa.wxs.qq.com"))
                insert(Url("host", "wxsnsdy.wxs.qq.com"))
                insert(Url("host", "wxsnsdythumb.wxs.qq.com"))
                insert(Url("host", "xc.gdt.qq.com"))
                insert(Url("host", "xlivrdr.com"))
                insert(Url("host", "xlmzc.cnjp-exp.com"))
                insert(Url("host", "xlog.jd.com"))
                insert(Url("host", "xlviiirdr.com"))
                insert(Url("host", "xlviirdr.com"))
                insert(Url("host", "youxi.kugou.com"))
                insert(Url("host", "zeus.ad.xiaomi.com"))
            }
        }
    }

}