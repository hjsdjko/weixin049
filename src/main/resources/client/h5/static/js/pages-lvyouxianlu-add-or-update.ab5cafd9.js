(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-lvyouxianlu-add-or-update"],{"480d":function(e,r,i){"use strict";var t,n=function(){var e=this,r=e.$createElement,i=e._self._c||r;return i("v-uni-view",{staticClass:"content"},[i("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[i("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("景点名称")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.jingdianmingcheng,placeholder:"景点名称"},model:{value:e.ruleForm.jingdianmingcheng,callback:function(r){e.$set(e.ruleForm,"jingdianmingcheng",r)},expression:"ruleForm.jingdianmingcheng"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("线路名称")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.xianlumingcheng,placeholder:"线路名称"},model:{value:e.ruleForm.xianlumingcheng,callback:function(r){e.$set(e.ruleForm,"xianlumingcheng",r)},expression:"ruleForm.xianlumingcheng"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.tupianTap.apply(void 0,arguments)}}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("图片")]),e.ruleForm.tupian?i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:e.baseUrl+e.ruleForm.tupian.split(",")[0],mode:"aspectFill"}}):i("v-uni-image",{staticClass:"avator",style:{width:"80rpx",borderRadius:"100%",objectFit:"cover",display:"block",height:"80rpx"},attrs:{src:"../../static/gen/upload.png",mode:"aspectFill"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("景点地址")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.jingdiandizhi,placeholder:"景点地址"},model:{value:e.ruleForm.jingdiandizhi,callback:function(r){e.$set(e.ruleForm,"jingdiandizhi",r)},expression:"ruleForm.jingdiandizhi"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("起点")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.qidian,placeholder:"起点"},model:{value:e.ruleForm.qidian,callback:function(r){e.$set(e.ruleForm,"qidian",r)},expression:"ruleForm.qidian"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("途径路段")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.tujingluduan,placeholder:"途径路段"},model:{value:e.ruleForm.tujingluduan,callback:function(r){e.$set(e.ruleForm,"tujingluduan",r)},expression:"ruleForm.tujingluduan"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("目的地")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.mudedi,placeholder:"目的地"},model:{value:e.ruleForm.mudedi,callback:function(r){e.$set(e.ruleForm,"mudedi",r)},expression:"ruleForm.mudedi"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("出行方式")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.chuxingfangshi,placeholder:"出行方式"},model:{value:e.ruleForm.chuxingfangshi,callback:function(r){e.$set(e.ruleForm,"chuxingfangshi",r)},expression:"ruleForm.chuxingfangshi"}})],1),i("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#eeeeee",alignItems:"center",borderWidth:"0px 0px 2rpx 0px",background:"none",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[i("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("收藏数量")]),i("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.storeupnum,placeholder:"收藏数量"},model:{value:e.ruleForm.storeupnum,callback:function(r){e.$set(e.ruleForm,"storeupnum",r)},expression:"ruleForm.storeupnum"}})],1),i("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[i("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",margin:"0 4% 0 0",color:"#fff",borderRadius:"60rpx",background:"#d84fa9",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(r){arguments[0]=r=e.$handleEvent(r),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},a=[];i.d(r,"b",(function(){return n})),i.d(r,"c",(function(){return a})),i.d(r,"a",(function(){return t}))},"4f86":function(e,r,i){var t=i("ccd5");"string"===typeof t&&(t=[[e.i,t,""]]),t.locals&&(e.exports=t.locals);var n=i("4f06").default;n("9d6458e8",t,!0,{sourceMap:!1,shadowMode:!1})},"8bb6":function(e,r,i){"use strict";var t=i("4f86"),n=i.n(t);n.a},ccd5:function(e,r,i){var t=i("24fb");r=t(!1),r.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-58041f56]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=r},e63e:function(e,r,i){"use strict";i.r(r);var t=i("fddb"),n=i.n(t);for(var a in t)"default"!==a&&function(e){i.d(r,e,(function(){return t[e]}))}(a);r["default"]=n.a},fddb:function(e,r,i){"use strict";var t=i("4ea4");Object.defineProperty(r,"__esModule",{value:!0}),r.default=void 0,i("a481"),i("c5f6"),i("f559"),i("456d"),i("ac6a"),i("28a5"),i("96cf");var n=t(i("3b8d")),a=t(i("e2b1")),o=t(i("064f")),u=t(i("bd56")),l={data:function(){return{cross:"",ruleForm:{jingdianmingcheng:"",xianlumingcheng:"",tupian:"",jingdiandizhi:"",qidian:"",tujingluduan:"",mudedi:"",chuxingfangshi:"",storeupnum:"0"},user:{},ro:{jingdianmingcheng:!1,xianlumingcheng:!1,tupian:!1,jingdiandizhi:!1,qidian:!1,tujingluduan:!1,mudedi:!1,chuxingfangshi:!1,storeupnum:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:u.default},watch:{},onLoad:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(r){var i,t,n,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return i=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(i);case 3:if(t=e.sent,this.user=t.data,this.ruleForm.userid=uni.getStorageSync("userid"),r.refid&&(this.ruleForm.refid=r.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!r.id){e.next=13;break}return this.ruleForm.id=r.id,e.next=11,this.$api.info("lvyouxianlu",this.ruleForm.id);case 11:t=e.sent,this.ruleForm=t.data;case 13:if(this.cross=r.cross,!r.cross){e.next=57;break}n=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(n);case 17:if((e.t1=e.t0()).done){e.next=57;break}if(a=e.t1.value,"jingdianmingcheng"!=a){e.next=23;break}return this.ruleForm.jingdianmingcheng=n[a],this.ro.jingdianmingcheng=!0,e.abrupt("continue",17);case 23:if("xianlumingcheng"!=a){e.next=27;break}return this.ruleForm.xianlumingcheng=n[a],this.ro.xianlumingcheng=!0,e.abrupt("continue",17);case 27:if("tupian"!=a){e.next=31;break}return this.ruleForm.tupian=n[a].split(",")[0],this.ro.tupian=!0,e.abrupt("continue",17);case 31:if("jingdiandizhi"!=a){e.next=35;break}return this.ruleForm.jingdiandizhi=n[a],this.ro.jingdiandizhi=!0,e.abrupt("continue",17);case 35:if("qidian"!=a){e.next=39;break}return this.ruleForm.qidian=n[a],this.ro.qidian=!0,e.abrupt("continue",17);case 39:if("tujingluduan"!=a){e.next=43;break}return this.ruleForm.tujingluduan=n[a],this.ro.tujingluduan=!0,e.abrupt("continue",17);case 43:if("mudedi"!=a){e.next=47;break}return this.ruleForm.mudedi=n[a],this.ro.mudedi=!0,e.abrupt("continue",17);case 47:if("chuxingfangshi"!=a){e.next=51;break}return this.ruleForm.chuxingfangshi=n[a],this.ro.chuxingfangshi=!0,e.abrupt("continue",17);case 51:if("storeupnum"!=a){e.next=55;break}return this.ruleForm.storeupnum=n[a],this.ro.storeupnum=!0,e.abrupt("continue",17);case 55:e.next=17;break;case 57:this.styleChange(),this.$forceUpdate();case 59:case"end":return e.stop()}}),e,this)})));function r(r){return e.apply(this,arguments)}return r}(),methods:{styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var r={color:"#666666"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var r={color:"#666"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var r={color:"#666666"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var r={color:"#666"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #999999",borderRadius:"0",background:"#ffffff"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #5fb959",borderRadius:"0",color:"#fff",background:"#5fb959"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #999999",borderRadius:"0",background:"#ffffff"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var r={border:"2rpx solid #5fb959",color:"#fff",borderRadius:"0",background:"#5fb959"};Object.keys(r).forEach((function(i){e.style[i]=r[i]}))}))}))},tupianTap:function(){var e=this;this.$api.upload((function(r){e.ruleForm.tupian="file/"+r.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,n.default)(regeneratorRuntime.mark((function e(){var r,i,t,n,a,o,u,l,s,d;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(this.ruleForm.jingdianmingcheng){e.next=3;break}return this.$utils.msg("景点名称不能为空"),e.abrupt("return");case 3:if(this.ruleForm.xianlumingcheng){e.next=6;break}return this.$utils.msg("线路名称不能为空"),e.abrupt("return");case 6:if(this.ruleForm.jingdiandizhi){e.next=9;break}return this.$utils.msg("景点地址不能为空"),e.abrupt("return");case 9:if(!this.ruleForm.storeupnum||this.$validate.isIntNumer(this.ruleForm.storeupnum)){e.next=12;break}return this.$utils.msg("收藏数量应输入整数"),e.abrupt("return");case 12:if(!this.cross){e.next=29;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=29;break}if(r||(r=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=25;break}for(u in r)u==a&&(r[u]=o);return l=uni.getStorageSync("crossTable"),e.next=23,this.$api.update("".concat(l),r);case 23:e.next=29;break;case 25:i=Number(uni.getStorageSync("userid")),t=r["id"],n=uni.getStorageSync("statusColumnName"),n=n.replace(/\[/,"").replace(/\]/,"");case 29:if(!t||!i){e.next=52;break}return this.ruleForm.crossuserid=i,this.ruleForm.crossrefid=t,s={page:1,limit:10,crossuserid:i,crossrefid:t},e.next=35,this.$api.list("lvyouxianlu",s);case 35:if(d=e.sent,!(d.data.total>=n)){e.next=42;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 42:if(!this.ruleForm.id){e.next=47;break}return e.next=45,this.$api.update("lvyouxianlu",this.ruleForm);case 45:e.next=49;break;case 47:return e.next=49,this.$api.add("lvyouxianlu",this.ruleForm);case 49:this.$utils.msgBack("提交成功");case 50:e.next=60;break;case 52:if(!this.ruleForm.id){e.next=57;break}return e.next=55,this.$api.update("lvyouxianlu",this.ruleForm);case 55:e.next=59;break;case 57:return e.next=59,this.$api.add("lvyouxianlu",this.ruleForm);case 59:this.$utils.msgBack("提交成功");case 60:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var r=new Date,i=r.getFullYear(),t=r.getMonth()+1,n=r.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),t=t>9?t:"0"+t,n=n>9?n:"0"+n,"".concat(i,"-").concat(t,"-").concat(n)},toggleTab:function(e){this.$refs[e].show()}}};r.default=l},ff0e:function(e,r,i){"use strict";i.r(r);var t=i("480d"),n=i("e63e");for(var a in n)"default"!==a&&function(e){i.d(r,e,(function(){return n[e]}))}(a);i("8bb6");var o,u=i("f0c5"),l=Object(u["a"])(n["default"],t["b"],t["c"],!1,null,"58041f56",null,!1,t["a"],o);r["default"]=l.exports}}]);