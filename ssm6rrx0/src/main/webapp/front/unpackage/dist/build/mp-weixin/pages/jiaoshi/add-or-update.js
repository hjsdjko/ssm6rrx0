(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/jiaoshi/add-or-update"],{"0085":function(e,n,t){"use strict";t.r(n);var i=t("68f3"),r=t("76ad");for(var a in r)"default"!==a&&function(e){t.d(n,e,(function(){return r[e]}))}(a);t("7eac");var u,o=t("f0c5"),s=Object(o["a"])(r["default"],i["b"],i["c"],!1,null,"1dabac6f",null,!1,i["a"],u);n["default"]=s.exports},"68f3":function(e,n,t){"use strict";var i;t.d(n,"b",(function(){return r})),t.d(n,"c",(function(){return a})),t.d(n,"a",(function(){return i}));var r=function(){var e=this,n=e.$createElement;e._self._c},a=[]},"76ad":function(e,n,t){"use strict";t.r(n);var i=t("ba6e"),r=t.n(i);for(var a in i)"default"!==a&&function(e){t.d(n,e,(function(){return i[e]}))}(a);n["default"]=r.a},"7eac":function(e,n,t){"use strict";var i=t("e013"),r=t.n(i);r.a},"7fa6":function(e,n,t){"use strict";(function(e){t("ce52");i(t("66fd"));var n=i(t("0085"));function i(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,t("543d")["createPage"])},ba6e:function(e,n,t){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var i=r(t("a34a"));function r(e){return e&&e.__esModule?e:{default:e}}function a(e,n,t,i,r,a,u){try{var o=e[a](u),s=o.value}catch(c){return void t(c)}o.done?n(s):Promise.resolve(s).then(i,r)}function u(e){return function(){var n=this,t=arguments;return new Promise((function(i,r){var u=e.apply(n,t);function o(e){a(u,i,r,o,s,"next",e)}function s(e){a(u,i,r,o,s,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([t.e("common/vendor"),t.e("components/w-picker/w-picker")]).then(function(){return resolve(t("3980"))}.bind(null,t)).catch(t.oe)},s={data:function(){return{ruleForm:{gonghao:"",mima:"",xingming:"",xingbie:"",qinshi:"",dianhua:"",youxiang:"",zhaopian:""},xingbieOptions:[],xingbieIndex:0,qinshiOptions:[],qinshiIndex:0,user:{},ro:{gonghao:!1,mima:!1,xingming:!1,xingbie:!1,qinshi:!1,dianhua:!1,youxiang:!1,zhaopian:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var t=this;return u(i.default.mark((function r(){var a,u,o,s;return i.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return a=e.getStorageSync("nowTable"),r.next=3,t.$api.session(a);case 3:return u=r.sent,t.user=u.data,t.xingbieOptions="男,女".split(","),r.next=8,t.$api.option("sushexinxi","sushemingcheng",{});case 8:if(u=r.sent,t.qinshiOptions=u.data,t.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(t.ruleForm.refid=n.refid),!n.id){r.next=18;break}return t.ruleForm.id=n.id,r.next=16,t.$api.info("jiaoshi",t.ruleForm.id);case 16:u=r.sent,t.ruleForm=u.data;case 18:if(!n.cross){r.next=57;break}o=e.getStorageSync("crossObj"),r.t0=i.default.keys(o);case 21:if((r.t1=r.t0()).done){r.next=57;break}if(s=r.t1.value,"gonghao"!=s){r.next=27;break}return t.ruleForm.gonghao=o[s],t.ro.gonghao=!0,r.abrupt("continue",21);case 27:if("mima"!=s){r.next=31;break}return t.ruleForm.mima=o[s],t.ro.mima=!0,r.abrupt("continue",21);case 31:if("xingming"!=s){r.next=35;break}return t.ruleForm.xingming=o[s],t.ro.xingming=!0,r.abrupt("continue",21);case 35:if("xingbie"!=s){r.next=39;break}return t.ruleForm.xingbie=o[s],t.ro.xingbie=!0,r.abrupt("continue",21);case 39:if("qinshi"!=s){r.next=43;break}return t.ruleForm.qinshi=o[s],t.ro.qinshi=!0,r.abrupt("continue",21);case 43:if("dianhua"!=s){r.next=47;break}return t.ruleForm.dianhua=o[s],t.ro.dianhua=!0,r.abrupt("continue",21);case 47:if("youxiang"!=s){r.next=51;break}return t.ruleForm.youxiang=o[s],t.ro.youxiang=!0,r.abrupt("continue",21);case 51:if("zhaopian"!=s){r.next=55;break}return t.ruleForm.zhaopian=o[s],t.ro.zhaopian=!0,r.abrupt("continue",21);case 55:r.next=21;break;case 57:t.styleChange();case 58:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xingbieChange:function(e){this.xingbieIndex=e.target.value,this.ruleForm.xingbie=this.xingbieOptions[this.xingbieIndex]},qinshiChange:function(e){this.qinshiIndex=e.target.value,this.ruleForm.qinshi=this.qinshiOptions[this.qinshiIndex]},zhaopianTap:function(){var e=this;this.$api.upload((function(n){e.ruleForm.zhaopian=e.$base.url+"upload/"+n.file,e.$forceUpdate(),e.$nextTick((function(){e.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return u(i.default.mark((function n(){return i.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.gonghao){n.next=3;break}return e.$utils.msg("工号不能为空"),n.abrupt("return");case 3:if(e.ruleForm.mima){n.next=6;break}return e.$utils.msg("密码不能为空"),n.abrupt("return");case 6:if(e.ruleForm.xingming){n.next=9;break}return e.$utils.msg("姓名不能为空"),n.abrupt("return");case 9:if(!e.ruleForm.youxiang||e.$validate.isEmail(e.ruleForm.youxiang)){n.next=12;break}return e.$utils.msg("邮箱应输入邮件格式"),n.abrupt("return");case 12:if(!e.ruleForm.id){n.next=17;break}return n.next=15,e.$api.update("jiaoshi",e.ruleForm);case 15:n.next=19;break;case 17:return n.next=19,e.$api.add("jiaoshi",e.ruleForm);case 19:e.$utils.msgBack("提交成功");case 20:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,t=n.getFullYear(),i=n.getMonth()+1,r=n.getDate();return"start"===e?t-=60:"end"===e&&(t+=2),i=i>9?i:"0"+i,r=r>9?r:"0"+r,"".concat(t,"-").concat(i,"-").concat(r)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,t("543d")["default"])},e013:function(e,n,t){}},[["7fa6","common/runtime","common/vendor"]]]);